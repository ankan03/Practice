package com.kt.day1.controller;

import java.util.*;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.kt.day1.model.Highako;

public class MainClass {

	public static void main(String[] args) {

		List<Highako> highakoList = new ArrayList<Highako>();

		Highako alpha = new Highako(11623, "Apurva");
		Highako beta = new Highako(11253, "Shivam");
		Highako gamma = new Highako(11354, "Apratim");
		Highako deta = new Highako(11334, "Kunal");
		Highako eta = new Highako(11501, "Rajanya");

		highakoList.add(alpha);
		highakoList.add(beta);
		highakoList.add(gamma);
		highakoList.add(deta);
		highakoList.add(eta);

		Configuration config = new Configuration().configure("com/kt/day1/cfg/hibernate.cfg.xml");

		SessionFactory factory = config.buildSessionFactory();

		for (Highako highakoObject : highakoList) {
			Session session = factory.openSession();
			Transaction txn = null;

			try {
				txn = session.beginTransaction();
				session.save(highakoObject); // What we want to do !!
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
}
