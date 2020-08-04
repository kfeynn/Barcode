package com.barcode.ATS.controller;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.rpc.ServiceException;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.barcode.ATS.model.Good;
import com.barcode.ATS.model.GoodAddr;
import com.barcode.ATS.model.GroundingAddr;
import com.barcode.app.controller.GroundingController;
import com.barcode.app.model.RnBox;
import com.barcode.common.bean.ResultBean;
import com.barcode.common.utils.TiptopRequestUtils;
import com.barcode.common.utils.TiptopResponseUtils;
import com.barcode.core.databases.DataSourceTypeManager;
import com.barcode.core.databases.DataSources;
import com.barcode.receiving.dao.DeliverDao;
import com.barcode.tiptop.service.GetApmt110Request_GetApmt110Request;
import com.barcode.tiptop.service.GetApmt110Response_GetApmt110Response;
import com.barcode.tiptop.service.GetAsmq2021Request_GetAsmq2021Request;
import com.barcode.tiptop.service.GetAsmq2021Response_GetAsmq2021Response;
import com.barcode.tiptop.service.TIPTOPServiceGateWayLocator;
import com.sun.org.apache.bcel.internal.generic.NEW;

@Controller
@RequestMapping("/ATS")
public class AutoGroundingController {
	public static List<GroundingAddr> groundingAddrsList = new ArrayList<GroundingAddr>();
	@Autowired
	private DeliverDao deliverDao;
	@RequestMapping(value = "/getGood")
	@ResponseBody
	public ResultBean<List<Good>> getGood(String boxnum,String tlf902) throws RemoteException{
		String strs="success";
		String goodsListjson="";
		String goodsAddrListjson="";
		List<Good> goodslist = null;
		List<GoodAddr> goodAddrsList = null;
		String rnNum = getRnNumbyboxNum(boxnum);
		if(rnNum==null){
			return new ResultBean<>(200, "此箱号对应的收货单列表为空",null);
		}
		String plant = rnNum.substring(4,7);
		//String plant = "S10180328";
		Document document;
		try {
			GetApmt110Response_GetApmt110Response response
			= new TIPTOPServiceGateWayLocator()
				.getTIPTOPServiceGateWayPortType()
				.getApmt110(new GetApmt110Request_GetApmt110Request(
						TiptopRequestUtils.buildQueryRNRequest(boxnum,plant)));
			document = TiptopResponseUtils.createDocument(response.getResponse());
			
			String code = TiptopResponseUtils.getStatusElementAttr(document, "code");
			if("0".equals(code)){
				goodsListjson = TiptopResponseUtils.getValue(document, 1);
			}else {
				strs = TiptopResponseUtils.getStatusElementAttr(document, "description");
			}
			goodslist = JSONArray.parseArray(goodsListjson, Good.class);
			String  rvb05 = "";
			if(goodslist.size()>0){
				for(Good good : goodslist){
					if(good.getBarcode().equals(boxnum)){
						rvb05 = good.getRvb05();
						break;
					}
				}
                Iterator<Good> it = goodslist.iterator();
                //移除不是对应物料
                while (it.hasNext())
                {
                    Good good = it.next();
                    if (!good.getRvb05().equals(rvb05))
                    {
                        it.remove();
                    }
                }
				GetAsmq2021Response_GetAsmq2021Response response1
				= new TIPTOPServiceGateWayLocator()
					.getTIPTOPServiceGateWayPortType()
					.getAsmq2021(new GetAsmq2021Request_GetAsmq2021Request(
							TiptopRequestUtils.buildQueryGoodAddrRequest(rvb05, plant, tlf902)));
				document = TiptopResponseUtils.createDocument(response1.getResponse());
			}
			String code1 = TiptopResponseUtils.getStatusElementAttr(document, "code");
			if("0".equals(code1)){
				goodsAddrListjson = TiptopResponseUtils.getValue(document, 1);
			}else {
				strs = TiptopResponseUtils.getStatusElementAttr(document, "description");
			}
			goodAddrsList = JSONArray.parseArray(goodsAddrListjson, GoodAddr.class);
			if(goodAddrsList.size()>0){
				for(Good good : goodslist){
					good.setGoodsAddrlist(goodAddrsList);
				}
			}
			} catch (ServiceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (DocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return new ResultBean<>(200, strs,goodslist);
	}
	
	
	public String getRnNumbyboxNum(String box_num){
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
						if(rnNum == null){
							DataSourceTypeManager.set(DataSources.S10);
							rnNum = deliverDao.getRnNumbyBoxnum("s10.ibb_file",box_num);
							if(rnNum == null){
								DataSourceTypeManager.set(DataSources.Test);
								rnNum = deliverDao.getRnNumbyBoxnum("s10180328.ibb_file",box_num);
								if(rnNum == null){
									DataSourceTypeManager.set(DataSources.S31);
									rnNum = deliverDao.getRnNumbyBoxnum("s31.ibb_file",box_num);
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
	
	@RequestMapping(value = "/onGrounding", method = RequestMethod.POST)
	@ResponseBody
	public ResultBean<List<GroundingAddr>> onGrounding(String data){
		String strs="success";
		Good good = null;
		List<Good> goodslist = null;
		List<GoodAddr> goodAddrsList = null;
		goodslist = JSONArray.parseArray(data, Good.class);
		getGroundingAddrList(goodslist);
		return new ResultBean<>(200, strs,groundingAddrsList);
	}
	
	private void getGroundingAddrList(List<Good> goodsList){
		for (Good good : goodsList) {
			GroundingAddr groundingAddr = new GroundingAddr();
			groundingAddr.goodsList = new ArrayList<Good>();
			if(groundingAddrsList.size()>0){
				for (GroundingAddr groundingAddr2 : groundingAddrsList) {
					if(good.getGoodsAddrlist().get(0).getTlf902().equals(groundingAddr2.getTlf902())){
						groundingAddr2.getGoodsList().add(good);
					}else {
						groundingAddr.setTlf902(good.getGoodsAddrlist().get(0).getTlf902());
						groundingAddr.goodsList.add(good);
						groundingAddrsList.add(groundingAddr);
					}
				}
			}else {
				groundingAddr.setTlf902(good.getGoodsAddrlist().get(0).getTlf902());
				groundingAddr.goodsList.add(good);
				groundingAddrsList.add(groundingAddr);
			}
		}
	}
}
