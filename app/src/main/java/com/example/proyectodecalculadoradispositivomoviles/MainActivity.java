package com.example.proyectodecalculadoradispositivomoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1;
    Button Sumar;
    TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText)findViewById(R.id.etnumero1);
        resultado = (TextView) findViewById(R.id.txtresultado);
        Sumar =(Button)findViewById(R.id.btnsumar);

        //Funcion CLICK

        Sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double numero1 = Double.parseDouble(num1.getText().toString());
                double sumatoria = numero1 + 10;
                resultado.setText(Double.toString(sumatoria));
            }
        });
    }
}