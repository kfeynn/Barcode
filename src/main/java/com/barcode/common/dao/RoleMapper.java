package com.barcode.common.dao;

import java.util.Set;

import org.apache.ibatis.annotations.Param;

public interface RoleMapper {

	String appfindRoleByUserId(@Param("userId") int userId);
	
	Set<String> findRoleByUserId(@Param("userId") int userId);
}