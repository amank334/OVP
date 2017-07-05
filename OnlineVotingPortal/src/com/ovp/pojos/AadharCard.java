package com.ovp.pojos;

import java.util.Date;

public class AadharCard {
	protected int aadharNo;
	protected String aadharName;
	protected String aadharCountry;
	protected String aadharSex;
	protected Date aadharDOB;
	protected String aadharAddress;
	protected String aadharCity;
	protected String aadharDistrict;
	protected String aadharState;
	protected String aadharMobile;
	
	
	public AadharCard() {
		super();
	}
	public AadharCard(int aadharNo, String aadharName, String aadharCountry, String aadharSex, Date aadharDOB,
			String aadharAddress, String aadharCity, String aadharDistrict, String aadharState, String aadharMobile) {
		super();
		this.aadharNo = aadharNo;
		this.aadharName = aadharName;
		this.aadharCountry = aadharCountry;
		this.aadharSex = aadharSex;
		this.aadharDOB = aadharDOB;
		this.aadharAddress = aadharAddress;
		this.aadharCity = aadharCity;
		this.aadharDistrict = aadharDistrict;
		this.aadharState = aadharState;
		this.aadharMobile = aadharMobile;
	}
	public int getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(int aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getAadharName() {
		return aadharName;
	}
	public void setAadharName(String aadharName) {
		this.aadharName = aadharName;
	}
	public String getAadharCountry() {
		return aadharCountry;
	}
	public void setAadharCountry(String aadharCountry) {
		this.aadharCountry = aadharCountry;
	}
	public String getAadharSex() {
		return aadharSex;
	}
	public void setAadharSex(String aadharSex) {
		this.aadharSex = aadharSex;
	}
	public Date getAadharDOB() {
		return aadharDOB;
	}
	public void setAadharDOB(Date aadharDOB) {
		this.aadharDOB = aadharDOB;
	}
	public String getAadharAddress() {
		return aadharAddress;
	}
	public void setAadharAddress(String aadharAddress) {
		this.aadharAddress = aadharAddress;
	}
	public String getAadharCity() {
		return aadharCity;
	}
	public void setAadharCity(String aadharCity) {
		this.aadharCity = aadharCity;
	}
	public String getAadharDistrict() {
		return aadharDistrict;
	}
	public void setAadharDistrict(String aadharDistrict) {
		this.aadharDistrict = aadharDistrict;
	}
	public String getAadharState() {
		return aadharState;
	}
	public void setAadharState(String aadharState) {
		this.aadharState = aadharState;
	}
	public String getAadharMobile() {
		return aadharMobile;
	}
	public void setAadharMobile(String aadharMobile) {
		this.aadharMobile = aadharMobile;
	}
	@Override
	public String toString() {
		return "AadharCard [aadharNo=" + aadharNo + ", aadharName=" + aadharName + ", aadharCountry=" + aadharCountry
				+ ", aadharSex=" + aadharSex + ", aadharDOB=" + aadharDOB + ", aadharAddress=" + aadharAddress
				+ ", aadharCity=" + aadharCity + ", aadharDistrict=" + aadharDistrict + ", aadharState=" + aadharState
				+ ", aadharMobile=" + aadharMobile + "]";
	}
	
	
}
