package com.learning_spring.example;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learning_spring.example.game.BeanConfigurations;

public class AppBasicSpring {

	
	public static void main(String[] args) {
		
		var context=new AnnotationConfigApplicationContext(BeanConfigurations.class);
		
		System.out.println(context.getBean("name"));
		
		System.out.println(context.getBean("age"));
//		
		System.out.println(context.getBean("person"));
		
		System.out.println(context.getBean("address1"));
		
		System.out.println(context.getBean("personWithAddress"));
		
//		System.out.println(context.getBean(Address.class));s
		
		context.close();
	}
}
