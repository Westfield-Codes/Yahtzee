package main.functions;

import java.sql.Array;

public class DiceCup {


private int[] hand;
private boolean[] hold;

public DiceCup() {
    hand = new int[] {0, 0, 0, 0, 0};
    hold = new boolean[] {false, false, false, false, false};
}

getHand() {
    return this.hand;
}
}
