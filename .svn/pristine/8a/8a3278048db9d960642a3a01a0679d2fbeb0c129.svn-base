package com.barcode.common.dao;

import java.util.List;
import java.util.Map;

import com.barcode.common.model.CUserRole;


public interface CUserRoleMapper {
    int insert(CUserRole record);

    int insertSelective(CUserRole record);

	int deleteByUserId(Long id);

	int deleteRoleByUserIds(Map<String, Object> resultMap);

	List<Long> findUserIdByRoleId(Long id);
}