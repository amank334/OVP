package com.ovp.pojos;

public class Party {
	protected int partyId;
	protected String partyName;
	protected String partyDetails;
	protected String partyLogo;
	protected String partyUserId;
	protected String partyPassword;
	protected String partyPm;
	protected String partyPmPhoto;
	protected String detailsEdited;
	protected String partyEmail;
	protected String partyVerified;

	public Party() {
		super();
	}

	

	public Party(String partyName, String partyUserId, String partyPassword,
			String partyEmail) {
		super();
		this.partyName = partyName;
		this.partyUserId = partyUserId;
		this.partyPassword = partyPassword;
		this.partyEmail = partyEmail;
	}



	public Party(String partyName, String partyDetails, String partyLogo, String partyUserId, String partyPassword,
			String partyPm, String partyPmPhoto, String detailsEdited, String partyEmail, String partyVerified) {
		super();
		this.partyName = partyName;
		this.partyDetails = partyDetails;
		this.partyLogo = partyLogo;
		this.partyUserId = partyUserId;
		this.partyPassword = partyPassword;
		this.partyPm = partyPm;
		this.partyPmPhoto = partyPmPhoto;
		this.detailsEdited = detailsEdited;
		this.partyEmail = partyEmail;
		this.partyVerified = partyVerified;
	}



	public Party(int partyId, String partyName, String partyDetails, String partyLogo, String partyUserId,
			String partyPassword, String partyPm, String partyPmPhoto, String detailsEdited, String partyEmail,
			String partyVerified) {
		super();
		this.partyId = partyId;
		this.partyName = partyName;
		this.partyDetails = partyDetails;
		this.partyLogo = partyLogo;
		this.partyUserId = partyUserId;
		this.partyPassword = partyPassword;
		this.partyPm = partyPm;
		this.partyPmPhoto = partyPmPhoto;
		this.detailsEdited = detailsEdited;
		this.partyEmail = partyEmail;
		this.partyVerified = partyVerified;
	}



	public int getPartyId() {
		return partyId;
	}

	public void setPartyId(int partyId) {
		this.partyId = partyId;
	}

	public String getPartyName() {
		return partyName;
	}

	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}

	public String getPartyDetails() {
		return partyDetails;
	}

	public void setPartyDetails(String partyDetails) {
		this.partyDetails = partyDetails;
	}

	public String getPartyLogo() {
		return partyLogo;
	}

	public void setPartyLogo(String partyLogo) {
		this.partyLogo = partyLogo;
	}

	public String getPartyUserId() {
		return partyUserId;
	}

	public void setPartyUserId(String partyUserId) {
		this.partyUserId = partyUserId;
	}

	public String getPartyPm() {
		return partyPm;
	}

	public void setPartyPm(String partyPm) {
		this.partyPm = partyPm;
	}

	public String getPartyPassword() {
		return partyPassword;
	}

	public void setPartyPassword(String partyPassword) {
		this.partyPassword = partyPassword;
	}
	
	public String getPartyPmPhoto() {
		return partyPmPhoto;
	}

	public void setPartyPmPhoto(String partyPmPhoto) {
		this.partyPmPhoto = partyPmPhoto;
	}

	public String getDetailsEdited() {
		return detailsEdited;
	}

	public void setDetailsEdited(String detailsEdited) {
		this.detailsEdited = detailsEdited;
	}

	public String getPartyEmail() {
		return partyEmail;
	}

	public void setPartyEmail(String partyEmail) {
		this.partyEmail = partyEmail;
	}

	public String getPartyVerified() {
		return partyVerified;
	}

	public void setPartyVerified(String partyVerified) {
		this.partyVerified = partyVerified;
	}

	@Override
	public String toString() {
		return "Party [partyId=" + partyId + ", partyName=" + partyName + ", partyDetails=" + partyDetails
				+ ", partyLogo=" + partyLogo + ", partyUserId=" + partyUserId + ", partyPassword=" + partyPassword
				+ ", partyPm=" + partyPm + ", partyPmPhoto=" + partyPmPhoto + ", detailsEdited=" + detailsEdited
				+ ", partyEmail=" + partyEmail + ", partyVerified=" + partyVerified + "]";
	}

}
