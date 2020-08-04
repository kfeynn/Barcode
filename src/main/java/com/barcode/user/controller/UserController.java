package com.barcode.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.barcode.user.mapper.User;
import com.barcode.user.service.IUserService;

@Controller
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	@RequestMapping(value="info")
	public ModelAndView UserInfo(String gen01){
		System.out.println(gen01);
		User user = userService.findUser(gen01);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("user-manage/userinfo");
		mav.addObject("user", user);
		
		return mav;
	}
}
