package com.maven;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
	private String  brand;

//	CONSTRUCTOR INJECTION
//	public Tyre(String brand) {
//		super();
//		this.brand = brand;
//	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Tyre is Rolling";
	}

//	@Override
//	public String toString() {
//		return "Tyre [brand=" + brand + "]";
//	}
	
	
}
