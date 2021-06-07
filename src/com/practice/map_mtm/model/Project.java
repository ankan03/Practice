package com.practice.map_mtm.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "project")
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "project_id")
	private int pid;
	@Column(name = "project_name")
	private String pName;
	
	@ManyToMany(mappedBy = "projectList")
	private List<Employee> employeeList = new ArrayList<Employee>();

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(String pName) {
		super();
		this.pName = pName;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}

	@Override
	public String toString() {
		return "Project [pid=" + pid + ", pName=" + pName + ", employeeList=" + employeeList + "]";
	}
	
	

}
