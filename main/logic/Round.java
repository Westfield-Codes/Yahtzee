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
        if (this.roundNum > 13) {
            System.out.println("Game Over! No more rounds left.");
            System.out.println("Implement showScores()");
        }
       else {
        for (Player player : players) {
            System.out.println("Round " + this.roundNum + ": " + player.getName() + "!");
            takeTurn(player);
        }
       }
    }

    private void takeTurn(Player player) {
        int roll = 0;
        while (roll < 3) {
            if (roll == 0) {
                player.cup.clearHeld();
                player.cup.rerollDice();
                
            }
            else {
                player.cup.setHeld();
                player.cup.rerollDice();
            }
            System.out.println("Your New Hand: " + player.cup.getHand().toString);
       }
        System.out.println("Score your hand where?");
        String response = input.nextLine().trim().toLowerCase();
        player.cup.scoreHand();
        System.out.println("End of turn for " + player.getName() + ".");
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
