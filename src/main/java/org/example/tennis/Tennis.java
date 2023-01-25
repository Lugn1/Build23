package org.example.tennis;

public class Tennis {
    private int score;
    public String readScore() {
        if (score > 0)
            return "15-love";
        return "love-love";
    }

    public void incrementScore(String player) {
        score++;
    }
}
