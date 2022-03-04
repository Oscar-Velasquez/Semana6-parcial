package com.example.multifuncion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class cambios_de_pantalla extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cambios_de_pantalla);
    }
    public void Atras(View view) {
        Intent Atras = new Intent(this, MainActivity.class);
        startActivity(Atras);
    }
}