package com.maven.MavenDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
	
	@Autowired
	Tyre tyre = new Tyre();
	

	public Tyre getTyre() {
		return tyre;
	}


	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}


	public void drive() {
		System.out.println("Car is moving");
	}


	@Override
	public String toString() {
		return "Car [tyre=" + tyre + "]";
	}
	
	
	
}