package main;

import main.logic.GameGraphics;
import main.logic.Player;
import main.logic.DiceCup;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GameGraphics.show();
        Scanner scanner = new Scanner(System.in);
        ArrayList<Player> players = new ArrayList<>();
        System.out.print("How many players?: ");
        int playersNum = scanner.nextLine();
        for (int i = 0; i < playersNum; i++) {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            Player player = new Player(name);
            players.add(player);
        }
        Round game = new Round(players);
        System.out.println("Welcome, " + P1.getName() + "!");
        while (Round1.getRound < 13){
            Round1.playRound();
            System.out.println(P1.getName() + " round: " + round + " score: " + P1.getScore());
            P1.cup.rerollDice();
            System.out.println("Your current hand: " + P1.cup.getHand().toString());
            System.out.println("Enter the indices of the dice you want to hold (0-4), separated by spaces, or 'r' to reroll all:");
            String input = scanner.nextLine();
            if (input.equals("r")) {
                P1.cup.rerollDice();
            } else {
                String[] indices = input.split(" ");
                for (String index : indices) {
                    int i = Integer.parseInt(index);
                    P1.cup.holdDie(i);
                }
            }

        /* Copilot Suggestions */
       
        // GameGraphics.showPlayers(players);
    }

}
