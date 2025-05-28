import java.util.Scanner;
import DiceCup.java;
import Player.java;

public class Round {
    private Scanner input;
    private DiceCup cup;

    public Round() {
        this.input = new Scanner(System.in);
        this.cup = new DiceCup();
    }


    public void playRound(Player player) {
        int[] held = {True, True, True, True};
        DiceCup.setHeld(held);
        takeTurn(player);

    }



    private void takeTurn(Player player) {
        int roll = 1;
        boolean shouldContinue = true;

        if (roll <= 3 && shouldContinue) {
            
            
            
            boolean[] diceToRoll = DiceCup.getHeld();
            int[] dice = DiceCup.rollDice(diceToRoll);
            player.addToScore(score);
        }


    }



    // STATIC METHODS. PROCEDURE BELOW
    
    // May roll dice up to 3 times, may stop & score after 1st or 2nd roll
    // To roll dice, place them in dice cup & roll





    // First roll: all 5 dice
    // Set keepers aside
    // score now? or roll again?




    // Reroll any/all dice you want
    // no need to declae combination to roll for.





    // Third (final roll): reroll any dice you want
    // After, must fill in a box on score card with a score or zero

}
