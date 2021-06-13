package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean
	public WatchingMovie getMovie() {
		return new WatchingMovie();
	}
	
	//We can change default bean name also
	@Bean(name = {"getStudent1","getStudent2","getStudent3"})
	public Student getStudent() {
		return new Student(getMovie());
	}
}
