package com.practice.hql;

import java.io.IOException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.practice.model.Cirtificate;
import com.practice.model.Student;

public class HqlSelect {
	public static void main(String[] args) throws IOException {
		Configuration config = new Configuration().configure("com/practice/cfg/hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction txn = null;
		
		//Normal query
		String query = "from Student";
		
		//With condition
		String query1 = "from Student where city='Kolkata'";
		
		//With Object Property
		String query2 = "from Student as s where s.city='Chinsurah'";
		
		//With Object Property & appending parameter dynamically
		String query3 = "from Student as s where s.city= :x and s.name=:y";
		
		
		
		Query q = session.createQuery(query3);
		q.setParameter("x", "Chinsurah");
		q.setParameter("y", "Ankan");
		List<Student> studentList = q.list();
		for (Student student : studentList) {
			System.out.println(student);
		}
		
		session.close();
		factory.close();

	}
}
