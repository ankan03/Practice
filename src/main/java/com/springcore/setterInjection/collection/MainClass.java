package com.springcore.setterInjection.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.setterInjection.Student;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/setterInjection/collection/collectionConfig.xml");
        Employee emp = (Employee) context.getBean("employeebean");
        
        System.out.println(emp.getEmployeeId());
        System.out.println(emp.getEmployeePhoneList());
        System.out.println(emp.getEmployeeAddressSet());
        System.out.println(emp.getEmployeeCourseMap());
	}

}
