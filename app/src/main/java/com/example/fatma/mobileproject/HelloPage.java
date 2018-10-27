package com.example.fatma.mobileproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.content.Intent;

public class HelloPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_page);

        getSupportActionBar().hide();



        ImageView iv1= findViewById(R.id.imageView3);
        iv1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(HelloPage.this, MuseumMap.class);
                        startActivity(i);


                    }
                }

        );

    }
}
