package com.barcode.permission.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.barcode.common.dao.RoleMapper;
import com.barcode.permission.service.IRoleService;


@Service
public class RoleServiceImpl implements IRoleService {
	
	@Autowired
	RoleMapper roleMapper;

	public String appfindRoleByUserId(int userId) {
		return roleMapper.appfindRoleByUserId(userId);
	}

	@Override
	public Set<String> findRoleByUserId(int userId) {
		// TODO Auto-generated method stub
		return roleMapper.findRoleByUserId(userId);
	}

	
}
