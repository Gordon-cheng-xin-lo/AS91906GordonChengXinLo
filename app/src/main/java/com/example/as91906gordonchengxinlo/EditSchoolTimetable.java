package com.example.as91906gordonchengxinlo;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class EditSchoolTimetable extends AppCompatActivity {

    @SuppressLint("LongLogTag")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_school_timetable);


        Intent intent = getIntent();
        String ClassName_message = intent.getStringExtra(SchoolTimetable.ClassName_MESSAGE);
        String Location_message = intent.getStringExtra(SchoolTimetable.Location_MESSAGE);
        String Day_message = intent.getStringExtra(SchoolTimetable.Day_MESSAGE);
        String StartTime_message = intent.getStringExtra(SchoolTimetable.StartTime_MESSAGE);
        String EndTime_message = intent.getStringExtra(SchoolTimetable.EndTime_MESSAGE);
        String Image_message = intent.getStringExtra(SchoolTimetable.Image_MESSAGE);
        String Position_message = intent.getStringExtra(SchoolTimetable.Position_MESSAGE);
        Log.d("Day==================================================================",Day_message+"                            "+Position_message);


        EditText ST_Class = (EditText) findViewById(R.id.SchoolTimetable_Edit_Class);
        ST_Class.setText(ClassName_message);
        EditText ST_Day = (EditText) findViewById(R.id.schoolTimetable_Edit_Day);
        ST_Day.setText(Day_message);
        EditText ST_Location = (EditText) findViewById(R.id.SchoolTimetable_Edit_Location);
        ST_Location.setText(Location_message);
        EditText ST_StartTime = (EditText) findViewById(R.id.SchoolTimetable_Edit_Starting_time);
        ST_StartTime.setText(StartTime_message);
        EditText ST_EndTime = (EditText) findViewById(R.id.SchoolTimetable_Edit_Ending_time);
        ST_EndTime.setText(EndTime_message);

    }

    public void Save_change(View aView) {
        /*
         * up data the setting by the get value and update to the list by showing the text view
         * */

        /*Edit.putExtra()*/
        TextView EditedClass = (TextView)findViewById(R.id.SchoolTimetable_Edit_Class);
        TextView EditedDay = (TextView)findViewById(R.id.schoolTimetable_Edit_Day);
        TextView EditedLocation = (TextView)findViewById(R.id.SchoolTimetable_Edit_Location);
        TextView EditedStartTime = (TextView)findViewById(R.id.SchoolTimetable_Edit_Starting_time);
        TextView EditedEndTime = (TextView)findViewById(R.id.SchoolTimetable_Edit_Ending_time);

        CharSequence Class =EditedClass.getText();
        CharSequence Day =EditedDay.getText();
        CharSequence Location =EditedLocation.getText();
        CharSequence StartTime =EditedStartTime.getText();
        CharSequence EndTime =EditedEndTime.getText();
                /*
                up date the list in teh view class

                */
        AlertDialog.Builder Check = new AlertDialog.Builder(EditSchoolTimetable.this);
        Check.setMessage("Please make sure the value is correct below"+"\n\nClass==>  "+Class+"\n\nClass Day==>  "+Day+"\n\nLocation==>  "+Location+"\n\nStart At==>  "+StartTime+"\n\nEnd In==>  "+EndTime);

        Check.setPositiveButton("Save and Leave", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
                /*update function to teh list*/
            }
        });
        Check.show();
    }

    public void Leave(View aView) {
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