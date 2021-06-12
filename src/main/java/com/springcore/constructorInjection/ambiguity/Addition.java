package com.springcore.constructorInjection.ambiguity;

public class Addition {
	private int a;
	private int b;
	
	public Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("Inside constructor : int,int");
	}
	
	public Addition(double a, double b) {
		super();
		this.a = (int)a;
		this.b = (int)b;
		System.out.println("Inside constructor : double,double");
	}
	
//	public Addition(String a, String b) {
//		super();
//		this.a = Integer.parseInt(a);
//		this.b = Integer.parseInt(b);
//		System.out.println("Inside constructor : String,String");
//	}
	
	public void getResult() {
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("After addition: "+(a+b));
	}

}
