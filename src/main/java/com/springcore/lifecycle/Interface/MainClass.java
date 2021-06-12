package com.springcore.lifecycle.Interface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.setterInjection.Student;

public class MainClass {

	public static void main(String[] args) {

        //If we want to use destroy method of the model class then we have to create instance of AbstractApplicationContext class and call registerShutdownHook() method  
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/Interface/config.xml");
        
		Pizza pizzaObj = (Pizza) context.getBean("pizza");
        System.out.println(pizzaObj);
        
        
        System.out.println("-----------------------------------");

        Berger bergerObj = (Berger) context.getBean("berger");
        System.out.println(bergerObj);
        
        
        
        context.registerShutdownHook();
        
	}

}
