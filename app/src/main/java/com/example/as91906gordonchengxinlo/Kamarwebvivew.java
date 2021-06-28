package com.example.as91906gordonchengxinlo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class Kamarwebvivew extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //  define the layout of the page/activity
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kamarwebvivew);
        //define the object in the xml
        WebView kamarWeb = findViewById(R.id.KamarWebView);
        kamarWeb.loadUrl("https://kamarportal.mrgs.school.nz/index.php");
    }
    //  go through to next page/activity
    public void homepage(View aView) {
        Intent homepageFunction = new Intent(this,MainActivity.class);
        startActivity(homepageFunction);
        finishAffinity();
    }
    //  go through to next page/activity
    public void Return (View aView) {
        finish();
    }
}