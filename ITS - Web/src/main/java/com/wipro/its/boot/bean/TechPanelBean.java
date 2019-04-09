package com.wipro.its.boot.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "its_tbl_techpanel")
public class TechPanelBean {
	@Id
	private String techID;
	private String techName;
	private String subject;

	public String getTechID() {
		return techID;
	}

	public void setTechID(String techID) {
		this.techID = techID;
	}

	public String getTechName() {
		return techName;
	}

	public void setTechName(String techName) {
		this.techName = techName;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public TechPanelBean(String techID, String techName, String subject) {
		super();
		this.techID = techID;
		this.techName = techName;
		this.subject = subject;
	}

	public TechPanelBean() {
		super();
	}

}
