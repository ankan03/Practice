package com.struts2.introduction;

public class Action {
	private String isStudent;
	private String subject;
	
	public String execute() {
		System.out.println("Inside execute()  method of Action Class");
		isStudent = new Student().show(getSubject());
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
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
}
