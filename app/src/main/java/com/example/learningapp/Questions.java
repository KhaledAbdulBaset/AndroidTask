package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Questions extends AppCompatActivity {
Button btn1;
Button btn2;
Button btn3;
Button btn4;
TextView scoreField;
String sc;
public String tagScore="default";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        scoreField=findViewById(R.id.score_txt_view);

btn1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Toast.makeText(Questions.this, "WRONG ANSWER", Toast.LENGTH_SHORT).show();
        ScoreControl.decreaseScore();
        sc=String.valueOf(ScoreControl.getScore());
        scoreField.setText(sc);
    }
});

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Questions.this, "WRONG ANSWER", Toast.LENGTH_SHORT).show();
                ScoreControl.decreaseScore();
                sc=String.valueOf(ScoreControl.getScore());
                scoreField.setText(sc);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Questions.this, "WRONG ANSWER", Toast.LENGTH_SHORT).show();
                ScoreControl.decreaseScore();
                sc=String.valueOf(ScoreControl.getScore());
                scoreField.setText(sc);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Questions.this, "RIGHT ANSWER", Toast.LENGTH_SHORT).show();
                ScoreControl.increaseScore();
                sc=String.valueOf(ScoreControl.getScore());
                scoreField.setText(sc);
                Intent intent = new Intent(Questions.this,question2.class);
                tagScore=sc;
                intent.putExtra("score",tagScore);
                startActivity(intent);

            }
        });

    }
}