package com.barcode.app.controller;

import java.rmi.RemoteException;
import java.util.List;

import javax.xml.rpc.ServiceException;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.junit.Test;
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
import com.barcode.tiptop.service.GetAimt301Request_GetAimt301Request;
import com.barcode.tiptop.service.GetAimt301Response_GetAimt301Response;
import com.barcode.tiptop.service.GetAsfi510Request_GetAsfi510Request;
import com.barcode.tiptop.service.GetAsfi510Response_GetAsfi510Response;
import com.barcode.tiptop.service.TIPTOPServiceGateWayLocator;
import com.barcode.tiptop.service.UpdateAimt301Request_UpdateAimt301Request;
import com.barcode.tiptop.service.UpdateAimt301Response_UpdateAimt301Response;
import com.barcode.tiptop.service.UpdateAsfi510Request_UpdateAsfi510Request;
import com.barcode.tiptop.service.UpdateAsfi510Response_UpdateAsfi510Response;
import com.barcode.tiptop.service.TIPTOPServiceGateWayBindingStub;

@Controller
@RequestMapping("/app")
//获取发料单数据请求
public class PackingController {
	
	
	@RequestMapping(value = "/appGetPKbox")
	@ResponseBody
	public ResultBean<List<PKbox>> appGetPKbox(@RequestParam("pkNum")String pkNum){
		String pkListjson="";
		String strs = "";
		List<PKbox> pkboxlist = null;
		String code = "-1";
		Document document;
		try {
			if(pkNum.substring(0,2).equals("11")){   //杂发
				GetAimt301Response_GetAimt301Response response
				= new TIPTOPServiceGateWayLocator()
					.getTIPTOPServiceGateWayPortType()
					.getAimt301(new GetAimt301Request_GetAimt301Request(
							TiptopRequestUtils.buildQuerySPKboxRequest(pkNum)));
				document = TiptopResponseUtils.createDocument(response.getResponse());
				code = TiptopResponseUtils.getStatusElementAttr(document, "code");

			}else {  //创建发料发送请求对象,并接受tipto接口端返回来的数据
					GetAsfi510Response_GetAsfi510Response response
						= new TIPTOPServiceGateWayLocator()
							.getTIPTOPServiceGateWayPortType()
							.getAsfi510(new GetAsfi510Request_GetAsfi510Request(
									TiptopRequestUtils.buildQueryPKboxRequest(pkNum)));
					document = TiptopResponseUtils.createDocument(response.getResponse());   //
					code = TiptopResponseUtils.getStatusElementAttr(document, "code");
				}
			if("0".equals(code)){  //正常则返回对应的数据
				pkListjson = TiptopResponseUtils.getValue(document, 1); //将xml转化为json
				pkboxlist = JSONArray.parseArray(pkListjson, PKbox.class);  //把获取的pkListjson转化到PKbox然后赋给list里面
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
			if (pkboxlist != null) {
				strs = "success";
			}
			int code1 = Integer.valueOf(code);
			return new ResultBean<>(code1, strs,pkboxlist);
	}
	//发料单过账请求
	@RequestMapping(value = "/packing", method = RequestMethod.POST)
	@ResponseBody
	public ResultBean<String> packing(@RequestParam("number")String number,@RequestParam("user")String user,
			@RequestParam("plant")String plant){
		Document document;
		String code = "-1";
		try {
			if(number.substring(0,2).equals("11")){
				UpdateAimt301Response_UpdateAimt301Response response
				= new TIPTOPServiceGateWayLocator()
					.getTIPTOPServiceGateWayPortType()
					.updateAimt301(new UpdateAimt301Request_UpdateAimt301Request(
							TiptopRequestUtils.buildPackingRequest(number,user,plant)));
			document = TiptopResponseUtils.createDocument(response.getResponse());
			code = TiptopResponseUtils.getStatusElementAttr(document, "code");
			}else{
				UpdateAsfi510Response_UpdateAsfi510Response response
				= new TIPTOPServiceGateWayLocator()
					.getTIPTOPServiceGateWayPortType()
					.updateAsfi510(new UpdateAsfi510Request_UpdateAsfi510Request(
							TiptopRequestUtils.buildPackingRequest(number,user,plant)));
			document = TiptopResponseUtils.createDocument(response.getResponse());
			code = TiptopResponseUtils.getStatusElementAttr(document, "code");
			}
			if("0".equals(code)) return new ResultBean<>(200, "发料成功");
			else {System.out.println("request xml : " + TiptopRequestUtils.buildPackingRequest(number,user,plant));
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
