package com.springcore.constructorInjection.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.setterInjection.Student;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constructorInjection/collection/collectionConfig.xml");
        Employee emp = (Employee) context.getBean("employeebean");
        System.out.println(emp);
	}

}
