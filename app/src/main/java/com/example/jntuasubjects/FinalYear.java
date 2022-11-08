package com.example.jntuasubjects;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FinalYear extends AppCompatActivity {
    public Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_year);
        button = (Button) findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(FinalYear.this,EEE.class);
                startActivity(intent);
            }
        });
        button = (Button) findViewById(R.id.btn1);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(FinalYear.this,CSE.class);
                startActivity(intent);
            }
        });
        button = (Button) findViewById(R.id.btn2);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(FinalYear.this,ECE.class);
                startActivity(intent);
            }
        });
        button = (Button) findViewById(R.id.btn3);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(FinalYear.this,CE.class);
                startActivity(intent);
            }
        });
        button = (Button) findViewById(R.id.btn4);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(FinalYear.this,IT.class);
                startActivity(intent);
            }
        });
        button = (Button) findViewById(R.id.btn5);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(FinalYear.this,FT.class);
                startActivity(intent);
            }
        });
        button = (Button) findViewById(R.id.btn6);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(FinalYear.this,ME.class);
                startActivity(intent);
            }
        });

    }
}