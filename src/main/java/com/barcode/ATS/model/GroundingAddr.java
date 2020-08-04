package com.barcode.ATS.model;

import java.util.List;

public class GroundingAddr {
	/*储位*/
    private String tlf902;
    /*需要上架的物品*/
    public List<Good> goodsList;
	public String getTlf902() {
		return tlf902;
	}
	public void setTlf902(String tlf902) {
		this.tlf902 = tlf902;
	}
	public List<Good> getGoodsList() {
		return goodsList;
	}
	public void setGoodsList(List<Good> goodsList) {
		this.goodsList = goodsList;
	}

    
}
