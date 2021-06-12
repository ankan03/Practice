package com.springcore.lifecycle.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Pizza {
	private double price;

	public Pizza() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Inside setPrice method of Pizza");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pizza [price=" + price + "]";
	}
	
	//We can change the function name also
	@PostConstruct
	public void init() {
		System.out.println("Inside init method of Pizza");
	}
	
	//We can change the function name also
	@PreDestroy
	public void destroy() {
			System.out.println("Inside destroy method of Pizza");
	}
}
