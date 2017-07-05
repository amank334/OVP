package com.ovp.pojos;

import java.util.Date;

public class Election {
	protected int electionId;
	protected Date electionDate;
	protected String electionType;
	protected String electionState;

	public Election() {
		super();
	}

	public Election(Date electionDate, String electionType, String electionState) {
		super();
		this.electionDate = electionDate;
		this.electionType = electionType;
		this.electionState = electionState;
	}

	public Election(int electionId, Date electionDate, String electionType, String electionState) {
		super();
		this.electionId = electionId;
		this.electionDate = electionDate;
		this.electionType = electionType;

		this.electionState = electionState;
	}

	public int getElectionId() {
		return electionId;
	}

	public void setElectionId(int electionId) {
		this.electionId = electionId;
	}

	public Date getElectionDate() {
		return electionDate;
	}

	public void setElectionDate(Date electionDate) {
		this.electionDate = electionDate;
	}

	public String getElectionType() {
		return electionType;
	}

	public void setElectionType(String electionType) {
		this.electionType = electionType;
	}

	public String getElectionState() {
		return electionState;
	}

	public void setElectionState(String electionState) {
		this.electionState = electionState;
	}

	@Override
	public String toString() {
		return "Election [electionId=" + electionId + ", electionDate=" + electionDate + ", electionType="
				+ electionType + ", electionState=" + electionState + "]";
	}

}
