package com.ovp.pojos;

public class MainAdmin {
	protected int adminId;
	protected String adminUserId;
	protected String adminPassword;
	protected String adminEmail;

	public MainAdmin() {
		super();
	}

	public MainAdmin(String adminUserId, String adminPassword, String adminEmail) {
		super();
		this.adminUserId = adminUserId;
		this.adminPassword = adminPassword;
		this.adminEmail = adminEmail;
	}

	public MainAdmin(int adminId, String adminUserId, String adminPassword, String adminEmail) {
		super();
		this.adminId = adminId;
		this.adminUserId = adminUserId;
		this.adminPassword = adminPassword;
		this.adminEmail = adminEmail;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdminUserId() {
		return adminUserId;
	}

	public void setAdminUserId(String adminUserId) {
		this.adminUserId = adminUserId;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	public String getAdminEmail() {
		return adminEmail;
	}

	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}

	@Override
	public String toString() {
		return "MainAdmin [adminId=" + adminId + ", adminUserId=" + adminUserId + ", adminPassword=" + adminPassword
				+ ", adminEmail=" + adminEmail + "]";
	}

}
