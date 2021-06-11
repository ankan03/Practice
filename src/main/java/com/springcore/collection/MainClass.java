package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.Student;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collection/collectionConfig.xml");
        Employee emp = (Employee) context.getBean("employeebean");
        
        System.out.println(emp.getEmployeeId());
        System.out.println(emp.getEmployeePhoneList());
        System.out.println(emp.getEmployeeAddressSet());
        System.out.println(emp.getEmployeeCourseMap());
	}

}
