package com.practice;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	int eId;
	String eName;
	
	
	public Employee(int eId, String eName) {
		super();
		this.eId = eId;
		this.eName = eName;
	}


	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}


	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + "]";
	}
	
	
}