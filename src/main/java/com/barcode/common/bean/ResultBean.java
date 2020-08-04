package com.barcode.common.bean;

import java.io.Serializable;

/**
 * 返回结果bean
 * 
 * @param <T>
 */
public class ResultBean<T> implements Serializable {

	private static final long serialVersionUID = 1L;

	private int status;
	
	private String message;
	
	private T data;

	public ResultBean(int status, String message){
		super();
		this.status = status;
		this.message = message;
	}

	public ResultBean(int status, String message, T data) {
		super();
		this.status = status;
		this.message = message;
		this.data = data;
	}

	public int getStatus() {
		return status;
	}

	public String getMessage() {
		return message;
	}

	public T getData() {
		return data;
	}
}
