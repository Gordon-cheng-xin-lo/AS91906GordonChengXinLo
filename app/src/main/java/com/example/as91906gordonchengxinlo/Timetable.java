package com.example.as91906gordonchengxinlo;

import androidx.appcompat.app.AppCompatActivity;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Timetable extends AppCompatActivity {
    //set the object for page/activity
    Button HomeButton;
    Button Accountbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //  define the layout of the page/activity
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetable);
        //define the object in the xml
        HomeButton = findViewById(R.id.Timetable_home_button);
        Accountbutton = findViewById(R.id.Timetable_account_button);
    }
    //  go through to next page/activity
    public void Return (View aView) {
        Intent Homepage_function = new Intent(this,MainActivity.class);
        startActivity(Homepage_function);
        finishAffinity();
    }
    //  go through to next page/activity
    public void Scooltimetable (View aView) {
        Intent Schooltimetable_function = new Intent(this,SchoolTimetable.class);
        startActivity(Schooltimetable_function);
    }
    //  go through to next page/activity
    public void Homework (View aView) {
        Intent Homework_function = new Intent (this,Homework.class);
        startActivity(Homework_function);
    }
}