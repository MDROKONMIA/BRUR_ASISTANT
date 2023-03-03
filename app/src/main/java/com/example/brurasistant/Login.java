package com.example.brurasistant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    TextView signUpText;
    Button loginBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        signUpText=findViewById(R.id.textSignUp);
        signUpText.setOnClickListener((v)->{
            startActivity(new Intent(Login.this, SignUp.class));
        });

        loginBtn=findViewById(R.id.loginButton);
        loginBtn.setOnClickListener((v)->{
            startActivity(new Intent(Login.this, HomePage.class));
        });
    }
}