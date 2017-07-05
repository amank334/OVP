package com.ovp.pojos;

public class StateAdmin {
	protected int stateAdminId;
	protected String adminState;
	protected String stateAdminUserId;
	protected String stateAdminPassword;
	protected String stateAdminEmail;

	public StateAdmin() {
		super();
	}

	public StateAdmin(String adminState, String stateAdminEmail, String stateAdminPassword) {
		super();
		this.adminState = adminState;
		this.stateAdminEmail = stateAdminEmail;
		this.stateAdminPassword = stateAdminPassword;
	}

	public StateAdmin(String adminState, String stateAdminUserId, String stateAdminPassword, String stateAdminEmail) {
		super();
		this.adminState = adminState;
		this.stateAdminUserId = stateAdminUserId;
		this.stateAdminPassword = stateAdminPassword;
		this.stateAdminEmail = stateAdminEmail;
	}

	public StateAdmin(int stateAdminId, String adminState, String stateAdminUserId, String stateAdminPassword,
			String stateAdminEmail) {
		super();
		this.stateAdminId = stateAdminId;
		this.adminState = adminState;
		this.stateAdminUserId = stateAdminUserId;
		this.stateAdminPassword = stateAdminPassword;
		this.stateAdminEmail = stateAdminEmail;
	}

	public int getStateAdminId() {
		return stateAdminId;
	}

	public void setStateAdminId(int stateAdminId) {
		this.stateAdminId = stateAdminId;
	}

	public String getAdminState() {
		return adminState;
	}

	public void setAdminState(String adminState) {
		this.adminState = adminState;
	}

	public String getStateAdminUserId() {
		return stateAdminUserId;
	}

	public void setStateAdminUserId(String stateAdminUserId) {
		this.stateAdminUserId = stateAdminUserId;
	}

	public String getStateAdminPassword() {
		return stateAdminPassword;
	}

	public void setStateAdminPassword(String stateAdminPassword) {
		this.stateAdminPassword = stateAdminPassword;
	}

	public String getStateAdminEmail() {
		return stateAdminEmail;
	}

	public void setStateAdminEmail(String stateAdminEmail) {
		this.stateAdminEmail = stateAdminEmail;
	}

	@Override
	public String toString() {
		return "StateAdmin [stateAdminId=" + stateAdminId + ", adminState=" + adminState + ", stateAdminUserId="
				+ stateAdminUserId + ", stateAdminPassword=" + stateAdminPassword + ", stateAdminEmail="
				+ stateAdminEmail + "]";
	}

}
