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
import com.barcode.app.model.AKbox;
import com.barcode.app.model.PKbox;
import com.barcode.common.bean.ResultBean;
import com.barcode.common.utils.TiptopRequestUtils;
import com.barcode.common.utils.TiptopResponseUtils;
import com.barcode.tiptop.service.GetAimt301Request_GetAimt301Request;
import com.barcode.tiptop.service.GetAimt301Response_GetAimt301Response;
import com.barcode.tiptop.service.GetAsfi510Request_GetAsfi510Request;
import com.barcode.tiptop.service.GetAsfi510Response_GetAsfi510Response;
import com.barcode.tiptop.service.GetAimt324Request_GetAimt324Request;
import com.barcode.tiptop.service.GetAimt324Response_GetAimt324Response;
import com.barcode.tiptop.service.TIPTOPServiceGateWayLocator;
import com.barcode.tiptop.service.UpdateAimt301Request_UpdateAimt301Request;
import com.barcode.tiptop.service.UpdateAimt301Response_UpdateAimt301Response;
import com.barcode.tiptop.service.UpdateAsfi510Request_UpdateAsfi510Request;
import com.barcode.tiptop.service.UpdateAsfi510Response_UpdateAsfi510Response;
import com.barcode.tiptop.service.UpdateAimt324Request_UpdateAimt324Request;
import com.barcode.tiptop.service.UpdateAimt324Response_UpdateAimt324Response;

@Controller
@RequestMapping("/app")
public class AllotController {

	@RequestMapping(value = "/appGetAKbox")
	@ResponseBody
	public ResultBean<List<AKbox>> appGetPKbox(@RequestParam("akNum")String akNum){
		String akListjson="";
		String strs = "";
		List<AKbox> akboxlist = null;
		String code = "-1";
		Document document;  
		System.out.println("+参数+"+akNum);
		
		try {
			 //创建调拨发送请求对象,并接受tipto接口端返回来的数据
			GetAimt324Response_GetAimt324Response response
						= new TIPTOPServiceGateWayLocator()
							.getTIPTOPServiceGateWayPortType()
							.getAimt324(new GetAimt324Request_GetAimt324Request(
									TiptopRequestUtils.buildQueryAKboxRequest(akNum)));
					document = TiptopResponseUtils.createDocument(response.getResponse());   //
					code = TiptopResponseUtils.getStatusElementAttr(document, "code");				
			if("0".equals(code)){  //正常则返回对应的数据
				akListjson = TiptopResponseUtils.getValue(document, 1); //将xml转化为json
				akboxlist = JSONArray.parseArray(akListjson, AKbox.class);  //把获取的pkListjson转化到PKbox然后赋给list里面
			}else {
				strs = TiptopResponseUtils.getStatusElementAttr(document, "description");
			}
		} 
		catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			if (akboxlist != null) {
				strs = "success";
			}
			int code1 = Integer.valueOf(code);
			return new ResultBean<>(code1, strs,akboxlist);
	}
	//调拨单过账请求
	@RequestMapping(value = "/allot", method = RequestMethod.POST)
	@ResponseBody
	public ResultBean<String> allot(@RequestParam("number")String number,@RequestParam("user")String user,
			@RequestParam("plant")String plant){
		Document document;
		String code = "-1";
		try {
				UpdateAimt324Response_UpdateAimt324Response response
				= new TIPTOPServiceGateWayLocator()
					.getTIPTOPServiceGateWayPortType()
					.updateAimt324(new UpdateAimt324Request_UpdateAimt324Request(
							TiptopRequestUtils.buildAllotRequest(number,user,plant)));
			document = TiptopResponseUtils.createDocument(response.getResponse());
			code = TiptopResponseUtils.getStatusElementAttr(document, "code");
			
			if("0".equals(code)) return new ResultBean<>(200, "调拨成功");
			else {System.out.println("request xml : " + TiptopRequestUtils.buildAllotRequest(number,user,plant));
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
