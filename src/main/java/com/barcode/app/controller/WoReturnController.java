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
import com.barcode.common.bean.ResultBean;
import com.barcode.common.utils.TiptopRequestUtils;
import com.barcode.common.utils.TiptopResponseUtils;
import com.barcode.tiptop.service.GetAsfi520Request_GetAsfi520Request;
import com.barcode.tiptop.service.GetAsfi520Response_GetAsfi520Response;
import com.barcode.tiptop.service.TIPTOPServiceGateWayLocator;
import com.barcode.tiptop.service.UpdateAsfi510Request_UpdateAsfi510Request;
import com.barcode.tiptop.service.UpdateAsfi510Response_UpdateAsfi510Response;
import com.barcode.tiptop.service.UpdateAsfi520Request_UpdateAsfi520Request;
import com.barcode.tiptop.service.UpdateAsfi520Response_UpdateAsfi520Response;

@Controller
@RequestMapping("/app")

public class WoReturnController {
	@RequestMapping(value = "/appGetWRbox")
	@ResponseBody
	public ResultBean<List<PKbox>> appGetWRbox(@RequestParam("wrNum")String wrNum){
		String pkListjson="";
		String strs = "";
		List<PKbox> pkboxlist = null;
		String code = "-1";
			try {
				GetAsfi520Response_GetAsfi520Response response
					= new TIPTOPServiceGateWayLocator()
						.getTIPTOPServiceGateWayPortType()
						.getAsfi520(new GetAsfi520Request_GetAsfi520Request(
								TiptopRequestUtils.buildQueryWRboxRequest(wrNum)));
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
	
	@RequestMapping(value = "/woReturn", method = RequestMethod.POST)
	@ResponseBody
	public ResultBean<String> woReturn(@RequestParam("WR")String wrStr,@RequestParam("plant")String plant){
		
		try {
			UpdateAsfi520Response_UpdateAsfi520Response response
				= new TIPTOPServiceGateWayLocator()
					.getTIPTOPServiceGateWayPortType()
					.updateAsfi520(new UpdateAsfi520Request_UpdateAsfi520Request(
							TiptopRequestUtils.buildCommonRequest(wrStr,plant)));
			Document document = TiptopResponseUtils.createDocument(response.getResponse());
			String code = TiptopResponseUtils.getStatusElementAttr(document, "code");
			if("0".equals(code)) return new ResultBean<>(200, "退料成功");
			else {System.out.println("request xml : " + TiptopRequestUtils.buildCommonRequest(wrStr,plant));
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
