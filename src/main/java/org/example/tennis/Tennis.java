package org.example.tennis;

import java.util.HashMap;
import java.util.Map;

public class Tennis {
    private Map<String, Integer> scores = new HashMap<>();

    public Tennis() {
        scores.put("player1", 0);
        scores.put("player2", 0);
    }

    public String readScore() {
        int player1Score = scores.get("player1");
        int player2Score = scores.get("player2");

        if (isDeuce()){
            return "deuce";
        }


        String scoreAsString = "";

        scoreAsString += getScore(player1Score);

        scoreAsString += "-";

        scoreAsString += getScore(player2Score);

        return scoreAsString;
    }

    private boolean isDeuce() {
        return scores.get("player1") >= 3 && scores.get("player2") >= 3;
    }

    private static String getScore(int player1Score) {
        if (player1Score == 3)
            return "40";
        else if (player1Score == 2)
            return "30";
        else if (player1Score == 1)
            return "15";
        else
            return "love";
    }

    public void incrementScore(String player) {

        scores.put(player, scores.get(player) + 1);

    }

    public boolean isGameOver() {
        if (scores.get("player1") > 3 && scores.get("player1") > scores.get("player2") + 1)
            return true;
        return false;
    }
}
