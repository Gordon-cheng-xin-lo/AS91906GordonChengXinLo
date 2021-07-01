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

public class EditHomeWork extends AppCompatActivity {
    @SuppressLint("LongLogTag")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //  define the layout of the page/activity
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_home_work);
        //  get value form the previous page/activity(HomeworkRecyclerView.class)
        Intent intent = getIntent();
        String name_message = intent.getStringExtra("Name_MESSAGE");
        String class_message = intent.getStringExtra("Class_MESSAGE");
        String date_message = intent.getStringExtra("Date_MESSAGE");
        String inform_message = intent.getStringExtra("Inform_MESSAGE");
//        Log.d("Check Data >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>",name_message+"\n"+class_message+"\n"+date_message+"\n"+inform_message);
        //  define the layout and set text for the page/activity
        EditText hmDate = (EditText) findViewById(R.id.HM_Edit_Date);
        hmDate.setText(date_message);
        EditText hmClass = (EditText) findViewById(R.id.HM_Edit_Class);
        hmClass.setText(class_message);
        EditText hmName = (EditText) findViewById(R.id.HM_Edit_Title);
        hmName.setText(name_message);
        EditText hmInform = (EditText) findViewById(R.id.HM_Edit_Information);
        hmInform.setText(inform_message);
    }

    //  get data and go through to next page/activity
    public void saveChange(View aView) {
        /*
         * up data the setting by the get value and update to the list by showing the text view
         * */
        /*Edit.putExtra()*/
        //  define the layout of the page/activity
        TextView editedClass = (TextView)findViewById(R.id.HM_Edit_Class);
        TextView editedName = (TextView)findViewById(R.id.HM_Edit_Title);
        TextView editedDate = (TextView)findViewById(R.id.HM_Edit_Date);
        TextView editedInform = (TextView)findViewById(R.id.HM_Edit_Information);
        //  get value from the page/activity
        CharSequence classText =editedClass.getText();
        CharSequence name =editedName.getText();
        CharSequence date =editedDate.getText();
        CharSequence inform =editedInform.getText();
        //  if statement to chek the edit text basic information have been fill
        if (classText.length()==0 || name.length()==0){
            //  set up a pop up window for the page/activity
            AlertDialog.Builder check = new AlertDialog.Builder(EditHomeWork.this);
            check.setMessage("Please make sure the \n   class name\n    name of Homework\nis filled below");
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
        else if (classText.length()>0 && name.length()>0) {
            //  set up a pop up window for the page/activity
            AlertDialog.Builder check = new AlertDialog.Builder(EditHomeWork.this);
            check.setMessage("Please make sure the value is correct below"+"\n\nclassText==>  "+classText+"\n\ndate==>  "+date+"\n\nTitle==>  "+name+"\n\nDetail==>  "+inform);
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
        //  set up a pop up window for the page/activity
        AlertDialog.Builder warning = new AlertDialog.Builder(EditHomeWork.this);
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