package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

@Component("myStudent")
public class Student {
	public void show() {
		System.out.println("Inside Show method of Student class");
	}
	
}
