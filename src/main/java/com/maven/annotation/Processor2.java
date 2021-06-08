package com.maven.annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//If more than 1 class implement one interface we have to declare one class as @Primary to avoide confusion & Error
@Component
//@Primary
//If we don't want to specify @Primary then we have to manually specify which class will be used by @Qualifier 
public class Processor2 implements MobileProcessor {

	public void process() {
		System.out.println("Inside process() method of Processor2");

	}

}
