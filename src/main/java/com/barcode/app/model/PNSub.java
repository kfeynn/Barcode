package com.barcode.app.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 送货单身实体类
 * @author jiaquan.chen
 *
 */
public class PNSub implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/** 序号 */
	private int id;
	/** 采购单号 */
	private String pmm01;
	/** 项次 */
	private int pmn02;
	/** 料号 */
	private String pmn04;
	/** 品名 */
	private String pmn041;
	/** 规格 */
	private String ima021;
	/** 单位 */
	private String pmn86;
	/** 数量 */
	private double pmn20;
	/** 计价数量 */
	private double pmn87;
	/** 单位 */
	private String pmn07;
	/** 状态 */
	private int status;
	/** 关联外键 */
	private String sdnnum;
    /** 收货单项次 */
    private int rvb02;
    /** 允许入库数量 */
    private double rvb07;
    /** 本次入库数量 */
    private double rvv17a;
    
	private PN pn;
	private List<Box> boxs = new ArrayList<Box>();

	
	public PNSub() {
		super();
	}
	public PNSub(int id, String pmm01, int pmn02, String pmn04, String pmn041,
			String ima021, String pmn86, double pmn20, double pmn87,
			String pmn07, int status, String sdnnum, PN pn, List<Box> boxs) {
		super();
		this.id = id;
		this.pmm01 = pmm01;
		this.pmn02 = pmn02;
		this.pmn04 = pmn04;
		this.pmn041 = pmn041;
		this.ima021 = ima021;
		this.pmn86 = pmn86;
		this.pmn20 = pmn20;
		this.pmn87 = pmn87;
		this.pmn07 = pmn07;
		this.status = status;
		this.sdnnum = sdnnum;
		this.pn = pn;
		this.boxs = boxs;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getIma021() {
		return ima021;
	}
	public void setIma021(String ima021) {
		this.ima021 = ima021;
	}
	public String getPmn86() {
		return pmn86;
	}
	public void setPmn86(String pmn86) {
		this.pmn86 = pmn86;
	}
	public double getPmn20() {
		return pmn20;
	}
	public void setPmn20(double pmn20) {
		this.pmn20 = pmn20;
	}
	public double getPmn87() {
		return pmn87;
	}
	public void setPmn87(double pmn87) {
		this.pmn87 = pmn87;
	}
	public String getPmn07() {
		return pmn07;
	}
	public void setPmn07(String pmn07) {
		this.pmn07 = pmn07;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getSdnnum() {
		return sdnnum;
	}
	public void setSdnnum(String sdnnum) {
		this.sdnnum = sdnnum;
	}
	public PN getPn() {
		return pn;
	}
	public void setPn(PN pn) {
		this.pn = pn;
	}
	
	public List<Box> getBoxs() {
		return boxs;
	}
	public void setBoxs(List<Box> boxs) {
		this.boxs = boxs;
	}
	

	public int getRvb02() {
		return rvb02;
	}
	public void setRvb02(int rvb02) {
		this.rvb02 = rvb02;
	}
	
	public double getRvb07() {
		return rvb07;
	}
	public void setRvb07(double rvb07) {
		this.rvb07 = rvb07;
	}
	public double getRvv17a() {
		return rvv17a;
	}
	public void setRvv17a(double rvv17a) {
		this.rvv17a = rvv17a;
	}
	@Override
	public String toString() {
		return "PNSub [id=" + id + ", pmm01=" + pmm01 + ", pmn02=" + pmn02
				+ ", pmn04=" + pmn04 + ", pmn041=" + pmn041 + ", ima021="
				+ ima021 + ", pmn86=" + pmn86 + ", pmn20=" + pmn20 + ", pmn87="
				+ pmn87 + ", pmn07=" + pmn07 + ", status=" + status
				+ ", sdnnum=" + sdnnum + ", pn=" + pn + ", boxs=" + boxs + "]";
	}
}
