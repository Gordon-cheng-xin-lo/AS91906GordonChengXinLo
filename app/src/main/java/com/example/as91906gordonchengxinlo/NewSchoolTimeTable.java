package com.example.as91906gordonchengxinlo;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NewSchoolTimeTable extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_school_time_table);
    }



    public void Leave(View aView) {
        AlertDialog.Builder Warning = new AlertDialog.Builder(NewSchoolTimeTable.this);
        Warning.setMessage("Is that you want to leave and Not save the change");
        Warning.setPositiveButton("Leave", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        Warning.show();
    }
}