package com.javeriana.fapp.firstapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;



public class MainActivity extends Activity {

    private static final String TAG = "La Aplicacion";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.v(TAG, "Creo");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    protected void onResume() {
        Log.v(TAG, "Resumio");
        super.onResume();
    }

    @Override
    protected void onStart() {
        Log.v(TAG, "Empezo");
        super.onStart();
    }

    @Override
    protected void onPause() {
        Log.v(TAG, "Pauso");
        super.onPause();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void MiMetodo(MenuItem item) {
        CharSequence text = "Hola";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(getApplicationContext(), text, duration);
        //Se muestra el mensaje
        toast.show();
    }

    public void OpenBrowser(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
        startActivity(browserIntent);
    }

    public void OpenActivity(View view) {
        Intent intent = new Intent(this, MainConcentrationGame.class);
        startActivity(intent);
    }

    public void Tomarid(View view){
        final ImageView hola = (ImageView)findViewById(R.id.imageView1);
        hola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CharSequence text = "Funciona!!";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(getApplicationContext(), text, duration);
                //Se muestra el mensaje
                toast.show();
            }
        });
    }
}

