package main;

import main.logic.GameGraphics;
import main.logic.Player;
import main.logic.Round;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Integer;

public class Main {
    public static void main(String[] args) {
        GameGraphics.show();
        Scanner sc = new Scanner(System.in);
        ArrayList<Player> players = new ArrayList<>();
        System.out.print("How many players?: ");
        String playersNum = sc.nextLine();
        int playersCount = Integer.parseInt(playersNum);
        if (playersNum == null) {
            System.out.println("Invalid number of players. Please enter a valid integer.");
            return;
        }
        for (int i = 0; i < playersCount; i++) {
            System.out.print("Enter your name: ");
            String name = sc.nextLine();
            Player player = new Player(name);
            players.add(player);
        }
        // Round game = new Round(players);
        // GameGraphics.showPlayers(players);
    }

}
