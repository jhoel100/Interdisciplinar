package com.example.registrocontrol;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BuscarDocente extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar_docente);
    }
    public  void CRetroceder(View view) {
        Intent cambiar = new Intent(this, ModificarDocente.class);
        startActivity(cambiar);
    }
    public  void CModificarD(View view) {
        Intent cambiar = new Intent(this, Otros.class);
        startActivity(cambiar);
    }
}