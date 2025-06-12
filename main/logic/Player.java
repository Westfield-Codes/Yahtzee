package main.logic;

import java.util.Scanner;

public class Player {
    private String name;
    private Scoresheet playerScoresheet;
    Scanner input = new Scanner(System.in);

    // More methods may be necessary for accessing and mutating the Scoresheet object for each player.

    public Player(String name, Scoresheet playerScoresheet) {
        System.out.println("Enter Player Name: ");
        this.name = input.nextLine();
        this.playerScoresheet = playerScoresheet;

        input.close();
    }

    public String getName() {
        return name;
    }

/* got rid of these methods, they were not used in the original code and are not necessary for the current functionality */
    // public int getScore() {
    //     return playerScoresheet.getScore();
    // }

    // This just calls another function, should this one just do the same thing directly with playerScoresheet?
    // public void addToScore(int number) {
    //     this.playerScoresheet.addScore(number);
    // }
}
