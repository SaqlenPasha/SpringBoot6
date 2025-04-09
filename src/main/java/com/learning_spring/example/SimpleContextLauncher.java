package com.learning_spring.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.learning_spring.example")
public class SimpleContextLauncher {
		
	public static void main(String[] args) {
	
		try(var context =new AnnotationConfigApplicationContext(SimpleContextLauncher.class)) {
	
		}
		
	}

}
