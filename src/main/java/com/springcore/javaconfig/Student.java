package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

public class Student {
	private WatchingMovie movie;
	
	
	public Student(WatchingMovie movie) {
		super();
		this.movie = movie;
	}


	public WatchingMovie getMovie() {
		return movie;
	}


	public void setMovie(WatchingMovie movie) {
		this.movie = movie;
	}


	public void show() {
		System.out.println("Inside Show method of Student class");
	}


	@Override
	public String toString() {
		return "Student [movie=" + movie + "]";
	}
	
	
}
