package com.springcore.beanScope.annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//By default every Spring class is singletone (All the references of the same class pointed to the same object)
//If we want to make the class prototype we have to declare one extra annotation(@Scope) in Model class(Student1)
@Scope("prototype")
public class Student1 {
	
}
