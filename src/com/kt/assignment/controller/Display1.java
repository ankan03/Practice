package com.kt.assignment.controller;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.kt.assignment.model.Student;

public class Display1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Students with age >12

		Configuration config = new Configuration().configure("com/kt/assignment/cfg/hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		//HQL
		Query readQuery = session.createQuery("FROM Student S WHERE S.age>12");
		List<Student> studentList = readQuery.list();
		
		for (Student studentObject: studentList) {
			System.out.println(studentObject.toString());
		}
		factory.close();
	}
}
