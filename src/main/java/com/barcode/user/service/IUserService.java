package com.barcode.user.service;

import java.util.Set;

import org.apache.ibatis.annotations.Param;

import com.barcode.common.model.CUser;
import com.barcode.user.mapper.User;


public interface IUserService {
	
	public CUser login(String employee, String email, String password);
	
	public User findUser(String gen01);
	
	public CUser appLogin(String employee, String password);
	
	//修改密码
	public void updateUserPassword(String employee, String password);

	
	public String findRole(int userid);
	
}
