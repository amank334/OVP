package com.ovp.pojos;

public class ConstIdParty {
	protected String uniqueConstId;
	protected int partyId;
	protected int electionId;

	public ConstIdParty() {
		super();
	}

	public ConstIdParty(String uniqueConstId, int partyId, int electionId) {
		super();
		this.uniqueConstId = uniqueConstId;
		this.partyId = partyId;
		this.electionId = electionId;
	}

	public String getUniqueConstId() {
		return uniqueConstId;
	}

	public void setUniqueConstId(String uniqueConstId) {
		this.uniqueConstId = uniqueConstId;
	}

	public int getPartyId() {
		return partyId;
	}

	public void setPartyId(int partyId) {
		this.partyId = partyId;
	}

	public int getElectionId() {
		return electionId;
	}

	public void setElectionId(int electionId) {
		this.electionId = electionId;
	}

	@Override
	public String toString() {
		return "ConstIdParty [uniqueConstId=" + uniqueConstId + ", partyId=" + partyId + ", electionId=" + electionId
				+ "]";
	}

}
