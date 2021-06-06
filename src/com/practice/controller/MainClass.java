package com.practice.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.practice.model.Address;
import com.practice.model.Student;


public class MainClass {

	public static void main(String[] args) throws IOException {
		Configuration config = new Configuration().configure("com/practice/cfg/hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction txn = null;
		
//		Student class object
		Student student1 = new Student("Ankan","Chinsurah");
		Student student2 = new Student("Abhishek","Patna");
		
		//Reading image
		FileInputStream fileInputStream1 = new FileInputStream("src/com/practice/model/Screenshot (49).png");
		byte[] data1 = new byte[fileInputStream1.available()];
		fileInputStream1.read(data1);
		
		FileInputStream fileInputStream2 = new FileInputStream("src/com/practice/model/google.png");
		byte[] data2 = new byte[fileInputStream2.available()];
		fileInputStream2.read(data2);
		
		//Address object
		Address address1 = new Address("Chatterjee Bagan", "Chinsurah", true, new Date(), 123.45, data1);
		Address address2 = new Address("Hospital road", "Akalpoush", false, new Date(), 123.45, data2);
		
			try {
				txn = session.beginTransaction();
				session.save(student1);
				session.save(student2);
				session.save(address1);
				session.save(address2);
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
