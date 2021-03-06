package com.barcode.ATS.controller;

import java.rmi.RemoteException;
import java.util.List;

import javax.xml.rpc.ServiceException;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.barcode.app.model.PKbox;
import com.barcode.app.model.RnBox;
import com.barcode.common.bean.ResultBean;
import com.barcode.common.utils.TiptopRequestUtils;
import com.barcode.common.utils.TiptopResponseUtils;
import com.barcode.tiptop.service.CreateApmt110Request_CreateApmt110Request;
import com.barcode.tiptop.service.CreateApmt110Response_CreateApmt110Response;
import com.barcode.tiptop.service.CreateApmt720Request_CreateApmt720Request;
import com.barcode.tiptop.service.CreateApmt720Response_CreateApmt720Response;
import com.barcode.tiptop.service.GetAsfi510Request_GetAsfi510Request;
import com.barcode.tiptop.service.GetAsfi510Response_GetAsfi510Response;
import com.barcode.tiptop.service.TIPTOPServiceGateWayLocator;
import com.barcode.tiptop.service.UpdateAsfi510Request_UpdateAsfi510Request;
import com.barcode.tiptop.service.UpdateAsfi510Response_UpdateAsfi510Response;

@Controller
@RequestMapping("/ATS")

public class AutoPackingController {
	@RequestMapping(value = "/getPKbox")
	@ResponseBody
	public ResultBean<List<PKbox>> getPKbox(String pkNum){
		String pkListjson="";
		String strs = "";
		List<PKbox> pkboxlist = null;
		String code = "-1";
			try {
				GetAsfi510Response_GetAsfi510Response response
					= new TIPTOPServiceGateWayLocator()
						.getTIPTOPServiceGateWayPortType()
						.getAsfi510(new GetAsfi510Request_GetAsfi510Request(
								TiptopRequestUtils.buildQueryPKboxRequest(pkNum)));
				Document document = TiptopResponseUtils.createDocument(response.getResponse());
				code = TiptopResponseUtils.getStatusElementAttr(document, "code");
				
				if("0".equals(code)){
					pkListjson = TiptopResponseUtils.getValue(document, 1);
					pkboxlist = JSONArray.parseArray(pkListjson, PKbox.class);
				}else {
					strs = TiptopResponseUtils.getStatusElementAttr(document, "description");
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
			if (pkboxlist != null) {
				strs = "success";
			}
			int code1 = Integer.valueOf(code);
			return new ResultBean<>(code1, strs,pkboxlist);
	}
	
	@RequestMapping(value = "/packing", method = RequestMethod.POST)
	@ResponseBody
	public ResultBean<String> packing(@RequestParam("PK")String pkStr,@RequestParam("plant")String plant){
		
		try {
			UpdateAsfi510Response_UpdateAsfi510Response response
				= new TIPTOPServiceGateWayLocator()
					.getTIPTOPServiceGateWayPortType()
					.updateAsfi510(new UpdateAsfi510Request_UpdateAsfi510Request(
							TiptopRequestUtils.buildCommonRequest(pkStr,plant)));
			Document document = TiptopResponseUtils.createDocument(response.getResponse());
			String code = TiptopResponseUtils.getStatusElementAttr(document, "code");
			if("0".equals(code)) return new ResultBean<>(200, "发料成功");
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
}
