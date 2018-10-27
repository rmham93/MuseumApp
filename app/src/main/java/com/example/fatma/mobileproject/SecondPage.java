package com.example.fatma.mobileproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;

public class SecondPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);

        getSupportActionBar().hide();//hide ActionBar

        Intent in = getIntent();

        TextView answer1 = findViewById(R.id.textView9);
        TextView answer2 = findViewById(R.id.textView2);
        TextView answer3 = findViewById(R.id.textView10);
        TextView answer4 = findViewById(R.id.textView11);
        TextView answer5 = findViewById(R.id.answer5);

        String tv1= in.getExtras().getString("Name",null);
        String tv2= in.getExtras().getString("Age",null);
        String tv3= in.getExtras().getString("Mail",null);
        String q4= in.getExtras().getString("q4",null);
        String q5= in.getExtras().getString("q5",null);

        tv1 = "Your name: " +tv1;
        tv2 = "Your age: " +tv2;
        tv3 = "Your mail: " +tv3;
        q4= "Your answer: " + q4;
        q5= "Your answer: " + q5;


        answer1.setText(tv1);
        answer2.setText(tv2);
        answer3.setText(tv3);
        answer4.setText(q4);
        answer5.setText(q5);


    }
}
