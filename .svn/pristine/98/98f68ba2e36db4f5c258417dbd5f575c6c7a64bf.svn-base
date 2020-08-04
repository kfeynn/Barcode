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
import com.barcode.tiptop.service.CreateTc_imb1Request_CreateTc_imb1Request;
import com.barcode.tiptop.service.CreateTc_imb1Response_CreateTc_imb1Response;
import com.barcode.tiptop.service.CreateTc_imbRequest_CreateTc_imbRequest;
import com.barcode.tiptop.service.CreateTc_imbResponse_CreateTc_imbResponse;
import com.barcode.tiptop.service.GetApmt110ARequest_GetApmt110ARequest;
import com.barcode.tiptop.service.GetApmt110AResponse_GetApmt110AResponse;
import com.barcode.tiptop.service.GetApmt110Request_GetApmt110Request;
import com.barcode.tiptop.service.GetApmt110Response_GetApmt110Response;
import com.barcode.tiptop.service.GetAqct110Request_GetAqct110Request;
import com.barcode.tiptop.service.GetAqct110Response_GetAqct110Response;
import com.barcode.tiptop.service.TIPTOPServiceGateWayLocator;
import com.barcode.tiptop.service.UpdateAqct110Request_UpdateAqct110Request;
import com.barcode.tiptop.service.UpdateAqct110Response_UpdateAqct110Response;

@Controller
@RequestMapping("/app")

public class Join1Controller {
	@Autowired
	private DeliverDao deliverDao;
	
	@RequestMapping(value = "/receivingJoin1", method = RequestMethod.POST)
	@ResponseBody
	public ResultBean<String> packing(@RequestParam("number")String number,@RequestParam("user")String user,@RequestParam("plant")String plant){
		
		try {
			CreateTc_imb1Response_CreateTc_imb1Response response
			= new TIPTOPServiceGateWayLocator()
				.getTIPTOPServiceGateWayPortType()
				.createTc_imb1(new CreateTc_imb1Request_CreateTc_imb1Request(
						TiptopRequestUtils.buildRNboxJoin1Request(number,user,plant)));
		Document document = TiptopResponseUtils.createDocument(response.getResponse());
		String code = TiptopResponseUtils.getStatusElementAttr(document, "code");
		if("0".equals(code)) return new ResultBean<>(200, "送货单交接成功");
		else {System.out.println("request xml : " + TiptopRequestUtils.buildRNboxJoin1Request(number,user,plant));
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
	
	@RequestMapping(value = "/appGetRnboxa")
	@ResponseBody
	public ResultBean<List<RnBox>> appGetRnboxa(@RequestParam("box_num")String box_num){
		String rnListjson="";
		String strs = "";
		List<RnBox> itemList = null;
		String code = "-1";
		String rnboxitemListjson="";    
		List<RnBox> rnboxlist = null;
		String rvb01 = "";//收货单号
		String rvb02 = "";//项次
		try {
			String rnNum = getRnNumbyboxNum1(box_num);
			if(rnNum==null){
				return new ResultBean<>(200, "此送货单对应的收货单列表为空",null);
			}
			String plant = rnNum.substring(4,7);
			//String plant = "S10180328";

					GetApmt110AResponse_GetApmt110AResponse response1
					= new TIPTOPServiceGateWayLocator()
						.getTIPTOPServiceGateWayPortType()
						.getApmt110A(new GetApmt110ARequest_GetApmt110ARequest(
								TiptopRequestUtils.buildQueryRN1Request(box_num,plant)));
					Document document1 = TiptopResponseUtils.createDocument(response1.getResponse());
					 code = TiptopResponseUtils.getStatusElementAttr(document1, "code");
					if("0".equals(code)){
						rnListjson = TiptopResponseUtils.getValue(document1, 1);
						rnboxlist = JSONArray.parseArray(rnListjson, RnBox.class);
					}else {
						strs = TiptopResponseUtils.getStatusElementAttr(document1, "description");
					}
					rnboxlist = JSONArray.parseArray(rnListjson, RnBox.class);
					if(rnboxlist==null){
						return new ResultBean<>(200, "此送货单对应的收货单列表为空",null);
					}
//					for1:for(RnBox rnBox : rnboxlist){
//						if(rnBox.getBarcode().equals(box_num)){
//							rvb01 = rnBox.getRvb01();
//							rvb02 = rnBox.getRvb02();
//							GetApmt110AResponse_GetApmt110AResponse response2
//							= new TIPTOPServiceGateWayLocator()
//								.getTIPTOPServiceGateWayPortType()
//								.getApmt110A(new GetApmt110ARequest_GetApmt110ARequest(
//										TiptopRequestUtils.buildGetIqcItemRequest(rvb01, plant,rvb02)));
//							Document document2 = TiptopResponseUtils.createDocument(response2.getResponse());
//							code = TiptopResponseUtils.getStatusElementAttr(document2, "code");
//							
//							if("0".equals(code)){
//								rnboxitemListjson = TiptopResponseUtils.getValue(document2, 1);
//								rnboxlist = JSONArray.parseArray(rnboxitemListjson, RnBox.class);
//								break for1;
//							}else {
//								strs = TiptopResponseUtils.getStatusElementAttr(document2, "description");
//							}
//						}
//					}

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
//			if (itemList != null && itemList.size()>0) {
//				strs = "success";
//			}
			int code1 = Integer.valueOf(code);
			
			return new ResultBean<>(code1, strs,rnboxlist);
	}
	
	private String getRnNumbyboxNum1(String box_num){
		String rnNum;
		DataSourceTypeManager.set(DataSources.S30);
		rnNum = deliverDao.getRnNumbyBoxnum1("s30.rva_file",box_num);
		if(rnNum == null){
			DataSourceTypeManager.set(DataSources.S80);
			rnNum = deliverDao.getRnNumbyBoxnum1("s80.rva_file",box_num);
			if (rnNum == null) {
				DataSourceTypeManager.set(DataSources.S50);
				rnNum = deliverDao.getRnNumbyBoxnum1("s50.rva_file",box_num);
				if (rnNum == null) {
					DataSourceTypeManager.set(DataSources.S60);
					rnNum = deliverDao.getRnNumbyBoxnum1("s60.rva_file",box_num);
					if(rnNum == null){
						DataSourceTypeManager.set(DataSources.S70);
						rnNum = deliverDao.getRnNumbyBoxnum1("s70.rva_file",box_num);
				  	    if(rnNum == null){
							DataSourceTypeManager.set(DataSources.S90);
							rnNum = deliverDao.getRnNumbyBoxnum1("s90.rva_file",box_num);
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
     }else {
    	return rnNum;
		}		
	return rnNum;
	}
}
