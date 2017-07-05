package com.ovp.pojos;

public class ParliamentConstituency {
	protected int pConstId;
	protected int pConstNo;
	protected String pConstName;
	protected String pConstState;
	protected String uniqueConstId;

	public ParliamentConstituency() {
		super();
	}

	public ParliamentConstituency(int pConstNo, String pConstName, String pConstState, String uniqueConstId) {
		super();
		this.pConstNo = pConstNo;
		this.pConstName = pConstName;
		this.pConstState = pConstState;
		this.uniqueConstId = uniqueConstId;
	}

	public ParliamentConstituency(int pConstId, int pConstNo, String pConstName, String pConstState,
			String uniqueConstId) {
		super();
		this.pConstId = pConstId;
		this.pConstNo = pConstNo;
		this.pConstName = pConstName;
		this.pConstState = pConstState;
		this.uniqueConstId = uniqueConstId;
	}

	public int getpConstId() {
		return pConstId;
	}

	public void setpConstId(int pConstId) {
		this.pConstId = pConstId;
	}

	public int getpConstNo() {
		return pConstNo;
	}

	public void setpConstNo(int pConstNo) {
		this.pConstNo = pConstNo;
	}

	public String getpConstName() {
		return pConstName;
	}

	public void setpConstName(String pConstName) {
		this.pConstName = pConstName;
	}

	public String getpConstState() {
		return pConstState;
	}

	public void setpConstState(String pConstState) {
		this.pConstState = pConstState;
	}

	public String getUniqueConstId() {
		return uniqueConstId;
	}

	public void setUniqueConstId(String uniqueConstId) {
		this.uniqueConstId = uniqueConstId;
	}

	@Override
	public String toString() {
		return "ParliamentConstituency [pConstId=" + pConstId + ", pConstNo=" + pConstNo + ", pConstName=" + pConstName
				+ ", pConstState=" + pConstState + ", uniqueConstId=" + uniqueConstId + "]";
	}

}
