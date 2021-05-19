package com.example.as91906gordonchengxinlo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Homework extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework);

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