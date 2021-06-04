package com.practice;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(15, "Ankan4"));
		employeeList.add(new Employee(16, "Mukherjee4"));
		
		
		Configuration config = new Configuration().configure("com/practice/hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();

		for (Employee empObj : employeeList) {
			Session session = factory.openSession();
			Transaction txn = null;

			try {
				txn = session.beginTransaction();
				session.save(empObj);
				System.out.println("------------------");
				txn.commit();
				System.out.println("******************");
			} catch (HibernateException e) {
				if (txn != null)
					txn.rollback();
				e.printStackTrace();
			} finally {
				session.close();
			}
		}
		
	}

}
