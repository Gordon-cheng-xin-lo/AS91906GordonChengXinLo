package com.example.as91906gordonchengxinlo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class EditSchoolTimetable extends AppCompatActivity {
    @SuppressLint("LongLogTag")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //  define the layout of the page/activity
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_school_timetable);
        //  get value form the previous page/activity(SchoolTimeTable.class)
        //  define the layout and set text for the page/activity
        Intent intent = getIntent();
        String className_message = intent.getStringExtra("ClassName_MESSAGE");
        EditText stClass = (EditText) findViewById(R.id.SchoolTimetable_Edit_Class);
        stClass.setText(className_message);
        String location_message = intent.getStringExtra("Location_MESSAGE");
        EditText stLocation = (EditText) findViewById(R.id.SchoolTimetable_Edit_Location);
        stLocation.setText(location_message);
        String day_message = intent.getStringExtra("Day_MESSAGE");
        EditText stDay = (EditText) findViewById(R.id.schoolTimetable_Edit_Day);
        stDay.setText(day_message);
        String startTime_message = intent.getStringExtra("StartTime_MESSAGE");
        EditText stStarttime = (EditText) findViewById(R.id.SchoolTimetable_Edit_Starting_time);
        stStarttime.setText(startTime_message);
        String endTime_message = intent.getStringExtra("EndTime_MESSAGE");
        EditText stEndtime = (EditText) findViewById(R.id.SchoolTimetable_Edit_Ending_time);
        stEndtime.setText(endTime_message);
//        String Position_message = intent.getStringExtra(SchoolTimetable.Position_MESSAGE);
        Log.d("Day==================================================================",className_message+location_message+day_message+startTime_message+endTime_message);
    }
    //  get data and go through to next page/activity
    public void saveChange(View aView) {
        /*
         * up data the setting by the get value and update to the list by showing the text view
         * */
        /*Edit.putExtra()*/
        //  define the layout of the page/activity
        TextView editedClass = (TextView)findViewById(R.id.SchoolTimetable_Edit_Class);
        TextView editedDay = (TextView)findViewById(R.id.schoolTimetable_Edit_Day);
        TextView editedLocation = (TextView)findViewById(R.id.SchoolTimetable_Edit_Location);
        TextView editedStartTime = (TextView)findViewById(R.id.SchoolTimetable_Edit_Starting_time);
        TextView editedEndTime = (TextView)findViewById(R.id.SchoolTimetable_Edit_Ending_time);
        //  get value from the page/activity
        CharSequence classText =editedClass.getText();
        CharSequence day =editedDay.getText();
        CharSequence location =editedLocation.getText();
        CharSequence startTime =editedStartTime.getText();
        CharSequence endTime =editedEndTime.getText();
                /*                up date the list in teh view class                */
        //  if statement to chek the edit text basic information have been filled
        if (classText.length()==0 || day.length()==0 || location.length()==0){
            //  set up a pop up window for the page/activity
            AlertDialog.Builder check = new AlertDialog.Builder(EditSchoolTimetable.this);
            check.setMessage("Please make sure the \n   classText Name\n    location of classText\n    day of classText\nis filled below");
//            check.setPositiveButton("Save and Leave", new DialogInterface.OnClickListener() {
//                @Override
//                public void onClick(DialogInterface dialog, int which) {
//                    finish();
//                    /*update function to teh list*/
//                }
//            });
            check.show();
        }
        //  if statement to chek the edit text basic information have been fill
        else if (classText.length()>0 && day.length()>0 && location.length()>0) {
            //  set up a pop up window for the page/activity
            AlertDialog.Builder check = new AlertDialog.Builder(EditSchoolTimetable.this);
            check.setMessage("Please make sure the value is correct below"+"\n\nclassText==>  "+classText+"\n\nclassText day==>  "+day+"\n\nlocation==>  "+location+"\n\nStart At==>  "+startTime+"\n\nEnd In==>  "+endTime);
//            check.setPositiveButton("Save and Leave", new DialogInterface.OnClickListener() {
//                @Override
//                public void onClick(DialogInterface dialog, int which) {
//                    finish();
//                    /*update function to teh list*/
//                }
//            });
            check.show();
        }

    }
    //  go through to next page/activity
    public void leave(View aView) {
        //  set up a pop up window for the page/activity
        AlertDialog.Builder warning = new AlertDialog.Builder(EditSchoolTimetable.this);
        warning.setMessage("Is that you want to leave and Not save the change");
        warning.setPositiveButton("Leave", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        warning.show();
    }
}