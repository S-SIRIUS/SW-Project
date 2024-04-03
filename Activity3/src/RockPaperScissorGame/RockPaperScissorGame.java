/*
 * Copyright © Eunji Park
 * This code was written for the in-class Activity of Software Project at Chung-Ang University.
 */

package RockPaperScissorGame;

import java.util.Random;

public class RockPaperScissorGame {

    /* [Problem 1] Declare ROCK, PAPER, SCISSOR Constants here
     *
     * Declare ROCK, PAPER, SCISSOR as constants.
     * ROCK is 0, PAPER is 1, and SCISSOR is 2.
     *
     * tip: static and final
     *
     * */

    static final int ROCK = 0;
    static final int PAPER = 1;
    static final int SCISSOR = 2;

    /* [Problem 2] Declare Fields
     *
     * Declare the fields that will store player's and computer's choice.
     * Each field should be "private" so that other people cannot modify the choices.
     *
     * Field names: playerChoice, computerChoice
     *
     * */
    private int playerChoice;
    private int computerChoice;


    /* [Problem 3] Declare Constructors
     *
     * Declare Constructors to initialize the fields (which are declared above) as -1.
     * You can also add exception handling functionality utilizing constructor overloading (optional).
     *
     * */
    public RockPaperScissorGame(){
        this.playerChoice = -1;
        this.computerChoice = -1;
    }



    // [Problem 4] Declare Methods
    // 4-1. Setter Method
    /*
    * 4-1. Declare Setter Method
     * Write a code foe a method that stores the player's input from the scanner into the private field playerChoice.
            * If the player enters an valid integer (0,1,2), store the player's input into the field.
            * If the player enters an invalid integer, print a message asking them to input again.
            *
            * Argument type: int
            * Access modifier: public
            * Return type: void
    */
    public void setPlayerChoice(int choice) {
        if (choice >= 0 && choice <= 2) {
            this.playerChoice = choice;
        }
        else {
            System.out.println("Invalid input.");
            this.playerChoice = -1;
        }
    }

    // 4-2. Getter Method
    /*
     * 4-2. Declare Getter Method
     * Write a getter method to be used for printing the private fields playerChoice and computerChoice.
     *
     * Argument type: none
     * Access modifier: public
     * Return type: int
     */
    public int getPlayerChoice() {
        return playerChoice;
    }

    // 4-3. Choice Type Changing Method
    /*
     * 4-3. Declare Choice type changing Method (int to String)
     * Get the int type choice as an argument and return it as a String corresponding to the int value.
     * (e.g. 0 --> Rock)
     *
     * Argument type: int
     * Access modifier: private
     * Return type: String
     *
     * tip: You can utilize switch statement
     */
    private String getChoiceString(int choice) {

        switch (choice) {
            case ROCK:
                return "Rock";
            case PAPER:
                return "Paper";
            case SCISSOR:
                return "Scissor";
            default:
                return "Invalid Choice";
        }

    }

    // 4-4. Result Determining Method
    /*
     * 4-4. Declare result determining method
     * Declare result determining method based on the rules of the game.
     *
     * Argument type: int Player, int Computer
     * Access modifier: private
     * Return type: String
     */
    private String determineWinner(int player, int computer)
    {
        if(player == 0){ //플레이어가 바위 일때
            if(computer == 1)
            {
                return "Computer Win!";
            }
            else if(computer ==2)
            {
                return "Player Win!";
            }
            else
            {
                return "Draw! No winner.";
            }
        }

        if(player == 1){//플레이어가 보자기일때
            if(computer == 1)
            {
                return "Draw! No winner.";
            }
            else if(computer ==0)
            {
                return "Player Win!";
            }
            else
            {
                return "Computer Win!";
            }
        }

        if(player == 2) // 플레이어가 가위일때
        {
            if(computer == 2)
            {
                return "Draw! No winner.";
            }
            else if(computer ==0)
            {
                return "Computer Win!";
            }
            else{
                return "Player Win!";
            }
        }
        return "Unexpected error";
    }

    // Game Playing Method 
    public void playGame() {
        // Generate the computer's choice randomly
        Random random = new Random();
        this.computerChoice = random.nextInt(3);

        // Print results
        System.out.println("Player's choice: " + getChoiceString(playerChoice));
        System.out.println("Computer's choice: " + getChoiceString(computerChoice));
        System.out.println("Result: " + determineWinner(playerChoice, computerChoice));
    }
}