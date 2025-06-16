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

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        Player P1 = new Player(name);
        
        

    }
}
