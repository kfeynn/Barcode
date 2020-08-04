package com.barcode.app.model;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @author jiaquan.chen
 *
 */
public class TableResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private PN pn;
	
	private List<PNSub> pnsubList;
	
	private List<BM> bmList;
	
	private List<BM> rows;

	public TableResult() {
		super();
	}

	/*public TableResult(PN pn, List<PNSub> pnsubList, List<BM> bmList) {
		super();
		this.pn = pn;
		this.pnsubList = pnsubList;
		this.bmList = bmList;
	}*/
	
	public TableResult(PN pn, List<PNSub> pnsubList, List<BM> rows) {
		super();
		this.pn = pn;
		this.pnsubList = pnsubList;
		this.rows = rows;
	}

	public TableResult(List<BM> rows) {
		super();
		this.rows = rows;
	}

	public PN getPn() {
		return pn;
	}

	public void setPn(PN pn) {
		this.pn = pn;
	}

	public List<PNSub> getPnsubList() {
		return pnsubList;
	}

	public void setPnsubList(List<PNSub> pnsubList) {
		this.pnsubList = pnsubList;
	}

	public List<BM> getBmList() {
		return bmList;
	}

	public List<BM> getRows() {
		return rows;
	}

	public void setRows(List<BM> rows) {
		this.rows = rows;
	}

	public void setBmList(List<BM> bmList) {
		this.bmList = bmList;
	}

	@Override
	public String toString() {
		return "TableResult [pn=" + pn + ", pnsubList=" + pnsubList
				+ ", bmList=" + bmList + "]";
	}
}