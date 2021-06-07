package com.practice.map_otm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "answer_otm")
public class AnswerOtm {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "answer_no")
	private int answerNo;
	private String answer;
	
	@ManyToOne
	@JoinColumn(name = "fk_question_id")
	private QuestionOtm question;
	
	
	public AnswerOtm() {
		super();
		// TODO Auto-generated constructor stub
	}


	public AnswerOtm(String answer) {
		super();
		this.answer = answer;
	}


	public int getAnswerNo() {
		return answerNo;
	}


	public void setAnswerNo(int answerNo) {
		this.answerNo = answerNo;
	}


	public String getAnswer() {
		return answer;
	}


	public void setAnswer(String answer) {
		this.answer = answer;
	}


	public QuestionOtm getQuestion() {
		return question;
	}


	public void setQuestion(QuestionOtm question) {
		this.question = question;
	}


	@Override
	public String toString() {
		return "Answer [answerNo=" + answerNo + ", answer=" + answer + "]";
	}
	
	
}
