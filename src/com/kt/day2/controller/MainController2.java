package com.kt.day2.controller;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.kt.day2.model.Highradian;
import com.kt.day2.model.Laptop;

public class MainController2 {

	public static void main(String[] args) {
		// ONE TO ONE RELATIONSHIP

		Configuration config = new Configuration().configure("com/kt/day2/cfg/hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction txn = null;
		
		Highradian highradian = new Highradian("Ankan");
		Laptop laptop = new Laptop("HP");
		highradian.setLaptop(laptop);
		
		
			try {
				txn = session.beginTransaction();
				session.save(highradian);
				session.save(laptop);
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
