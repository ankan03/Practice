package com.springcore.constructorInjection.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	
	private int employeeId;
	private List<String> employeePhoneList;
	private Set<String> employeeAddressSet;
	private Map<String , String> employeeCourseMap;
	
	public Employee(int employeeId, List<String> employeePhoneList, Set<String> employeeAddressSet,
			Map<String, String> employeeCourseMap) {
		super();
		this.employeeId = employeeId;
		this.employeePhoneList = employeePhoneList;
		this.employeeAddressSet = employeeAddressSet;
		this.employeeCourseMap = employeeCourseMap;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeePhoneList=" + employeePhoneList
				+ ", employeeAddressSet=" + employeeAddressSet + ", employeeCourseMap=" + employeeCourseMap + "]";
	}

	
	
	
	
}
