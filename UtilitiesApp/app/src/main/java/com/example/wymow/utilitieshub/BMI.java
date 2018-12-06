package com.example.wymow.utilitieshub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BMI extends AppCompatActivity {

        Button Calculate;
        EditText weight, height;
        TextView result, info;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        weight = (EditText) findViewById(R.id.etWeight);
        height = (EditText) findViewById(R.id.etCm);
        Calculate = (Button) findViewById(R.id.btnCalculator);
        result = (TextView)findViewById(R.id.tvResult);
        info = (TextView)findViewById(R.id.tvINFO);


        Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double getWeight = new Double(weight.getText().toString());
                double getHeight = new Double(height.getText().toString());
                double answer,newHeight ;
                newHeight = getHeight/100;
                    answer = getWeight/(newHeight * newHeight);



                if (answer <18.5)
                    info.setText("You are Underweight");
                else if (answer >18.5 && answer < 24.9 )
                    info.setText("You are Normal");
                else if (answer > 24.9 && answer <29.9)
                    info.setText("You are Overweight");
                else if (answer > 29.9)
                    info.setText("You are Obese!");

                result.setText(new Double(answer).toString());




            }
        });

    }
}
