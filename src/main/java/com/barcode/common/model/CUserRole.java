package com.barcode.common.model;

import java.io.Serializable;

import com.alibaba.fastjson.JSONObject;

public class CUserRole implements Serializable {

	private static final long serialVersionUID = 1L;
	/** {@link CUser.id} */
	private int uid;
	/** {@link Role.id} */
	private int rid;

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	@Override
	public String toString() {
		return JSONObject.toJSONString(this);
	}

}
