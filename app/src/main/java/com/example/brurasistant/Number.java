package com.example.brurasistant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class Number extends AppCompatActivity {

    ImageView btnNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);

        btnNext=findViewById(R.id.btnNext);

        btnNext.setOnClickListener((v)->{
            startActivity(new Intent(Number.this, Verification.class));
        });
    }
}