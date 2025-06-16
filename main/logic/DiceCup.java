package main.logic;

import java.sql.Array;

public class DiceCup {
    private int[] hand;
    private boolean[] hold;

    public DiceCup() {
        this.hand = new int[] {0, 0, 0, 0, 0};
        this.hold = new boolean[] {false, false, false, false, false};
    }

    public int[] getHand() {
        return this.hand;
    }
    public void clearHeld() {
        this.hold ={false, false, false, false, false};
    }
    public int rollDie() {
        return (int) (Math.random() * 6) + 1;
    }

    public int[] rerollDice(){
        for (int i = 0; i < this.hold.length; i++) {
            if (!this.hold[i]) {
                this.hand[i] = rollDie();
            }
        }    
            /* What does this do? mbm */
            // for (int j = 0; j < hand.length; j++) {
        
            //     if (hand[j] != 0) {
            //         index++;
            //     }
            // }
            /* What does this do? mbm */
            // int[] newArray = new int[index];

            /* What does this do? mbm */
            // for (int k = 0; k < hand.length; k++) {
            //     if (hand[k] != 0) {
            //         newArray[k] = hand[k];
            //     }
            //     else {
            //         if (k > 0) {
            //             k--;
            //         }
            //     }
            // }
    }
   
    public void holdDie(int index) {
        if (index >= 0 && index < hold.length) {
            this.hold[index] = true;
        } else {
            System.out.println("Invalid index. Please enter a number between 0 and " + (hold.length - 1));
        }
    }


}
