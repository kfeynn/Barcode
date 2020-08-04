package com.barcode.common.model;

import java.io.Serializable;

import com.alibaba.fastjson.JSONObject;

public class Permission implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	/** 操作地址 */
	private String url;
	/** 操作名称 */
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return JSONObject.toJSONString(this);
	}

}
