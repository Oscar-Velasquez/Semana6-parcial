package com.example.multifuncion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Campant(View view){
        Intent campant = new Intent(this, cambios_de_camara.class);
        startActivity(campant);
    }

    public void Operbasic(View view){
        Intent operbasic = new Intent(this, operaciones_basicas.class);
        startActivity(operbasic);
    }

    public void ContBasic(View view){
        Intent contbasic = new Intent(this, controles_basicos.class);
        startActivity(contbasic);
    }

    public void Sensor(View view){
        Intent sensor = new Intent(this, sensores.class);
        startActivity(sensor);
    }

    public void Audiovideo(View vew){
        Intent audiovideo = new Intent(this, rep_audio_y_video.class);
        startActivity(audiovideo);
    }

}