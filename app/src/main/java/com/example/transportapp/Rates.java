package com.example.transportapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Rates extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rates);

        getSupportActionBar().setTitle("Rates");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
