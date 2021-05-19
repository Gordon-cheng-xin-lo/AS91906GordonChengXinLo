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

    public void Save_change(View aView) {
        /*
         * up data the setting by the get value and update to the list by showing the text view
         * */

        /*Edit.putExtra()*/
        TextView EditedClass = (TextView)findViewById(R.id.SchoolTimetable_New_Class);
        TextView EditedDay = (TextView)findViewById(R.id.SchoolTimetable_New_Day);
        TextView EditedLocation = (TextView)findViewById(R.id.SchoolTimetable_New_Location);
        TextView EditedStartTime = (TextView)findViewById(R.id.SchoolTimetable_New_Starting_time);
        TextView EditedEndTime = (TextView)findViewById(R.id.SchoolTimetable_New_Ending_time);

        CharSequence Class =EditedClass.getText();
        CharSequence Day =EditedDay.getText();
        CharSequence Location =EditedLocation.getText();
        CharSequence StartTime =EditedStartTime.getText();
        CharSequence EndTime =EditedEndTime.getText();
                /*
                up date the list in teh view class

                */
        AlertDialog.Builder Check = new AlertDialog.Builder(NewSchoolTimeTable.this);
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