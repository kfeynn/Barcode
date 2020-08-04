package com.barcode.permission.service;

import java.util.Set;

public interface IPermissionService {

	Set<String> findPermissionByUserId(int userId);
}
