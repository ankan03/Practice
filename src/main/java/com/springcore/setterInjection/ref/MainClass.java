package com.springcore.setterInjection.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.setterInjection.Student;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/setterInjection/ref/refConfig.xml");
        A a = (A) context.getBean("aref");
        System.out.println(a);
	}

}
