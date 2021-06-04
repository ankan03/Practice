package com.kt.day2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "laptop")
public class Laptop {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="fk_laptop_id")
	private int laptopId;
	@Column(name="laptop_make_number")
	private String laptopMakeNumber;
		
	public Laptop() {
		super();
	}

	public Laptop(String laptopMakeNumber) {
		super();
		this.laptopMakeNumber = laptopMakeNumber;
	}
	
	
	public int getLaptopId() {
		return laptopId;
	}
	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}
	public String getLaptopMakeNumber() {
		return laptopMakeNumber;
	}
	public void setLaptopMakeNumber(String laptopMakeNumber) {
		this.laptopMakeNumber = laptopMakeNumber;
	}
	
	
}
