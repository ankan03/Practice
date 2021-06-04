package com.kt.assignment.controller;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.kt.assignment.model.Student;

public class Display4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Students with gender is empty

				Configuration config = new Configuration().configure("com/kt/assignment/cfg/hibernate.cfg.xml");
				SessionFactory factory = config.buildSessionFactory();
				Session session = factory.openSession();
				//HQL
				Criteria c=session.createCriteria(Student.class);  
				c.add(Restrictions.isNull("gender"));
				List list=c.list(); 		
				for (Object studentObject: list) {
					System.out.println(studentObject.toString());
				}
				
				factory.close();

	}

}
