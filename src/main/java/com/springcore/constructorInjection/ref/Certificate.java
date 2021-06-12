package com.springcore.constructorInjection.ref;

public class Certificate {
	String certificateName;

	public Certificate(String certificateName) {
		super();
		this.certificateName = certificateName;
	}

	@Override
	public String toString() {
		return "Certificate [certificateName=" + certificateName + "]";
	}
	
	
}
