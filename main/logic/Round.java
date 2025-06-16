package main.logic;
import java.util.Scanner;
import DiceCup.java;
import Player.java;

/* A round is attached to a player. */
public class Round {
    private Scanner input;
    private int roundNum;
    private ArrayList<Player> players;

    public Round(ArrayList<Player> players) {
        this.roundNum = 0;
        this.input = new Scanner(System.in);
        this.players = players;
    }

    private int getRound(){
        return this.roundNum;
    }

    private int playRound(){
        this.roundNum++;
        for (Player player : players) {
            takeTurn(player);
        }
    }

    private void takeTurn(Player player) {
        int roll = 0;
        while (roll < 3) {
            // Sets all 5 dice to be rolled on 1st round
            if (roll == 0) {
                player.cup.clearHeld();
                player.cup.rerollDice();
                
            }
            else {
                player.cup.setHeld(held);
                player.cup.rerollDice();
            }
       =
            
            // Rolls the amount of dice not being held
            boolean[] diceToRoll = DiceCup.getHeld();
            int[] dice = DiceCup.rollDice(diceToRoll);
            player.addToScore(dice);

            // Asks user whether to roll again
            System.out.println("Would you like to roll again? (Y/N) ");
            String rollAgain = input.nextLine().toLowerCase();

            if (rollAgain.equals("n")) {
                shouldContinue = false;
                System.out.println("Scoring now.");
            }

            // Asks the user for input & updates the hold array
            else {
                for (int i = 0; i < cup.getHeld().length; i++) {
                    System.out.println("Hold die #" + (i + 1) + "? (Y/N) "); // Adding 1 to the number of dice; Die #1 rather than Die #0 for first die
                    String holdDie = input.nextLine().toLowerCase();
                    if (holdDie.equals("y")) {
                        cup.setHeld(i, true);
                    }
                }
            }

            // Increases the roll count for a maximum of 3 rolls
            roll++;
        }


    }

    /******** Instructions ********
    First roll: all 5 dice
    Set keepers aside
    score now? or roll again?

    Second roll: Reroll any/all dice you want
    no need to declare combination to roll for.

    Third (final roll): reroll any dice you want
    After, must fill in a box on score card with a score or zero */

}
