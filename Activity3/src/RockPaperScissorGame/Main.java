/*
 * Copyright © Eunji Park
 * This code was written for the in-class Activity of Software Project
 * at Chung-Ang University.
 */

package RockPaperScissorGame;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		RockPaperScissorGame game = new RockPaperScissorGame();
		
		for (int i=0; i<4; i++) {
			
			// Get the player's input through keyboard 
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Please choose from ROCK, PAPER, or SCISSOR: ");
	        String choice = scanner.next();
			int new_choice = change_Int(choice);

	        game.setPlayerChoice(new_choice);
	        game.playGame(); // 게임 진행
	        System.out.println(" ");
	        
			
		}

	}
	private static int change_Int(String choice){
		if (choice.equals("9"))
		{
			System.exit(0);
		}
		if (choice.equals("rock") | choice.equals("0")){
			return 0;
		}
		else if (choice.equals("paper") | choice.equals("1")){
			return 1;
		}
		else if (choice.equals("scissors") | choice.equals("2")){
			return 2;
		}
		else{
			return -1;
		}
	}
}
