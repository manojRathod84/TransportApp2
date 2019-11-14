package com.example.transportapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Complain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complain);

        getSupportActionBar().setTitle("Complain");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final EditText edit1 = (EditText)findViewById(R.id.edit1);
        final EditText edit2 = (EditText)findViewById(R.id.edit2);
        Button btn_feed = (Button)findViewById(R.id.btn_feed);
        btn_feed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Intent.ACTION_SEND);
                i.setType("message/html");
                i.putExtra(Intent.EXTRA_EMAIL,new String("manojrathod51715@gmail.com"));
                i.putExtra(Intent.EXTRA_SUBJECT,"Feedback from App");
                i.putExtra(Intent.EXTRA_TEXT,"Subject:"+edit1.getText()+"\n FeedBack:"+edit2.getText());
                try{
                    startActivity(Intent.createChooser(i,"Please Select Email"));
                }
                catch (android.content.ActivityNotFoundException ex)
                {
                    Toast.makeText(Complain.this,"There are no email clients",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
