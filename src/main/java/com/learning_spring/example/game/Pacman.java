package com.learning_spring.example.game;

import org.springframework.stereotype.Component;

@Component
public class Pacman implements GameConsole {

	public void up() {
		System.out.println("Pacup");
	}

	public void down() {
		System.out.println("Pacdown");
	}

	public void left() {
		System.out.println("Pacleft");
	}

	public void right() {
		System.out.println("Pacright");
	}

}
