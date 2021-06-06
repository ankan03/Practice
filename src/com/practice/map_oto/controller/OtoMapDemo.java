package com.practice.map_oto.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.practice.map_oto.model.Answer;
import com.practice.map_oto.model.Question;
import com.practice.model.Address;
import com.practice.model.Student;

public class OtoMapDemo {
	public static void main(String[] args) throws IOException {
		Configuration config = new Configuration().configure("com/practice/cfg/hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction txn = null;
		
		
		Question question1 = new Question("What is your name?");
		Question question2 = new Question("What is your roll?");
		Question question3 = new Question("What is your city?");
		
		Answer answer1 = new Answer("My name is Ankan Mukherjee");
		Answer answer2 = new Answer("My roll is 1828049");
		Answer answer3 = new Answer("My city is Chinsurah");
		
		question1.setAnswer(answer1);
		question2.setAnswer(answer2);
		question3.setAnswer(answer3);
		
		answer1.setQuestion(question1);
		answer2.setQuestion(question2);
		answer3.setQuestion(question3);
		
		
		
			try {
				txn = session.beginTransaction();
				session.save(question1);
				session.save(question2);
				session.save(question3);
				session.save(answer1);
				session.save(answer2);
				session.save(answer3);
				txn.commit();
			} catch (HibernateException e) {
				if (txn != null)
					txn.rollback();
				e.printStackTrace();
			} finally {
				// Fetching .......
				Question q = session.get(Question.class,1);
				System.out.println("Question: "+q.getQuestion()+"\t Answer: "+q.getAnswer().getAnswer());
				
				session.close();
				factory.close();
			}
			
			
			

	}
}
