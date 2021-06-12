package com.springcore.lifecycle.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.setterInjection.Student;

public class MainClass {

	public static void main(String[] args) {

//		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/xml/config.xml");
//        Pizza pizzaObj = (Pizza) context.getBean("pizza");
//        System.out.println(pizzaObj);
        
        //If we want to use destroy method of the model class then we have to create instance of AbstractApplicationContext class and call registerShutdownHook() method  
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/xml/config.xml");
        Pizza pizzaObj = (Pizza) context.getBean("pizza");
        System.out.println(pizzaObj);
        context.registerShutdownHook();
        
	}

}
