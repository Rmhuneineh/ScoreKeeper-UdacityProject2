package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int homeScore = 0, homeFoul = 0, homeYellow = 0, homeRed = 0, homeCorner = 0;
    private int awayScore = 0, awayFoul = 0, awayYellow = 0, awayRed = 0, awayCorner = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void addOneToHome(View view) {
        homeScore = homeScore + 1;
        displayHomeTeamScore(homeScore);
    }

    public void addOneHomeFoul(View view) {
        homeFoul = homeFoul + 1;
        String foul = "FOULS: " + homeFoul;
        displayHomeTeamFoul(foul);
    }

    public void addOneHomeYellow(View view) {
        homeYellow = homeYellow + 1;
        String yellow = "YELLOW CARDS: " + homeYellow;
        displayHomeTeamYellow(yellow);
    }

    public void addOneHomeRed(View view) {
        homeRed = homeRed + 1;
        String red = "RED CARDS: " + homeRed;
        displayHomeTeamRed(red);
    }

    public void addOneHomeCorner(View view) {
        homeCorner = homeCorner + 1;
        String corner = "CORNERS: " + homeCorner;
        displayHomeTeamCorner(corner);
    }

    public void displayHomeTeamScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_home_team);
        scoreView.setText(String.valueOf(score));
    }

    public void displayHomeTeamFoul(String number) {
        TextView scoreView = (TextView) findViewById(R.id.home_fouls);
        scoreView.setText(String.valueOf(number));
    }

    public void displayHomeTeamYellow(String number) {
        TextView scoreView = (TextView) findViewById(R.id.home_yellow);
        scoreView.setText(String.valueOf(number));
    }

    public void displayHomeTeamRed(String number) {
        TextView scoreView = (TextView) findViewById(R.id.home_red);
        scoreView.setText(String.valueOf(number));
    }

    public void displayHomeTeamCorner(String number) {
        TextView scoreView = (TextView) findViewById(R.id.home_corners);
        scoreView.setText(String.valueOf(number));
    }

    public void addOneToAway(View view) {
        awayScore = awayScore + 1;
        displayAwayTeamScore(awayScore);
    }

    public void addOneAwayFoul(View view) {
        awayFoul = awayFoul + 1;
        String foul = "FOULS: " + awayFoul;
        displayAwayTeamFoul(foul);
    }

    public void addOneAwayYellow(View view) {
        awayYellow = awayYellow + 1;
        String yellow = "YELLOW CARDS: " + awayYellow;
        displayAwayTeamYellow(yellow);
    }

    public void addOneAwayRed(View view) {
        awayRed = awayRed + 1;
        String red = "RED CARDS: " + awayRed;
        displayAwayTeamRed(red);
    }

    public void addOneAwayCorner(View view) {
        awayCorner = awayCorner + 1;
        String corner = "CORNERS: " + awayCorner;
        displayAwayTeamCorner(corner);
    }

    public void resetAll(View view) {
        homeScore = 0;
        homeFoul = 0;
        homeYellow = 0;
        homeRed = 0;
        homeCorner = 0;

        awayScore = 0;
        awayFoul = 0;
        awayYellow = 0;
        awayRed = 0;
        awayCorner = 0;

        displayHomeTeamScore(homeScore);
        String foul = "FOULS: " + homeFoul;
        displayHomeTeamFoul(foul);
        String yellow = "YELLOW CARDS: " + homeYellow;
        displayHomeTeamYellow(yellow);
        String red = "RED CARDS: " + homeRed;
        displayHomeTeamRed(red);
        String corner = "CORNERS: " + homeCorner;
        displayHomeTeamCorner(corner);

        displayAwayTeamScore(awayScore);
        foul = "FOULS: " + awayFoul;
        displayAwayTeamFoul(foul);
        yellow = "YELLOW CARDS: " + awayYellow;
        displayAwayTeamYellow(yellow);
        red = "RED CARDS: " + awayRed;
        displayAwayTeamRed(red);
        corner = "CORNERS: " + awayCorner;
        displayAwayTeamCorner(corner);
    }

    public void displayAwayTeamScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_away_team);
        scoreView.setText(String.valueOf(score));
    }

    public void displayAwayTeamFoul(String number) {
        TextView scoreView = (TextView) findViewById(R.id.away_fouls);
        scoreView.setText(String.valueOf(number));
    }

    public void displayAwayTeamYellow(String number) {
        TextView scoreView = (TextView) findViewById(R.id.away_yellow);
        scoreView.setText(String.valueOf(number));
    }

    public void displayAwayTeamRed(String number) {
        TextView scoreView = (TextView) findViewById(R.id.away_red);
        scoreView.setText(String.valueOf(number));
    }

    public void displayAwayTeamCorner(String number) {
        TextView scoreView = (TextView) findViewById(R.id.away_corners);
        scoreView.setText(String.valueOf(number));
    }
}
