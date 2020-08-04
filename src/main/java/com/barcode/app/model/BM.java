package com.barcode.app.model;

import java.io.Serializable;

public class BM implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/** 采购单号 */
	private String pmm01;
	/** 项次 */
	private int pmn02;
	/** 箱号 */
	private String boxnum;
	/** 批次 */
	private String lot;
	/** 内标签号 */
	private String id;
	/** 料号 */
	private String pmn04;
	/** 品名 */
	private String pmn041;
	/** 数量 */
	private int pmn20;
	public BM() {
		super();
	}
	public BM(String pmm01, int pmn02, String boxnum, String lot, String id,
			String pmn04, String pmn041, int pmn20) {
		super();
		this.pmm01 = pmm01;
		this.pmn02 = pmn02;
		this.boxnum = boxnum;
		this.lot = lot;
		this.id = id;
		this.pmn04 = pmn04;
		this.pmn041 = pmn041;
		this.pmn20 = pmn20;
	}
	public String getBoxnum() {
		return boxnum;
	}
	public void setBoxnum(String boxnum) {
		this.boxnum = boxnum;
	}
	public String getPmm01() {
		return pmm01;
	}
	public void setPmm01(String pmm01) {
		this.pmm01 = pmm01;
	}
	public int getPmn02() {
		return pmn02;
	}
	public void setPmn02(int pmn02) {
		this.pmn02 = pmn02;
	}
	public String getLot() {
		return lot;
	}
	public void setLot(String lot) {
		this.lot = lot;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPmn04() {
		return pmn04;
	}
	public void setPmn04(String pmn04) {
		this.pmn04 = pmn04;
	}
	public String getPmn041() {
		return pmn041;
	}
	public void setPmn041(String pmn041) {
		this.pmn041 = pmn041;
	}
	public int getPmn20() {
		return pmn20;
	}
	public void setPmn20(int pmn20) {
		this.pmn20 = pmn20;
	}
	@Override
	public String toString() {
		return "BM [boxnum=" + boxnum + ", pmm01=" + pmm01 + ", pmn02=" + pmn02
				+ ", id=" + id + ", pmn04=" + pmn04 + ", pmn041=" + pmn041
				+ ", pmn20=" + pmn20 + "]";
	}
	
}
