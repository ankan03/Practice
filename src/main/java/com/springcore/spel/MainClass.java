package com.springcore.spel;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import com.springcore.setterInjection.Student;

public class MainClass {

	public static void main(String[] args) throws Exception {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/config.xml");
		
		Student1 student1 = context.getBean("student1",Student1.class);
		System.out.println(student1);
		
		SpelExpressionParser spelExpressionParser = new SpelExpressionParser();
		Expression expression =spelExpressionParser.parseExpression("6<2?1:9");
		System.out.println(expression.getValue());
	}

}
