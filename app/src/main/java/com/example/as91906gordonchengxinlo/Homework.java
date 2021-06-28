package com.example.as91906gordonchengxinlo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework extends AppCompatActivity {
    //define the object for recyclerview
    RecyclerView HomeworkRecyclerView;
    HomeworkRecyclerView adapter;
    List<HomeworkList> HomeworkListInformation = new ArrayList<HomeworkList>();

    @SuppressLint("LongLogTag")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //  define the layout of the page/activity
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework);
        //  set the testing data
        fillHomeworkInformationList();
        //  set the action bar
        getSupportActionBar();
        //define the object in the xml
        HomeworkRecyclerView= findViewById(R.id.Homewok_Recycleview);
        HomeworkRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        //define the object for recyclerview
        adapter = new HomeworkRecyclerView(this, HomeworkListInformation);
        HomeworkRecyclerView.setAdapter(adapter);
    }

    //  set the testing data into list
    private void fillHomeworkInformationList() {
        HomeworkList HM1 = new HomeworkList(1,"3/6/2021","CSC","Programming","15 credit");
        HomeworkList HM2 = new HomeworkList(2,"4/6/2021","CAl","Complex Number","test");
        HomeworkList HM3 = new HomeworkList(3,"5/5/2021","PHY","MACH","test");
        HomeworkList HM4 = new HomeworkList(4,"6/8/2021","PHT","Platelet","Internal");
        HomeworkList HM5 = new HomeworkList(4,"6/8/2021","DYV","1234567890","1234567890");
        HomeworkList HM6 = new HomeworkList(4,"6/8/2021","BJY","Platelet","Boundary Test Cause Sample");
        HomeworkList HM7 = new HomeworkList(4,"6/8/2021","","Platelet","Boundary Minimum Test Cause");
        HomeworkList HM8 = new HomeworkList(4,"6/8/2021","B","Platelet","Boundary Minimum Test Cause");
        HomeworkList HM9 = new HomeworkList(4,"6/8/2021","12345678901234","Platelet","Boundary Maximum Test Cause");
        HomeworkList HM10 = new HomeworkList(4,"6/8/2021","12345678901234","Platelet","Boundary Maximum Test Cause");
        HomeworkList HM11 = new HomeworkList(4,"6/8/2021","BJY","","Boundary Minimum Test Cause");
        HomeworkList HM12 = new HomeworkList(4,"6/8/2021","BJY","P","Boundary Minimum Test Cause");
        HomeworkList HM13 = new HomeworkList(4,"6/8/2021","BJY","12345678901234567890123456789","Boundary Maximum Test Cause");
        HomeworkList HM14 = new HomeworkList(4,"6/8/2021","BJY","12345678901234567890123456789","Boundary Maximum Test Cause");

        HomeworkListInformation.addAll(Arrays.asList(HM1,HM2,HM3,HM4,HM5,HM6,HM7,HM8,HM9,HM10,HM11,HM12,HM13,HM14));
    }
    //  go through to next page/activity
    public void Homepage (View aView) {
        Intent homepageFunction = new Intent(this,MainActivity.class);
        startActivity(homepageFunction);
        finishAffinity();
    }
    //  go through to next page/activity
    public void newHomework(View aView) {
        Intent newHomeworkFunction = new Intent(this,NewHomework.class);
        startActivity(newHomeworkFunction);
    }
/*    public void Edit_Homework(View aView) {
        Log.d("Edit"," Click");
        Intent Edit_Homework_Function = new Intent(this,EditHomeWork.class);
        startActivity(Edit_Homework_Function);
    }*/
    //  go through to next page/activity
    public void Return (View aView) {
        finish();
    }
}