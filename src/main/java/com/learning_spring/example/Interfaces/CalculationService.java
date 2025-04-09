package com.learning_spring.example.Interfaces;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CalculationService {

//	@Autowired	
//	@Qualifier("oracleDatabase1") DbProvider dbProvider;

	DbProvider dbProvider;
	
	public CalculationService(
//			@Qualifier("oracleDatabase1") 
				DbProvider dbProvider) {
		this.dbProvider = dbProvider;
	}
	
	public int caluculate() {
		return Arrays.stream(dbProvider.getData()).max().orElse(0);
	}
	
	
}
