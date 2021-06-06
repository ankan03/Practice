package com.practice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "student_roll")
	private int roll;
	@Column(name = "student_name")
	private String name;
	@Column(name = "student_city")
	private String city;
	
	//Embedding Objects
	private Cirtificate cirtificate;
	
	public Student() {
		super();
	}

	public Student(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	
	public Cirtificate getCirtificate() {
		return cirtificate;
	}

	public void setCirtificate(Cirtificate cirtificate) {
		this.cirtificate = cirtificate;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", city=" + city + "]";
	}
	
	
	
	
}
