package com.example.registrocontrol;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Otros extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otros);
    }

    public  void CBuscarDocente(View view) {
        Intent cambiar = new Intent(this, BuscarDocente.class);
        startActivity(cambiar);
    }


}