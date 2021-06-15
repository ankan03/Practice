package com.struts2.introduction;

public class Student {
	public String show(String subject) {
		System.out.println("Inside show() method of Student Class");
		// To put the subject the URL will be http://localhost:8081/Struts2Tutorial/demo/getTutorial.action?subject=dsa
		if (subject.equals("dsa")) {
			return "Handle with care";
		} else {
			return "Don't worry";
		}
	}
}
