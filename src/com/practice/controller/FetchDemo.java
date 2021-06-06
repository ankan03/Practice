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
import com.practice.model.Student;

public class FetchDemo {
	public static void main(String[] args) throws IOException {
		Configuration config = new Configuration().configure("com/practice/cfg/hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction txn = null;
		
		//1.
		//load and get method
//		System.out.println((Student)session.get(Student.class, 1));
//		System.out.println((Student)session.load(Student.class, 2));
//		System.out.println((Address)session.load(Address.class, 1));
		
		
		//2.
		//If object is not present in the DB , get() method will return null
//		Student s = (Student)session.get(Student.class, 9);
//		System.out.println(s);
		
		//If object is not present in the DB , load() method will throw exception
//		Student s = (Student)session.load(Student.class, 9);
//		System.out.println(s);
		
		
		//3.
		//If data is already fetched from database it will not call DB if same quary written 2nd time, 
		//in this case get() method will provide value from cache memory 
		
		//When object is created but value has never used then get() method will fire quarry
//		Student s = (Student)session.get(Student.class, 1);
//		System.out.println(s);
//		Student s1 = (Student)session.get(Student.class, 1);
//		System.out.println(s1);
		
		
		
		//If data is already fetched from database it will not call DB if same quary written 2nd time, 
		//in this case get() method will provide value from cache memory 
		
		//When object is created but value has never used then load() method will not fire quarry
		//If the data is used somewhere then only it fire quarry . thats why it better than get() method
		Student s = (Student)session.load(Student.class, 1);
		System.out.println(s);
		Student s1 = (Student)session.load(Student.class, 1);
		System.out.println(s1);
		
		
		session.close();
		factory.close();
			

	}
}
