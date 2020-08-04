package com.barcode.permission.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.barcode.common.dao.PermissionMapper;
import com.barcode.permission.service.IPermissionService;


@Service
public class PermissionServiceImpl implements IPermissionService {

	@Autowired
	PermissionMapper permissionMapper;
	
	public Set<String> findPermissionByUserId(int userId) {
		return permissionMapper.findPermissionByUserId(userId);
	}

	
}
