package com.practice.controller;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.practice.model.Student;


public class MainClass {

	public static void main(String[] args) {
		Configuration config = new Configuration().configure("com/practice/cfg/hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction txn = null;
		
		Student student1 = new Student("Ankan","Chinsurah");
		Student student2 = new Student("Abhishek","Patna");
		
			try {
				txn = session.beginTransaction();
				session.save(student1);
				session.save(student2);
				txn.commit();
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
