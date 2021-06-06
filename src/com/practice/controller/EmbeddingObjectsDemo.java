package com.practice.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.practice.model.Address;
import com.practice.model.Cirtificate;
import com.practice.model.Student;

public class EmbeddingObjectsDemo {
	public static void main(String[] args) throws IOException {
		Configuration config = new Configuration().configure("com/practice/cfg/hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction txn = null;
		
//		Student class object
		Student student1 = new Student("Ankan","Chinsurah");
		student1.setCirtificate(new Cirtificate("Web development", "3 months"));
		
		Student student2 = new Student("Abhishek","Patna");
		student2.setCirtificate(new Cirtificate("Android", "2 months"));
		
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
