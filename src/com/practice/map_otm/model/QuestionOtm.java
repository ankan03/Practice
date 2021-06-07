package com.practice.map_otm.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "question_otm")
public class QuestionOtm {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "question_no")
	private int questionNo;
	
	@OneToMany(mappedBy = "question")
	private List<AnswerOtm> answerList = new ArrayList<AnswerOtm>();
	
	
	@Column(name = "question")
	private String question;
	
	
	public QuestionOtm() {
		super();
		// TODO Auto-generated constructor stub
	}
	public QuestionOtm(String question) {
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
	
	
	public List<AnswerOtm> getAnswerList() {
		return answerList;
	}
	public void setAnswerList(List<AnswerOtm> answerList) {
		this.answerList = answerList;
	}
	
	@Override
	public String toString() {
		return "Question [questionNo=" + questionNo + ", question=" + question + "]";
	}
	
	
}
