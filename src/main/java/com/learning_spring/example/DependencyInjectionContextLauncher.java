package com.learning_spring.example;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
record DependencyInjector() {
	
}

@Component
record Dependency1() {
	
}

@Component
record Dependency2() {
	
}



@Configuration
@ComponentScan
public class DependencyInjectionContextLauncher {
		
	public static void main(String[] args) {
	
		try(var context =new AnnotationConfigApplicationContext(DependencyInjectionContextLauncher.class)) {
	
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
		}
		
	}

}
