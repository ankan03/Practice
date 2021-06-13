package com.springcore.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
	//We can put @Autowired before variable declaration
//	@Autowired
	private Address address;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//We can put @Autowired before constructor declaration
	@Autowired
	public Employee(Address address) {
		super();
		this.address = address;
		System.out.println("Inside constructor method of Employee");
	}

	public Address getAddress() {
		return address;
	}
	
	//We can put @Autowired before setAddress method declaration
//	@Autowired
	public void setAddress(Address address) {
		System.out.println("Inside setAddress method of Employee");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
}
