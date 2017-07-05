package com.ovp.pojos;

public class AssemblyConstituency {
	protected int aConstId;
	protected int aConstNo;
	protected String aConstName;
	protected String aConstState;
	protected int pConstId;
	protected String uniqueConstId;

	public AssemblyConstituency() {
		super();
	}

	public AssemblyConstituency(int aConstNo, String aConstName, String aConstState, int pConstId,
			String uniqueConstId) {
		super();
		this.aConstNo = aConstNo;
		this.aConstName = aConstName;
		this.aConstState = aConstState;
		this.pConstId = pConstId;
		this.uniqueConstId = uniqueConstId;
	}

	public AssemblyConstituency(int aConstId, int aConstNo, String aConstName, String aConstState, int pConstId,
			String uniqueConstId) {
		super();
		this.aConstId = aConstId;
		this.aConstNo = aConstNo;
		this.aConstName = aConstName;
		this.aConstState = aConstState;
		this.pConstId = pConstId;
		this.uniqueConstId = uniqueConstId;
	}

	public int getaConstId() {
		return aConstId;
	}

	public void setaConstId(int aConstId) {
		this.aConstId = aConstId;
	}

	public int getaConstNo() {
		return aConstNo;
	}

	public void setaConstNo(int aConstNo) {
		this.aConstNo = aConstNo;
	}

	public String getaConstName() {
		return aConstName;
	}

	public void setaConstName(String aConstName) {
		this.aConstName = aConstName;
	}

	public String getaConstState() {
		return aConstState;
	}

	public void setaConstState(String aConstState) {
		this.aConstState = aConstState;
	}

	public int getpConstId() {
		return pConstId;
	}

	public void setpConstId(int pConstId) {
		this.pConstId = pConstId;
	}

	public String getUniqueConstId() {
		return uniqueConstId;
	}

	public void setUniqueConstId(String uniqueConstId) {
		this.uniqueConstId = uniqueConstId;
	}

	@Override
	public String toString() {
		return "AssemblyConstituency [aConstId=" + aConstId + ", aConstNo=" + aConstNo + ", aConstName=" + aConstName
				+ ", aConstState=" + aConstState + ", pConstId=" + pConstId + ", uniqueConstId=" + uniqueConstId + "]";
	}

}
