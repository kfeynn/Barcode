package com.barcode.common.controller;


import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.UrlPathHelper;

import com.barcode.common.utils.LoggerUtils;
import com.barcode.common.utils.StringUtils;
import com.barcode.permission.service.IRoleService;
/**
 * 
 * @author tingfeng.zhou
 *
 */
@Controller
@Scope(value="prototype")
@RequestMapping("open")
public class CommonController extends BaseController {
	
	@Resource
	IRoleService roleService;
	
	/**
	 * 404错误
	 * @param request
	 * @return
	 */
	@RequestMapping("404")
	public ModelAndView _404(HttpServletRequest request){
		ModelAndView view = new ModelAndView("common/404");
		return view;
	}
	/**
	 * 500错误
	 * @param request
	 * @return
	 */
	@RequestMapping("500")
	public ModelAndView _500(HttpServletRequest request){
		ModelAndView view = new ModelAndView("common/500");
		
		Throwable t = (Throwable)request.getAttribute("javax.servlet.error.exception");
		String defaultMessage = "未知" ;
		if(null == t){
			view.addObject("line", defaultMessage);
			view.addObject("clazz", defaultMessage);
			view.addObject("methodName",defaultMessage);
			return view;
		}
		String message = t.getMessage() ;//错误信息
		StackTraceElement[] stack = t.getStackTrace();
		view.addObject("message", message);
		if(null != stack && stack.length != 0 ){
			StackTraceElement element = stack[0];
			int line = element.getLineNumber();//错误行号
			String clazz = element.getClassName();//错误java类
			String fileName = element.getFileName();
			
			String methodName = element.getMethodName() ;//错误方法
			view.addObject("line", line);
			view.addObject("clazz", clazz);
			view.addObject("methodName",methodName);
			LoggerUtils.fmtError(getClass(), "line:%s,clazz:%s,fileName:%s,methodName:%s()",
					line,clazz,fileName,methodName);
		}
		return view;
	}
	
	/**
	 * 踢出页面
	 * @return
	 */
	@RequestMapping(value="kickedOut",method=RequestMethod.GET)
	public ModelAndView kickedOut(HttpServletRequest request,UrlPathHelper pp){
		//如果是踢出后，来源地址是：http://shiro.itboy.net/u/login.shtml;JSESSIONID=4f1538d9-df19-48c8-b4b1-aadacadde23a
		//如果来源是null，那么就重定向到首页。这个时候，如果首页是要登录，那就会跳转到登录页
		if(StringUtils.isBlank(request.getHeader("Referer"))){
			return redirect("/");
		}
		return new ModelAndView("common/kicked_out");
	}
	/**
	 * 没有权限提示页面
	 * @return
	 */
	@RequestMapping(value="unauthorized",method=RequestMethod.GET)
	public ModelAndView unauthorized(){
		return new ModelAndView("common/unauthorized");
	}
}
