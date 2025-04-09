package com.learning_spring.example.game;

import org.springframework.stereotype.Component;

//@Component
public class MarioGame implements GameConsole {

	public void up() {
		System.out.println("Jump");
	}
	
	public void down() {
		System.out.println("Down The tunnel");
	}
	
	public void left() {
		System.out.println("Go Back");
	}
	
	public void right() {
		System.out.println("Go Front");
	}
	
}
