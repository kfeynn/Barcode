package com.barcode.core.token.manager;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;

import com.barcode.common.model.CUser;
import com.barcode.core.token.ShiroToken;

public class TokenManager {
	
	/**
	 * 登录
	 * @param user
	 * @param rememberMe
	 * @return
	 */
	public static CUser login(CUser user, boolean rememberMe){
		String username = null;
		if(user.getEmployee() != null) username = user.getEmployee();
		if(user.getEmail() != null) username = user.getEmail();
		ShiroToken token = new ShiroToken(username, user.getPassword());
		token.setRememberMe(rememberMe);
		SecurityUtils.getSubject().login(token);
		return getToken();
	}
	
	/**
	 * 获取当前用户的登录信息
	 * @return
	 */
	public static CUser getToken(){
		CUser user = (CUser)SecurityUtils.getSubject().getPrincipal();
		return user;
	}
	
	/**
	 * 获取当前用户的Session
	 * @return
	 */
	public static Session getSession(){
		return SecurityUtils.getSubject().getSession();
	}
	
	/**
	 * 获取当前用户的id
	 * @return
	 */
	public static int getUserId(){
		return getToken().getId();
	}
}
