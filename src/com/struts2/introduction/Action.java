package com.struts2.introduction;

public class Action {

	public String execute() {
		System.out.println("Inside execute()  method of Action Class");
		System.out.println(new Student().show());
		return "success";
	}
}
