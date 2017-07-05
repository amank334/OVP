package com.ovp.pojos;

public class Result {
	protected int resultId;
	protected int electionId;
	protected int candidateId;
	protected String finalResult;
	protected int totalVotes;
	protected String uniqueConstId;

	public Result() {
		super();
	}

	public Result(int electionId, int candidateId, String finalResult, int totalVotes, String uniqueConstId) {
		super();
		this.electionId = electionId;
		this.candidateId = candidateId;
		this.finalResult = finalResult;
		this.totalVotes = totalVotes;
		this.uniqueConstId = uniqueConstId;
	}

	public Result(int resultId, int electionId, int candidateId, String finalResult, int totalVotes,
			String uniqueConstId) {
		super();
		this.resultId = resultId;
		this.electionId = electionId;
		this.candidateId = candidateId;
		this.finalResult = finalResult;
		this.totalVotes = totalVotes;
		this.uniqueConstId = uniqueConstId;
	}

	public int getResultId() {
		return resultId;
	}

	public void setResultId(int resultId) {
		this.resultId = resultId;
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

	public String getFinalResult() {
		return finalResult;
	}

	public void setFinalResult(String finalResult) {
		this.finalResult = finalResult;
	}

	public int getTotalVotes() {
		return totalVotes;
	}

	public void setTotalVotes(int totalVotes) {
		this.totalVotes = totalVotes;
	}

	public String getUniqueConstId() {
		return uniqueConstId;
	}

	public void setUniqueConstId(String uniqueConstId) {
		this.uniqueConstId = uniqueConstId;
	}

	@Override
	public String toString() {
		return "Result [resultId=" + resultId + ", electionId=" + electionId + ", candidateId=" + candidateId
				+ ", finalResult=" + finalResult + ", totalVotes=" + totalVotes + ", uniqueConstId=" + uniqueConstId
				+ "]";
	}

}
