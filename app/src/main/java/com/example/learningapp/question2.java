package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class question2 extends AppCompatActivity {
TextView score2;
String scoreStr2;
Button btn21;
Button btn22;
Button btn23;
Button btn24;
String sc2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
        score2=findViewById(R.id.score_q2);
        Intent intentRec= getIntent();
        scoreStr2=intentRec.getStringExtra("score");
        score2.setText(scoreStr2);

        btn21=findViewById(R.id.btn21);
        btn22=findViewById(R.id.btn22);
        btn23=findViewById(R.id.btn23);
        btn24=findViewById(R.id.btn24);


btn21.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Toast.makeText(question2.this, "RIGHT ANSWER", Toast.LENGTH_SHORT).show();
        ScoreControl.increaseScore();
        sc2=String.valueOf(ScoreControl.getScore());
        score2.setText(sc2);
        Intent intent = new Intent(question2.this,question3.class);
       intent.putExtra("score2",sc2);
        startActivity(intent);
    }});

        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(question2.this, "WRONG ANSWER", Toast.LENGTH_SHORT).show();
                ScoreControl.decreaseScore();
                sc2=String.valueOf(ScoreControl.getScore());
                score2.setText(sc2);
            }});

        btn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(question2.this, "WRONG ANSWER", Toast.LENGTH_SHORT).show();
                ScoreControl.decreaseScore();
                sc2=String.valueOf(ScoreControl.getScore());
                score2.setText(sc2);
            }});

        btn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(question2.this, "WRONG ANSWER", Toast.LENGTH_SHORT).show();
                ScoreControl.decreaseScore();
                sc2=String.valueOf(ScoreControl.getScore());
                score2.setText(sc2);

            }});





    }
}