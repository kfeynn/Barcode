package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.DocumentException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.barcode.app.controller.AppLoginController;
import com.barcode.app.model.BM;
import com.barcode.app.model.PN;
import com.barcode.app.model.PNSub;
import com.barcode.common.model.CUser;
import com.barcode.common.utils.JsonUtils;
import com.barcode.common.utils.TiptopRequestUtils;
import com.barcode.common.utils.TiptopResponseUtils;
import com.barcode.core.databases.DataSourceTypeManager;
import com.barcode.core.databases.DataSources;
import com.barcode.receiving.dao.DeliverDao;
import com.barcode.user.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class TestMybatis {

	@Autowired
	private DeliverDao deliverDao;
	
	@Test
	public void TestPart() throws Exception{
		PN pn = deliverDao.findPNByDnnum("GDS32-90010818091401");
		System.out.println(pn);
		for(PNSub pnsub : pn.getPnsubs()){
			System.out.println(pnsub.toString());
		}
	}
	
	@Autowired
	private IUserService userService;
	
	@Test
	public void TestSupplier() throws Exception{
		//DataSourceTypeManager.set(DataSources.local);
		//TiptopRequestUtils.buildQueryRNRequest("{"barcode": "GB220034000008191809280001"}");
		//CUser user = userService.appLogin("123", "123");
		//System.out.println(user);
		//DataSourceTypeManager.set(DataSources.S30);
		//int status = deliverDao.getPNStatusByDnnum("900108", "GDS32-90010818091201");
		//System.out.println(status);
		
	}
	
	public static void main(String[] args) throws DocumentException {
		StringBuilder responseBuilder = new StringBuilder();
		responseBuilder.append("<Response><Execution><Status code=\"-1\" sqlcode=\"0\" description=\"此批号已经有扫描过，请勿重复扫描!\"/></Execution><ResponseContent><Parameter/><Document/></ResponseContent></Response>");
		System.out.println(TiptopResponseUtils.getStatusElementAttr(TiptopResponseUtils.createDocument(responseBuilder.toString()), "code"));
		
	}
}
