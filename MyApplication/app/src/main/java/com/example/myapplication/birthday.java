package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class birthday extends AppCompatActivity {
TextView atext;
String name1="";
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday);
        atext=(TextView)findViewById(R.id.bname);
        name1= getIntent().getStringExtra("birthdayname");
        atext.setText("HAPPY BIRTHDAY"+"\n"+name1);
    }
}