package main.functions;

import java.util.ArrayList;

public class Scoresheet {
    private Player currentPlayer;
    private Dicecup cup;
    private int[] hand;
    private int[] board;
    private String[] categories = {"ones","twos","threes","fours","fives","sixes","upper section bonus","three of a kind","four of a kind","full house","small straight","large straight","chance","yahtzee"};
    private ArrayList<String> unusedCategories;

public Scoresheet(Player currentPlayer, Dicecup cup) {
    this.currentPlayer = currentPlayer;
    this.cup = cup;
    this.hand = cup.getHand();
    this.board = makeBoard();
    this.unusedCategories = makeCategoryList();
}

/* validCategory() checks to see if the category is valid
 * @param: category
 * @return: true if valid, false if invalid
 */
public boolean validCategory(String category) {
    for (int i = 0; i < this.categories.length; i++) {
        if (categories[i].compareTo(category) == 0) {
            return unused(category);
        }
    }
    return false;
}

/* makeBoard() creates a board with 14 categories
 * @return: array of integers representing the board
 */
public int[] makeBoard() {
    int[] board = new int[14];
    for (int i = 0; i < board.length; i++) {
        board[i] = -1; // -1 means unused
    }
    return board;
}

/* makeCategoryList() makes list of categories that haven't been used yet
* @return: array list of categories
*/
public ArrayList<String> makeCategoryList() {
    ArrayList<String> unused = new ArrayList<String>();
    return unused;
}
    
/* unused() checks to see if the category is used before
 * @param: category
 * @return: true if unused, false if used
 */
public boolean unused(String category) {
    //  for (int i = 0; i < this.unusedCategories.size(); i++) {
    //     if (unusedCategories.get(i).contains(category)) {
            

    //  }
    return true;
}

/* scoreHand() returns score of hand for given category
 * @param: category
 * @return: score
 */
    public int scoreHand(String category) {
//    int score = 0;
//    int[] hand = cup.getHand();
//    if (!this.board.hasCategory(category)) {
//     for(int i = 0; i < categories)
//         if(indexOf(category) < 6) {
//             scoreSimple(indexOf(category));
//         } else {
//             scoreComplex(indexOf(category));
//         }
//     }
        return 1;
}

/* scoreSimple() scores categories with index less than 6
 * @param: categoryIndex
 * @return: score
 */

public int scoreSimple(int categoryIndex) {
    // int total = 0;
    // for(int value : hand) {
    //     if(value == categoryIndex + 1) {
    //         total += value;
    //     }
    // }

    return 1;
}

/* Scorecomplex() contains methods to get the score for categories with index greater than 5
 * Test Comment (remove me)
 * @param: categoryIndex
 * @return: score
 */

    public boolean verify(int categoryIndex) {
        if(categoryIndex < 6) {
                return true;
            }
        if(categoryIndex == 6) {
            return ofAKind(3);
            }
        if(categoryIndex == 7) {
            return ofAKind(4);
            }

        if(categoryIndex == 8) {
            boolean hasTwoPair = false;
            boolean hasThreePair = false;
            for(int i = 0; i < 6; i++) {
                int repeat = 0;
                for(int j = 0; j hand.length; j++) {
                    if(hand[j] == i + 1) {
                    repeat++;
                    }
                }
                if (repeat == 2) {
                    hasTwoPair = true;
                }
                if (repeat == 3) {
                hasThreePair = true;
                }
                }
                if(hasTwoPair = true && hasThreePair = true) {
                    return true;
                } else {
                    return false;
                }
                }

            
        if(categoryIndex == 9) {
            ArrayList<Integer> ordered = sortArray(getHand());
            String allDie = "";
            for(int num : ordered) {
            allDie += "" + num;
            }

            if(allDie.contains("1234") || allDie.contains("2345") || allDie.contains("3456")) {
                return true;
             } else {
                return false;
            }
        }

        if (categoryIndex == 10) {
            ArrayList<Integer> ordered = sortArray(getHand());
            String allDie = "";
            for(int num : ordered) {
                allDie += "" + num;
            }

            if(allDie.contains("12345") || allDie.contains("23456")) {
                return true;
            } else {
                return false;
            }
        }
        if (categoryIndex == 11) {
             return true;
        } 

        if(categoryIndex == 12) {
            return ofAKind(5);
        }    
    }

    public int[] sortArray(int[] hand) {

        int[] ordered = new int[5];
        for(int j = 0; j < hand.length; j++) {
            int lowest = hand[j];
            for(int i = j + 1; i < hand.length; i++) {
                if(hand[i] < lowest) {
                lowest = hand[i];
                int storage = hand[j];
                hand[j] = lowest;
                hand[i] = storage;
                }
            } 
        }
        return ordered;
    }

    public boolean ofAKind(int amount) {
        for(int i = 0; i < 6; i++) {
            int repeat = 0;
            for(int j = 0; j hand.length; j++) {
                if(hand[j] == i + 1) {
                    repeat++;
                }
            }
            if (repeat => amount) {
                return true;
            } else {
                return false;
            }
        }
    }
}
