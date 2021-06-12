package com.springcore.lifecycle.Interface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Berger implements InitializingBean,DisposableBean {
	private double price;

	public Berger() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Inside setPrice method of Berger");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Berger [price=" + price + "]";
	}

	public void destroy() throws Exception {
		System.out.println("Inside destroy method of Berger");
		
	}

	public void afterPropertiesSet() throws Exception {
		//Same as init() method of xml
		System.out.println("Inside initialize method of Berger");
		
	}
	
	
}
