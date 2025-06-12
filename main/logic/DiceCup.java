package main.logic;

import java.sql.Array;
import java.util.Arrays;

public class DiceCup {

// create a new array of dice in the Die class
private Die[] dice;
private int[] hand;
private boolean[] hold;

public DiceCup() {
    dice = new Die[5]; // an array of 5 dice
    hand = new int[] {0, 0, 0, 0, 0};
    hold = new boolean[] {false, false, false, false, false};
    }

public int[] getHand() {
    return this.hand;
}

public int rollDie() {
    return (int) (Math.random() * 6) + 1;
}

/* getHeld() finds the dice that are held in the arraylist
 * @param: boolean[hold]
 * @return: updated boolean[hold]
 */
public boolean[] getHeld() {
    for (int i = 0; i < hold.length; i++) {
        if (hold[i]) {
            hold[i] = true; // if the die is held, it remains true
        } else {
            hold[i] = false; // if the die is not held, it is false
        }
    }
    return hold;
}

/* setHeld() sets the hold condition for all dice in an array
 * @param: boolean[] held
 * @return: void
 */
public void setHeld(boolean[] held) {
    if (held.length == hold.length) {
        this.hold = Arrays.copyOf(held, held.length); // copy the new array to the hold array
    } else {
        System.out.println("Error: The length of the hold array does not match the number of dice.");
    }
}

/* setHeld() sets the hold condition for one dice in an array
 * @param: int i, boolean b
 * @return: void
 */
public void setHeld(int i, boolean b) {
    if (i >= 0 && i < hold.length) {
        hold[i] = b; // set the hold value for the die at index i
    } else {
        System.out.println("Error: Index out of bounds for hold array.");
    }
}

/* rerollDice() rolls multiple dice at a time but checks to see if a die is being held beforehand
 * @param: boolean[] held
 * @return: new ints for dice rolled
 */
public Die[] rerollDice(boolean[] held) {
    // Assuming you have an int[] dice representing the dice values in DiceCup
    // and a method rollDie(int index) that rolls a single die at the given index
    for (int i = 0; i < held.length; i++) {
        if (!held[i]) {
            // Roll the die at index i
            // Replace this with your actual rolling logic
            dice[i].setDieNum((int)(rollDie()));
        }
    }
    return dice;
}



/* The old method, but it might be better than the new one, not too sure. */
// public int[] rerollDice(){
//     for (int i = 0; i < hold.length; i++) {
//         if (!hold[i]) {
//             hand[i] = rollDie();
//         }

//         int index = 0;

//         for (int j = 0; j < hand.length; j++) {
        
//             if (hand[j] != 0) {
//                 index++;
//             }
//         }

//         int[] newArray = new int[index];

//         for (int k = 0; k < hand.length; k++) {
//             if (hand[k] != 0) {
//                 newArray[k] = hand[k];
//             }
//             else {
//                 if (k > 0) {
//                     k--;
//                 }
//             }
//         }
//     }
// }
   
    }
