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
        // GameGraphics.showPlayers(players);
    }

}
