package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		// Load the Spring configuration file
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		A a = context.getBean("A", A.class);
		//A.getA();

		// Retrieve the B bean from the context
//        B classB = context.getBean("classB", B.class);

	}
}
