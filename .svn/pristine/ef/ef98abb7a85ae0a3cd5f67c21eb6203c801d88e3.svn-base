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
import com.barcode.tiptop.service.UpdateAimt324Request_UpdateAimt324Request;
import com.barcode.tiptop.service.UpdateAimt324Response_UpdateAimt324Response;
import com.barcode.tiptop.service.UpdateAsfi510Request_UpdateAsfi510Request;
import com.barcode.tiptop.service.UpdateAsfi510Response_UpdateAsfi510Response;
import com.barcode.tiptop.service.UpdateAsfi520Request_UpdateAsfi520Request;
import com.barcode.tiptop.service.UpdateAsfi520Response_UpdateAsfi520Response;
import com.barcode.tiptop.service.UpdateAxmt620Request_UpdateAxmt620Request;
import com.barcode.tiptop.service.UpdateAxmt620Response_UpdateAxmt620Response;

@Controller
@RequestMapping("/app")
public class AxmtController {

	//出货单过账   
	@RequestMapping(value = "/updateAxmt620")
	@ResponseBody
	public ResultBean<String> updateAxmt620(@RequestParam(value="oga01",required=false)String oga01,@RequestParam(value="user",required=false)String user){		
		try {
			
			UpdateAxmt620Request_UpdateAxmt620Request request = new UpdateAxmt620Request_UpdateAxmt620Request(
					TiptopRequestUtils.buildUpdateAxmt620Request(oga01,user));
						
//			UpdateAxmt620Response_UpdateAxmt620Response response
//				= new TIPTOPServiceGateWayLocator()
//					.getTIPTOPServiceGateWayPortType()
//					.updateAxmt620(request);
			UpdateAxmt620Response_UpdateAxmt620Response response
			= new TIPTOPServiceGateWayLocator()
				.getTIPTOPServiceGateWayPortType()
				.updateAxmt620(new UpdateAxmt620Request_UpdateAxmt620Request(
						TiptopRequestUtils.buildUpdateAxmt620Request(oga01,user)));
 
		
			Document document = TiptopResponseUtils.createDocument(response.getResponse());
			String code = TiptopResponseUtils.getStatusElementAttr(document, "code");
			if("0".equals(code)) 
				return new ResultBean<>(200, "过账成功");
			else 
			{
				System.out.println("request xml : " + TiptopRequestUtils.buildUpdateAxmt620Request(oga01,user));
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
