package com.example.as91906gordonchengxinlo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Kamar extends AppCompatActivity {

    Button HomeButton;
    Button Accountbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kamar);
        HomeButton = findViewById(R.id.Kamar_home_button);
        Accountbutton = findViewById(R.id.Kamar_account_button);
    }

    public void WebViewKamar (View aView) {
        Intent Web_Kamar = new Intent(this,kamarwebvivew.class);
        startActivity(Web_Kamar);
    }

    public void Return (View aView) {
        Intent Homepage_function = new Intent(this,MainActivity.class);
        startActivity(Homepage_function);
        finishAffinity();
    }
}