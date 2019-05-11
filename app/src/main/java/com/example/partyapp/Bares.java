package com.example.partyapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Bares extends AppCompatActivity {

    Context contexto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bares);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        contexto=this;

    }

    public void mostarCartas(View view) {
        new dialogo_cartas(contexto);
    }

    public void Selecccion(View view){
        switch (view.getId()){
            case R.id.Sutton:
                new dialogo_sutton(contexto);
                break;
            case R.id.Morena:
                new dialogo_morena(contexto);
                break;
            case R.id.Adicta:
                new dialogo_adicta(contexto);
                break;
            case R.id.TierraBomba:
                new dialogo_tierra(contexto);
                break;
            case R.id.Cangri:
                new dialogo_cangri(contexto);
                break;
            case R.id.Delicia:
                new dialogo_delicia(contexto);
                break;
            case R.id.Dembow:
                new dialogo_dembow(contexto);
                break;
            case R.id.Lioo:
                new dialogo_lio(contexto);
                break;
            case R.id.Vitoria:
                new dialogo_vitoria(contexto);
                break;
        }
    }

}
