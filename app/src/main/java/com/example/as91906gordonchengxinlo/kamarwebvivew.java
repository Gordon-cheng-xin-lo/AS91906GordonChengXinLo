package com.example.as91906gordonchengxinlo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class kamarwebvivew extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //  define the layout of the page/activity
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kamarwebvivew);
        //define the object in the xml
        WebView KamarWeb = findViewById(R.id.KamarWebView);
        KamarWeb.loadUrl("https://kamarportal.mrgs.school.nz/index.php");
    }
    //  go through to next page/activity
    public void Homepage (View aView) {
        Intent Homepage_function = new Intent(this,MainActivity.class);
        startActivity(Homepage_function);
        finishAffinity();
    }
    //  go through to next page/activity
    public void Return (View aView) {
        finish();
    }
}