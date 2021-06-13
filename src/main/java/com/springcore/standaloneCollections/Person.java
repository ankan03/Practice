package com.springcore.standaloneCollections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	private List<String> friendList;
	private Map<String , Integer> feesStructure;
	private Properties properties;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<String> getFriendList() {
		return friendList;
	}

	public void setFriendList(List<String> friendList) {
		this.friendList = friendList;
	}
	
	

	public Map<String, Integer> getFeesStructure() {
		return feesStructure;
	}

	public void setFeesStructure(Map<String, Integer> feesStructure) {
		this.feesStructure = feesStructure;
	}

	
	
	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "Person [friendList=" + friendList + ", feesStructure=" + feesStructure + ", properties=" + properties
				+ "]";
	}

	
}
