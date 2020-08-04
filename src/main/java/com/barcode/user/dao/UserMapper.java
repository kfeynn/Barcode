package com.barcode.user.dao;

import org.apache.ibatis.annotations.Param;

import com.barcode.user.mapper.User;

public interface UserMapper {

	User findUser(@Param(value = "gen01") String gen01);
}
