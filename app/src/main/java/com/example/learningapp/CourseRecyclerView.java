package com.example.learningapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CourseRecyclerView extends RecyclerView.Adapter<CourseRecyclerView.ViewHolder> {
    private final Context mContext;
    private final LayoutInflater layoutInflater;
    private final List<String> mCoursesNames;

    public CourseRecyclerView(Context mContext, List<String> mCoursesNames) {
        this.mContext = mContext;
        layoutInflater=LayoutInflater.from(mContext);
        this.mCoursesNames = mCoursesNames;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = layoutInflater.inflate(R.layout.recyclerviewlayout,parent,false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.CourseName.setText(mCoursesNames.get(position));
        holder.mCurrentPosition=holder.getAdapterPosition();


    }



    @Override
    public int getItemCount() {
        return mCoursesNames.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final TextView CourseName;
        public int mCurrentPosition;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            CourseName=(TextView) itemView.findViewById(R.id.course_name);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                   Intent intent = new Intent(mContext,Questions.class);
                   mContext.startActivity(intent);
                }
            });
        }
    }
}
