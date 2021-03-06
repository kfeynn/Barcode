package com.barcode.app.controller;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.rpc.ServiceException;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.barcode.app.model.ImptAndEmptItem;
import com.barcode.app.model.IqcItem;
import com.barcode.app.model.PKbox;
import com.barcode.app.model.RnBox;
import com.barcode.common.bean.ResultBean;
import com.barcode.common.utils.TiptopRequestUtils;
import com.barcode.common.utils.TiptopResponseUtils;
import com.barcode.core.databases.DataSourceTypeManager;
import com.barcode.core.databases.DataSources;
import com.barcode.receiving.dao.DeliverDao;
import com.barcode.tiptop.service.GetApmt110Request_GetApmt110Request;
import com.barcode.tiptop.service.GetApmt110Response_GetApmt110Response;
import com.barcode.tiptop.service.GetAqct110Request_GetAqct110Request;
import com.barcode.tiptop.service.GetAqct110Response_GetAqct110Response;
import com.barcode.tiptop.service.TIPTOPServiceGateWayLocator;
import com.barcode.tiptop.service.UpdateAqct110Request_UpdateAqct110Request;
import com.barcode.tiptop.service.UpdateAqct110Response_UpdateAqct110Response;

@Controller
@RequestMapping("/app")

public class IQCController {
	@Autowired
	private DeliverDao deliverDao;
	
	@RequestMapping(value = "/iqc", method = RequestMethod.POST)
	@ResponseBody
	public ResultBean<String> packing(@RequestParam("RN")String pkStr,@RequestParam("plant")String plant){
		
		try {
			UpdateAqct110Response_UpdateAqct110Response response
				= new TIPTOPServiceGateWayLocator()
					.getTIPTOPServiceGateWayPortType()
					.updateAqct110(new UpdateAqct110Request_UpdateAqct110Request(
							TiptopRequestUtils.buildIQCRequest(pkStr,plant)));
			Document document = TiptopResponseUtils.createDocument(response.getResponse());
			String code = TiptopResponseUtils.getStatusElementAttr(document, "code");
			if("0".equals(code)) return new ResultBean<>(200, "IQC结果提交成功");
			else {System.out.println("request xml : " + TiptopRequestUtils.buildCommonRequest(pkStr,plant));
				return new ResultBean<>(400, TiptopResponseUtils.getStatusElementAttr(document, "description"));
			}
		} catch (RemoteException e) {
			e.printStackTrace();
			return new ResultBean<>(400, "远程连接失败");
		} catch (ServiceException e) {
			e.printStackTrace();
			return new ResultBean<>(400, "连接服务器失败");
		} catch (DocumentException e) {
			e.printStackTrace();
			return new ResultBean<>(400, "解析返回值错误");
		}
	}
	
	@RequestMapping(value = "/appGetIQCForm")
	@ResponseBody
	public ResultBean<List<IqcItem>> appGetIqcItemForm(@RequestParam("box_num")String box_num){
		String rnListjson="";
		String strs = "获取失败";
		List<IqcItem> itemList = null;
		String code = "-1";
		String iqcitemListjson="";    
		List<RnBox> rnboxlist = null;
		String rvb01 = "";//收货单号
		String rvb02 = "";//项次
		try {
			String rnNum = getRnNumbyboxNum(box_num);
			if(rnNum==null){
				return new ResultBean<>(200, "此箱号对应的收货单列表为空",null);
			}
			String plant = rnNum.substring(4,7);      //得到对应的运营中心
			//String plant = "S10180328";
            //以下此段是根据条码跟运营中心去获取对应的收货单条码信息，得到一个数组
					GetApmt110Response_GetApmt110Response response1
					= new TIPTOPServiceGateWayLocator()
						.getTIPTOPServiceGateWayPortType()
						.getApmt110(new GetApmt110Request_GetApmt110Request(
								TiptopRequestUtils.buildQueryRNRequest(box_num,plant)));
					Document document1 = TiptopResponseUtils.createDocument(response1.getResponse());
					String code1 = TiptopResponseUtils.getStatusElementAttr(document1, "code");
					if("0".equals(code1)){
						rnListjson = TiptopResponseUtils.getValue(document1, 1);
					}else {
						strs = TiptopResponseUtils.getStatusElementAttr(document1, "description");
					}
					rnboxlist = JSONArray.parseArray(rnListjson, RnBox.class);
					if(rnboxlist==null){
						return new ResultBean<>(200, "此箱号对应的收货单列表为空",null);
					}
					//根据获取的数组得到收获单项次然后再去获取QC相关的信息
					for1:for(RnBox rnBox : rnboxlist){
						if(rnBox.getBarcode().equals(box_num)){
							rvb01 = rnBox.getRvb01();
							rvb02 = rnBox.getRvb02();
							GetAqct110Response_GetAqct110Response response2
							= new TIPTOPServiceGateWayLocator()
								.getTIPTOPServiceGateWayPortType()
								.getAqct110(new GetAqct110Request_GetAqct110Request(
										TiptopRequestUtils.buildGetIqcItemRequest(rvb01, plant,rvb02)));
							Document document2 = TiptopResponseUtils.createDocument(response2.getResponse());
							code = TiptopResponseUtils.getStatusElementAttr(document2, "code");
							
							if("0".equals(code)){
								iqcitemListjson = TiptopResponseUtils.getValue(document2, 1);
								itemList = JSONArray.parseArray(iqcitemListjson, IqcItem.class);
								break for1;
							}else {
								strs = TiptopResponseUtils.getStatusElementAttr(document2, "description");
							}
						}
					}

			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ServiceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (DocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (itemList != null && itemList.size()>0) {
				strs = "success";
			}
			int code1 = Integer.valueOf(code);
			
			return new ResultBean<>(code1, strs,itemList);
	}
	
	private String getRnNumbyboxNum(String box_num){
		String rnNum;
		DataSourceTypeManager.set(DataSources.S30);
		rnNum = deliverDao.getRnNumbyBoxnum("s30.ibb_file",box_num);
		if(rnNum == null){
			DataSourceTypeManager.set(DataSources.S80);
			rnNum = deliverDao.getRnNumbyBoxnum("s80.ibb_file",box_num);
			if (rnNum == null) {
				DataSourceTypeManager.set(DataSources.S50);
				rnNum = deliverDao.getRnNumbyBoxnum("s50.ibb_file",box_num);
				if (rnNum == null) {
					DataSourceTypeManager.set(DataSources.S60);
					rnNum = deliverDao.getRnNumbyBoxnum("s60.ibb_file",box_num);
					if(rnNum == null){
						DataSourceTypeManager.set(DataSources.S70);
						rnNum = deliverDao.getRnNumbyBoxnum("s70.ibb_file",box_num);
					}else {
						return rnNum;
					}
				}else {
					return rnNum;
				}
			}else {
				return rnNum;
			}
		}else {
			return rnNum;
		}
		return rnNum;
	}
}
