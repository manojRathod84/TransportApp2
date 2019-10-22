package com.example.transportapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Complain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complain);

        getSupportActionBar().setTitle("Complain");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
