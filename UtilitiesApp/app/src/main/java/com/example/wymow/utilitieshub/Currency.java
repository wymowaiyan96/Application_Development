package com.example.wymow.utilitieshub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Currency extends AppCompatActivity {

    EditText input;
    TextView USD, EURO, JAPAN, myr;
   Button convC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);
        input = (EditText)findViewById(R.id.etSGD);
        USD = (TextView)findViewById(R.id.tvUSD);
        EURO = (TextView)findViewById(R.id.tvEuro);
        JAPAN = (TextView)findViewById(R.id.tvJapan);
        myr = (TextView)findViewById(R.id.tvMyanmar);

        convC=(Button)findViewById(R.id.btnConvCur);

        convC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double value= new Double(input.getText().toString());
                value = Math.round((value * 0.76)*100.0)/100.0;
                USD.setText(new Double(value).toString() + " USD");
                double value2= new Double(input.getText().toString());
                value2 = Math.round((value2 * 0.62)*100.0)/100.0;
                EURO.setText(new Double(value2).toString() + " EURO");
                double value3= new Double(input.getText().toString());
                value3 = Math.round((value3 * 80.5)*100.0)/100.0;
                JAPAN.setText(new Double(value3).toString()+ " YEN");
                double value4 = Double.valueOf(input.getText().toString());
                value4 = Math.round((value4 * 1000)*100.0)/100.0;
                myr.setText(Double.toString(value4)+" MMK");






            }
        });




    }
}
llll