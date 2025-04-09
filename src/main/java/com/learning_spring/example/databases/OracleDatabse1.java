package com.learning_spring.example.databases;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.learning_spring.example.Interfaces.DbProvider;

@Component
@Qualifier("oracleDatabase1")
public class OracleDatabse1 implements DbProvider {

	@Override
	public int[] getData() {

		return new int[] { 11,22,33,44,55 };
	}	
	
}
