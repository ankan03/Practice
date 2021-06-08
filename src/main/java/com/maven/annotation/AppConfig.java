package com.maven.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// If we dose't want to create @Bean then we have to add @ComponentScan in AppConfig file and also add @Component in the model class
//@Configuration
//public class AppConfig {
//	@Bean
//	public Samsung getPhone() {
//		return new Samsung();
//	}
//	
//	@Bean
//	public MobileProcessor getProcessor() {
//		return new Snapdragan();
//	}
//}

@Configuration
@ComponentScan(basePackages = "com.maven.annotation")
public class AppConfig {
	
}
