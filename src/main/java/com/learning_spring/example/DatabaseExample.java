package com.learning_spring.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.learning_spring.example.Interfaces.CalculationService;

@Configuration
@ComponentScan(basePackages = "com.learning_spring.example")	
public class DatabaseExample {

	public static void main(String[] args) {
		
		try (
			var context=new AnnotationConfigApplicationContext(DatabaseExample.class);
		){
			System.out.println(context.getBean(CalculationService.class).caluculate());
		}
		
	}
	
}
