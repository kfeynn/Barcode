package com.barcode.receiving.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.barcode.app.model.BM;
import com.barcode.app.model.TableResult;
import com.barcode.common.bean.ResultBean;
import com.barcode.receiving.service.IDeliverService;

@Controller
@RequestMapping("/deliver")
public class DeliverController {
	
	@Autowired
	private IDeliverService deliverService;
	
	@RequestMapping("/deliverPage")
	public String deliverPage(){
		return "receiving-manage/editdeliver";
	}

	@RequestMapping(value = "/query", method=RequestMethod.POST)
	@ResponseBody
	public TableResult queryDeliverByPN(@RequestParam("index") String index,
										 @RequestParam("content") String content){

		return deliverService.queryDeliverByPN(index, content);
	}
	
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	@ResponseBody
	public ResultBean<String> updateDeliverInfo(@RequestBody BM[] bmList){
		//{dnnum=S37-5105011807160001, modifyList=[{materId=GL6000009440029, pmn20=40}], deleteList=[{materId=GL6000009440030}]}
		
		try {
			deliverService.updatePN(bmList);
			return new ResultBean<String>(200, "送货单更新成功");
		}
		catch(Exception e) {
			return new ResultBean<String>(1001, "送货单更新失败");
		}
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	@ResponseBody
	public ResultBean<String> deleteDeliverInfo(@RequestBody BM[] bmList){
		
		try {
			deliverService.deletePN(bmList);
			return new ResultBean<String>(200, "送货单删除成功");
		}
		catch(Exception e) {
			return new ResultBean<String>(1001, "送货单删除失败");
		}
	}
}
