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
        HomeworkList HM6 = new HomeworkList(1,"3/6/2021","CSC","Programming","15 credit");
        HomeworkList HM7 = new HomeworkList(2,"4/6/2021","CAl","Complex Number","test");
        HomeworkList HM8 = new HomeworkList(3,"5/5/2021","PHY","MACH","test");
        HomeworkList HM9 = new HomeworkList(4,"6/8/2021","PHT","Platelet","Internal");
        HomeworkList HM10 = new HomeworkList(4,"6/8/2021","BJY","1234567890","1234567890");

        HomeworkListInformation.addAll(Arrays.asList(HM1,HM2,HM3,HM4,HM5,HM6,HM7,HM8,HM9,HM10));
    }
    //  go through to next page/activity
    public void Homepage (View aView) {
        Intent Homepage_function = new Intent(this,MainActivity.class);
        startActivity(Homepage_function);
        finishAffinity();
    }
    //  go through to next page/activity
    public void New_Homework(View aView) {
        Intent New_Homework_Function = new Intent(this,NewHomework.class);
        startActivity(New_Homework_Function);
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