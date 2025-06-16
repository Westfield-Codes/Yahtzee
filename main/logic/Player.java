package main.logic;

import java.util.Scanner;

public class Player {
    private String name;
    private DiceCup cup;
    private Scoresheet playerScoresheet;
    Scanner input = new Scanner(System.in);

    // More methods may be necessary for accessing and mutating the Scoresheet object for each player.

    public Player(String name) {
        // System.out.println("Enter Player Name: ");
        this.name = name;
        this.playerScoresheet = new Scoresheet();
        this.cup = new DiceCup();

        input.close();
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return playerScoresheet.getScore();
    }

    public void addToScore(int number) {
        this.playerScoresheet.addScore(number);
    }
}
