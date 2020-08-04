package com.barcode.user.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.barcode.common.dao.CUserMapper;
import com.barcode.common.dao.RoleMapper;
import com.barcode.common.model.CUser;
import com.barcode.user.dao.UserMapper;
import com.barcode.user.mapper.User;
import com.barcode.user.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{
	
	@Autowired
	private CUserMapper cuserMapper;
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private RoleMapper roleMapper;

	public CUser login(String employee, String email, String password) {
		return cuserMapper.findUserByEmployeeOrEmail(employee, email, password);
	}


	public User findUser(String gen01) {
		return userMapper.findUser(gen01);
	}


	public CUser appLogin(String employee, String password) {
		return cuserMapper.findUserByEmployee(employee, password);
	}


	public String findRole(int userid) {
		return roleMapper.appfindRoleByUserId(userid);
	}


	@Override
	public void updateUserPassword(String employee, String password) {
		// TODO Auto-generated method stub
		cuserMapper.appupdateUserPassword(employee,password);
	}

	
	


}
