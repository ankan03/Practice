package com.springcore.standaloneCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.setterInjection.Student;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standaloneCollections/config.xml");
        Person personObj = (Person) context.getBean("person");
        System.out.println(personObj);
        System.out.println(personObj.getFriendList().getClass().getName());
        System.out.println(personObj.getFeesStructure().getClass().getName());
        System.out.println(personObj.getProperties().getClass().getName());
        
	}

}
