package com.struts2.introduction;

public class LoginAction {
	private String userId;
	private String password;
	
	public String execute() {
		System.out.println("Inside execute()  method of LoginAction Class");
		if (userId.equals("ankan") && password.equals("123")) {
			return "success";
		} else {
			return "failure";
		}
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
