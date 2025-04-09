package com.learning_spring.example.game;

import org.springframework.stereotype.Component;

@Component
public class GameRunner {

	GameConsole game;
	
//	Pacman game;
	
	
	public GameRunner(GameConsole game) {
		this.game=game;
	}
	
	public void run() {
		System.out.println("Running the game: "+game);
		
		game
		.up();
		
		game.down();
		
		game.left();
		
		game.right();
		
		}
	
}
