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
    RecyclerView HomeworkRecyclerView;
    HomeworkRecyclerView adapter;

    List<HomeworkList> HomeworkListInformation = new ArrayList<HomeworkList>();

    @SuppressLint("LongLogTag")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework);
        fillHomeworkInformationList();
        Log.d("Lsit Response>>>>>>>>>>>>>>>>>>>>>>>>>>>", HomeworkListInformation.toString());
        getSupportActionBar();


        HomeworkRecyclerView= findViewById(R.id.Homewok_Recycleview);
        HomeworkRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new HomeworkRecyclerView(this, HomeworkListInformation);
        HomeworkRecyclerView.setAdapter(adapter);

    }

    private void fillHomeworkInformationList() {
        HomeworkList HM1 = new HomeworkList(1,"CSC","Programming","20 Credits","3/6/2021");
        HomeworkList HM2 = new HomeworkList(2,"CAL","Complex Number","Test","4/6/2021");
        HomeworkList HM3 = new HomeworkList(3,"PHY","MACH","Test","5/5/2021");
        HomeworkList HM4 = new HomeworkList(4,"PHT","Platelle","Internal","6/8/2021");

        HomeworkListInformation.addAll(Arrays.asList(HM1,HM2,HM3,HM4));
    }

    public void Homepage (View aView) {
        Intent Homepage_function = new Intent(this,MainActivity.class);
        startActivity(Homepage_function);
        finishAffinity();
    }

    public void New_Homework(View aView) {
        Intent New_Homework_Function = new Intent(this,NewHomework.class);
        startActivity(New_Homework_Function);
    }

/*    public void Edit_Homework(View aView) {
        Log.d("Edit"," Click");
        Intent Edit_Homework_Function = new Intent(this,EditHomeWork.class);
        startActivity(Edit_Homework_Function);
    }*/

    public void Return (View aView) {
        finish();
    }


}