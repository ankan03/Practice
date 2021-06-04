package com.kt.day2.controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.kt.day1.model.Highako;
import com.kt.day2.model.Highradian;

public class MainController {

	public static void main(String[] args) {

		Configuration config = new Configuration().configure("com/kt/day2/cfg/hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction txn = null;
		
		Highradian highradian1 = new Highradian("Ankan");
		
			try {
				txn = session.beginTransaction();
				session.save(highradian1); // What we want to do !!
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
