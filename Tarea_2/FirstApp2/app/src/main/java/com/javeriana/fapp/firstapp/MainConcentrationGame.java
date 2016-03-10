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

public class MainConcentrationGame extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_concentration_game);
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void Abrir5(View view) {
        Intent intent = new Intent(this, fivexfive.class);
        startActivity(intent);
    }

}
