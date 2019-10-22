package com.example.transportapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

private CardView trackCard,deliveryCard,bookCard,downloadCard,complainCard,conatctCard,ratesCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Dashboard");

        //defining cards
        trackCard = (CardView)findViewById(R.id.trackCard);
        deliveryCard = (CardView)findViewById(R.id.deliveryCard);
        bookCard = (CardView)findViewById(R.id.bookCard);
        downloadCard = (CardView)findViewById(R.id.downloadCard);
        complainCard = (CardView)findViewById(R.id.complainCard);
        conatctCard = (CardView)findViewById(R.id.contactCard);
        ratesCard = (CardView)findViewById(R.id.ratesCard);

        trackCard.setOnClickListener(this);
        deliveryCard.setOnClickListener(this);
        bookCard.setOnClickListener(this);
        downloadCard.setOnClickListener(this);
        complainCard.setOnClickListener(this);
        conatctCard.setOnClickListener(this);
        ratesCard.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        Intent i;

        switch (view.getId()){

            case R.id.trackCard : i = new Intent(this,Track.class);
            startActivity(i);
            break;

            case R.id.deliveryCard : i = new Intent(this,DeliveryReport.class);
                startActivity(i);
                break;

            case R.id.bookCard : i = new Intent(this,Booking.class);
                startActivity(i);
                break;

            case R.id.downloadCard : i = new Intent(this,DownloadReport.class);
                startActivity(i);
                break;

            case R.id.complainCard : i = new Intent(this,Complain.class);
                startActivity(i);
                break;

            case R.id.contactCard : i = new Intent(this,Contact.class);
                startActivity(i);
                break;

            case R.id.ratesCard : i = new Intent(this,Rates.class);
                startActivity(i);
                break;

            default:break;
        }
    }
}
