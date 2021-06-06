package com.practice.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Cirtificate {
	@Column(name="course_name")
	private String courseName;
	
	@Column(name="course_duration")
	private String courseDuration;

	public Cirtificate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cirtificate(String courseName, String courseDuration) {
		super();
		this.courseName = courseName;
		this.courseDuration = courseDuration;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDuration() {
		return courseDuration;
	}

	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
	}

	@Override
	public String toString() {
		return "Cirtificate [courseName=" + courseName + ", courseDuration=" + courseDuration + "]";
	}
	
	
	
}
