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
        String ClassName_message = intent.getStringExtra("ClassName_MESSAGE");
        EditText ST_Class = (EditText) findViewById(R.id.SchoolTimetable_Edit_Class);
        ST_Class.setText(ClassName_message);
        String Location_message = intent.getStringExtra("Location_MESSAGE");
        EditText ST_Location = (EditText) findViewById(R.id.SchoolTimetable_Edit_Location);
        ST_Location.setText(Location_message);
        String Day_message = intent.getStringExtra("Day_MESSAGE");
        EditText ST_Day = (EditText) findViewById(R.id.schoolTimetable_Edit_Day);
        ST_Day.setText(Day_message);
        String StartTime_message = intent.getStringExtra("StartTime_MESSAGE");
        EditText ST_StartTime = (EditText) findViewById(R.id.SchoolTimetable_Edit_Starting_time);
        ST_StartTime.setText(StartTime_message);
        String EndTime_message = intent.getStringExtra("EndTime_MESSAGE");
        EditText ST_EndTime = (EditText) findViewById(R.id.SchoolTimetable_Edit_Ending_time);
        ST_EndTime.setText(EndTime_message);
//        String Position_message = intent.getStringExtra(SchoolTimetable.Position_MESSAGE);
        Log.d("Day==================================================================",ClassName_message+Location_message+Day_message+StartTime_message+EndTime_message);
    }
    //  get data and go through to next page/activity
    public void Save_change(View aView) {
        /*
         * up data the setting by the get value and update to the list by showing the text view
         * */
        /*Edit.putExtra()*/
        //  define the layout of the page/activity
        TextView EditedClass = (TextView)findViewById(R.id.SchoolTimetable_Edit_Class);
        TextView EditedDay = (TextView)findViewById(R.id.schoolTimetable_Edit_Day);
        TextView EditedLocation = (TextView)findViewById(R.id.SchoolTimetable_Edit_Location);
        TextView EditedStartTime = (TextView)findViewById(R.id.SchoolTimetable_Edit_Starting_time);
        TextView EditedEndTime = (TextView)findViewById(R.id.SchoolTimetable_Edit_Ending_time);
        //  get value from the page/activity
        CharSequence Class =EditedClass.getText();
        CharSequence Day =EditedDay.getText();
        CharSequence Location =EditedLocation.getText();
        CharSequence StartTime =EditedStartTime.getText();
        CharSequence EndTime =EditedEndTime.getText();
                /*                up date the list in teh view class                */
        //  if statement to chek the edit text basic information have been filled
        if (Class.length()==0 || Day.length()==0 || Location.length()==0){
            //  set up a pop up window for the page/activity
            AlertDialog.Builder Check = new AlertDialog.Builder(EditSchoolTimetable.this);
            Check.setMessage("Please make sure the \n   Class Name\n    Location of Class\n    Day of Class\nis filled below");
//            Check.setPositiveButton("Save and Leave", new DialogInterface.OnClickListener() {
//                @Override
//                public void onClick(DialogInterface dialog, int which) {
//                    finish();
//                    /*update function to teh list*/
//                }
//            });
            Check.show();
        }
        //  if statement to chek the edit text basic information have been fill
        else if (Class.length()>0 && Day.length()>0 && Location.length()>0) {
            //  set up a pop up window for the page/activity
            AlertDialog.Builder Check = new AlertDialog.Builder(EditSchoolTimetable.this);
            Check.setMessage("Please make sure the value is correct below"+"\n\nClass==>  "+Class+"\n\nClass Day==>  "+Day+"\n\nLocation==>  "+Location+"\n\nStart At==>  "+StartTime+"\n\nEnd In==>  "+EndTime);
//            Check.setPositiveButton("Save and Leave", new DialogInterface.OnClickListener() {
//                @Override
//                public void onClick(DialogInterface dialog, int which) {
//                    finish();
//                    /*update function to teh list*/
//                }
//            });
            Check.show();
        }

    }
    //  go through to next page/activity
    public void Leave(View aView) {
        //  set up a pop up window for the page/activity
        AlertDialog.Builder Warning = new AlertDialog.Builder(EditSchoolTimetable.this);
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