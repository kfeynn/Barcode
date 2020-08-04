package com.barcode.app.controller;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.rpc.ServiceException;

import net.sf.json.util.NewBeanInstanceStrategy;

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
import com.barcode.app.model.RnBox;
import com.barcode.app.model.WhrBox;
import com.barcode.common.bean.ResultBean;
import com.barcode.common.utils.TiptopRequestUtils;
import com.barcode.common.utils.TiptopResponseUtils;
import com.barcode.core.databases.DataSourceTypeManager;
import com.barcode.core.databases.DataSources;
import com.barcode.receiving.dao.DeliverDao;
import com.barcode.tiptop.service.GetApmt110Request_GetApmt110Request;
import com.barcode.tiptop.service.GetApmt110Response_GetApmt110Response;
import com.barcode.tiptop.service.GetAsmq202Request_GetAsmq202Request;
import com.barcode.tiptop.service.GetAsmq202Response_GetAsmq202Response;
import com.barcode.tiptop.service.TIPTOPServiceGateWayLocator;

@Controller
@RequestMapping("/app")
public class ImptAndEmptController {
	String[] plantArray = new String[]{"S30","S50","S60","S70","S80","S31","S32","S33","S34","S35","S36","S37","S38","S39","S3A","S3B"};
	@Autowired
	private DeliverDao deliverDao;
	@RequestMapping(value = "/appGetImptAndEmptForm")
	@ResponseBody
	public ResultBean<List<ImptAndEmptItem>> appGetImptAndEmptForm(@RequestParam("box_num")String box_num,
			@RequestParam("tlf902")String tlf902,@RequestParam("start_time")String start_time,@RequestParam("end_time")String end_time){
		String itemListjson="";
		String strs = "";
		List<ImptAndEmptItem> itemList = null;
		List<ImptAndEmptItem> totalItemList = new ArrayList<ImptAndEmptItem>();
		String code = "-1";
		String rnListjson="";    
		List<RnBox> rnboxlist = null;
		String rvb05 = "";//料号
		String wAddr = "";//仓库
		String plant = "S30";
		try {
		if(box_num.substring(0, 2).equals("GB")){
			String rnNum = getRnNumbyboxNum(box_num);
			if(rnNum==null){
				return new ResultBean<>(200, "此箱号对应的收货单列表为空",null);
			}
			plant = rnNum.substring(4,7);
			//String plant = "S10180328";

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
					for(RnBox rnBox : rnboxlist){
						if(rnBox.getBarcode().equals(box_num)){
							rvb05 = rnBox.getRvb05();
							wAddr = rnBox.getRvb36();
						}
					}
					GetAsmq202Response_GetAsmq202Response response2
					= new TIPTOPServiceGateWayLocator()
						.getTIPTOPServiceGateWayPortType()
						.getAsmq202(new GetAsmq202Request_GetAsmq202Request(
								TiptopRequestUtils.buildImptAndEmptRequest(rvb05, plant,wAddr,start_time,end_time)));
					Document document2 = TiptopResponseUtils.createDocument(response2.getResponse());
					code = TiptopResponseUtils.getStatusElementAttr(document2, "code");
					
					if("0".equals(code)){
						itemListjson = TiptopResponseUtils.getValue(document2, 1);
						totalItemList = JSONArray.parseArray(itemListjson, ImptAndEmptItem.class);
					}else {
						strs = TiptopResponseUtils.getStatusElementAttr(document2, "description");
					}
		}else {
			rvb05 = box_num;    //料号查询
//			wAddr = "";
			wAddr = tlf902;   //仓库
			for (int i = 0; i < plantArray.length; i++) {
				GetAsmq202Response_GetAsmq202Response response2
				= new TIPTOPServiceGateWayLocator()
					.getTIPTOPServiceGateWayPortType()
					.getAsmq202(new GetAsmq202Request_GetAsmq202Request(
							TiptopRequestUtils.buildImptAndEmptRequest(rvb05, plantArray[i],wAddr,start_time,end_time)));
				Document document2 = TiptopResponseUtils.createDocument(response2.getResponse());
				code = TiptopResponseUtils.getStatusElementAttr(document2, "code");			
				if("0".equals(code)){
					itemListjson = TiptopResponseUtils.getValue(document2, 1);
					itemList = JSONArray.parseArray(itemListjson, ImptAndEmptItem.class);
					if(itemList != null && itemList.size()>0){
						for(ImptAndEmptItem imptAndEmptItem : itemList){
							totalItemList.add(imptAndEmptItem);
						}
					}
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
			if (totalItemList != null && totalItemList.size()>0) {
				strs = "success";
				System.out.println("totalItemList="+totalItemList.size());
			}
			int code1 = Integer.valueOf(code);
			
			return new ResultBean<>(code1, strs,totalItemList);
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
