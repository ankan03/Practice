package com.springcore.stereotypeAnnotations.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.setterInjection.Student;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotypeAnnotations/Collection/config.xml");
        DemoStudent studentObj  = context.getBean("ankan",DemoStudent.class);
        System.out.println(studentObj);
        System.out.println(studentObj.getFriendList().getClass().getName());
	}

}
