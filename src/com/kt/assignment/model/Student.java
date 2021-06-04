package com.kt.assignment.model;

public class Student {
	int studentId;
	int rollNumber;
	String name;
	int age;
	String gender;
	
	public Student(int rollNumber, String name, int age, String gender) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	
	public Student() {
		super();
	}


	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", rollNumber=" + rollNumber + ", name=" + name + ", age=" + age
				+ ", gender=" + gender + "]";
	}
	
	
	
}
