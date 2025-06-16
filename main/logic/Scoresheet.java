package main.logic;

import java.util.ArrayList;

public class Scoresheet {
    private Player currentPlayer;
    private DiceCup cup;
    private int[] hand;
    private int[] board;
    private String[] categories = {"ones","twos","threes","fours","fives","sixes","upper section bonus","three of a kind","four of a kind","full house","small straight","large straight","chance","yahtzee"};
    private ArrayList<String> unusedCategories;

public Scoresheet(Player currentPlayer, DiceCup cup) {
    this.currentPlayer = currentPlayer;
    this.cup = cup;
    this.hand = cup.getHand();
    this.board = makeBoard();
    this.unusedCategories = makeCategoryList();
}

/* validCategory() checks to see if the category is valid
 * @param: category
 * @return: true if valid, false if invalid
 * Not needed pm
 */
public boolean validCategory(String category) {
    for (int i = 0; i < this.categories.length; i++) {
        if (categories[i].compareTo(category) == 0) {
            return unused(category);
        }
    }
    return false;
}

/* unused() checks to see if the category is used before
 * @param: category
 * @return: true if unused, false if used
 * Not needed pm
 */
public boolean unused(String category) {
        for (int i = 0; i < this.unusedCategories.size(); i++) {
        if (unusedCategories.get(i).compareTo(category) == 0) {
            return true;
        }
    }
    return false;
}
/* makeBoard() creates a board with 14 categories
 * @return: array of integers representing the board
 * Ok pm
 */
public int[] makeBoard() {
    int[] board = new int[14];
    for (int i = 0; i < board.length; i++) {
        board[i] = -1; // -1 means unused
    }
    return board;
}

/* makeCategoryList() makes list of categories that haven't been used yet, removing
 * used categories from the list
 * @param: none
* @return: array list of categories
* Ok pm
*/
public ArrayList<String> makeCategoryList() {
    ArrayList<String> unused = new ArrayList<String>();
    for(String category : categories) {
        unused.add(category);
    }
    return unused;
}



/* scoreHand() returns score of hand for given category
 * @param: category
 * @return: score
 * Ok pm
 */
public int scoreHand(String category) {
   int score = 0;
   if (validCategory(category)) {
        if(indexOf(category) < 6) {
            score += scoreSimple(indexOf(category));
        } else {
            score += scoreComplex(indexOf(category));
        }
    }
        return score;
}

/* indexOf() returns index of a given category within the categories array
 * returns -1 if category cannot be found
 * @param: category
 * @return: index
 * Ok pm
 */

public int indexOf(String target) {
    for(int i = 0; i < categories.length; i++) {
        if (categories[i].equals(target)) {
            return i;
        } 
    } 
    return -1; // return -1 if not found
}

/* scoreSimple() scores categories with index less than 6
 * @param: categoryIndex
 * @return: score
 *  Ok pm
 */

public int scoreSimple(int categoryIndex) {
    int total = 0;
    for(int value : this.hand) {
        if(value == categoryIndex + 1) {
            total += value;
        }
    }
    return total;
}


/* scoreComplex() contains methods to get the score from the hand for categories with index greater than 5
 * Test Comment (remove me)
 * @param: categoryIndex
 * @return: score
 * Ok pm
 */
 public int scoreComplex(int categoryIndex) {
    if(categoryIndex == 6) {
        return 35;
    }
    if(categoryIndex == 7 || categoryIndex == 8) {
        int total = 0;
        for(int value : this.hand) {
            total += value;
        }
        return total;
    }
    if(categoryIndex == 9) {
        return 25;
    }
    if(categoryIndex == 10) {
        return 30;
    }
    if(categoryIndex == 11) {
        return 40;
    }
    if(categoryIndex == 12) {
        int total = 0;
         for(int value : this.hand) {
            total += value;
        }
        return total;
    }

    if (categoryIndex == 13) {
        return 50;
    }
    return 0; // Default return if no category matches 
 }



    public boolean verify(int categoryIndex) {
        if(categoryIndex < 6) {
                return true;
            }
        
        if(categoryIndex == 6) {
            int total = 0;
            for(int i = 0; i < 6; i++) {
                total += board[i];
            }

            if(total >= 35) {
                return true;
            }
        }
        if(categoryIndex == 7) {
            return ofAKind(3);
            }
        if(categoryIndex == 8) {
            return ofAKind(4);
            }

        if(categoryIndex == 9) {
            boolean hasTwoPair = false;
            boolean hasThreePair = false;
            for(int i = 0; i < 6; i++) {
                int repeat = 0;
                for(int j = 0; j< hand.length; j++) {
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
                if(hasTwoPair && hasThreePair) {
                    return true;
                } else {
                    return false;
                }
            }

            
        if(categoryIndex == 10) {
            int[] ordered = sortArray(cup.getHand());
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

        if (categoryIndex == 11) {
            int[] ordered = sortArray(cup.getHand());
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
        if (categoryIndex == 12) {
             return true;
        } 

        if(categoryIndex == 13) {
            return ofAKind(5);
        }    
        if (categoryIndex < 0 || categoryIndex >= categories.length) {
            return false; // Invalid category index
        }
        return false; // Default return if no category matches;
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
            for(int j = 0; j < hand.length; j++) {
                if(hand[j] == i + 1) {
                    repeat++;
                }
            }
            if (repeat >= amount) {
                return true;
            }
        }
        return false;
    }
}
