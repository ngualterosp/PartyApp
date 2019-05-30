package com.example.partyapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Eventos extends AppCompatActivity {
    Context contexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eventos);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        contexto=this;
    }

    public void mostarCartas(View view) {
        new dialogo_cartas(contexto);
    }

    public void Selecccion(View view){
        switch (view.getId()){
            case R.id.e1:
                new dialogo_evento1(contexto);
                break;
            case R.id.e2:
                new dialogo_evento2(contexto);
                break;
            case R.id.e3:
                new dialogo_evento3(contexto);
                break;
            case R.id.e4:
                new dialogo_evento4(contexto);
                break;


        }
    }
}
