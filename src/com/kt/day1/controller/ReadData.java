package com.kt.day1.controller;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.kt.day1.model.Highako;

public class ReadData {

	public static void main(String[] args) {
		
		Configuration config = new Configuration().configure("com/kt/day1/cfg/hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		//HQL
		Query readQuery = session.createQuery("FROM Highako");
		List<Highako> newHighakoList = readQuery.list();
		
		for (Highako highakoObject: newHighakoList) {
			System.out.println(highakoObject.toString());
		}
		session.clear();
		factory.close();
	}

}
