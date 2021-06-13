package com.springcore.autowiring.xml;

public class Employee {
	private Address address;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(Address address) {
		super();
		this.address = address;
		System.out.println("Inside constructor method of Employee");
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("Inside setAddress method of Employee");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
}
