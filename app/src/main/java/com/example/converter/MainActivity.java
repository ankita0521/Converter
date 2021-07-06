package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;



public class MainActivity extends AppCompatActivity {


    CardView dollar2Rupee, pound2Rupee, pound2Dollar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            dollar2Rupee = findViewById(R.id.dollarToRupee);
        pound2Rupee = findViewById(R.id.poundToRupee);
        pound2Dollar = findViewById(R.id.poundToDollar);

        dollar2Rupee.setOnClickListener(new View.OnClickListener() {


                @Override
                public void onClick(View v) {
                   // startActivity(new Intent(MainActivity.this,HomeActivity.class));
                    //Intent
                    Intent i = new Intent(MainActivity.this, HomeActivity.class);
                    i.putExtra("type",0);
                    startActivity(i);
                }
            });
        pound2Rupee.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View V) {
                //Internet
                Intent i = new Intent(MainActivity.this, HomeActivity.class);
                i.putExtra("type",1);
                startActivity(i);
            }
        });
        pound2Dollar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //Intent
                Intent i = new Intent(MainActivity.this, HomeActivity.class);
                i.putExtra("type",2);
                startActivity(i);
            }
        });


            }





        }