package com.example.multifuncion;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_determinar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_determinar);


        final EditText eNombre = (EditText) findViewById(R.id.etNombre);
        final EditText eEdad = (EditText) findViewById(R.id.etEdad);
        Button bEnviar = (Button) findViewById(R.id.btEnviarDatos);
        bEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = eNombre.getText().toString();
                String edad = eEdad.getText().toString();
                Bundle pasarDatos = new Bundle();
                pasarDatos.putString("pNombre", nombre);
                pasarDatos.putString("pEdad", edad);
                Intent siga = new
                        Intent(MainActivity_determinar.this,MainActivity_determinar2.class);
                siga.putExtras(pasarDatos);
                startActivity(siga);

            }
        });

    }
    public void Atras3(View view) {
        Intent Atras = new Intent(this, operaciones_basicas.class);
        startActivity(Atras);
    }

}
