package com.example.as91906gordonchengxinlo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Timetable extends AppCompatActivity {
    //set the object for page/activity
    Button mHomeButton;
    Button mAccountbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //  define the layout of the page/activity
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetable);
        //define the object in the xml
        mHomeButton = findViewById(R.id.Timetable_home_button);
        mAccountbutton = findViewById(R.id.Timetable_account_button);
    }
    //  go through to next page/activity
    public void Return (View aView) {
        Intent homepageFunction = new Intent(this,MainActivity.class);
        startActivity(homepageFunction);
        finishAffinity();
    }
    //  go through to next page/activity
    public void scooltimetable(View aView) {
        Intent schooltimetableFunction = new Intent(this,SchoolTimetable.class);
        startActivity(schooltimetableFunction);
    }
    //  go through to next page/activity
    public void homework(View aView) {
        Intent homeworkFunction = new Intent (this,Homework.class);
        startActivity(homeworkFunction);
    }
}