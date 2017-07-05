package com.ovp.pojos;

public class StateParty {
	protected int statePartyId;
	protected String statePartyUserId;
	protected String statePartyPassword;
	protected String statePartyState;
	protected String statePartyCm;
	protected String statePartyCmPhoto;
	protected int partyId;
	protected String partyDetails;
	protected String detailsEdited;
	protected String statePartyEmail;
	public StateParty() {
		super();
	}

	public StateParty(String statePartyUserId, String statePartyPassword, String statePartyState, String statePartyCm,
			String statePartyCmPhoto, int partyId, String partyDetails, String detailsEdited,String statePartyEmail) {
		super();
		this.statePartyUserId = statePartyUserId;
		this.statePartyPassword = statePartyPassword;
		this.statePartyState = statePartyState;
		this.statePartyCm = statePartyCm;
		this.statePartyCmPhoto = statePartyCmPhoto;
		this.partyId = partyId;
		this.partyDetails = partyDetails;
		this.detailsEdited = detailsEdited;
		this.statePartyEmail=statePartyEmail;
	}

	public StateParty(int statePartyId, String statePartyUserId, String statePartyPassword, String statePartyState,
			String statePartyCm, String statePartyCmPhoto, int partyId, String partyDetails, String detailsEdited,String statePartyEmail) {
		super();
		this.statePartyId = statePartyId;
		this.statePartyUserId = statePartyUserId;
		this.statePartyPassword = statePartyPassword;
		this.statePartyState = statePartyState;
		this.statePartyCm = statePartyCm;
		this.statePartyCmPhoto = statePartyCmPhoto;
		this.partyId = partyId;
		this.partyDetails = partyDetails;
		this.detailsEdited = detailsEdited;
		this.statePartyEmail=statePartyEmail;
	}

	public int getStatePartyId() {
		return statePartyId;
	}

	public void setStatePartyId(int statePartyId) {
		this.statePartyId = statePartyId;
	}

	public String getStatePartyUserId() {
		return statePartyUserId;
	}

	public String getStatePartyEmail() {
		return statePartyEmail;
	}

	public void setStatePartyEmail(String statePartyEmail) {
		this.statePartyEmail = statePartyEmail;
	}

	public void setStatePartyUserId(String statePartyUserId) {
		this.statePartyUserId = statePartyUserId;
	}

	public String getStatePartyPassword() {
		return statePartyPassword;
	}

	public void setStatePartyPassword(String statePartyPassword) {
		this.statePartyPassword = statePartyPassword;
	}

	public String getStatePartyState() {
		return statePartyState;
	}

	public void setStatePartyState(String statePartyState) {
		this.statePartyState = statePartyState;
	}

	public String getStatePartyCm() {
		return statePartyCm;
	}

	public void setStatePartyCm(String statePartyCm) {
		this.statePartyCm = statePartyCm;
	}

	public String getStatePartyCmPhoto() {
		return statePartyCmPhoto;
	}

	public void setStatePartyCmPhoto(String statePartyCmPhoto) {
		this.statePartyCmPhoto = statePartyCmPhoto;
	}

	public int getPartyId() {
		return partyId;
	}

	public void setPartyId(int partyId) {
		this.partyId = partyId;
	}

	public String getPartyDetails() {
		return partyDetails;
	}

	public void setPartyDetails(String partyDetails) {
		this.partyDetails = partyDetails;
	}

	public String getDetailsEdited() {
		return detailsEdited;
	}

	public void setDetailsEdited(String detailsEdited) {
		this.detailsEdited = detailsEdited;
	}

	@Override
	public String toString() {
		return "StateParty [statePartyId=" + statePartyId + ", statePartyUserId=" + statePartyUserId
				+ ", statePartyPassword=" + statePartyPassword + ", statePartyState=" + statePartyState
				+ ", statePartyCm=" + statePartyCm + ", statePartyCmPhoto=" + statePartyCmPhoto + ", partyId=" + partyId
				+ ", partyDetails=" + partyDetails + ", detailsEdited=" + detailsEdited + "]";
	}

}
