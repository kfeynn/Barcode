package com.barcode.core.token;

import java.util.Set;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.barcode.common.model.CUser;
import com.barcode.core.token.manager.TokenManager;
import com.barcode.permission.service.IPermissionService;
import com.barcode.permission.service.IRoleService;
import com.barcode.user.service.IUserService;


public class SimpleRealm extends AuthorizingRealm {
	
	@Autowired
	IUserService userService;
	@Autowired
	IPermissionService permissionService;
	@Autowired
	IRoleService roleService;

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection pc) {
		int userId = TokenManager.getUserId();
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		Set<String> permissions = permissionService.findPermissionByUserId(userId);
		info.setStringPermissions(permissions);
		Set<String> roles = roleService.findRoleByUserId(userId);
		info.setRoles(roles);
		return info;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken at) throws AuthenticationException {
		ShiroToken token = (ShiroToken) at;

		String username = token.getUsername();
		String password = token.getPswd();
		if (username != null && !"".equals(username)) {
			CUser user = null;
			if(username.indexOf("GT") > -1) 
				user = userService.login(username, null, password);
			if(username.indexOf("@") > -1) 
				user = userService.login(null, username, password);
			if (user != null) {
				System.out.println("user:" + user.toString());
				//登录成功，添加登录凭证
				return new SimpleAuthenticationInfo(user, user.getPassword(), getName());
			}
		}

		return null;
	}

}
