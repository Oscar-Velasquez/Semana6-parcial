package com.example.multifuncion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class acerca_de_nosotros extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca_de_nosotros);
    }
    public void Atras9(View view) {
        Intent Atras = new Intent(this, acerca_de.class);
        startActivity(Atras);
    }
}