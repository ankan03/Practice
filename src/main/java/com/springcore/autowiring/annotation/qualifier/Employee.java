package com.springcore.autowiring.annotation.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	//We can put @Autowired before variable declaration
	@Autowired
	//@Qualifier only can be declared before property variable
	@Qualifier("address2")	//If we provide such Qualifier name which doesn't exist then it will throw exception
	private Address address;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//We can put @Autowired before constructor declaration
//	@Autowired
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
