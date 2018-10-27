package com.example.fatma.mobileproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.content.Intent;
import android.widget.TextView;

public class MobileProje extends AppCompatActivity implements View.OnClickListener {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile_proje);

        getSupportActionBar().hide();

        //EditText edt= findViewById(R.id.editText);
        Button start_button=(Button)findViewById(R.id.button);
        start_button.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(MobileProje.this, SecondPage.class);
        EditText edt = (EditText) findViewById(R.id.editText);

        i.putExtra("Name" , edt.getText().toString());

        EditText edt2 = (EditText) findViewById(R.id.editText2);
        i.putExtra("Age" , edt2.getText().toString());

        EditText edt3 = (EditText) findViewById(R.id.editText3);
        i.putExtra("Mail" , edt3.getText().toString());


        RadioGroup rg1= findViewById(R.id.rg1);
        RadioGroup rg2=findViewById(R.id.rg2);


        int selected1 = rg1.getCheckedRadioButtonId();
        RadioButton questionFour = (RadioButton) findViewById(selected1);

        i.putExtra("q4",questionFour.getText().toString());

        int selected2 = rg2.getCheckedRadioButtonId();
        RadioButton questionFive = (RadioButton) findViewById(selected2);

        i.putExtra("q5",questionFive.getText().toString());




        startActivity(i);
    }



}


