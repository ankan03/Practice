package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Student1 {
	@Value("#{1+2}")
	private int id;
	@Value("#{15+29}")
	private int marks;
	
	@Value("#{T(java.lang.Math).sqrt(36)}")
	private double mySqrt;
	
	@Value("#{T(java.lang.Math).PI}")
	private double myPiValue;
	
	@Value("#{new java.lang.String('Ankan Mukherjee')}")
	private String myName;	
	
	@Value("#{5-2>1}")
	private boolean isActive;
	
	
	public Student1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	

	public double getMySqrt() {
		return mySqrt;
	}

	public void setMySqrt(double mySqrt) {
		this.mySqrt = mySqrt;
	}

	public double getMyPiValue() {
		return myPiValue;
	}

	public void setMyPiValue(double myPiValue) {
		this.myPiValue = myPiValue;
	}

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}
	
	

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "Student1 [id=" + id + ", marks=" + marks + ", mySqrt=" + mySqrt + ", myPiValue=" + myPiValue
				+ ", myName=" + myName + ", isActive=" + isActive + "]";
	}

	
	
}
