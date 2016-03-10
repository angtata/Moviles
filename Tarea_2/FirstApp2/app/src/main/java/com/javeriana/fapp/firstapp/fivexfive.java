package com.javeriana.fapp.firstapp;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import java.util.Collections;






import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class fivexfive extends Activity {
    public ArrayList <Integer> indices;
    public ArrayList <Integer> colors;
    boolean click;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fivexfive);

        colors = new ArrayList<Integer>();
        indices = new ArrayList<Integer>();
        click = true;
        llenarInicioColors(colors);
        LLenarInicioIndices(indices);
    }



    public void Color(final View view) {
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (click) {
                    int hola = v.getId() % indices.size();
                    int color = indices.get(hola);
                    v.setBackgroundColor(getResources().getColor(colors.get(color)));
                    click = false;
                }else {
                    click = true;
                }
                Button b = Comparar(v);
                if ((b.getId() == R.id.buttonT) && (b.getId() != v.getId())){
                    v.setBackgroundColor(getResources().getColor(R.color.gris));
                }

            }
        });
    }

    public Button Comparar(View view){

        final Button miboton = (Button)findViewById(R.id.button1);
        final Button miboton2 = (Button)findViewById(R.id.button2);
        final Button miboton3 = (Button)findViewById(R.id.button3);
        final Button miboton4 = (Button)findViewById(R.id.button4);
        final Button miboton5 = (Button)findViewById(R.id.button6);
        final Button miboton6 = (Button)findViewById(R.id.button7);
        final Button miboton7 = (Button)findViewById(R.id.button8);
        final Button miboton8 = (Button)findViewById(R.id.button9);
        final Button miboton9 = (Button)findViewById(R.id.button11);
        final Button miboton10 = (Button)findViewById(R.id.button12);
        final Button miboton11 = (Button)findViewById(R.id.button13);
        final Button miboton12 = (Button)findViewById(R.id.button14);
        final Button miboton13 = (Button)findViewById(R.id.button16);
        final Button miboton14 = (Button)findViewById(R.id.button17);
        final Button miboton15 = (Button)findViewById(R.id.button18);
        final Button miboton16 = (Button)findViewById(R.id.button19);
        final Button mibotonT = (Button)findViewById(R.id.buttonT);

        Drawable colorBoton = miboton.getBackground();
        Drawable colorBoton2 = miboton2.getBackground();
        Drawable colorBoton3 = miboton3.getBackground();
        Drawable colorBoton4 = miboton4.getBackground();
        Drawable colorBoton5 = miboton5.getBackground();
        Drawable colorBoton6 = miboton6.getBackground();
        Drawable colorBoton7 = miboton7.getBackground();
        Drawable colorBoton8 = miboton8.getBackground();
        Drawable colorBoton9 = miboton9.getBackground();
        Drawable colorBoton10 = miboton10.getBackground();
        Drawable colorBoton11 = miboton11.getBackground();
        Drawable colorBoton12 = miboton12.getBackground();
        Drawable colorBoton13 = miboton13.getBackground();
        Drawable colorBoton14 = miboton14.getBackground();
        Drawable colorBoton15 = miboton15.getBackground();
        Drawable colorBoton16 = miboton16.getBackground();
        Drawable colorBotonT = mibotonT.getBackground();

        Drawable v = view.getBackground();

        if (v.equals(colorBoton)){
            return miboton;
        }
        if (v.equals(colorBoton2)){
            return miboton2;
        }
        if (v.equals(colorBoton3)){
            return miboton3;
        }
        if (v.equals(colorBoton4)){
            return miboton4;
        }
        if (v.equals(colorBoton5)){
            return miboton5;
        }
        if (v.equals(colorBoton6)){
            return miboton6;
        }
        if (v.equals(colorBoton7)){
            return miboton7;
        }
        if (v.equals(colorBoton8)){
            return miboton8;
        }
        if (v.equals(colorBoton9)){
            return miboton9;
        }
        if (v.equals(colorBoton10)){
            return miboton10;
        }
        if (v.equals(colorBoton11)){
            return miboton11;
        }
        if (v.equals(colorBoton12)){
            return miboton12;
        }
        if (v.equals(colorBoton13)){
            return miboton13;
        }
        if (v.equals(colorBoton14)){
            return miboton14;
        }
        if (v.equals(colorBoton15)){
            return miboton15;
        }
        if (v.equals(colorBoton16)){
            return miboton16;
        }
        else{
            return mibotonT;
        }


    }

    public void llenarInicioColors(ArrayList<Integer> colors){
        this.colors.add(R.color.Amarillo);
        this.colors.add(R.color.Amarillo);
        this.colors.add(R.color.Azul);
        this.colors.add(R.color.Azul);
        this.colors.add(R.color.Naranja);
        this.colors.add(R.color.Naranja);
        this.colors.add(R.color.Rojo);
        this.colors.add(R.color.Rojo);
        this.colors.add(R.color.Verde);
        this.colors.add(R.color.Verde);
        this.colors.add(R.color.Negro);
        this.colors.add(R.color.Negro);
        this.colors.add(R.color.AguaMarina);
        this.colors.add(R.color.AguaMarina);
        this.colors.add(R.color.Morado);
        this.colors.add(R.color.Morado);

    }

    public void LLenarInicioIndices(ArrayList<Integer> indices){
        Random rand = new Random();
        for (int i = 0; i<colors.size(); i++) {
            this.indices.add(i);
        }
        Collections.shuffle(this.indices);
    }


    public void agregarColor(ArrayList<Integer> colors, Integer col){
        this.colors.add(col);
        CharSequence text = "Se agregó el color!!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(getApplicationContext(), text, duration);
        //Se muestra el mensaje
        toast.show();

    }

}

