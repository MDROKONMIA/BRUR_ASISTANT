package com.example.brurasistant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class WelcomePage extends AppCompatActivity {

    Button getStartBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        getStartBtn=findViewById(R.id.getStartButton);
         getStartBtn.setOnClickListener((v)->{
             startActivity(new Intent(WelcomePage.this, Login.class));
         });
    }
}