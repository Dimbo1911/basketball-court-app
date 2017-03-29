package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int totalScore1 = 0;
    private int totalScore2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(totalScore1);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void plusThreePointsA(View view) {
        totalScore1 += 3;
        displayForTeamA(totalScore1);
    }

    public void plusTwoPointsA(View view) {
        totalScore1 += 2;
        displayForTeamA(totalScore1);
    }

    public void freeThrowA(View view) {
        totalScore1 += 1;
        displayForTeamA(totalScore1);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void plusThreePointsB(View view) {
        totalScore2 += 3;
        displayForTeamB(totalScore2);
    }

    public void plusTwoPointsB(View view) {
        totalScore2 += 2;
        displayForTeamB(totalScore2);
    }

    public void freeThrowB(View view) {
        totalScore2 += 1;
        displayForTeamB(totalScore2);
    }

    /*Resets the score, on both teams*/
    public void clearTheValues(View view){
        totalScore1 = 0;
        totalScore2 = 0;
        displayForTeamA(totalScore1);
        displayForTeamB(totalScore2);
    }
}
