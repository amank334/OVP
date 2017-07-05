package com.ovp.pojos;

import java.util.Date;

public class Voter {
	protected int voterId;
	protected String voterName;
	protected String voterEmail;
	protected String vin;
	protected String voterAdharNo;
	protected String voterOtp;
	protected String voterMob;
	protected int aConstId;
	protected String voteComplete;
	protected String voterVcardNo;
	protected int vinCount;
	protected Date vinTime;
	protected int electionId;
	protected String voterPassword;
	protected Date voterDob;
	protected String voterAddress;
	public Voter() {
		super();
	}
	public Voter(String voterName, String voterEmail, String vin, String voterAdharNo, String voterOtp, String voterMob,
			int aConstId, String voteComplete, String voterVcardNo, int vinCount, Date vinTime, int electionId,
			String voterPassword, Date voterDob, String voterAddress) {
		super();
		this.voterName = voterName;
		this.voterEmail = voterEmail;
		this.vin = vin;
		this.voterAdharNo = voterAdharNo;
		this.voterOtp = voterOtp;
		this.voterMob = voterMob;
		this.aConstId = aConstId;
		this.voteComplete = voteComplete;
		this.voterVcardNo = voterVcardNo;
		this.vinCount = vinCount;
		this.vinTime = vinTime;
		this.electionId = electionId;
		this.voterPassword = voterPassword;
		this.voterDob = voterDob;
		this.voterAddress = voterAddress;
	}
	public Voter(int voterId, String voterName, String voterEmail, String vin, String voterAdharNo, String voterOtp,
			String voterMob, int aConstId, String voteComplete, String voterVcardNo, int vinCount, Date vinTime,
			int electionId, String voterPassword, Date voterDob, String voterAddress) {
		super();
		this.voterId = voterId;
		this.voterName = voterName;
		this.voterEmail = voterEmail;
		this.vin = vin;
		this.voterAdharNo = voterAdharNo;
		this.voterOtp = voterOtp;
		this.voterMob = voterMob;
		this.aConstId = aConstId;
		this.voteComplete = voteComplete;
		this.voterVcardNo = voterVcardNo;
		this.vinCount = vinCount;
		this.vinTime = vinTime;
		this.electionId = electionId;
		this.voterPassword = voterPassword;
		this.voterDob = voterDob;
		this.voterAddress = voterAddress;
	}
	
	public Voter(String voterVcardNo, String voterAdharNo,String voterName,  String voterMob, String voterEmail,
			 String voterPassword, String voterAddress) {
		super();
		this.voterName = voterName;
		this.voterEmail = voterEmail;
		
		this.voterAdharNo = voterAdharNo;
		
		this.voterMob = voterMob;
		
		this.voterVcardNo = voterVcardNo;
		
		
		this.voterPassword = voterPassword;
		
	this.voterAddress=voterAddress;
	}
	
	public int getVoterId() {
		return voterId;
	}
	public void setVoterId(int voterId) {
		this.voterId = voterId;
	}
	public String getVoterName() {
		return voterName;
	}
	public void setVoterName(String voterName) {
		this.voterName = voterName;
	}
	public String getVoterEmail() {
		return voterEmail;
	}
	public void setVoterEmail(String voterEmail) {
		this.voterEmail = voterEmail;
	}
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public String getVoterAdharNo() {
		return voterAdharNo;
	}
	public void setVoterAdharNo(String voterAdharNo) {
		this.voterAdharNo = voterAdharNo;
	}
	public String getVoterOtp() {
		return voterOtp;
	}
	public void setVoterOtp(String voterOtp) {
		this.voterOtp = voterOtp;
	}
	public String getVoterMob() {
		return voterMob;
	}
	public void setVoterMob(String voterMob) {
		this.voterMob = voterMob;
	}
	public int getaConstId() {
		return aConstId;
	}
	public void setaConstId(int aConstId) {
		this.aConstId = aConstId;
	}
	public String getVoteComplete() {
		return voteComplete;
	}
	public void setVoteComplete(String voteComplete) {
		this.voteComplete = voteComplete;
	}
	public String getVoterVcardNo() {
		return voterVcardNo;
	}
	public void setVoterVcardNo(String voterVcardNo) {
		this.voterVcardNo = voterVcardNo;
	}
	public int getVinCount() {
		return vinCount;
	}
	public void setVinCount(int vinCount) {
		this.vinCount = vinCount;
	}
	public Date getVinTime() {
		return vinTime;
	}
	public void setVinTime(Date vinTime) {
		this.vinTime = vinTime;
	}
	public int getElectionId() {
		return electionId;
	}
	public void setElectionId(int electionId) {
		this.electionId = electionId;
	}
	public String getVoterPassword() {
		return voterPassword;
	}
	public void setVoterPassword(String voterPassword) {
		this.voterPassword = voterPassword;
	}
	public Date getVoterDob() {
		return voterDob;
	}
	public void setVoterDob(Date voterDob) {
		this.voterDob = voterDob;
	}
	public String getVoterAddress() {
		return voterAddress;
	}
	public void setVoterAddress(String voterAddress) {
		this.voterAddress = voterAddress;
	}
	@Override
	public String toString() {
		return "Voter [voterId=" + voterId + ", voterName=" + voterName + ", voterEmail=" + voterEmail + ", vin=" + vin
				+ ", voterAdharNo=" + voterAdharNo + ", voterOtp=" + voterOtp + ", voterMob=" + voterMob + ", aConstId="
				+ aConstId + ", voteComplete=" + voteComplete + ", voterVcardNo=" + voterVcardNo + ", vinCount="
				+ vinCount + ", vinTime=" + vinTime + ", electionId=" + electionId + ", voterPassword=" + voterPassword
				+ ", voterDob=" + voterDob + ", voterAddress=" + voterAddress + "]";
	}
	

	

}
