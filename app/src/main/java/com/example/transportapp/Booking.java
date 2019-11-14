package com.example.transportapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class Booking extends AppCompatActivity {

    EditText date, sender, receiver, from, to, parcels, weight, charges;
    Button btn_book;
    User user;
    long maxid=0;
    DatabaseReference databaseUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);

        databaseUser = FirebaseDatabase.getInstance().getReference().child("User");
        databaseUser.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists())
                    maxid=(dataSnapshot.getChildrenCount());
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


        date = (EditText) findViewById(R.id.date);
        sender = (EditText) findViewById(R.id.sender);
        receiver = (EditText) findViewById(R.id.receiver);
        from = (EditText) findViewById(R.id.from);
        to = (EditText) findViewById(R.id.to);
        parcels = (EditText) findViewById(R.id.parcels);
        weight = (EditText) findViewById(R.id.weight);
        charges = (EditText) findViewById(R.id.charges);
        btn_book = (Button)findViewById(R.id.btn_book);
        user = new User();

        btn_book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int dat = Integer.parseInt(date.getText().toString().trim());
                int par = Integer.parseInt(parcels.getText().toString().trim());
                int wgt = Integer.parseInt(weight.getText().toString().trim());
                int cha = Integer.parseInt(charges.getText().toString().trim());

                user.setDate(dat);
                user.setCharges(cha);
                user.setParcels(par);
                user.setWeight(wgt);
                user.setSender(sender.getText().toString().trim());
                user.setReceiver(receiver.getText().toString().trim());
                user.setFrom(from.getText().toString().trim());
                user.setTo(to.getText().toString().trim());

                databaseUser.child(String.valueOf(maxid+1)).setValue(user);
                Toast.makeText(Booking.this,"Details Booked",Toast.LENGTH_SHORT).show();
            }
        });

    }

}
