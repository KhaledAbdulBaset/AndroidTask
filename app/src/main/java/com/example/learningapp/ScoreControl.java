package com.example.learningapp;

public class ScoreControl {
    private static int score=0;

    public static void increaseScore(){
        score++;
    }


    public static void decreaseScore(){
        if(score<=0){score=0;}
        else {score--;}

    }

    public static int getScore(){
       return score;
    }
}
