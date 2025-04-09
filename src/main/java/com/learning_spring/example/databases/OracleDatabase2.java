package com.learning_spring.example.databases;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.learning_spring.example.Interfaces.DbProvider;

@Component
@Primary
public class OracleDatabase2 implements DbProvider {

	@Override
	public int[] getData() {

		return new int[] { 1, 2, 3, 4, 5 };
	}
	
	
}
