package com.springcore.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	
	private int employeeId;
	private List<String> employeePhoneList;
	private Set<String> employeeAddressSet;
	private Map<String , String> employeeCourseMap;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeId, List<String> employeePhoneList, Set<String> employeeAddressSet,
			Map<String, String> employeeCourseMap) {
		super();
		this.employeeId = employeeId;
		this.employeePhoneList = employeePhoneList;
		this.employeeAddressSet = employeeAddressSet;
		this.employeeCourseMap = employeeCourseMap;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public List<String> getEmployeePhoneList() {
		return employeePhoneList;
	}

	public void setEmployeePhoneList(List<String> employeePhoneList) {
		this.employeePhoneList = employeePhoneList;
	}

	public Set<String> getEmployeeAddressSet() {
		return employeeAddressSet;
	}

	public void setEmployeeAddressSet(Set<String> employeeAddressSet) {
		this.employeeAddressSet = employeeAddressSet;
	}

	public Map<String, String> getEmployeeCourseMap() {
		return employeeCourseMap;
	}

	public void setEmployeeCourseMap(Map<String, String> employeeCourseMap) {
		this.employeeCourseMap = employeeCourseMap;
	}
	
	
	
}
