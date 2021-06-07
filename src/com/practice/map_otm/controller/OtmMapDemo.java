package com.practice.map_otm.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.practice.map_otm.model.AnswerOtm;
import com.practice.map_otm.model.QuestionOtm;
import com.practice.map_oto.model.Answer;
import com.practice.map_oto.model.Question;
import com.practice.model.Address;
import com.practice.model.Student;

public class OtmMapDemo {
	public static void main(String[] args) throws IOException {
		Configuration config = new Configuration().configure("com/practice/cfg/hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction txn = null;
		
		
		QuestionOtm question1 = new QuestionOtm("question-1?");
		QuestionOtm question2 = new QuestionOtm("question-2?");
		QuestionOtm question3 = new QuestionOtm("question-3?");
		
		AnswerOtm answer1 = new AnswerOtm("answer-1");
		AnswerOtm answer2 = new AnswerOtm("answer-2");
		AnswerOtm answer3 = new AnswerOtm("answer-3");
		AnswerOtm answer4 = new AnswerOtm("answer-4");
		AnswerOtm answer5 = new AnswerOtm("answer-5");
		
		
		question1.getAnswerList().add(answer1);
		question1.getAnswerList().add(answer2);
		question2.getAnswerList().add(answer3);
		question3.getAnswerList().add(answer4);
		question3.getAnswerList().add(answer5);
		
		answer1.setQuestion(question1);
		answer2.setQuestion(question1);
		answer3.setQuestion(question2);
		answer4.setQuestion(question3);
		answer5.setQuestion(question3);

		
			try {
				txn = session.beginTransaction();
				session.save(question1);
				session.save(question2);
				session.save(question3);
				session.save(answer1);
				session.save(answer2);
				session.save(answer3);
				session.save(answer4);
				session.save(answer5);
				txn.commit();
			} catch (HibernateException e) {
				if (txn != null)
					txn.rollback();
				e.printStackTrace();
			} finally {
				// Fetching .......
				QuestionOtm q = session.get(QuestionOtm.class,1);
				System.out.println("Question: "+q.getQuestion());
				//When we will ask for any data related to answerList then only Quarry will fire for it otherwise it will not fire Quarry to fetch the answer list
				//This property is called LAZY LOADING(It is default property of hibernate , we can override this into the specific model class)
				//In case of EAGER LOADING hibernate will fetch all the data first time
				System.out.println("Answer: "+q.getAnswerList().toString());
				
				session.close();
				factory.close();
			}
	}
}
