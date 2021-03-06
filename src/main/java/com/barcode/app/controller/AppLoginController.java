package com.barcode.app.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.rpc.ServiceException;

import net.sf.json.JsonConfig;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UnknownAccountException;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONArray;
import com.barcode.app.model.Box;
import com.barcode.app.model.PN;
import com.barcode.app.model.PNSub;
import com.barcode.app.model.RnBox;
import com.barcode.app.tool.AppUtil;
import com.barcode.common.bean.ResultBean;
import com.barcode.common.model.CUser;
import com.barcode.common.utils.TiptopRequestUtils;
import com.barcode.common.utils.TiptopResponseUtils;
import com.barcode.core.databases.DataSourceTypeManager;
import com.barcode.core.databases.DataSources;
import com.barcode.core.token.ShiroToken;
import com.barcode.core.token.manager.TokenManager;
import com.barcode.receiving.dao.DeliverDao;
import com.barcode.tiptop.service.CreateApmt110Request_CreateApmt110Request;
import com.barcode.tiptop.service.CreateApmt110Response_CreateApmt110Response;
import com.barcode.tiptop.service.GetApmt110Request_GetApmt110Request;
import com.barcode.tiptop.service.GetApmt110Response_GetApmt110Response;
import com.barcode.tiptop.service.TIPTOPServiceGateWayLocator;
import com.barcode.user.mapper.User;
import com.barcode.user.service.IUserService;
import com.sun.org.apache.bcel.internal.generic.NEW;

@Controller
@RequestMapping("/app")
public class AppLoginController {
	
	public static List<CUser> cUserList = new ArrayList<>();
	
	@Autowired
	private IUserService userService;
	@Autowired
	private DeliverDao deliverDao;
	
	private  String versionFile = "version.txt";
/*	@RequestMapping(value="appLogin", method=RequestMethod.POST)
	@ResponseBody
	public ResultBean<String> appLogin(@ModelAttribute("user") CUser user, boolean rememberMe,
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
	}*/
	
	@RequestMapping(value="appLogin",method=RequestMethod.POST)
	@ResponseBody
	private ResultBean<CUser> appLogin(@RequestParam("employee") String employee,
			@RequestParam("password") String password) throws IOException{
		DataSourceTypeManager.reset();
		CUser user = userService.appLogin(employee, password);
		cUserList.add(user);
		if(user != null){
			String role = userService.findRole(user.getId());
			user.setRole(role);
		}
		JsonConfig config = new JsonConfig();
		config.setExcludes(new String[]{"createTime","lastLoginTime"});//除去dept属性
	  return new ResultBean<>(200, "success",user);
	}
	
	@RequestMapping(value="Test",method=RequestMethod.GET)
	@ResponseBody
	private String Test()  {
		 
	  return "aaaaaa000";
	}
	
	
	
	
	@RequestMapping(value="appGetUpdateVersion")
	@ResponseBody
	private ResultBean<String> appGetUpdateVersion() throws IOException, URISyntaxException{
		String classPath = this.getClass().getResource("/").toURI().getPath() ;
		String path = classPath.substring(0, classPath.indexOf("WEB-INF")) +"update/"+versionFile;
		File f = new File(path);
		int length = (int) f.length();
		byte[] buff = new byte[length];
        FileInputStream fin=new FileInputStream(f);  
        fin.read(buff);  
        fin.close();  
        String result = new String(buff);
        return new ResultBean<>(200, "success",result);
	}
	
	@RequestMapping(value="appGetChangePwPath")
	@ResponseBody
	private ResultBean<CUser> appGetChangePwPath(@RequestParam("employee") String employee,@RequestParam("password") String password
			) throws IOException{
		System.out.println(employee);
		System.out.println(password);
		userService.updateUserPassword(employee, password);
		CUser user = userService.appLogin(employee, password);
		JsonConfig config = new JsonConfig();
		//config.setExcludes(new String[]{"createTime","lastLoginTime"});//除去dept属性
	  //封装数据  
		String strs="";
		if(user ==null){
			strs= "密码修改失败"; 
		}else{
			strs= "密码修改成功";  
		}
		return new ResultBean<>(200, strs,user);
	}
}
