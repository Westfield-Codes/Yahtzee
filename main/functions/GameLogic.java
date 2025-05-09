package main.functions;

import java.lang.Math;

/*
 * Contains all of the logic to run the game, in the form of helper methods
 * Examples: a method to roll the dice, a method that would toggle the "Hold" functionality, etc.
 */
public class GameLogic {

    /*
     * Currently a dummy method for testing event listeners.
     * Will later be used for setting a die to be held.
     */
    public static void holdDie() {
        System.out.println("Holding die...");
    }

    public static int rollDie() {
        return (int) (Math.random() * 6) + 1;
    }


    // TODO: Implement algorithm to select first user based on highest first roll
}
