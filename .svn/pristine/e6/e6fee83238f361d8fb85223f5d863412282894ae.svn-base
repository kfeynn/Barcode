package com.barcode.common.dao;

import org.apache.ibatis.annotations.Param;

import com.barcode.common.model.CUser;

public interface CUserMapper {

    CUser findUserByEmployeeOrEmail(@Param("employee") String employee,
    		@Param("email") String email,
    		@Param("password") String password);
    
    CUser findUserByEmployee(@Param("employee") String employee,
    		@Param("password") String password);
    
    void appupdateUserPassword(@Param(value = "employee") String employee,
			@Param(value = "password") String password);
}