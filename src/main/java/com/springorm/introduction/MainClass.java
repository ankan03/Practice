package com.springorm.introduction;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//This is used for Spring Jdbc Configuration WITH XML
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springorm/introduction/config.xml");
		StudentDao dao = context.getBean("studentDao",StudentDao.class);
		
		Student student = new Student(1, "Ankan", "Chinsurah");
		dao.insert(student);
		
	}
}
