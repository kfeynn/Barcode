package com.barcode.app.model;

import java.io.Serializable;

/**
 * 内标签实体类
 * @author jiaquan.chen
 *
 */
public class Mater implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/** 批次 */
	private String pmn02;
	/** 料号 */
	private String pmn04;
	/** 数量 */
	private double pmn20;
	/** 品名 */
	private String pmn041;
	/** 内标签号 */
	private String id;
	/** 状态 */
	private int status;
	
	private Box box;

	public Mater() {
		super();
	}
	public Mater(String pmn02, String pmn04, double pmn20, String pmn041,
			String id, int status, Box box) {
		super();
		this.pmn02 = pmn02;
		this.pmn04 = pmn04;
		this.pmn20 = pmn20;
		this.pmn041 = pmn041;
		this.id = id;
		this.status = status;
		this.box = box;
	}
	public String getLot() {
		return pmn02;
	}
	public void setLot(String lot) {
		this.pmn02 = lot;
	}
	public String getPmn04() {
		return pmn04;
	}
	public void setPmn04(String pmn04) {
		this.pmn04 = pmn04;
	}
	public double getPmn20() {
		return pmn20;
	}
	public void setPmn20(double pmn20) {
		this.pmn20 = pmn20;
	}
	public String getPmn041() {
		return pmn041;
	}
	public void setPmn041(String pmn041) {
		this.pmn041 = pmn041;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Box getBox() {
		return box;
	}
	public void setBox(Box box) {
		this.box = box;
	}
	@Override
	public String toString() {
		return "Mater [pmn02=" + pmn02 + ", pmn04=" + pmn04 + ", pmn20="
				+ pmn20 + ", pmn041=" + pmn041 + ", id=" + id + ", status="
				+ status + ", box=" + box + "]";
	}
}
