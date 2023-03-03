package com.example.brurasistant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SignUp extends AppCompatActivity {

    Button signUpBtn;
    TextView textSingIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        signUpBtn=findViewById(R.id.signUpButton);

        signUpBtn.setOnClickListener((v)->{
          startActivity(new Intent(SignUp.this, Number.class));
        });

        textSingIn=findViewById(R.id.textSignIn);
        textSingIn.setOnClickListener((v)->{
            startActivity(new Intent(SignUp.this, Login.class));
        });
    }

}