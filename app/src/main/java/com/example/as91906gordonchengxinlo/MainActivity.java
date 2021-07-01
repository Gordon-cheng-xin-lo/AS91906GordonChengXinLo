package com.example.as91906gordonchengxinlo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //set the object for page/activity
    Button mTimeTableButton;
    Button mContentShareButton;
    Button mRevisionButton;
    Button mKamarButton;
    Button mAccountButton;
    int mSet = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //  define the layout of the page/activity
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //this is the part leave for further development
        if (mSet ==0){
            mSet =1;
        }
        //define the object in the xml
        mTimeTableButton = findViewById(R.id.TimeTable_button);
        mContentShareButton = findViewById(R.id.ContentShare_button);
        mRevisionButton = findViewById(R.id.Revision_button);
        mKamarButton = findViewById(R.id.Kamar_button);
        mAccountButton = findViewById(R.id.Account_button);
    }

    //  go through to next page/activity
    public void timetableLayer(View aView) {
        Intent timetable = new Intent(this,Timetable.class);
        startActivity(timetable);
    }
    //  go through to next page/activity
    public void resourceLayer(View aView) {
        Intent resource = new Intent(this,Resource.class);
        startActivity(resource);
    }
    //  go through to next page/activity
        public void revisionLayer(View aView) {
        Intent revision = new Intent(this,Revision.class);
        startActivity(revision);
    }
    //  go through to next page/activity
    public void kamarLayer(View aView) {
        Intent kamar = new Intent(this,Kamar.class);
        startActivity(kamar);
    }

/*    public void Account_setting (View aView) {
        Intent AccountSetting = new Intent(this,AccountSetting.class);
        startActivity(AccountSetting);
        finish();
    }*/

}