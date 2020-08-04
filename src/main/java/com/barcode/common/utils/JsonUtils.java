package com.barcode.common.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.barcode.app.model.Box;
import com.barcode.app.model.PN;
import com.barcode.app.model.PNSub;

public class JsonUtils {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static String buildReceivingJson(PN pn, String employee) {
		
		Map returnMap = new HashMap<>();
		
		Map<String, String> headMap = new HashMap<>();
		headMap.put("pmm01", pn.getDnnum().substring(2));
		headMap.put("pmm09", pn.getSupid());
		headMap.put("pmm04", pn.getPmn33());
		headMap.put("rvauser", employee);
		
		returnMap.put("head", headMap);
		List<Map> bodyList = new ArrayList<>();
		List<PNSub> pnSubs = pn.getPnsubs();
		for(PNSub pnSub : pnSubs){
			List<Box> boxs = pnSub.getBoxs();
			for(Box box : boxs){
				Map<String, String> bodyMap = new HashMap<>();
				bodyMap.put("pmn01", pnSub.getPmm01());
				bodyMap.put("pmn02", String.valueOf(pnSub.getPmn02()));
				bodyMap.put("lotnumber", box.getBoxnum());
				bodyMap.put("pmn04", pnSub.getPmn04());
				bodyMap.put("pmn20", String.valueOf(box.getPmn20()));
				bodyMap.put("pmn20a", String.valueOf(pnSub.getPmn87()));
				bodyList.add(bodyMap);
			}
		}
		returnMap.put("body", bodyList);
		
		return JSON.toJSONString(returnMap);
	}
	
}
