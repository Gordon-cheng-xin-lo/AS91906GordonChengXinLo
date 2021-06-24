package com.example.as91906gordonchengxinlo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //set the object for page/activity
    Button TimeTableButton;
    Button ContentShareButton;
    Button RevisionButton;
    Button KamarButton;
    Button AccountButton;
    int Set = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //  define the layout of the page/activity
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //this is the part leave for further development
        if (Set==0){
            Set=1;
            
        }
        //define the object in the xml
        TimeTableButton = findViewById(R.id.TimeTable_button);
        ContentShareButton = findViewById(R.id.ContentShare_button);
        RevisionButton = findViewById(R.id.Revision_button);
        KamarButton = findViewById(R.id.Kamar_button);
        AccountButton = findViewById(R.id.Account_button);
    }

    //  go through to next page/activity
    public void Timetable_layer (View aView) {
        Intent Timetable = new Intent(this,Timetable.class);
        startActivity(Timetable);
    }
    //  go through to next page/activity
    public void Resource_layer (View aView) {
        Intent Resource = new Intent(this,Resource.class);
        startActivity(Resource);
    }
    //  go through to next page/activity
    public void Revision_layer (View aView) {
        Intent Revision = new Intent(this,Revision.class);
        startActivity(Revision);
    }
    //  go through to next page/activity
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