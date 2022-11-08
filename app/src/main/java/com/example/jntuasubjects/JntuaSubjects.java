package com.example.jntuasubjects;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class JntuaSubjects extends AppCompatActivity {
    public  Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jntua_subjects);
        button = (Button) findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(JntuaSubjects.this,EEE.class);
                startActivity(intent);
            }
        });
        button = (Button) findViewById(R.id.btn1);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(JntuaSubjects.this,CSE.class);
                startActivity(intent);
            }
        });
        button = (Button) findViewById(R.id.btn2);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(JntuaSubjects.this,ECE.class);
                startActivity(intent);
            }
        });
        button = (Button) findViewById(R.id.btn3);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(JntuaSubjects.this,CE.class);
                startActivity(intent);
            }
        });
        button = (Button) findViewById(R.id.btn4);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(JntuaSubjects.this,IT.class);
                startActivity(intent);
            }
        });
        button = (Button) findViewById(R.id.btn5);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(JntuaSubjects.this,FT.class);
                startActivity(intent);
            }
        });
        button = (Button) findViewById(R.id.btn6);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(JntuaSubjects.this,ME.class);
                startActivity(intent);
            }
        });

    }
}