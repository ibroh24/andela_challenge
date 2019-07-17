package com.example.androidchallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public WebView andellaWeb;
    public Button btnProfile;
    public Button btnAlc;

    public void secondButton(){
        btnProfile = (Button)findViewById(R.id.btnProfile);
        btnProfile.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent newButton = new Intent (MainActivity.this, myprofile.class);
                startActivity (newButton);
            }
        });
    }

    public void activitySwapping(){
        btnAlc = (Button)findViewById(R.id.btnAlc);
        btnAlc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnLocation = new Intent(MainActivity.this, AlcPage.class);
//                btnLocation.putExtra("url", "https://andela.com/alc");
                startActivity(btnLocation);
            }
        });
    }




        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activitySwapping();
        secondButton();
        //myProfile();
//        andellaWeb = (WebView)findViewById(R.id.andellaWeb);
//        WebSettings webSettings = andellaWeb.getSettings();
//        webSettings.setJavaScriptEnabled(true);
//        andellaWeb.loadUrl("https://andella.com/alc/");
    }

//    public void onClick(View v) {
//
//        Intent btnLocation = new Intent(getApplicationContext(), AlcPage.class);
//
//        switch(v.getId())
//        {
//            case R.id.action_bar:
//                btnLocation.putExtra("url", "https://andella.com/alc/");
//                startActivity(btnLocation);
//                break;
//
//            default:
//                break;
//        }
//        btnLocation.putExtra("url", "https://andella.com/alc/");
//        startActivity(btnLocation);
//    }
}
