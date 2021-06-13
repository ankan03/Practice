package com.springjdbc.databaseSetup;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springjdbc/databaseSetup/config.xml");
		StudentDaoImpl daoImpl = context.getBean("studentDaoImplementation",StudentDaoImpl.class);
		
		int result = daoImpl.insert(new Student(3, "Abhishek", "Patna"));
		System.out.println("No of row inserted: "+result);
	}

}
