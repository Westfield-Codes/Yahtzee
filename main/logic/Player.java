package main.functions;

public Player {
    private String name;
    private Scoresheet playerScoresheet

    // More methods may be necessary for accessing and mutating the Scoresheet object for each player.

    public Player(String name, Scoresheet playerScoresheet) {
        this.name = name;
        this.playerScoresheet = playerScoresheet;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return playerScoresheet.getScore();
    }

    public void addToScore(int number) {
        score += number;
    }
}