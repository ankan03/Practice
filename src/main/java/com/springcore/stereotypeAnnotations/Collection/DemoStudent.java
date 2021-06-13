package com.springcore.stereotypeAnnotations.Collection;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//We can change the default name of the bean (demoStudent)
@Component("ankan")
public class DemoStudent {
	@Value("12")
	private int studentId;
	@Value("Ankan Mukherjee")
	private String studentName;
	@Value("#{myList}")
	private List<String> friendList;
	
	public DemoStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public List<String> getFriendList() {
		return friendList;
	}

	public void setFriendList(List<String> friendList) {
		this.friendList = friendList;
	}

	@Override
	public String toString() {
		return "DemoStudent [studentId=" + studentId + ", studentName=" + studentName + ", friendList=" + friendList
				+ "]";
	}

	
}
