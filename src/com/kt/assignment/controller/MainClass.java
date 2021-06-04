package com.kt.assignment.controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.kt.assignment.model.Student;

public class MainClass {
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student( 123, "Ankan", 20, "M"));
		studentList.add(new Student( 124, "Ishani", 22, "F"));
		studentList.add(new Student( 125, "Ankan1", 10, "M"));
		studentList.add(new Student( 126, "Ishani1", 11, "F"));
		studentList.add(new Student( 127, "Ankan2", 18, "M"));
		studentList.add(new Student( 128, "Ananya", 19, "F"));
		studentList.add(new Student( 129, "Ankan3", 21, "M"));
		studentList.add(new Student( 130, "Ishani3", 22, null));
		studentList.add(new Student( 131, "Ankan4", 21, "M"));
		studentList.add(new Student( 132, "Ishani4", 22, null));
		
		Configuration config = new Configuration().configure("com/kt/assignment/cfg/hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();

		for (Student studentObj : studentList) {
			Session session = factory.openSession();
			Transaction txn = null;

			try {
				txn = session.beginTransaction();
				session.save(studentObj);
				txn.commit();
			} catch (HibernateException e) {
				if (txn != null)
					txn.rollback();
				e.printStackTrace();
			} finally {
				session.close();
			}
		}
		factory.close();
	}
}
