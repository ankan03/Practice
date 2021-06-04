package com.kt.day2.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "project")
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="pk_project_id")
	private int projectId;
	@Column(name="project_name")
	private String projectName;
	
	@ManyToMany(mappedBy = "projects")
	private List<Highradian> teamMembersList = new ArrayList<Highradian>();
	
	
	

	public Project() {
		super();
	}
	
	

	public Project(String projectName) {
		super();
		this.projectName = projectName;
	}



	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public List<Highradian> getTeamMembersList() {
		return teamMembersList;
	}

	public void setTeamMembersList(List<Highradian> teamMembersList) {
		this.teamMembersList = teamMembersList;
	}
	
	

}
