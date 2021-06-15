package com.struts2.introduction;

public class Action {
	private String isStudent;
	public String execute() {
		System.out.println("Inside execute()  method of Action Class");
		isStudent = new Student().show();
		return "success";
	}
	public String getIsStudent() {
		System.out.println("Inside getIsStudent() method of Action class");
		return isStudent;
	}
	public void setIsStudent(String isStudent) {
		System.out.println("Inside setIsStudent() method of Action class");
		this.isStudent = isStudent;
	}
	
	
}
