package com.javeriana.fapp.firstapp;

import java.util.ArrayList;

public class NumeroAleatorio{
    private int valorInicial;
    private int valorFinal;
    private ArrayList ListaNumero;

    public NumeroAleatorio(int valorInicial, int valorFinal){
        this.valorInicial = valorInicial;
        this.valorFinal = valorFinal;
        this.ListaNumero = new  ArrayList();
    }

    private int numeroAleatorio(){
        return (int)(Math.random()*(valorFinal-valorInicial+1)+valorInicial);
    }

    public int generar(){
        if (this.ListaNumero.size() < (valorFinal - valorInicial)+1){
            int numero = numeroAleatorio();
            if (this.ListaNumero.isEmpty()){
                this.ListaNumero.add(numero);
                return numero;
            }
            else{
                if (this.ListaNumero.contains(numero)){
                    return generar();
                }
                else {
                    this.ListaNumero.add(numero);
                    return numero;
                }
            }
        }
        else {
            return -1;
        }
    }
}
