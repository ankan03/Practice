package com.maven.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//If we dose't want to create @Bean then we have to add @ComponentScan in AppConfig file and also add @Component in the model class
@Component
public class Samsung {
	
	@Autowired
	@Qualifier("processor2")
	MobileProcessor cpu;
	
	public MobileProcessor getCpu() {
		return cpu;
	}

	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}

	public void config() {
		System.out.println("Samsung S7");
		cpu.process();
	}
}
