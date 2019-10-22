package com.example.transportapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DownloadReport extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_download_report);

        getSupportActionBar().setTitle("Download Report");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
