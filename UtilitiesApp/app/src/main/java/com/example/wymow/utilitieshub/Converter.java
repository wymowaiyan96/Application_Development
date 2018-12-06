package com.example.wymow.utilitieshub;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class Converter extends AppCompatActivity {
    EditText temp;
    RadioButton ctof,ftoc,kgtop, ptokg,feetToCm, CmToFeet,kmToMile, mileToKm;
    Button convert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);
        temp = (EditText)findViewById(R.id.editText);
        ctof = (RadioButton)findViewById(R.id.ToFrbt);
        ftoc = (RadioButton)findViewById(R.id.ToCrbt);
        kgtop = (RadioButton) findViewById(R.id.ToPrbt);
        ptokg = (RadioButton) findViewById(R.id.ToKGrbt);
        CmToFeet = (RadioButton)findViewById(R.id.ToFeetrbt);
        feetToCm = (RadioButton)findViewById(R.id.RbtToCm);
        kmToMile = (RadioButton)findViewById(R.id.toMrbt);
        mileToKm = (RadioButton)findViewById(R.id.toKMrbt);
        convert = (Button)findViewById(R.id.btnConvert);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double value = new Double(temp.getText().toString());
                if (ftoc.isChecked())
                    value = ((value - 32) * 5 / 9);
                else if (ctof.isChecked())
                    value = ((32 + value) * 9 / 5);
                else if (kgtop.isChecked())
                    value = (value * 2.20462);
                else if (ptokg.isChecked())
                    value = (value * 0.453592);
                else if (CmToFeet.isChecked())
                    value = value * 0.0328084;
                else if (feetToCm.isChecked())
                    value = value * 30.48;
                else if (kmToMile.isChecked())
                    value = value * 0.621371;
                else if (mileToKm.isChecked())
                    value = value * 1.60934;


                temp.setText(new Double(value).toString());
            }

        });
    }
}