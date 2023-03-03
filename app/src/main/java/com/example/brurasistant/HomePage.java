package com.example.brurasistant;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.Toast;

public class HomePage extends AppCompatActivity {


//    GridView homePageGridView;
//
//
//    int[] image = new int[10];
//    String[] name= new String[10];

    CardView profileCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

//        for( int i=0; i<10; i++){
//            this.image[i]= R.drawable.admission;
//            this.name[i]= "Addmission";
//        }
//
        profileCard=findViewById(R.id.profileBoxBtn);
        profileCard.setOnClickListener((v)->{
            startActivity(new Intent(HomePage.this, ProfilePage.class));
        });
//
//
//        homePageGridView=(GridView) findViewById(R.id.dataGridView);
//        Toast.makeText(HomePage.this, "ok", Toast.LENGTH_SHORT).show();
//        homePageGridView.setAdapter(new GridAdapter(this, name, image));



    }
}