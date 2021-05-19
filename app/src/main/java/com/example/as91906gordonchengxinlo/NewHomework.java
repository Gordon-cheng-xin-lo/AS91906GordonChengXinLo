package com.example.as91906gordonchengxinlo;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NewHomework extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_homework);
    }

    public void Save_change(View aView) {
        /*
         * up data the setting by the get value and update to the list by showing the text view
         * */
        TextView NewClass = (TextView)findViewById(R.id.HM_New_Class);
        TextView NewName = (TextView)findViewById(R.id.HM_New_Title);
        TextView NewDate = (TextView)findViewById(R.id.HM_New_Date);
        TextView NewInform = (TextView)findViewById(R.id.HM_New_Information);

        CharSequence Class =NewClass.getText();
        CharSequence Name =NewName.getText();
        CharSequence Date =NewDate.getText();
        CharSequence Inform =NewInform.getText();

        AlertDialog.Builder Check = new AlertDialog.Builder(NewHomework.this);
        Check.setMessage("Please make sure the value you change is correct below\n\nClass==>  "+Class+"\n\nDate==>  "+Date+"\n\nTitle==>  "+Name+"\n\nDetail==>  "+Inform);
        Check.setPositiveButton("Leave", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                /*Update the date class  function and restart the activity
                * also update the homework activity*/

                finish();
            }
        });
        Check.show();
    }

    public void Leave(View aView) {
        AlertDialog.Builder Warning = new AlertDialog.Builder(NewHomework.this);
        Warning.setMessage("Is that you want to leave and Give up the change");
        Warning.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        Warning.show();
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