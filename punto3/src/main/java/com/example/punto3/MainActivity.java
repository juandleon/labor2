package com.example.punto3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText lado,base,altura,lado1,lado2,radio;
    TextView area;
    RadioButton cua,tri,rec,cir;
    Button calcular;
    double result;
    LinearLayout layocua,layotri,layorec,layocir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layocua=(LinearLayout) findViewById(R.id.layocua);
        layotri=(LinearLayout) findViewById(R.id.layotri);
        layorec=(LinearLayout) findViewById(R.id.layorec);
        layocir=(LinearLayout) findViewById(R.id.layocir);
        lado=(EditText) findViewById(R.id.lado);
        base=(EditText) findViewById(R.id.base);
        altura=(EditText) findViewById(R.id.altura);
        lado1=(EditText) findViewById(R.id.lado1);
        lado2=(EditText) findViewById(R.id.lado2);
        radio=(EditText) findViewById(R.id.radio);
        area=(TextView) findViewById(R.id.area);
        cua=(RadioButton) findViewById(R.id.cua);
        rec=(RadioButton) findViewById(R.id.rec);
        tri=(RadioButton) findViewById(R.id.tri);
        cir=(RadioButton) findViewById(R.id.cir);
        calcular=(Button) findViewById(R.id.calcular);

        cua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layocua.setVisibility(View.VISIBLE);
                layotri.setVisibility(View.GONE);
                layorec.setVisibility(View.GONE);
                layocir.setVisibility(View.GONE);
            }
        });

        tri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layotri.setVisibility(View.VISIBLE);
                layocua.setVisibility(View.GONE);
                layorec.setVisibility(View.GONE);
                layocir.setVisibility(View.GONE);
            }
        });

        rec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layorec.setVisibility(View.VISIBLE);
                layotri.setVisibility(View.GONE);
                layocua.setVisibility(View.GONE);
                layocir.setVisibility(View.GONE);
            }
        });

        cir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layocir.setVisibility(View.VISIBLE);
                layotri.setVisibility(View.GONE);
                layorec.setVisibility(View.GONE);
                layocua.setVisibility(View.GONE);
            }
        });

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (cua.isChecked()) {
                    String ladoo = lado.getText().toString();
                    if (ladoo.isEmpty()) {
                    } else {
                        result = Double.parseDouble(ladoo);
                        result = result * result;
                        ladoo = Double.toString(result);
                        area.setText(ladoo);
                    }

                }
                if (tri.isChecked()) {
                    String basee = base.getText().toString();
                    String alturaa = altura.getText().toString();
                    if (basee.isEmpty()) {
                    } else {
                        if (alturaa.isEmpty()) {
                        } else {
                            result = (Double.parseDouble(basee))*(Double.parseDouble(alturaa));
                            result = result /2;
                            basee = Double.toString(result);
                            area.setText(basee);
                        }

                    }
                }

                if (rec.isChecked()) {
                    String largo = lado1.getText().toString();
                    String alto = lado2.getText().toString();
                    if (largo.isEmpty()) {
                    } else {
                        if (alto.isEmpty()) {
                        } else {
                            result = (Double.parseDouble(largo))*(Double.parseDouble(alto));
                            largo = Double.toString(result);
                            area.setText(largo);
                        }

                    }
                }

                if (cir.isChecked()) {
                    String radioo = radio.getText().toString();
                    if (radioo.isEmpty()) {
                    } else {
                        result = Double.parseDouble(radioo);
                        result = Math.PI*(result*result);
                        radioo = Double.toString(result);
                        area.setText(radioo);
                    }

                }
            }
        });


    }
}
