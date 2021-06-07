package com.practice.map_mtm.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.practice.map_mtm.model.Employee;
import com.practice.map_mtm.model.Project;
import com.practice.map_otm.model.AnswerOtm;
import com.practice.map_otm.model.QuestionOtm;
import com.practice.map_oto.model.Answer;
import com.practice.map_oto.model.Question;
import com.practice.model.Address;
import com.practice.model.Student;

public class MtmMapDemo {
	public static void main(String[] args) throws IOException {
		Configuration config = new Configuration().configure("com/practice/cfg/hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction txn = null;
		
		
		Employee employee1 = new Employee("employee-1");
		Employee employee2 = new Employee("employee-2");
		Employee employee3 = new Employee("employee-3");
		
		Project project1 = new Project("project-1");
		Project project2 = new Project("project-2");
		Project project3 = new Project("project-3");
		
		
		employee1.getProjectList().add(project1);
		employee1.getProjectList().add(project2);
		employee2.getProjectList().add(project2);
		employee3.getProjectList().add(project3);
		employee3.getProjectList().add(project1);
		
		project1.getEmployeeList().add(employee1);
		project1.getEmployeeList().add(employee3);
		project2.getEmployeeList().add(employee1);
		project2.getEmployeeList().add(employee2);
		project3.getEmployeeList().add(employee3);

		
			try {
				txn = session.beginTransaction();
				session.save(employee1);
				session.save(employee2);
				session.save(employee3);
				session.save(project1);
				session.save(project2);
				session.save(project3);
				txn.commit();
			} catch (HibernateException e) {
				if (txn != null)
					txn.rollback();
				e.printStackTrace();
			} finally {
				// Fetching .......
//				Employee employee = session.get(Employee.class,1);
//				System.out.println("Employee: "+employee.toString()+"\t Project: "+employee.getProjectList().toString());
				
				session.close();
				factory.close();
			}
	}
}
