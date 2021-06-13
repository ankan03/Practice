package com.springcore.stereotypeAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//We can change the default name of the bean (demoStudent)
@Component("aa")
public class DemoStudent1 {
	@Value("12")
	private int studentId;
	@Value("Ankan Mukherjee")
	private String studentName;
	
	public DemoStudent1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "DemoStudent1 [studentId=" + studentId + ", studentName=" + studentName + "]";
	}
	
	
	
}
