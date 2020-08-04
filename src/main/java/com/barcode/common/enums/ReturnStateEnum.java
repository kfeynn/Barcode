package com.barcode.common.enums;

public enum ReturnStateEnum {

	SUCCESS(200, "成功"),ERROR(400, "系统错误");
	
	private int state;
	
	private String stateInfo;

	private ReturnStateEnum(int state, String stateInfo) {
		this.state = state;
		this.stateInfo = stateInfo;
	}

	public int getState() {
		return state;
	}

	public String getStateInfo() {
		return stateInfo;
	}
	
	public static ReturnStateEnum stateOf(int index) {
		for (ReturnStateEnum state : values()) {
			if (state.getState() == index) {
				return state;
			}
		}
		return null;
	}
}
