package com.example.alexi.eva1_2_fibonacci_ordenmenor_serie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Numerica extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numerica);
    }
    public void onAnteriorBurbuja(View view){
        Intent intAnterior = new Intent(this,Burbuja.class);
        startActivity(intAnterior);
        finish();
    }
}
