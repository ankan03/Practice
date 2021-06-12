package com.springcore.constructorInjection.ref;

public class Person {
	private String personName;
	private int personId;
	private Certificate certificate;
	
	public Person(String personName, int personId, Certificate certificate) {
		super();
		this.personName = personName;
		this.personId = personId;
		this.certificate = certificate;
	}

	@Override
	public String toString() {
		return "Person [personName=" + personName + ", personId=" + personId + ", certificate=" + certificate + "]";
	}
	
	
		
}
