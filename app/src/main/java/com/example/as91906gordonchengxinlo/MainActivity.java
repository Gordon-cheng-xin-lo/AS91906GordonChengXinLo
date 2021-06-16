package com.example.as91906gordonchengxinlo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button TimeTableButton;
    Button ContentShareButton;
    Button RevisionButton;
    Button KamarButton;
    Button AccountButton;
    int Set = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (Set==0){

            Set=1;
        }

        TimeTableButton = findViewById(R.id.TimeTable_button);
        ContentShareButton = findViewById(R.id.ContentShare_button);
        RevisionButton = findViewById(R.id.Revision_button);
        KamarButton = findViewById(R.id.Kamar_button);
        AccountButton = findViewById(R.id.Account_button);



    }


    public void Timetable_layer (View aView) {
        Intent Timetable = new Intent(this,Timetable.class);
        startActivity(Timetable);
    }

    public void Resource_layer (View aView) {
        Intent Resource = new Intent(this,Resource.class);
        startActivity(Resource);
    }

    public void Revision_layer (View aView) {
        Intent Revision = new Intent(this,Revision.class);
        startActivity(Revision);
    }

    public void Kamar_layer (View aView) {
        Intent Kamar = new Intent(this,Kamar.class);
        startActivity(Kamar);
    }

/*    public void Account_setting (View aView) {
        Intent AccountSetting = new Intent(this,AccountSetting.class);
        startActivity(AccountSetting);
        finish();
    }*/

}