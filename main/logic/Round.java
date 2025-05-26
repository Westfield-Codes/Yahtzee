import java.util.Scanner;
import DiceCup.java;
import Player.java;
public class Round {
    Scanner input = new Scanner(System.in);

    

    public static void playRound(Player player) {
        firstRoll(player);
        String rollAgain = input.nextLine();
        secondRoll(player, rollAgain);
        String rollAgain = input.nextLine();
        thirdRoll(player, rollAgain);
    }

    private static void firstRoll(Player player) {
        int score = DiceCup.rollFive();
        player.playerScoresheet.addScore(score);

    }

    // STATIC METHODS
    
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
