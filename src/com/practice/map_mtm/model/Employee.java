package com.practice.map_mtm.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employee_id")
	private int eId;
	
	@Column(name = "employee_name")
	private String eName;
	
	@ManyToMany
	@JoinTable(name = "many_to_many_join" )
	List<Project> projectList = new ArrayList<Project>(); 

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Employee(String eName) {
		super();
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



	public List<Project> getProjectList() {
		return projectList;
	}



	public void setProjectList(List<Project> projectList) {
		this.projectList = projectList;
	}



	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", projectList=" + projectList + "]";
	}

	
	
	
}
