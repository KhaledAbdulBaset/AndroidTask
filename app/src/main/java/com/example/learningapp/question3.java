package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class question3 extends AppCompatActivity {
TextView scoreId;
Button btn31;
Button btn32;
Button btn33;
Button btn34;
String currentScore;

public static final String shardPref="sharedPref";
public static final String key="totalScore";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);
        Intent intent3=getIntent();
        String scoreStr3=intent3.getStringExtra("score2");
        scoreId=findViewById(R.id.scroe3_id);
        scoreId.setText(scoreStr3);

        btn31=findViewById(R.id.btn31);
        btn32=findViewById(R.id.btn32);
        btn33=findViewById(R.id.btn33);
        btn34=findViewById(R.id.btn34);

        btn31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(question3.this, "WRONG ANSWER", Toast.LENGTH_SHORT).show();
                ScoreControl.decreaseScore();
                currentScore=String.valueOf(ScoreControl.getScore());
                scoreId.setText(currentScore);
            }
        });

        btn32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(question3.this, "RIGHT ANSWER", Toast.LENGTH_SHORT).show();
                ScoreControl.increaseScore();
                currentScore=String.valueOf(ScoreControl.getScore());
                scoreId.setText(currentScore);
                Intent intent=new Intent(question3.this,certification.class);
                startActivity(intent);
            }
        });

        btn33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(question3.this, "WRONG ANSWER", Toast.LENGTH_SHORT).show();
                ScoreControl.decreaseScore();
                currentScore=String.valueOf(ScoreControl.getScore());
                scoreId.setText(currentScore);
            }
        });

        btn34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(question3.this, "WRONG ANSWER", Toast.LENGTH_SHORT).show();
                ScoreControl.decreaseScore();
                currentScore=String.valueOf(ScoreControl.getScore());
                scoreId.setText(currentScore);
            }
        });




    }
}