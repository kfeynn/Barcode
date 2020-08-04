package com.barcode.ATS.model;

import java.util.List;

import com.barcode.app.model.RnBox;

public class Good extends RnBox {
	private List<GoodAddr> goodsAddrlist;
	/** 优先级 */
	private int priority;

	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public List<GoodAddr> getGoodsAddrlist() {
		return goodsAddrlist;
	}
	public void setGoodsAddrlist(List<GoodAddr> goodsAddrlist) {
		this.goodsAddrlist = goodsAddrlist;
	}

}
