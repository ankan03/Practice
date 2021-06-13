package com.springcore.beanScope.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.setterInjection.Student;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/beanScope/xml/config.xml");
		
		//By default every Spring class is singletone (All the references of the same class pointed to the same object)
		//If we want to make the class prototype we have to declare one extra tag in config.xml
		Student1 student1 = context.getBean("demo",Student1.class);
		System.out.println(student1.hashCode());
		
		Student1 student2 = context.getBean("demo",Student1.class);
		System.out.println(student2.hashCode());
	}

}
