package com.ovp.pojos;

public class Candidate {
	protected int candidateId;
	protected String candidateName;
	protected int partyId;
	protected int electionId;
	protected String uniqueConstId;
	protected String candidatePhoto;
	protected String candidateNominated;

	public Candidate() {
		super();
	}

	public Candidate(String candidateName, int partyId, int electionId, String uniqueConstId, String candidatePhoto,
			String candidateNominated) {
		super();
		this.candidateName = candidateName;
		this.partyId = partyId;
		this.electionId = electionId;
		this.uniqueConstId = uniqueConstId;
		this.candidatePhoto = candidatePhoto;
		this.candidateNominated = candidateNominated;
	}

	public Candidate(int candidateId, String candidateName, int partyId, int electionId, String uniqueConstId,
			String candidatePhoto, String candidateNominated) {
		super();
		this.candidateId = candidateId;
		this.candidateName = candidateName;
		this.partyId = partyId;
		this.electionId = electionId;
		this.uniqueConstId = uniqueConstId;
		this.candidatePhoto = candidatePhoto;
		this.candidateNominated = candidateNominated;
	}

	public int getCandidateId() {
		return candidateId;
	}

	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
	}

	public String getCandidateName() {
		return candidateName;
	}

	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
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

	public String getUniqueConstId() {
		return uniqueConstId;
	}

	public void setUniqueConstId(String uniqueConstId) {
		this.uniqueConstId = uniqueConstId;
	}

	public String getCandidatePhoto() {
		return candidatePhoto;
	}

	public void setCandidatePhoto(String candidatePhoto) {
		this.candidatePhoto = candidatePhoto;
	}

	public String getCandidateNominated() {
		return candidateNominated;
	}

	public void setCandidateNominated(String candidateNominated) {
		this.candidateNominated = candidateNominated;
	}

	@Override
	public String toString() {
		return "Candidate [candidateId=" + candidateId + ", candidateName=" + candidateName + ", partyId=" + partyId
				+ ", electionId=" + electionId + ", uniqueConstId=" + uniqueConstId + ", candidatePhoto="
				+ candidatePhoto + ", candidateNominated=" + candidateNominated + "]";
	}

}
