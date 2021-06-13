package com.springjdbc.databaseSetup;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springjdbc/databaseSetup/config.xml");
		JdbcTemplate template = context.getBean("jdbcTemplate",JdbcTemplate.class);
		
		String sqlQuery = "INSERT INTO student_table (student_id, student_name, student_city) VALUES (?,?,?)";
		int result = template.update(sqlQuery,2,"Mukherjee","Kolkata");
		System.out.println("No of row inserted: "+result);
	}

}
