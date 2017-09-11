package com.example.alexi.eva1_2_fibonacci_ordenmenor_serie;

/**
 * Created by Alexis on 10/09/2017.
 */

public class Ordenador {
    public void ordenarBurbuja(int []array ){

        int aux;
        boolean cambio=false;

        while (true){
        cambio=false;
            for(int i =1;i<array.length;i++){
                if(array[i]<array[i-1]){
                    aux=array[i];
                    array[i]=array[i-1];
                    array[i-1]=aux;
                    cambio=true;
                }
            }
            if(cambio==false){
                break;
            }
        }

    }
}
