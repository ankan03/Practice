package com.maven.annotation;

import org.springframework.stereotype.Component;

//If we dose't want to create @Bean then we have to add @ComponentScan in AppConfig file and also add @Component in the model class
@Component
public class Snapdragan implements MobileProcessor {
	public void process() {
		System.out.println("Inside process() method of Snapdragan");
	}
}
