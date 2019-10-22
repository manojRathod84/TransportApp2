package com.example.transportapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

class LoginActivity extends AppCompatActivity {

    EditText username, password;
    Button button;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        username =(EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);
        button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vaildate(username.getText().toString(), password.getText().toString());
            }
        });
    }

    private void vaildate(String username, String password){

        if (username == "admin" && password == "1234"){
            Intent intent =  new Intent(LoginActivity.this, DashBoardFragment.class);
            startActivity(intent);
        }else {
                Toast.makeText(this,"Incorrect Text", Toast.LENGTH_SHORT).show();
        }

    }
}
