package com.struts2.introduction;

import com.opensymphony.xwork2.Action;

//We can implement com.opensymphony.xwork2.Action and use different standared string
public class LoginAction implements Action {
	private String userId;
	private String password;
	
	public String execute()  {
		System.out.println("Inside execute()  method of LoginAction Class");
		if (userId.equals("ankan") && password.equals("123")) {
			return SUCCESS;
		} else {
			return ERROR;
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
