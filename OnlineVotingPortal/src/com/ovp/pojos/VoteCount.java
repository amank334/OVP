package com.ovp.pojos;

public class VoteCount {
	protected int voteCountId;
	protected int electionId;
	protected int candidateId;
	protected int totalVotes;

	public VoteCount() {
		super();
	}

	public VoteCount(int electionId, int candidateId, int totalVotes) {
		super();
		this.electionId = electionId;
		this.candidateId = candidateId;
		this.totalVotes = totalVotes;
	}

	public VoteCount(int voteCountId, int electionId, int candidateId, int totalVotes) {
		super();
		this.voteCountId = voteCountId;
		this.electionId = electionId;
		this.candidateId = candidateId;
		this.totalVotes = totalVotes;
	}

	public int getVoteCountId() {
		return voteCountId;
	}

	public void setVoteCountId(int votecountId) {
		this.voteCountId = votecountId;
	}

	public int getElectionId() {
		return electionId;
	}

	public void setElectionId(int electionId) {
		this.electionId = electionId;
	}

	public int getCandidateId() {
		return candidateId;
	}

	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
	}

	public int getTotalVotes() {
		return totalVotes;
	}

	public void setTotalVotes(int totalVotes) {
		this.totalVotes = totalVotes;
	}

	@Override
	public String toString() {
		return "VoteCount [votecountId=" + voteCountId + ", electionId=" + electionId + ", candidateId=" + candidateId
				+ ", totalVotes=" + totalVotes + "]";
	}

}
