package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class chooseCourse extends AppCompatActivity {
    public List<String> CoursesNameList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_course);

        RecyclerView recyclerViewCourses=findViewById(R.id.List_note);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerViewCourses.setLayoutManager(linearLayoutManager);

        CoursesNameList = new ArrayList<String>();
        CoursesNameList.add("Java");
        CoursesNameList.add("DataStructure");
        CoursesNameList.add("Maths");
        CoursesNameList.add("Electronics");
        CoursesNameList.add("Physics");
        CoursesNameList.add("Software");
        CoursesNameList.add("Design");
        CoursesNameList.add("Microprocessors");
        CoursesNameList.add("ComputerArch");
        CoursesNameList.add("machine");

        final CourseRecyclerView courseRecyclerView = new CourseRecyclerView(this,CoursesNameList);
        recyclerViewCourses.setAdapter(courseRecyclerView);





    }
}