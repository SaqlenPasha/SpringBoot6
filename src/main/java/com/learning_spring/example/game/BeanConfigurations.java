package com.learning_spring.example.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address address) {}

record Address(String line1, String city) {}

@Configuration
public class BeanConfigurations {

    @Bean
    String name() {
		return "Bob";
	}

    @Bean
    int age() {
		return 30;
	}
	
    @Bean
    Person person() {
    	return new Person("Bob",24,address());
    }
	
    @Bean(name = "address1")
    public Address address() {
		return new Address("123 Main St", "Springfield");
	}
	
    @Bean(name = "address2")
    public Address address2() {
		return new Address("UdderField", "England");
	}
	
    @Bean
    public Person personWithAddress(String name, int age, Address address2) {
    	
    	return new Person(name, age, address2);
    }
}
