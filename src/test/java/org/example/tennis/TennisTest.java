package org.example.tennis;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TennisTest {

    @Test
    void newTennisObjectHasScoreLoveLove() {
        Tennis tennis = new Tennis();

        assertThat(tennis.readScore()).isEqualTo("love-love");

    }

    @Test
    void afterPlayer1WinsBallScoreShouldReturn15Love() {
        Tennis tennis = new Tennis();

        tennis.incrementScore("player1");

        assertThat(tennis.readScore()).isEqualTo("15-love");
    }

    @Test
    void afterPlayer2WinsBallScoreShouldReturn1515(){
        Tennis tennis = new Tennis();

        tennis.incrementScore("player1");
        tennis.incrementScore("player2");

        assertThat(tennis.readScore()).isEqualTo("15-15");
    }

    @Test
    void afterPlayer1HasWonThreeBallsScoreShouldReturn30love(){
        Tennis tennis = new Tennis();

        tennis.incrementScore("player1");
        tennis.incrementScore("player1");

        assertThat(tennis.readScore()).isEqualTo("30-love");
    }

    @Test
    void afterPlayer1HasWonFourBallsScoreShouldReturn40love(){
        Tennis tennis = new Tennis();

        tennis.incrementScore("player1");
        tennis.incrementScore("player1");
        tennis.incrementScore("player1");

        assertThat(tennis.readScore()).isEqualTo("40-love");
    }

}
