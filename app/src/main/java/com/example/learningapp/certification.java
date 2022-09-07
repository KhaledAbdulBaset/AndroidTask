package com.example.learningapp;

import static com.example.learningapp.question3.key;
import static com.example.learningapp.question3.shardPref;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class certification extends AppCompatActivity {
Button getBtn;
ImageView certification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_certification);
        Intent intent = getIntent();
        getBtn=findViewById(R.id.get_btn);
        certification=findViewById(R.id.certification_id);

        getBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                certification.setVisibility(View.VISIBLE);
            }
        });





    }
}