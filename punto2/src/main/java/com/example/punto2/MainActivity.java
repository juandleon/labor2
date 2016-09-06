package com.example.punto2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button calcular;
    EditText no1,no2;
    TextView result;
    RadioButton suma,resta,multi,division;
    int check=0;
    double c=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calcular=(Button) findViewById(R.id.calcular);
        no1=(EditText) findViewById(R.id.no1);
        no2=(EditText) findViewById(R.id.no2);
        result=(TextView) findViewById(R.id.result);
        suma=(RadioButton) findViewById(R.id.suma);
        resta=(RadioButton) findViewById(R.id.resta);
        multi=(RadioButton) findViewById(R.id.multi);
        division=(RadioButton) findViewById(R.id.division);

        if(resta.isChecked()){
            check=1;
            multi.setChecked(false);
            division.setChecked(false);
            suma.setChecked(false);
        }
        if(multi.isChecked()){
            check=2;
            suma.setChecked(false);
            resta.setChecked(false);
            division.setChecked(false);
        }
        if(division.isChecked()){
            check=3;
            multi.setChecked(false);
            suma.setChecked(false);
            resta.setChecked(false);
        }
        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check=0;
                resta.setChecked(false);
                multi.setChecked(false);
                division.setChecked(false);
            }
        });
        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check=1;
                suma.setChecked(false);
                multi.setChecked(false);
                division.setChecked(false);
            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check=2;
                suma.setChecked(false);
                resta.setChecked(false);
                division.setChecked(false);
            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check=3;
                suma.setChecked(false);
                multi.setChecked(false);
                resta.setChecked(false);
            }
        });

        calcular.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                String num1=no1.getText().toString();
                String num2=no2.getText().toString();
                String resultado;

                double a = Double.parseDouble(num1);
                double b = Double.parseDouble(num2);
                switch (check) {
                            case (0):
                                c = a + b;
                                resultado = Double.toString(c);
                                result.setText(resultado);
                                break;
                            case (1):
                                c = a - b;
                                resultado = Double.toString(c);
                                result.setText(resultado);
                                break;
                            case (2):
                                c = a * b;
                                resultado = Double.toString(c);
                                result.setText(resultado);
                                break;
                            case (3):
                                c = a / b;
                                resultado = Double.toString(c);
                                result.setText(resultado);
                                break;

                        }

            }

        });

    }


}
