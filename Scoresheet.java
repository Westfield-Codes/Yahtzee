package main.functions;

public class Scoresheet {
    private Player currentPlayer;
    private Dicecup cup;
    private int[] hand;
    private int[] board;
    private String[] categories;
    private ArrayList<String> unusedCategories;

public Scoresheet(Player currentPlayer, Dicecup cup) {
    this.currentPlayer = currentPlayer;
    this.cup = cup;
    this.hand = cup.getHand();
    this.board = new int[14];
    this.categories = {"ones","twos","threes","fours","fives","sixes","upper section bonus","three of a kind","four of a kind","full house","small straight","large straight","chance","yahtzee"};
    this.unusedCategories = new ArrayList<String>();
    unusedCategories.add("ones");
    unusedCategories.add("twos");
    unusedCategories.add("threes");
    unusedCategories.add("fours");
    unusedCategories.add("fives");
    unusedCategories.add("upper section bonus");
    unusedCategories.add("three of a kind");
    unusedCategories.add("four of a kind");
    unusedCategories.add("full house");
    unusedCategories.add("small straight");
    unusedCategories.add("large straight");
    unusedCategories.add("chance");
    unusedCategories.add("yahtzee");

}

public String getName() {
    return currentPlayer.getName();
}

public int[] getHand() {
    return cup.getHand();
}

public boolean validCategory(String category) {
    for (int i = 0; i < this.categories.length; i++) {
        if (categories[i].compareTo(category) == 0) {
            return unused(category);
        }
    }
    return false;
}

public booleaan unused(String category) {
     for (int i = 0; i < this.unusedCategories.size(); i++) {
        if (unusedCategories.get(i).contains(category)) {
            

     }
}

// public int scoreHand(String category) {
//     int score = 0;
//     int[] hand = cup.getHand();
//     if (this.board.hasCategory(category)) {
//         return -1;
//     }
//     else if (indexOf(category) < 6) {
//         int counting = indexOf(category) + 1;
//         for (Die die = 0; die < 6; die++) {
//             if (hand(die) == counting) {
//                 score += counting;
//             }
//         }
//     } else {
//         if (category.equals("three of a kind")) {
//             for (int die = 0; die < 6; die++) {
//                 score += hand[die];
//             }
//         }
//         if (category.equals("four of a kind")) {
//             for (int die = 0; die < 6; die++) {
//                 score += hand[die];
//             }
//         }
//         if (category.equals("full house")) {
//             score += 25;
//         }
//         if (category.equals("small straight")) {
//             score += 30;
//         }
//         if (category.equals("large straight")) {
//             score += 40;
//         }
//         if (category.equals("yahtzee")) {
//             score += 50;
//         }
//         if (category.equals("chance")) {
//             for (int die = 0; die < 6; die++) {
//                 score += hand[die];
//             }
//         }
//     }
//     int newScore = {indexOf(category), score};
//     this.board.add(newScore);
//     int latest = this.board.length - 1;
//     System.out.println("Scored: " + this.board[latest].toString());
//     return score;
// }
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
}

public int scoreSimple(int categoryIndex) {
    int total = 0;
    for(int value : hand) {
        if(value == categoryIndex + 1) {
            total += value;
        }
    }

    return total;
}

public int scoreComplex(int categoryIndex) {
    if(categoryIndex == )
}
}