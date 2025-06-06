package main.functions;

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

/* makeCategoryList() makes list of categories that haven't been used yet, removing
 * used categories from the list
 * @param: none
* @return: array list of categories
*/
public ArrayList<String> makeCategoryList() {
    ArrayList<String> unused = new ArrayList<String>();
    unused.addAll(categories);
    return unused;
}
    
/* unused() checks to see if the category is used before
 * @param: category
 * @return: true if unused, false if used
 */
public booleaan unused(String category) {
        if (this.unusedCategories.contains(category)) {
            return false; // category is used
        }
    return true;
}

/* scoreHand() returns score of hand for given category
 * @param: category
 * @return: score
 */
    public int scoreHand(String category) {
   int score = 0;
   int[] hand = cup.getHand();
   if (!this.board.hasCategory(category)) {
    for(int i = 0; i < categories)
        if(indexOf(category) < 6) {
            scoreSimple(indexOf(category));
        } else {
            scoreComplex(indexOf(category));
        }
    }
        return 1;
}

/* scoreSimple() scores categories with index less than 6
 * @param: categoryIndex
 * @return: score
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

/* Scorecomplex() contains methods to get the score for categories with index greater than 5
 * @param: categoryIndex
 * @return: score
 */

public int scoreComplex(int categoryIndex) {
//     if(categoryIndex == ) 
// } 
    return 2;
    }
}
