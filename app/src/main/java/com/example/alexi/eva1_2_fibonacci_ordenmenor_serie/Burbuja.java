package com.example.alexi.eva1_2_fibonacci_ordenmenor_serie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Burbuja extends AppCompatActivity {
EditText edtSecuencia;
    TextView txtResBurbuja;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burbuja);
        edtSecuencia=(EditText)findViewById(R.id.edtSecuencia);
        txtResBurbuja=(TextView) findViewById(R.id.txtResBurbuja);
    }

    public void onOrdenar(View view){
//        String foo = edtSecuencia.getText().toString();
//        String[] bar = foo.split("");
//
////        Toast.makeText(this, bar[1], Toast.LENGTH_SHORT).show();
//        int[] arreglo = new int[bar.length];
//        for(int i = 0;i < bar.length;i++)
//        {
//
//                arreglo[i] = Integer.parseInt(bar[i]);
//
//        }
//        for (String foobar : bar ){
//
//            Toast.makeText(this, String.format("<%s>", foobar), Toast.LENGTH_SHORT).show();
//        }
//        Ordenador o = new Ordenador();
//        o.ordenarBurbuja(arreglo);
//        for(int i=0;i<=arreglo.length;i++){
////            txtResBurbuja.setText(arreglo[i]);
//            Toast.makeText(this, ""+bar[i], Toast.LENGTH_SHORT).show();
//        }

        int[] numeros = convertirEntrada(edtSecuencia.getText().toString());
        int[] numerosOrdenados = ordernarNumeros(numeros);

        String result = "";

        for(int i=0;i<numerosOrdenados.length;i++){
            result = result + " " + String.valueOf(numerosOrdenados[i]);
        }
        txtResBurbuja.setText(result);
    }

    public int[] convertirEntrada(String entrada){

        String[] entradas = entrada.split(" ");

        int[] numeros = new int[entradas.length];

        for(int i=0;i<entradas.length; i++){
            try{
                numeros[i] = Integer.parseInt(entradas[i]);
            }catch(NumberFormatException e){
                return null;
            }

        }
        return numeros;
    }

    public int[] ordernarNumeros(int[] numeros) {

        if(numeros == null){
            Toast.makeText(this, "Por favor solo ingrese numeros", Toast.LENGTH_SHORT).show();
            return new int[]{0};
        }

        for(int i = 0; i < numeros.length - 1; i++)
        {
            for(int j = 0; j < numeros.length - 1; j++)
            {
                if (numeros[j] > numeros[j + 1])
                {
                    int tmp = numeros[j+1];
                    numeros[j+1] = numeros[j];
                    numeros[j] = tmp;
                }
            }
        }
        return numeros;
    }


    public void onAnteriorPrincipal(View view){
        Intent intAnterior = new Intent(this,Principal.class);
        startActivity(intAnterior);
        finish();
    }
    public void onSiguienteNumerica(View view){
        Intent intSiguienteNumerica = new Intent(this,Numerica.class);
        startActivity(intSiguienteNumerica);
        finish();
    }
}
