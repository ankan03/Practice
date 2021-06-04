package com.kt.day2.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "department")
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="fk_dept_id")
	private int deptId;
	@Column(name="dept_name")
	private String deptName;
	
	@OneToMany(mappedBy = "dept")
	private List<Highradian> highradiansList = new ArrayList<Highradian>();

	public Department() {
		super();
	}

	public Department(String deptName) {
		super();
		this.deptName = deptName;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public List<Highradian> getHighradiansList() {
		return highradiansList;
	}

	public void setHighradiansList(List<Highradian> highradiansList) {
		this.highradiansList = highradiansList;
	}
	
	
	
}
