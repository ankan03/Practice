package com.springjdbc.introduction;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//This is used for Spring Jdbc Configuration WITH XML
//		ApplicationContext context = new ClassPathXmlApplicationContext("com/springjdbc/introduction/config.xml");
		
		//Spring Jdbc Configuration WITHOUT XML
		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
		
		StudentDaoImpl daoImpl = context.getBean("studentDaoImplementation",StudentDaoImpl.class);
		
		
		//INSERT
//		int result = daoImpl.insert(new Student(3, "Abhishek", "Patna"));
//		System.out.println("No of row inserted: "+result);
		
		//UPDATE
//		int result = daoImpl.update(new Student(1, "Ankan", "Chinsurah"));
//		System.out.println(result+" Row updated");
		
		//DELETE
//		int result = daoImpl.delete(5);
//		System.out.println(result+" Row deleted");
		
		//SELECT Single Student
//		Student student = daoImpl.getStudent(3);
//		System.out.println(student);
		
		//SELECT list of Student
		List<Student> students = daoImpl.getAllStudent();
		for (Student student : students) {
			System.out.println(student);
		}
		
	}

}
