package com.example.as91906gordonchengxinlo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NewHomework extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //  define the layout of the page/activity
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_homework);
    }

    public void saveChange(View aView) {
        /*
         * up data the setting by the get value and update to the list by showing the text view
         * */
        //define the object in the xml
        TextView newClass = (TextView)findViewById(R.id.HM_New_Class);
        TextView newName = (TextView)findViewById(R.id.HM_New_Title);
        TextView newDate = (TextView)findViewById(R.id.HM_New_Date);
        TextView newInform = (TextView)findViewById(R.id.HM_New_Information);
        //  get value from the page/activity
        CharSequence classText =newClass.getText();
        CharSequence name =newName.getText();
        CharSequence date =newDate.getText();
        CharSequence inform =newInform.getText();
        //  if statement to chek the edit text basic information have been fill
        if (classText.length()==0 || name.length()==0) {
            //  set up a pop up window for the page/activity
            AlertDialog.Builder check = new AlertDialog.Builder(NewHomework.this);
            check.setMessage("Please make sure the \n   class name\n    name of Homework\nis filled below");
//            Check.setPositiveButton("Leave", new DialogInterface.OnClickListener() {
//                @Override
//                public void onClick(DialogInterface dialog, int which) {
//                    /*Update the date class  function and restart the activity
//                     * also update the homework activity*/
//                    finish();
//                }
//            });
            check.show();
        }
        //  if statement to chek the edit text basic information have been fill
        else if (classText.length()>0 && name.length()>0) {
            //  set up a pop up window for the page/activity
            AlertDialog.Builder check = new AlertDialog.Builder(NewHomework.this);
            check.setMessage("Please make sure the value you change is correct below\n\nclassText==>  "+classText+"\n\ndate==>  "+date+"\n\nTitle==>  "+name+"\n\nDetail==>  "+inform);
            check.setPositiveButton("Leave", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    /*Update the date class  function and restart the activity
                     * also update the homework activity*/
//                    HomeworkList HM1 = new HomeworkList(1, (String) date, (String) classText, (String) name, (String) inform);
//                    set update function on list

                    finish();
                }
            });
            check.show();
        }

    }
    //  go through to next page/activity
    public void leave(View aView) {
        //  set up a pop up window for the page/activity
        AlertDialog.Builder warning = new AlertDialog.Builder(NewHomework.this);
        warning.setMessage("Is that you want to leave and Give up the change");
        warning.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        warning.show();
    }

    /*public void Homepage (View aView) {
        Intent Homepage_function = new Intent(this,MainActivity.class);
        startActivity(Homepage_function);
        finishAffinity();
    }

    public void Return (View aView) {
        finish();
    }*/
}