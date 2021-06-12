package com.springcore.lifecycle.xml;

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
		System.out.println("Inside setPrice method");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pizza [price=" + price + "]";
	}
	
	//We can change the function name also
	public void init() {
		System.out.println("Inside init method");
	}
	
	//We can change the function name also
		public void destroy() {
			System.out.println("Inside destroy method");
		}
}
