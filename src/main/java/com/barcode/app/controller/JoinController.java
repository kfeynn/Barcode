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
import com.barcode.tiptop.service.CreateTc_imbRequest_CreateTc_imbRequest;
import com.barcode.tiptop.service.CreateTc_imbResponse_CreateTc_imbResponse;
import com.barcode.tiptop.service.GetApmt722ARequest_GetApmt722ARequest;
import com.barcode.tiptop.service.GetApmt722AResponse_GetApmt722AResponse;
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

public class JoinController {
	@RequestMapping(value = "/appGetWHRboxa")
	@ResponseBody
	public ResultBean<List<WhrBox>> appGetWRboxa(@RequestParam("whNum")String whNum){
		String whrBoxListjson="";
		String strs = "";
		List<WhrBox> whrBoxList = null;
		String code = "-1";
			try {
				GetApmt722AResponse_GetApmt722AResponse response
					= new TIPTOPServiceGateWayLocator()
						.getTIPTOPServiceGateWayPortType()
						.getApmt722A(new GetApmt722ARequest_GetApmt722ARequest(
								TiptopRequestUtils.buildQueryWHRboxaRequest(whNum)));
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
	
	@RequestMapping(value = "/whReturnJoin", method = RequestMethod.POST)
	@ResponseBody
	public ResultBean<String> whReturnJoin(@RequestParam("number")String number,@RequestParam("user")String user){
		
		try {
			CreateTc_imbResponse_CreateTc_imbResponse response
				= new TIPTOPServiceGateWayLocator()
					.getTIPTOPServiceGateWayPortType()
					.createTc_imb(new CreateTc_imbRequest_CreateTc_imbRequest(
							TiptopRequestUtils.buildWRboxJoinRequest(number,user)));
			Document document = TiptopResponseUtils.createDocument(response.getResponse());
			String code = TiptopResponseUtils.getStatusElementAttr(document, "code");
			if("0".equals(code)) return new ResultBean<>(200, "仓退交接成功");
			else {System.out.println("request xml : " + TiptopRequestUtils.buildWRboxJoinRequest(number,user));
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
