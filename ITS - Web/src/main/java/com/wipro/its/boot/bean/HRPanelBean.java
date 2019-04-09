package com.wipro.its.boot.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "its_tbl_hrpanel")
public class HRPanelBean {

	@Id
	private String empHRID;
	private String empHRName;

	public String getEmpHRID() {
		return empHRID;
	}

	public void setEmpHRID(String empHRID) {
		this.empHRID = empHRID;
	}

	public String getEmpHRName() {
		return empHRName;
	}

	public void setEmpHRName(String empHRName) {
		this.empHRName = empHRName;
	}

	public HRPanelBean(String empHRID, String empHRName) {
		super();
		this.empHRID = empHRID;
		this.empHRName = empHRName;
	}

	public HRPanelBean() {
		super();
	}

}
