package com.maven.MavenDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        
    	//Without using @Component
//        Vehicle obj = (Vehicle)context.getBean("vehicle");
//        obj.drive();
        
    	//With using @Component in Car class(By default the name will be 1st letter small of the class name i.e Car => car)
//        Vehicle obj = (Vehicle)context.getBean("car");
//        obj.drive();
        
      //With using @Component in Bike class (By default the name will be 1st letter small of the class name i.e Bike => bike)
//        Vehicle obj = (Vehicle)context.getBean("bike");
//        obj.drive();
        
//      Tyre obj = (Tyre)context.getBean("tyre");
//      System.out.println(obj);
        
        Car car = (Car)context.getBean("car");
        System.out.println(car);
        
    }
}
