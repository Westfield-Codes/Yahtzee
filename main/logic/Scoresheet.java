package main.logic;

public class Scoresheet {
    

    private int score;

    // Currently stubs, so that errors go away
    public Scoresheet() {
        this.score = 0;
    }

    public int getScore() {
        return this.score;
    }

    public void addScore(int num) {
        score += num;
    }
}
