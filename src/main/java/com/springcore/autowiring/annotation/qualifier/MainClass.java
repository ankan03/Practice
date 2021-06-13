package com.springcore.autowiring.annotation.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.setterInjection.Student;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowiring/annotation/qualifier/config.xml");
        Employee employeeObj = (Employee) context.getBean("employee1");
        System.out.println(employeeObj);
        
	}

}
