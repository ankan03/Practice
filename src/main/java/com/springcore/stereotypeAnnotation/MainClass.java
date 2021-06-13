package com.springcore.stereotypeAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.setterInjection.Student;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotypeAnnotation/stereotypeConfig.xml");
		DemoStudent1 student = context.getBean("aa",DemoStudent1.class);
		System.out.println(student);
	}

}
