package com.wipro.its.boot.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "its_tbl_interview_schedule")
public class InterviewScheduleBean {

	@Id
	private String interviewID;
	private String candidateID;
	private String subject;
	private String techID;
	private Date interviewDate;
	private String interviewTime;
	private Integer techRating;
	private String empHRID;
	private Date empHRinterviewDate;
	private String empHRinterviewTime;
	private Integer empHRrating;
	private String result;
	private Integer shareResult;

	public String getInterviewID() {
		return interviewID;
	}

	public void setInterviewID(String interviewID) {
		this.interviewID = interviewID;
	}

	public String getCandidateID() {
		return candidateID;
	}

	public void setCandidateID(String candidateID) {
		this.candidateID = candidateID;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTechID() {
		return techID;
	}

	public void setTechID(String techID) {
		this.techID = techID;
	}

	public Date getInterviewDate() {
		return interviewDate;
	}

	public void setInterviewDate(Date interviewDate) {
		this.interviewDate = interviewDate;
	}

	public String getInterviewTime() {
		return interviewTime;
	}

	public void setInterviewTime(String interviewTime) {
		this.interviewTime = interviewTime;
	}

	public Integer getTechRating() {
		return techRating;
	}

	public void setTechRating(Integer techRating) {
		this.techRating = techRating;
	}

	public String getEmpHRID() {
		return empHRID;
	}

	public void setEmpHRID(String empHRID) {
		this.empHRID = empHRID;
	}

	public Date getEmpHRinterviewDate() {
		return empHRinterviewDate;
	}

	public void setEmpHRinterviewDate(Date empHRinterviewDate) {
		this.empHRinterviewDate = empHRinterviewDate;
	}

	public String getEmpHRinterviewTime() {
		return empHRinterviewTime;
	}

	public void setEmpHRinterviewTime(String empHRinterviewTime) {
		this.empHRinterviewTime = empHRinterviewTime;
	}

	public Integer getEmpHRrating() {
		return empHRrating;
	}

	public void setEmpHRrating(Integer empHRrating) {
		this.empHRrating = empHRrating;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public Integer getShareResult() {
		return shareResult;
	}

	public void setShareResult(Integer shareResult) {
		this.shareResult = shareResult;
	}

	public InterviewScheduleBean(String interviewID, String candidateID, String subject, String techID,
			Date interviewDate, String interviewTime, Integer techRating, String empHRID, Date empHRinterviewDate,
			String empHRinterviewTime, Integer empHRrating, String result, Integer shareResult) {
		super();
		this.interviewID = interviewID;
		this.candidateID = candidateID;
		this.subject = subject;
		this.techID = techID;
		this.interviewDate = interviewDate;
		this.interviewTime = interviewTime;
		this.techRating = techRating;
		this.empHRID = empHRID;
		this.empHRinterviewDate = empHRinterviewDate;
		this.empHRinterviewTime = empHRinterviewTime;
		this.empHRrating = empHRrating;
		this.result = result;
		this.shareResult = shareResult;
	}

	public InterviewScheduleBean() {
		super();
	}

	@Override
	public String toString() {
		return "InterviewScheduleBean [interviewID=" + interviewID + ", candidateID=" + candidateID + ", subject="
				+ subject + ", techID=" + techID + ", interviewDate=" + interviewDate + ", interviewTime="
				+ interviewTime + ", techRating=" + techRating + ", empHRID=" + empHRID + ", empHRinterviewDate="
				+ empHRinterviewDate + ", empHRinterviewTime=" + empHRinterviewTime + ", empHRrating=" + empHRrating
				+ ", result=" + result + ", shareResult=" + shareResult + "]";
	}

}