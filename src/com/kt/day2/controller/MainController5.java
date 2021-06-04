package com.kt.day2.controller;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.kt.day2.model.Department;
import com.kt.day2.model.Highradian;
import com.kt.day2.model.Laptop;
import com.kt.day2.model.Project;

public class MainController5 {

	public static void main(String[] args) {
		// MANY TO MANY RELATIONSHIP

				Configuration config = new Configuration().configure("com/kt/day2/cfg/hibernate.cfg.xml");
				SessionFactory factory = config.buildSessionFactory();
				Session session = factory.openSession();
				Transaction txn = null;		
				
					try {
						txn = session.beginTransaction();
						
						
						Highradian highradian1 = new Highradian("Ankan");
						Highradian highradian2 = new Highradian("Abhishek");
						Highradian highradian3 = new Highradian("Harsh");
						Highradian highradian4 = new Highradian("Abhedya");
						Highradian highradian5 = new Highradian("Anubhav");
						
						
						Laptop laptop1 = new Laptop("HP");
						Laptop laptop2 = new Laptop("Lenovo");
						Laptop laptop3 = new Laptop("Macbook");
						Laptop laptop4 = new Laptop("Samsung");
						Laptop laptop5 = new Laptop("Dell");
						
						
						Department department1 = new Department("Consulting");
						Department department2 = new Department("Atonomus");
						
						
						Project project1 = new Project("Invoice Management System");
						Project project2 = new Project("Covid-19 Tracker and Tips");
						Project project3 = new Project("Food Panda reception Management");
						
						
						highradian1.setLaptop(laptop1);
						highradian2.setLaptop(laptop2);
						highradian3.setLaptop(laptop3);
						highradian4.setLaptop(laptop4);
						highradian5.setLaptop(laptop5);
						
						
						highradian1.setDept(department1);
						highradian2.setDept(department1);
						department1.getHighradiansList().add(highradian1);
						department1.getHighradiansList().add(highradian2);
						
						
						highradian3.setDept(department2);
						highradian4.setDept(department2);
						highradian5.setDept(department2);
						department2.getHighradiansList().add(highradian3);
						department2.getHighradiansList().add(highradian4);
						department2.getHighradiansList().add(highradian5);
						
						
						highradian1.getProjects().add(project1);
						highradian2.getProjects().add(project2);
						highradian2.getProjects().add(project3);
						project1.getTeamMembersList().add(highradian1);
						project2.getTeamMembersList().add(highradian2);
						project3.getTeamMembersList().add(highradian2);
						
						highradian3.getProjects().add(project1);
						highradian4.getProjects().add(project2);
						highradian5.getProjects().add(project3);
						project1.getTeamMembersList().add(highradian3);
						project2.getTeamMembersList().add(highradian4);
						project3.getTeamMembersList().add(highradian5);
						
						
						session.save(highradian1);
						session.save(highradian2);
						session.save(highradian3);
						session.save(highradian4);
						session.save(highradian5);
						
						session.save(laptop1);
						session.save(laptop2);
						session.save(laptop3);
						session.save(laptop4);
						session.save(laptop5);
						
						
						session.save(department1);
						session.save(department2);
						
						
						session.save(project1);
						session.save(project2);
						session.save(project3);
						
						
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
