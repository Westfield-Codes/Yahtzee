package main.functions;

import java.sql.Array;

public class DiceCup {


private int[] hand;
private boolean[] hold;

public DiceCup() {
    hand = new int[] {0, 0, 0, 0, 0};
    hold = new boolean[] {false, false, false, false, false};
}

public int[] getHand() {
    return this.hand;
}

public int rollDie() {
    return (int) (Math.random() * 6) + 1;
}

public int[] rerollDice(){
    for (int i = 0; i < hold.length; i++) {
        if (!hold[i]) {
            hand[i] = rollDie();
        }

        int index = 0;

        for (int j = 0; j < hand.length; j++) {
        
            if (hand[j] != 0) {
                index++;
            }
        }

        int[] newArray = new int[index];

        for (int k = 0; k < hand.length; k++) {
            if (hand[k] != 0) {
                newArray[k] = hand[k];
            }
            else {
                if (k > 0) {
                    k--;
                }
            }
        }
    }
}
   
    }
