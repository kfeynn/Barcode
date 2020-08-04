package com.barcode.common.model;

import java.io.Serializable;

import com.alibaba.fastjson.JSONObject;

/**
 * 角色{@link Role}和 权限{@link Permission}中间表
 */
public class RolePermission implements Serializable {
	private static final long serialVersionUID = 1L;
	/** {@link Role.id} */
	private int rid;
	/** {@link Permission.id} */
	private int pid;

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	@Override
	public String toString() {
		return JSONObject.toJSONString(this);
	}

}