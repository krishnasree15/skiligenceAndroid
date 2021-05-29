package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
public class MainActivity extends AppCompatActivity {

    Button creating;
    EditText nameoncard;
    String name="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        creating = (Button) findViewById(R.id.creat);
        nameoncard=(EditText) findViewById(R.id.name);
        creating.setOnClickListener(new View.OnClickListener()
        {   @Override
            public void onClick(View view){
            name=nameoncard.getText().toString();
            Intent i=new Intent(MainActivity.this,birthday.class);
            i.putExtra("birthdayname",name);
            startActivity(i);
        }

        });


    }
}