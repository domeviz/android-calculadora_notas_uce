package com.example.calculadorauce;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private EditText et3;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText) findViewById(R.id.nota_individual);
        et2=(EditText) findViewById(R.id.nota_grupal);
        et3=(EditText) findViewById(R.id.nota_examen);
        tv1=(TextView) findViewById(R.id.nota_final);

    }

    public void nota(View view){

        String Individual_String=et1.getText().toString();
        String Grupal_String=et2.getText().toString();
        String Examen_String=et3.getText().toString();

        double Individual_double=Double.parseDouble(Individual_String);
        double Grupal_double=Double.parseDouble(Grupal_String);
        double Examen_Double=Double.parseDouble(Examen_String);

        Individual_double=Individual_double*0.7;
        Grupal_double=Grupal_double*0.6;
        Examen_Double=Examen_Double*0.7;
        double nota_final=Individual_double+Grupal_double+Examen_Double;

        DecimalFormat df = new DecimalFormat("#.00");

        if(nota_final>=13.5){
            tv1.setText("Aprobado con: "+df.format(nota_final));
        } else{
            tv1.setText("Reprobado con: "+df.format(nota_final));
        }
    }

}