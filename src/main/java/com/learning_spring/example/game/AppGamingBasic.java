package com.learning_spring.example.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.learning_spring.example")
public class AppGamingBasic {
		
	public static void main(String[] args) {
	
		try(var context =new AnnotationConfigApplicationContext(AppGamingBasic.class)) {
		
			context.getBean(GameRunner.class).run();
		}
		
	}

}
