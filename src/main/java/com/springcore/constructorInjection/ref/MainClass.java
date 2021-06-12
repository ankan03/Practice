package com.springcore.constructorInjection.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.setterInjection.Student;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constructorInjection/ref/config.xml");
        Person personObj = (Person) context.getBean("personbean");
        System.out.println(personObj);
	}

}
