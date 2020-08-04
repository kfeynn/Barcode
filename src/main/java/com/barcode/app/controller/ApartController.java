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
import com.barcode.app.model.CKbox;
import com.barcode.common.bean.ResultBean;
import com.barcode.common.utils.TiptopRequestUtils;
import com.barcode.common.utils.TiptopResponseUtils;
import com.barcode.tiptop.service.GetAtmt261Request_GetAtmt261Request;
import com.barcode.tiptop.service.GetAtmt261Response_GetAtmt261Response;
import com.barcode.tiptop.service.TIPTOPServiceGateWayLocator;
import com.barcode.tiptop.service.UpdateAtmt261Request_UpdateAtmt261Request;
import com.barcode.tiptop.service.UpdateAtmt261Response_UpdateAtmt261Response;

@Controller
@RequestMapping("/app")
public class ApartController {

	@RequestMapping(value = "/appGetCKbox")
	@ResponseBody
	public ResultBean<List<CKbox>> appGetPKbox(@RequestParam("ckNum")String ckNum){
		String ckListjson="";
		String strs = "";
		List<CKbox> ckboxlist = null;
		String code = "-1";
		Document document;  
		System.out.println("+参数+"+ckNum);
//		获取拆解单相关数据
		try {
			 //创建调拨发送请求对象,并接受tipto接口端返回来的数据
			GetAtmt261Response_GetAtmt261Response response
						= new TIPTOPServiceGateWayLocator()
							.getTIPTOPServiceGateWayPortType()
							.getAtmt261(new GetAtmt261Request_GetAtmt261Request(
									TiptopRequestUtils.buildQueryCKboxRequest(ckNum)));
					document = TiptopResponseUtils.createDocument(response.getResponse());   //
					code = TiptopResponseUtils.getStatusElementAttr(document, "code");				
			if("0".equals(code)){  //正常则返回对应的数据
				ckListjson = TiptopResponseUtils.getValue(document, 1); //将xml转化为json
				ckboxlist = JSONArray.parseArray(ckListjson, CKbox.class);  //把获取的ckListjson转化到CKbox然后赋给list里面
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
			if (ckboxlist != null) {
				strs = "success";
			}
			int code1 = Integer.valueOf(code);
			return new ResultBean<>(code1, strs,ckboxlist);
	}
	//调拨单过账请求
	@RequestMapping(value = "/apart", method = RequestMethod.POST)
	@ResponseBody
	public ResultBean<String> apart(@RequestParam("number")String number,@RequestParam("user")String user,
			@RequestParam("plant")String plant){
		Document document;
		String code = "-1";
		try {
				UpdateAtmt261Response_UpdateAtmt261Response response
				= new TIPTOPServiceGateWayLocator()
					.getTIPTOPServiceGateWayPortType()
					.updateAtmt261(new UpdateAtmt261Request_UpdateAtmt261Request(
							TiptopRequestUtils.buildApartRequest(number,user,plant)));
			document = TiptopResponseUtils.createDocument(response.getResponse());
			code = TiptopResponseUtils.getStatusElementAttr(document, "code");
			
			if("0".equals(code)) return new ResultBean<>(200, "过账成功");
			else {System.out.println("request xml : " + TiptopRequestUtils.buildApartRequest(number,user,plant));
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
