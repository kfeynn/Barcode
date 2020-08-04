package com.barcode.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.barcode.common.bean.ResultBean;
import com.barcode.common.model.CUser;
import com.barcode.core.token.ShiroToken;
import com.barcode.core.token.manager.TokenManager;
import com.barcode.user.service.IUserService;

@Controller
@RequestMapping
public class UserLoginController {
	
	@Autowired
	private IUserService userService;
	
	@RequestMapping("home")
	public String index() {
		return "home";
	}
	
	@RequestMapping("toLogin")
	public String toLogin() {
		return "login";
	}
	
	@RequestMapping(value="blank")
	public ModelAndView Blank(){
		return new ModelAndView("common/index");
	}
	
	@RequestMapping(value="login", method=RequestMethod.POST)
	@ResponseBody
	public ResultBean<String> Login(@ModelAttribute("user") CUser user, boolean rememberMe,
			HttpServletRequest request, HttpServletResponse response){

		System.out.println("Controller login");
		System.out.println(user.toString());
		System.out.println(rememberMe);		

		//ShiroToken token = new ShiroToken(user.getUsername(), user.getPassword());
		try{
			//SecurityUtils.getSubject().login(token);
			user = TokenManager.login(user, rememberMe);
		}catch(UnknownAccountException e){
			System.out.println("账号或密码错误");
			return new ResultBean<String>(401, "账号或密码错误");
			//return "user/login";
		}

		return new ResultBean<String>(200, "登录成功", "blank.do");
		//return "home";
	}
}
