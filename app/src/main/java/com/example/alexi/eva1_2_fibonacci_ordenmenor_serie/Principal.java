package com.example.alexi.eva1_2_fibonacci_ordenmenor_serie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigInteger;
import java.util.ArrayList;

public class Principal extends AppCompatActivity {
    EditText edtFibonacci;
    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        edtFibonacci =(EditText)findViewById(R.id.edtFibonacci);
        txtResultado =(TextView) findViewById(R.id.txtResultado);





    }
    public void onCalcularFibo(View view){
        int x=1;
        int anterior=0;
        int temp;
        int cont=0;
        if(Integer.parseInt(edtFibonacci.getText().toString())==0){
       txtResultado.setText("0");
        }else{
            while (true){
                System.out.println(x);
                cont++;
                if(cont==Integer.parseInt(edtFibonacci.getText().toString())){
                    System.out.println(x);
                    txtResultado.setText(""+x);
                }
                temp = x;
                x=x+anterior;
                anterior=temp;
                if(x>30){
                    break;
                }
            }
        }


    }
    public void onSiguienteBurbuja(View view){
        Intent inSig = new Intent(this,Burbuja.class);
        startActivity(inSig);
        finish();
    }


}
