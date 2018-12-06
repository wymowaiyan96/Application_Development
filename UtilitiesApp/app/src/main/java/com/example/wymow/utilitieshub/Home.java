package com.example.wymow.utilitieshub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    Button Converter, Calculator, Currency, BMI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Converter = (Button)findViewById(R.id.btnConverter);
        BMI = (Button)findViewById(R.id.btnBMI);
        Currency = (Button)findViewById(R.id.btnCurrency);
        Calculator = (Button)findViewById(R.id.btnCalculator) ;

        Converter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Home.this,Converter.class);
                startActivity(i);
            }
        });

        BMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Home.this,BMI.class);
                startActivity(i);
            }
        });

        Currency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Home.this,Currency.class);
                startActivity(i);
            }
        });


    }
}
