package com.wipro.its.boot.bean;

public class LoginResponse {
  int status;
  String loginType;
  int loginStatus;
  
  public int getLoginStatus() {
    return loginStatus;
  }
  
  public void setLoginStatus(int loginStatus) {
    this.loginStatus = loginStatus;
  }
  

  public LoginResponse() {}
  

  public LoginResponse(int status, String loginType, int loginStatus)
  {
    this.status = status;
    this.loginType = loginType;
    this.loginStatus = loginStatus;
  }
  
  public int getStatus() {
    return status;
  }
  
  public void setStatus(int status) {
    this.status = status;
  }
  
  public String getLoginType() {
    return loginType;
  }
  
  public void setLoginType(String loginType) {
    this.loginType = loginType;
  }
}