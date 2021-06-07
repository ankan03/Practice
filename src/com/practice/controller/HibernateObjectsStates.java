package com.practice.controller;

import java.io.IOException;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.practice.model.Cirtificate;
import com.practice.model.Student;

public class HibernateObjectsStates {
	public static void main(String[] args) throws IOException {
		Configuration config = new Configuration().configure("com/practice/cfg/hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		
//		Student class object
		Student student1 = new Student("Ankan","Chinsurah");
		student1.setCirtificate(new Cirtificate("Web development", "3 months"));
		
		Student student2 = new Student("Abhishek","Patna");
		student2.setCirtificate(new Cirtificate("Android", "2 months"));
		
		Session session = factory.openSession();
		Transaction txn = null;
		
		
		

		
			try {
				txn = session.beginTransaction();
				session.save(student1);
				session.save(student2);
				
				//Even if we change the value of object after save() method it will change the object value in SESSION & LOCAL OBJECT
				//Final SESSON OBJECT will be pushed to Database
				student1.setName("Mukherjee");
				
				
				txn.commit();
				//If we change the value of object after commit() method it will change the object value in LOCAL OBJECT but can't change value in SESSION 
				//So this value will not be pushed to Database this will only reflect the local object 
				student2.setName("Raj");
				System.out.println(student2.toString());
				
			} catch (HibernateException e) {
				if (txn != null)
					txn.rollback();
				e.printStackTrace();
			} finally {
				session.close();
				factory.close();
			}

	}
}
