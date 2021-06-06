package com.practice.map_oto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "question")
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "question_no")
	private int questionNo;
	@OneToOne
	@JoinColumn(name = "fk_answer_no")
	private Answer answer1;
	
	
	@Column(name = "question")
	private String question;
	
	
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(String question) {
		super();
		this.question = question;
	}
	
	public int getQuestionNo() {
		return questionNo;
	}
	public void setQuestionNo(int questionNo) {
		this.questionNo = questionNo;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	
	
	public Answer getAnswer() {
		return answer1;
	}
	public void setAnswer(Answer answer) {
		this.answer1 = answer;
	}
	@Override
	public String toString() {
		return "Question [questionNo=" + questionNo + ", question=" + question + "]";
	}
	
	
}
