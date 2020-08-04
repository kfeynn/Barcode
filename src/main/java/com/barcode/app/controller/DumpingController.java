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
import com.barcode.app.model.BKbox;
import com.barcode.common.bean.ResultBean;
import com.barcode.common.utils.TiptopRequestUtils;
import com.barcode.common.utils.TiptopResponseUtils;
import com.barcode.tiptop.service.GetAsft670Request_GetAsft670Request;
import com.barcode.tiptop.service.GetAsft670Response_GetAsft670Response;
import com.barcode.tiptop.service.TIPTOPServiceGateWayLocator;
import com.barcode.tiptop.service.UpdateAsft670Request_UpdateAsft670Request;
import com.barcode.tiptop.service.UpdateAsft670Response_UpdateAsft670Response;

@Controller
@RequestMapping("/app")
public class DumpingController {
	@RequestMapping(value = "/appGetBKbox")
	@ResponseBody
	public ResultBean<List<BKbox>> appGetBKbox(@RequestParam("bkNum")String bkNum){
		String bkListjson="";
		String strs = "";
		List<BKbox> bkboxlist = null;
		String code = "-1";
		Document document;  
		System.out.println("+参数+"+bkNum);
		
		try {
			 //创建调拨发送请求对象,并接受tipto接口端返回来的数据
			GetAsft670Response_GetAsft670Response response
						= new TIPTOPServiceGateWayLocator()
							.getTIPTOPServiceGateWayPortType()
							.getAsft670(new GetAsft670Request_GetAsft670Request(
									TiptopRequestUtils.buildQueryBKboxRequest(bkNum)));
					document = TiptopResponseUtils.createDocument(response.getResponse());   //
					code = TiptopResponseUtils.getStatusElementAttr(document, "code");				
			if("0".equals(code)){  //正常则返回对应的数据
				bkListjson = TiptopResponseUtils.getValue(document, 1); //将xml转化为json
				bkboxlist = JSONArray.parseArray(bkListjson, BKbox.class);  //把获取的pkListjson转化到PKbox然后赋给list里面
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
			if (bkboxlist != null) {
				strs = "success";
			}
			int code1 = Integer.valueOf(code);
			return new ResultBean<>(code1, strs,bkboxlist);
	}
	//报废单过账请求
	@RequestMapping(value = "/dumping", method = RequestMethod.POST)
	@ResponseBody
	public ResultBean<String> dumping(@RequestParam("number")String number,@RequestParam("user")String user,
			@RequestParam("plant")String plant){
		Document document;
		String code = "-1";
		try {
				UpdateAsft670Response_UpdateAsft670Response response
				= new TIPTOPServiceGateWayLocator()
					.getTIPTOPServiceGateWayPortType()
					.updateAsft670(new UpdateAsft670Request_UpdateAsft670Request(
							TiptopRequestUtils.buildDumpingRequest(number,user,plant)));
			document = TiptopResponseUtils.createDocument(response.getResponse());
			code = TiptopResponseUtils.getStatusElementAttr(document, "code");
			
			if("0".equals(code)) return new ResultBean<>(200, "报废过账成功");
			else {System.out.println("request xml : " + TiptopRequestUtils.buildDumpingRequest(number,user,plant));
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
