package com.kt.assignment.controller;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import com.kt.assignment.model.Student;

public class Display3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Male Students with age >18 and name starting “A”

		Configuration config = new Configuration().configure("com/kt/assignment/cfg/hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		//HQL
		Criteria c=session.createCriteria(Student.class);  
		c.add(Restrictions.gt("age",18)); 
		c.add(Restrictions.eq("gender","M")); 
		c.add(Restrictions.like("name", "A", MatchMode.START));
		List list=c.list(); 		
		for (Object studentObject: list) {
			System.out.println(studentObject.toString());
		}
		
		factory.close();
		
	}
}
