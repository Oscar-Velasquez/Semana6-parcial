package com.example.multifuncion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class operaciones_basicas extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operaciones_basicas);


        final EditText tNombre = (EditText) this.findViewById(R.id.etNombre);
        final EditText tApellido = (EditText) this.findViewById(R.id.etApellido);
        Button bDatos = (Button) this.findViewById(R.id.btEnviarDatos);

        bDatos.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {

                String nom = tNombre.getText().toString();
                String ape = tApellido.getText().toString();

                Toast.makeText(getApplicationContext(), "Tu nombre es: " + nom + " " + ape, Toast.LENGTH_LONG).show();
            }

        });
    }

    public void Siguiente(View view) {
        Intent siguiente = new Intent(this, MainActivity_determinar.class);
        startActivity(siguiente);
    }
    public void Atras2(View view) {
        Intent Atras = new Intent(this, MainActivity.class);
        startActivity(Atras);
    }
  
}