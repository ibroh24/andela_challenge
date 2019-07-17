package com.example.androidchallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AlcPage extends AppCompatActivity {

    public WebView andellaWeb;

    //    private WebView webView;

    public void andelaWebPage(){
        andellaWeb = (WebView)findViewById(R.id.andellWeb);
//        webView = findViewById(R.id.web)

        String url = getIntent().getStringExtra("url");
        //andellaWeb = (WebView)findViewById(R.id.andellaWeb);
        WebSettings webSettings = andellaWeb.getSettings();
        andellaWeb.setWebViewClient(new WebViewClient(){
            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error){
                handler.proceed();
            }
        });
        webSettings.setJavaScriptEnabled(true);
        andellaWeb.loadUrl("https://andela.com/alc/");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alc_page);
        getSupportActionBar ().setDisplayHomeAsUpEnabled(true);
        andelaWebPage();



    }

}
