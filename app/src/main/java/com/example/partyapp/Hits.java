package com.example.partyapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Hits extends AppCompatActivity {

    Button play_pause, btn_repetir;
    MediaPlayer mp;
    ImageView iv;
    TextView tv_titulo, tv_artista;
    int repetir = 2, posicion = 0;

    MediaPlayer vectormp [] = new MediaPlayer[9];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hits);

        play_pause = (Button) findViewById(R.id.btn_play);
        btn_repetir = (Button) findViewById(R.id.btn_repetir);
        iv = (ImageView) findViewById(R.id.img_hits);
        tv_titulo = (TextView) findViewById(R.id.tv_titulo);
        tv_artista = (TextView) findViewById(R.id.tv_artista);

        vectormp[0] = MediaPlayer.create(this, R.raw.otrotrago);
        vectormp[1] = MediaPlayer.create(this, R.raw.verteir);
        vectormp[2] = MediaPlayer.create(this, R.raw.quemaspues);
        vectormp[3] = MediaPlayer.create(this, R.raw.terobare);
        vectormp[4] = MediaPlayer.create(this, R.raw.destino);
        vectormp[5] = MediaPlayer.create(this, R.raw.concalma);
        vectormp[6] = MediaPlayer.create(this, R.raw.solita);
        vectormp[7] = MediaPlayer.create(this, R.raw.hp);
        vectormp[8] = MediaPlayer.create(this, R.raw.siseda);




        tv_titulo.setText("Sech ft Darell");
        tv_artista.setText("Otro Trago");

    }

    public void PlayPause(View view){
        if(vectormp[posicion].isPlaying()){
            vectormp[posicion].pause();
            play_pause.setBackgroundResource(R.drawable.reproducir);
            Toast.makeText(this, "Pausa", Toast.LENGTH_SHORT).show();
        }else{
            vectormp[posicion].start();
            play_pause.setBackgroundResource(R.drawable.pausa);
            Toast.makeText(this, "Play", Toast.LENGTH_SHORT).show();
        }
    }

    public void Stop(View view){
        if(vectormp[posicion] != null){
            vectormp[posicion].stop();

            vectormp[0] = MediaPlayer.create(this, R.raw.otrotrago);
            vectormp[1] = MediaPlayer.create(this, R.raw.verteir);
            vectormp[2] = MediaPlayer.create(this, R.raw.quemaspues);
            vectormp[3] = MediaPlayer.create(this, R.raw.terobare);
            vectormp[4] = MediaPlayer.create(this, R.raw.destino);
            vectormp[5] = MediaPlayer.create(this, R.raw.concalma);
            vectormp[6] = MediaPlayer.create(this, R.raw.solita);
            vectormp[7] = MediaPlayer.create(this, R.raw.hp);
            vectormp[8] = MediaPlayer.create(this, R.raw.siseda);

            posicion = 0;
            play_pause.setBackgroundResource(R.drawable.reproducir);
            iv.setImageResource(R.drawable.portada1);
            Toast.makeText(this, "Stop", Toast.LENGTH_SHORT).show();
        }
    }

    public void Repetir (View view){
        if(repetir == 1){
            btn_repetir.setBackgroundResource(R.drawable.no_repetir);
            Toast.makeText(this, "No repetir", Toast.LENGTH_SHORT).show();
            vectormp[posicion].setLooping(false);
            repetir = 2;
        }else{
            btn_repetir.setBackgroundResource(R.drawable.repetir);
            Toast.makeText(this, "Repetir", Toast.LENGTH_SHORT).show();
            vectormp[posicion].setLooping(true);
            repetir = 1;
        }
    }

    public void Siguiente (View view){
        if(posicion < vectormp.length-1){
            if(vectormp[posicion].isPlaying()){
                vectormp[posicion].stop();
                posicion++;
                vectormp[posicion].start();

                if(posicion == 0){
                    iv.setImageResource(R.drawable.portada1);
                    tv_titulo.setText("Otro trago");
                    tv_artista.setText("Sech ft Darell");
                }else if(posicion == 1){
                    iv.setImageResource(R.drawable.portada2);
                   tv_titulo.setText("Verte ir");
                   tv_artista.setText("Dj Luian x Anuel Aa x Nicky Jam x Brytiago");
                }else if(posicion == 2){
                    iv.setImageResource(R.drawable.portada3);
                   tv_titulo.setText("Que mas Pues");
                   tv_artista.setText("Sech");
                }else if(posicion == 3){
                    iv.setImageResource(R.drawable.portada5);
                    tv_titulo.setText("Te Robaré");
                    tv_artista.setText("Ozuna ft Nicky Jam");
                }else if(posicion == 4){
                    iv.setImageResource(R.drawable.portada6);
                    tv_titulo.setText("Destino");
                    tv_artista.setText("Greeicy ft Nacho");
                }else if(posicion == 5){
                    iv.setImageResource(R.drawable.portada7);
                    tv_titulo.setText("Con Calma");
                    tv_artista.setText("Daddy Yankee");
                }else if(posicion == 6){
                    iv.setImageResource(R.drawable.portada8);
                    tv_titulo.setText("Solita");
                    tv_artista.setText("Sech ft Farruko, Zion y Lennox");
                }else if(posicion == 7){
                    iv.setImageResource(R.drawable.portada9);
                    tv_titulo.setText("HP");
                    tv_artista.setText("Maluma");
                }else if(posicion == 8){
                    iv.setImageResource(R.drawable.portada10);
                    tv_titulo.setText("Si Se Da");
                    tv_artista.setText("Myke Towers & Farruko");
                }

            }else{
                posicion++;

                if(posicion == 0){
                    iv.setImageResource(R.drawable.portada1);
                    tv_titulo.setText("Otro trago");
                    tv_artista.setText("Sech ft Darell");
                }else if(posicion == 1){
                    iv.setImageResource(R.drawable.portada2);
                    tv_titulo.setText("Verte ir");
                    tv_artista.setText("Dj Luian x Anuel Aa x Nicky Jam x Brytiago");
                }else if(posicion == 2){
                    iv.setImageResource(R.drawable.portada3);
                    tv_titulo.setText("Que mas Pues");
                    tv_artista.setText("Sech");
                }else if(posicion == 3){
                    iv.setImageResource(R.drawable.portada5);
                    tv_titulo.setText("Te Robaré");
                    tv_artista.setText("Ozuna ft Nicky Jam");
                }else if(posicion == 4){
                    iv.setImageResource(R.drawable.portada6);
                    tv_titulo.setText("Destino");
                    tv_artista.setText("Greeicy ft Nacho");
                }else if(posicion == 5){
                    iv.setImageResource(R.drawable.portada7);
                    tv_titulo.setText("Con Calma");
                    tv_artista.setText("Daddy Yankee");
                }else if(posicion == 6){
                    iv.setImageResource(R.drawable.portada8);
                    tv_titulo.setText("Solita");
                    tv_artista.setText("Sech ft Farruko, Zion y Lennox");
                }else if(posicion == 7){
                    iv.setImageResource(R.drawable.portada9);
                    tv_titulo.setText("HP");
                    tv_artista.setText("Maluma");
                }else if(posicion == 8){
                    iv.setImageResource(R.drawable.portada10);
                    tv_titulo.setText("Si Se Da");
                    tv_artista.setText("Myke Towers & Farruko");
                }

            }
        }else{
            Toast.makeText(this, "No hay mas canciones", Toast.LENGTH_SHORT).show();
        }
    }

    public void Anterior(View view){
        if(posicion >= 1){
            if(vectormp[posicion].isPlaying()){
                vectormp[posicion].stop();
                vectormp[0] = MediaPlayer.create(this, R.raw.otrotrago);
                vectormp[1] = MediaPlayer.create(this, R.raw.verteir);
                vectormp[2] = MediaPlayer.create(this, R.raw.quemaspues);
                vectormp[3] = MediaPlayer.create(this, R.raw.terobare);
                vectormp[4] = MediaPlayer.create(this, R.raw.destino);
                vectormp[5] = MediaPlayer.create(this, R.raw.concalma);
                vectormp[6] = MediaPlayer.create(this, R.raw.solita);
                vectormp[7] = MediaPlayer.create(this, R.raw.hp);
                vectormp[8] = MediaPlayer.create(this, R.raw.siseda);

                posicion--;

                if(posicion == 0){
                    iv.setImageResource(R.drawable.portada1);
                    tv_titulo.setText("Otro trago");
                    tv_artista.setText("Sech ft Darell");
                }else if(posicion == 1){
                    iv.setImageResource(R.drawable.portada2);
                    tv_titulo.setText("Verte ir");
                    tv_artista.setText("Dj Luian x Anuel Aa x Nicky Jam x Brytiago");
                }else if(posicion == 2){
                    iv.setImageResource(R.drawable.portada3);
                    tv_titulo.setText("Que mas Pues");
                    tv_artista.setText("Sech");
                }else if(posicion == 3){
                    iv.setImageResource(R.drawable.portada5);
                    tv_titulo.setText("Te Robaré");
                    tv_artista.setText("Ozuna ft Nicky Jam");
                }else if(posicion == 4){
                    iv.setImageResource(R.drawable.portada6);
                    tv_titulo.setText("Destino");
                    tv_artista.setText("Greeicy ft Nacho");
                }else if(posicion == 5){
                    iv.setImageResource(R.drawable.portada7);
                    tv_titulo.setText("Con Calma");
                    tv_artista.setText("Daddy Yankee");
                }else if(posicion == 6){
                    iv.setImageResource(R.drawable.portada8);
                    tv_titulo.setText("Solita");
                    tv_artista.setText("Sech ft Farruko, Zion y Lennox");
                }else if(posicion == 7){
                    iv.setImageResource(R.drawable.portada9);
                    tv_titulo.setText("HP");
                    tv_artista.setText("Maluma");
                }else if(posicion == 8){
                    iv.setImageResource(R.drawable.portada10);
                    tv_titulo.setText("Si Se Da");
                    tv_artista.setText("Myke Towers & Farruko");
                }

                vectormp[posicion].start();
            }else{
                posicion--;

                if(posicion == 0){
                    iv.setImageResource(R.drawable.portada1);
                    tv_titulo.setText("Otro trago");
                    tv_artista.setText("Sech ft Darell");
                }else if(posicion == 1){
                    iv.setImageResource(R.drawable.portada2);
                    tv_titulo.setText("Verte ir");
                    tv_artista.setText("Dj Luian x Anuel Aa x Nicky Jam x Brytiago");
                }else if(posicion == 2){
                    iv.setImageResource(R.drawable.portada3);
                    tv_titulo.setText("Que mas Pues");
                    tv_artista.setText("Sech");
                }else if(posicion == 3){
                    iv.setImageResource(R.drawable.portada5);
                    tv_titulo.setText("Te Robaré");
                    tv_artista.setText("Ozuna ft Nicky Jam");
                }else if(posicion == 4){
                    iv.setImageResource(R.drawable.portada6);
                    tv_titulo.setText("Destino");
                    tv_artista.setText("Greeicy ft Nacho");
                }else if(posicion == 5){
                    iv.setImageResource(R.drawable.portada7);
                    tv_titulo.setText("Con Calma");
                    tv_artista.setText("Daddy Yankee");
                }else if(posicion == 6){
                    iv.setImageResource(R.drawable.portada8);
                    tv_titulo.setText("Solita");
                    tv_artista.setText("Sech ft Farruko, Zion y Lennox");
                }else if(posicion == 7){
                    iv.setImageResource(R.drawable.portada9);
                    tv_titulo.setText("HP");
                    tv_artista.setText("Maluma");
                }else if(posicion == 8){
                    iv.setImageResource(R.drawable.portada10);
                    tv_titulo.setText("Si Se Da");
                    tv_artista.setText("Myke Towers & Farruko");
                }

            }
        }else{
            Toast.makeText(this, "No hay mas canciones", Toast.LENGTH_SHORT).show();
        }
    }
}
