package main.logic;
import java.util.Scanner;

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

    public boolean[] getHold() {
        return this.hold;
    }
    

    /* Set Held Dice: Console log version */
    public void setHeld() {
        System.out.println("Your current hand: " + this.getHand().toString());
        System.out.print("Hold which dice? a = all, n = none: ");
        Scanner sc = new Scanner(System.in);
        String toHold = sc.nextLine();
        if (toHold == null) {
            System.out.println("No input received.");
            return;
        }
        if (toHold.equalsIgnoreCase("a")) {
            for (int i = 0; i < this.hold.length; i++) {
                this.hold[i] = true;
            }
            System.out.println("All dice are now held.");
            return;
        } 
        else if (toHold.equalsIgnoreCase("n")) {
            clearHeld();
            System.out.println("No dice are held.");
            return;
        }
        else {
            String[] holds = toHold.split(",");
            for (String die : holds) {
                try {
                    int index = Integer.parseInt(die.trim());
                    if (index >= 0 && index < this.hold.length) {
                        this.hold[index] = true;
                    } else {
                        System.out.println("Invalid index. Please enter a number between 0 and " + (this.hold.length - 1));
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter numbers separated by commas.");
                }
            System.out.println("Dice held: " + toHold);
            }
        }
        return;
    }

    public void clearHeld() {
        for (int d = 0; d < 5; d++){
            this.hold[d]=false;
        }
    }
    public int rollDie() {
        return (int) (Math.random() * 6) + 1;
    }

    public void rerollDice(){
        for (int i = 0; i < this.hold.length; i++) {
            if (!this.hold[i]) {
                this.hand[i] = rollDie();
            }
        }    
    }
   
   /* UI Version */

    public void holdDie(int index) {
        if (index >= 0 && index < hold.length) {
            this.hold[index] = true;
        } else {
            System.out.println("Invalid index. Please enter a number between 0 and " + (hold.length - 1));
        }
    }

}
