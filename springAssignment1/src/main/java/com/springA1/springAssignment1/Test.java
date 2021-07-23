package com.springA1.springAssignment1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Test {

	public static void main(String[] args) {
	
	    AbstractApplicationContext context=new ClassPathXmlApplicationContext("person.xml");
		
		Customer person=(Customer)context.getBean("customer");
		
		person.details();
	}

}
