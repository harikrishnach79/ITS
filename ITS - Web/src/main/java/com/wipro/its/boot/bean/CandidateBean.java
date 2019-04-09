package com.wipro.its.boot.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "its_tbl_candidate")
public class CandidateBean {

	@Id
	private String candidateID;
	private String primaryskills;
	private String secondaryskills;
	private int experience;
	private String qualification;
	private String designation;
	private int noticePeriod;
	private String location;
	private int shareDetails;

	public String getCandidateID() {
		return candidateID;
	}

	public void setCandidateID(String candidateID) {
		this.candidateID = candidateID;
	}

	public String getPrimaryskills() {
		return primaryskills;
	}

	public void setPrimaryskills(String primaryskills) {
		this.primaryskills = primaryskills;
	}

	public String getSecondaryskills() {
		return secondaryskills;
	}

	public void setSecondaryskills(String secondaryskills) {
		this.secondaryskills = secondaryskills;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getNoticePeriod() {
		return noticePeriod;
	}

	public void setNoticePeriod(int noticePeriod) {
		this.noticePeriod = noticePeriod;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getShareDetails() {
		return shareDetails;
	}

	public void setShareDetails(int shareDetails) {
		this.shareDetails = shareDetails;
	}

	public CandidateBean(String candidateID, String primaryskills, String secondaryskills, int experience,
			String qualification, String designation, int noticePeriod, String location, int shareDetails) {
		super();
		this.candidateID = candidateID;
		this.primaryskills = primaryskills;
		this.secondaryskills = secondaryskills;
		this.experience = experience;
		this.qualification = qualification;
		this.designation = designation;
		this.noticePeriod = noticePeriod;
		this.location = location;
		this.shareDetails = shareDetails;
	}

	public CandidateBean() {
		super();
	}

	@Override
	public String toString() {
		return "CandidateBean [candidateID=" + candidateID + ", primaryskills=" + primaryskills + ", secondaryskills="
				+ secondaryskills + ", experience=" + experience + ", qualification=" + qualification + ", designation="
				+ designation + ", noticePeriod=" + noticePeriod + ", location=" + location + ", shareDetails="
				+ shareDetails + "]";
	}

}
