package com.barcode.app.controller;

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
import com.barcode.app.model.WhrBox;
import com.barcode.common.bean.ResultBean;
import com.barcode.common.utils.TiptopRequestUtils;
import com.barcode.common.utils.TiptopResponseUtils;
import com.barcode.tiptop.service.GetApmt722Request_GetApmt722Request;
import com.barcode.tiptop.service.GetApmt722Response_GetApmt722Response;
import com.barcode.tiptop.service.GetAsfi520Request_GetAsfi520Request;
import com.barcode.tiptop.service.GetAsfi520Response_GetAsfi520Response;
import com.barcode.tiptop.service.TIPTOPServiceGateWayLocator;
import com.barcode.tiptop.service.UpdateApmt722Request_UpdateApmt722Request;
import com.barcode.tiptop.service.UpdateApmt722Response_UpdateApmt722Response;
import com.barcode.tiptop.service.UpdateAsfi510Request_UpdateAsfi510Request;
import com.barcode.tiptop.service.UpdateAsfi510Response_UpdateAsfi510Response;
import com.barcode.tiptop.service.UpdateAsfi520Request_UpdateAsfi520Request;
import com.barcode.tiptop.service.UpdateAsfi520Response_UpdateAsfi520Response;

@Controller
@RequestMapping("/app")

public class WhReturnController {
	@RequestMapping(value = "/appGetWHRbox")
	@ResponseBody
	public ResultBean<List<WhrBox>> appGetWRbox(@RequestParam("whNum")String whNum){
		String whrBoxListjson="";
		String strs = "";
		List<WhrBox> whrBoxList = null;
		String code = "-1";
			try {
				GetApmt722Response_GetApmt722Response response
					= new TIPTOPServiceGateWayLocator()
						.getTIPTOPServiceGateWayPortType()
						.getApmt722(new GetApmt722Request_GetApmt722Request(
								TiptopRequestUtils.buildQueryWHRboxRequest(whNum)));
				Document document = TiptopResponseUtils.createDocument(response.getResponse());
				code = TiptopResponseUtils.getStatusElementAttr(document, "code");
				
				if("0".equals(code)){
					whrBoxListjson = TiptopResponseUtils.getValue(document, 1);
					whrBoxList = JSONArray.parseArray(whrBoxListjson, WhrBox.class);
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
			if (whrBoxList != null) {
				strs = "success";
			}
			int code1 = Integer.valueOf(code);
			return new ResultBean<>(code1, strs,whrBoxList);
	}
	
	@RequestMapping(value = "/whReturn", method = RequestMethod.POST)
	@ResponseBody
	public ResultBean<String> whReturn(@RequestParam("WHR")String whrStr,@RequestParam("plant")String plant){
		
		try {
			UpdateApmt722Response_UpdateApmt722Response response
				= new TIPTOPServiceGateWayLocator()
					.getTIPTOPServiceGateWayPortType()
					.updateApmt722(new UpdateApmt722Request_UpdateApmt722Request(
							TiptopRequestUtils.buildCommonRequest(whrStr,plant)));
			Document document = TiptopResponseUtils.createDocument(response.getResponse());
			String code = TiptopResponseUtils.getStatusElementAttr(document, "code");
			if("0".equals(code)) return new ResultBean<>(200, "退料成功");
			else {System.out.println("request xml : " + TiptopRequestUtils.buildCommonRequest(whrStr,plant));
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
