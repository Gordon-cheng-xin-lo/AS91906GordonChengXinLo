package com.example.as91906gordonchengxinlo;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class EditHomeWork extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_home_work);
        Intent intent = getIntent();
        String Name_message = intent.getStringExtra(HomeworkRecyclerView.Name_MESSAGE);
        String Class_message = intent.getStringExtra(HomeworkRecyclerView.Class_MESSAGE);
        String Date_message = intent.getStringExtra(HomeworkRecyclerView.Date_MESSAGE);
        String Inform_message = intent.getStringExtra(HomeworkRecyclerView.Inform_MESSAGE);
        EditText HM_Date = (EditText) findViewById(R.id.HM_Edit_Date);
        HM_Date.setText(Date_message);
        EditText HM_Class = (EditText) findViewById(R.id.HM_Edit_Class);
        HM_Class.setText(Class_message);
        EditText HM_Name = (EditText) findViewById(R.id.HM_Edit_Title);
        HM_Name.setText(Name_message);
        EditText HM_Inform = (EditText) findViewById(R.id.HM_Edit_Information);
        HM_Inform.setText(Inform_message);
    }


    public void Save_change(View aView) {
        /*
        * up data the setting by the get value and update to the list by showing the text view
        * */

        /*Edit.putExtra()*/
        TextView EditedClass = (TextView)findViewById(R.id.HM_Edit_Class);
        TextView EditedName = (TextView)findViewById(R.id.HM_Edit_Title);
        TextView EditedDate = (TextView)findViewById(R.id.HM_Edit_Date);
        TextView EditedInform = (TextView)findViewById(R.id.HM_Edit_Information);

        CharSequence Class =EditedClass.getText();
        CharSequence Name =EditedName.getText();
        CharSequence Date =EditedDate.getText();
        CharSequence Inform =EditedInform.getText();
                /*
                up date the list in teh view class


                String Class = EditedClass.getText().toString();
                String Date = EditedName.getText().toString();
                String Name = EditedDate.getText().toString();
                String Inform = EditedInform.getText().toString();*/
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

    public void Leave(View aView) {
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