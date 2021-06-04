package com.kt.day1.model;

public class Highako { // POJO

	private int empID;
	private String empName;

	public Highako() {
	}

	public Highako(int empID, String empName) {
		setEmpID(empID);
		setEmpName(empName);
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Highako [empID=" + empID + ", empName=" + empName + "]";
	}

}
