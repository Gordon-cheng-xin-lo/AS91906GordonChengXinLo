package com.example.as91906gordonchengxinlo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Kamar extends AppCompatActivity {
    //set the object for page/activity
    Button HomeButton;
    Button Accountbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //  define the layout of the page/activity
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kamar);
        //define the object in the xml
        HomeButton = findViewById(R.id.Kamar_home_button);
        Accountbutton = findViewById(R.id.Kamar_account_button);
    }
    //  go through to next page/activity
    public void WebViewKamar (View aView) {
        Intent Web_Kamar = new Intent(this,kamarwebvivew.class);
        startActivity(Web_Kamar);
    }
    //  go through to next page/activity
    public void Return (View aView) {
        Intent Homepage_function = new Intent(this,MainActivity.class);
        startActivity(Homepage_function);
        finishAffinity();
    }
}