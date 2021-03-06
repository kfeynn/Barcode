package com.barcode.app.controller;

import java.io.IOException;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import net.sf.json.JsonConfig;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.barcode.app.model.Box;
import com.barcode.app.model.PN;
import com.barcode.common.bean.ResultBean;
import com.barcode.common.utils.TiptopRequestUtils;
import com.barcode.common.utils.TiptopResponseUtils;
import com.barcode.core.databases.DataSourceTypeManager;
import com.barcode.core.databases.DataSources;
import com.barcode.receiving.dao.DeliverDao;
import com.barcode.tiptop.service.CreateApmt110Request_CreateApmt110Request;
import com.barcode.tiptop.service.CreateApmt110Response_CreateApmt110Response;
import com.barcode.tiptop.service.TIPTOPServiceGateWayLocator;

@Controller
@RequestMapping("/app")
public class ReceivingController {
	@Autowired
	private DeliverDao deliverDao;
	
	@RequestMapping(value = "/receiving", method = RequestMethod.POST)
	@ResponseBody
	public ResultBean<String> receiving(@RequestParam("PN")String pnStr,@RequestParam("plant")String plant){
		
		try {
			CreateApmt110Response_CreateApmt110Response response
				= new TIPTOPServiceGateWayLocator()
					.getTIPTOPServiceGateWayPortType()
					.createApmt110(new CreateApmt110Request_CreateApmt110Request(
							TiptopRequestUtils.buildReceivingRequest(pnStr, plant)));
			Document document = TiptopResponseUtils.createDocument(response.getResponse());
			String code = TiptopResponseUtils.getStatusElementAttr(document, "code");
			if("0".equals(code)) return new ResultBean<>(200, "收货成功");
			else {System.out.println("request xml : " + TiptopRequestUtils.buildReceivingRequest(pnStr, plant));
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
		
		//return new ResultBean<>(200, "收货成功");
	}
	
	@RequestMapping(value="appGetDnMaterialList")
	@ResponseBody
	private ResultBean<PN> appGetDnMaterialList(@RequestParam("dn_num") String dn_num) 
			throws IOException{
		DataSourceTypeManager.reset();
		PN pn = deliverDao.findPNByDnnum(dn_num);
		String strs="";
		if(pn==null){
			strs= "无数据返回"; 
			return new ResultBean<>(200, strs,pn);
		}else if(pn.getStatus()==0){
			strs= "此送货单已设置为无效";
			pn = null;
			return new ResultBean<>(200, strs,pn);
		}
		//送货单类型管控 0为送货单1为退货单
		int rejectflag1=pn.getRejectflag();
		if(rejectflag1==1){
			strs="此单为退货单非送货单";
			pn=null;
			return new ResultBean<>(200, strs,pn);
		}
		DataSourceTypeManager.set(DataSources.S30);
		System.out.println(pn.getDnnum().substring(2,pn.getDnnum().length()));
		String dnnum1 = pn.getDnnum();
		String dnnum2 = dnnum1.substring(2,pn.getDnnum().length());
		String tablename = pn.getPlant().substring(0, 2)+"0.rva_file";
		int receiving_status = deliverDao.getPNStatusByDnnum(tablename,pn.getSupid(), dnnum1, dnnum2);		
		pn.setReceiving_status(receiving_status);
	  //封装数据 
		if(pn.getStatus() == 1){
			strs= "success";  
		}else{
			strs= "二维码失效"; 
		}
		return new ResultBean<>(200, strs,pn);
	}
	
	@RequestMapping(value="appGetBox")
	@ResponseBody
	private ResultBean<Box> appGetBox(@RequestParam("boxnum") String boxnum) 
			throws IOException{
		DataSourceTypeManager.reset();
		Box box = deliverDao.getBoxByBoxnum(boxnum);
		String msg;
		if(box==null){
			msg = "箱标贴返回null";
		}else {
			msg = "success";
		}		
		return new ResultBean<>(200, msg,box);
	}
}
