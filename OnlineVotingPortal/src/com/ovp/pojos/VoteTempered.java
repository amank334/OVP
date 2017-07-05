package com.ovp.pojos;

public class VoteTempered {
	protected int voteTemperedId;
	protected int voterId;
	protected int voteGivenTo;

	public VoteTempered() {
		super();
	}

	public VoteTempered(int voteId, int voteGivenTo) {
		super();
		this.voterId = voteId;
		this.voteGivenTo = voteGivenTo;
	}

	public VoteTempered(int voteTemperedId, int voteId, int voteGivenTo) {
		super();
		this.voteTemperedId = voteTemperedId;
		this.voterId = voteId;
		this.voteGivenTo = voteGivenTo;
	}

	public int getVoteTemperedId() {
		return voteTemperedId;
	}

	public void setVoteTemperedId(int voteTemperedId) {
		this.voteTemperedId = voteTemperedId;
	}

	public int getVoterId() {
		return voterId;
	}

	public void setVoterId(int voteId) {
		this.voterId = voteId;
	}

	public int getVoteGivenTo() {
		return voteGivenTo;
	}

	public void setVoteGivenTo(int voteGivenTo) {
		this.voteGivenTo = voteGivenTo;
	}

	@Override
	public String toString() {
		return "VoteTempered [voteTemperedId=" + voteTemperedId + ", voterId=" + voterId + ", voteGivenTo=" + voteGivenTo
				+ "]";
	}

}
