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
        String Name_message = intent.getStringExtra("Name_MESSAGE");
        String Class_message = intent.getStringExtra("Class_MESSAGE");
        String Date_message = intent.getStringExtra("Date_MESSAGE");
        String Inform_message = intent.getStringExtra("Inform_MESSAGE");
//        Log.d("Check Data >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>",Name_message+"\n"+Class_message+"\n"+Date_message+"\n"+Inform_message);
        //  define the layout and set text for the page/activity
        EditText HM_Date = (EditText) findViewById(R.id.HM_Edit_Date);
        HM_Date.setText(Date_message);
        EditText HM_Class = (EditText) findViewById(R.id.HM_Edit_Class);
        HM_Class.setText(Class_message);
        EditText HM_Name = (EditText) findViewById(R.id.HM_Edit_Title);
        HM_Name.setText(Name_message);
        EditText HM_Inform = (EditText) findViewById(R.id.HM_Edit_Information);
        HM_Inform.setText(Inform_message);
    }

    //  get data and go through to next page/activity
    public void Save_change(View aView) {
        /*
         * up data the setting by the get value and update to the list by showing the text view
         * */
        /*Edit.putExtra()*/
        //  define the layout of the page/activity
        TextView EditedClass = (TextView)findViewById(R.id.HM_Edit_Class);
        TextView EditedName = (TextView)findViewById(R.id.HM_Edit_Title);
        TextView EditedDate = (TextView)findViewById(R.id.HM_Edit_Date);
        TextView EditedInform = (TextView)findViewById(R.id.HM_Edit_Information);
        //  get value from the page/activity
        CharSequence Class =EditedClass.getText();
        CharSequence Name =EditedName.getText();
        CharSequence Date =EditedDate.getText();
        CharSequence Inform =EditedInform.getText();
        //  set up a pop up window for the page/activity
        AlertDialog.Builder Check = new AlertDialog.Builder(EditHomeWork.this);
        Check.setMessage("Please make sure the value is correct below"+"\n\nClass==>  "+Class+"\n\nDate==>  "+Date+"\n\nTitle==>  "+Name+"\n\nDetail==>  "+Inform);
        Check.setPositiveButton("Save and Leave", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
                /*update function to teh list*/
            }
        });
        Check.show();
    }
    //  go through to next page/activity
    public void Leave(View aView) {
        //  set up a pop up window for the page/activity
        AlertDialog.Builder Warning = new AlertDialog.Builder(EditHomeWork.this);
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