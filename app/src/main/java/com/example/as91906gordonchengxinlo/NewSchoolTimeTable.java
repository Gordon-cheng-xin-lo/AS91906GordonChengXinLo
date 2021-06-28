package com.example.as91906gordonchengxinlo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NewSchoolTimeTable extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //  define the layout of the page/activity
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_school_time_table);
    }

    public void saveChange(View aView) {
        /*
         * up data the setting by the get value and update to the list by showing the text view
         * */
        //define the object in the xml
        TextView editedClass = (TextView)findViewById(R.id.SchoolTimetable_New_Class);
        TextView editedDay = (TextView)findViewById(R.id.SchoolTimetable_New_Day);
        TextView editedLocation = (TextView)findViewById(R.id.SchoolTimetable_New_Location);
        TextView editedStartTime = (TextView)findViewById(R.id.SchoolTimetable_New_Starting_time);
        TextView editedEndTime = (TextView)findViewById(R.id.SchoolTimetable_New_Ending_time);
        //  get value from the page/activity
        CharSequence classText =editedClass.getText();
        CharSequence day =editedDay.getText();
        CharSequence location =editedLocation.getText();
        CharSequence startTime =editedStartTime.getText();
        CharSequence endTime =editedEndTime.getText();
                /*
                up date the list in teh view class

                */
        if (classText.length()==0 || day.length()==0 || location.length()==0){
            //  set up a pop up window for the page/activity
            AlertDialog.Builder check = new AlertDialog.Builder(NewSchoolTimeTable.this);
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
            AlertDialog.Builder check = new AlertDialog.Builder(NewSchoolTimeTable.this);
            check.setMessage("Please make sure the value is correct below"+"\n\nclassText==>  "+classText+"\n\nclassText day==>  "+day+"\n\nlocation==>  "+location+"\n\nStart At==>  "+startTime+"\n\nEnd In==>  "+endTime);
            check.setPositiveButton("Save and Leave", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                    /*update function to teh list*/
                }
            });
            check.show();
        }
    }
    //  go through to next page/activity
    public void leave(View aView) {
        AlertDialog.Builder warning = new AlertDialog.Builder(NewSchoolTimeTable.this);
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