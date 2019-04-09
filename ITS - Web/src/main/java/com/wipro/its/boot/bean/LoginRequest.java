package com.wipro.its.boot.bean;

public class LoginRequest {
	String userID;
	String password;

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LoginRequest() {
		super();
	}

	public LoginRequest(String userID, String password) {
		super();
		this.userID = userID;
		this.password = password;
	}

}
