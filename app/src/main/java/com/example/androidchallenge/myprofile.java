package com.example.androidchallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class myprofile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myprofile);
        getSupportActionBar ().setDisplayHomeAsUpEnabled(true);

    }
}
