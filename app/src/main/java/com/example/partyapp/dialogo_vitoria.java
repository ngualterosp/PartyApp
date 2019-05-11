package com.example.partyapp;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import android.widget.Button;
public class dialogo_vitoria {

    public dialogo_vitoria(Context contexto)
    {
        final Dialog dialogo = new Dialog(contexto);
        dialogo.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialogo.setCancelable(true);
        dialogo.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        dialogo.setContentView(R.layout.dialogo_vitoria);
        dialogo.show();

    }

}
