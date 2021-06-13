package com.springjdbc.databaseSetup;

public class Student {
	private int studentId;
	private int studentName;
	private int studentCity;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studentId, int studentName, int studentCity) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentCity = studentCity;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getStudentName() {
		return studentName;
	}

	public void setStudentName(int studentName) {
		this.studentName = studentName;
	}

	public int getStudentCity() {
		return studentCity;
	}

	public void setStudentCity(int studentCity) {
		this.studentCity = studentCity;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentCity=" + studentCity
				+ "]";
	}
	
	
	
}
