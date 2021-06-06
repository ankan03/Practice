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
@Table(name = "answer")
public class Answer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "answer_no")
	private int answerNo;
	private String answer;
	
	@OneToOne(mappedBy = "answer1")
//	@JoinColumn(name = "fk_question_no")
	private Question question;
	
	
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Answer(String answer) {
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


	public Question getQuestion() {
		return question;
	}


	public void setQuestion(Question question) {
		this.question = question;
	}


	@Override
	public String toString() {
		return "Answer [answerNo=" + answerNo + ", answer=" + answer + "]";
	}
	
	
}
