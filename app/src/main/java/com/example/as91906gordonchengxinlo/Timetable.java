package com.example.as91906gordonchengxinlo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Timetable extends AppCompatActivity {

    Button HomeButton;
    Button Accountbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetable);

        HomeButton = findViewById(R.id.Timetable_home_button);
        Accountbutton = findViewById(R.id.Timetable_account_button);
    }

    public void Return (View aView) {
        Intent Homepage_function = new Intent(this,MainActivity.class);
        startActivity(Homepage_function);
        finishAffinity();
    }

    public void Scooltimetable (View aView) {
        Intent Schooltimetable_function = new Intent(this,SchoolTimetable.class);
        startActivity(Schooltimetable_function);
    }


    public void Homework (View aView) {
        Intent Homework_function = new Intent (this,Homework.class);
        startActivity(Homework_function);
    }
}