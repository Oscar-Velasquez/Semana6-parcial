package com.example.multifuncion;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

public class acerca_de extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca_de);
    }

    public void acercadenosotros(View view) {
        Intent acercadenosotros = new Intent(this, acerca_de_nosotros.class);
        startActivity(acercadenosotros);
    }
}