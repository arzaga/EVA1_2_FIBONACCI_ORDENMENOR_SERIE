package com.example.alexi.eva1_2_fibonacci_ordenmenor_serie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Numerica extends AppCompatActivity {
    private EditText edtNumerica;
    private Button btnCalcularNum;
    private TextView txtResultadoNum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numerica);
        edtNumerica = (EditText) findViewById(R.id.edtNumerica);
        btnCalcularNum = (Button) findViewById(R.id.btnCalcularNum);
        txtResultadoNum = (TextView) findViewById(R.id.txtResultadoNum);


    }
    public void onAnteriorBurbuja(View view){
        Intent intAnterior = new Intent(this,Burbuja.class);
        startActivity(intAnterior);
        finish();
    }

    public void onCalcularNumerica(View view){
        try {
            int posicion = Integer.parseInt(edtNumerica.getText().toString());
            txtResultadoNum.setText(String.valueOf(parImpar(posicion)));
        }catch (NumberFormatException e){
            Toast.makeText(Numerica.this, "Solo se permiten Números", Toast.LENGTH_SHORT).show();

        }
    }
    public int parImpar(int posicion) {
        int resultado = -1;
        for(int i=1;i<=posicion;i++){
            if(i%2 == 0 ){
                resultado += 1;
            }else {
                resultado += 2;
            }
        }
        return resultado;
    }
}
