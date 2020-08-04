package com.barcode.app.controller;

import java.io.IOException;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.rpc.ServiceException;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.barcode.app.model.Box;
import com.barcode.app.model.ImgsBox;
import com.barcode.app.model.PN;
import com.barcode.app.model.PNSub;
import com.barcode.app.model.RnBox;
import com.barcode.common.bean.ResultBean;
import com.barcode.common.utils.TiptopRequestUtils;
import com.barcode.common.utils.TiptopResponseUtils;
import com.barcode.core.databases.DataSourceTypeManager;
import com.barcode.core.databases.DataSources;
import com.barcode.receiving.dao.DeliverDao;
import com.barcode.tiptop.service.CreateAimt324Request_CreateAimt324Request;
import com.barcode.tiptop.service.CreateAimt324Response_CreateAimt324Response;
import com.barcode.tiptop.service.CreateApmt110Request_CreateApmt110Request;
import com.barcode.tiptop.service.CreateApmt110Response_CreateApmt110Response;
import com.barcode.tiptop.service.CreateApmt720Request_CreateApmt720Request;
import com.barcode.tiptop.service.CreateApmt720Response_CreateApmt720Response;
import com.barcode.tiptop.service.GetApmt110Request_GetApmt110Request;
import com.barcode.tiptop.service.GetApmt110Response_GetApmt110Response;
import com.barcode.tiptop.service.GetImgsRequest_GetImgsRequest;
import com.barcode.tiptop.service.GetImgsResponse_GetImgsResponse;
import com.barcode.tiptop.service.TIPTOPServiceGateWayLocator;

@Controller
@RequestMapping("/app")
public class GoodsMoveController {
	@Autowired
	private DeliverDao deliverDao;
	
	@RequestMapping(value="appGetImgsBox")
	@ResponseBody
	private ResultBean<List<ImgsBox>> appGetImgsBox(@RequestParam("box_num") String box_num) throws IOException{
		String strs="success";
		String rnListjson="";    
		List<ImgsBox> imgsBoxlist = null;
		String rnNum = getRnNumbyboxNum(box_num);
		if(rnNum==null){
			return new ResultBean<>(200, "此箱号对应的收货单列表为空",null);
		}
		String plant = rnNum.substring(4,7);
		//String plant = "S10180328";
		Document document;
		try {
			GetImgsResponse_GetImgsResponse response
			= new TIPTOPServiceGateWayLocator()
				.getTIPTOPServiceGateWayPortType()
				.getImgs(new GetImgsRequest_GetImgsRequest(
						TiptopRequestUtils.buildQueryRNRequest(box_num,plant)));
			document = TiptopResponseUtils.createDocument(response.getResponse());
			
			String code = TiptopResponseUtils.getStatusElementAttr(document, "code");
			if("0".equals(code)){
				rnListjson = TiptopResponseUtils.getValue(document, 1);
			}else {
				strs = TiptopResponseUtils.getStatusElementAttr(document, "description");
			}
			imgsBoxlist = JSONArray.parseArray(rnListjson, ImgsBox.class);
			if(imgsBoxlist ==null){
				strs = "此箱号对应的收货单列表为空";
			}

			} catch (ServiceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (DocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return new ResultBean<>(200, strs,imgsBoxlist);

	}
	
	@RequestMapping(value = "/goodsMove", method = RequestMethod.POST)
	@ResponseBody
	public ResultBean<String> goodsMove(@RequestParam("RN")String pnStr,@RequestParam("plant")String plant){
		
		try {
			CreateAimt324Response_CreateAimt324Response response
				= new TIPTOPServiceGateWayLocator()
					.getTIPTOPServiceGateWayPortType()
					.createAimt324(new CreateAimt324Request_CreateAimt324Request(
							TiptopRequestUtils.buildgoodsMoveRequest(pnStr, plant)));
			Document document = TiptopResponseUtils.createDocument(response.getResponse());
			String code = TiptopResponseUtils.getStatusElementAttr(document, "code");
			if("0".equals(code)) return new ResultBean<>(200, "调拨成功");
			else {System.out.println("request xml : " + TiptopRequestUtils.buildGroundingRequest(pnStr, plant));
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
