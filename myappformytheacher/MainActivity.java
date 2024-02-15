package com.example.myappformytheacher;

import static com.example.myappformytheacher.R.id.boton;
import static com.example.myappformytheacher.R.id.btnUno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    MediaPlayer reproductor;
    ImageButton uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,diez;
    Button Boton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uno=findViewById(R.id.btnUno);
        dos=findViewById(R.id.btnDos);
        tres=findViewById(R.id.btnTres);
        cuatro=findViewById(R.id.btnCuatro);
        cinco=findViewById(R.id.btnCinco);
        seis=findViewById(R.id.btnSeis);
        siete=findViewById(R.id.btnSiete);
        ocho=findViewById(R.id.btnOcho);
        nueve=findViewById(R.id.btnNueve);
        diez=findViewById(R.id.btnDiez);
        Boton=findViewById(R.id.boton);


        Boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, EnglishActivity.class);

                startActivity(intent);
            }
        });


        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reproductor=MediaPlayer.create(MainActivity.this,R.raw.uno);
                if (reproductor.isPlaying()){
                    reproductor.pause();
                }else {
                    reproductor.start();
                }

            }
        });

        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reproductor=MediaPlayer.create(MainActivity.this,R.raw.dos);
                if (reproductor.isPlaying()){
                    reproductor.pause();
                }else {
                    reproductor.start();
                }

            }
        });

        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reproductor=MediaPlayer.create(MainActivity.this,R.raw.tres);
                if (reproductor.isPlaying()){
                    reproductor.pause();
                }else {
                    reproductor.start();
                }

            }
        });

        cuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reproductor=MediaPlayer.create(MainActivity.this,R.raw.cuatro);
                if (reproductor.isPlaying()){
                    reproductor.pause();
                }else {
                    reproductor.start();
                }

            }
        });

        cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reproductor=MediaPlayer.create(MainActivity.this,R.raw.cinco);
                if (reproductor.isPlaying()){
                    reproductor.pause();
                }else {
                    reproductor.start();
                }

            }
        });

        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reproductor=MediaPlayer.create(MainActivity.this,R.raw.uno);
                if (reproductor.isPlaying()){
                    reproductor.pause();
                }else {
                    reproductor.start();
                }

            }
        });

        seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reproductor=MediaPlayer.create(MainActivity.this,R.raw.seis);
                if (reproductor.isPlaying()){
                    reproductor.pause();
                }else {
                    reproductor.start();
                }

            }
        });

        siete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reproductor=MediaPlayer.create(MainActivity.this,R.raw.siete);
                if (reproductor.isPlaying()){
                    reproductor.pause();
                }else {
                    reproductor.start();
                }

            }
        });

        ocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reproductor=MediaPlayer.create(MainActivity.this,R.raw.ocho);
                if (reproductor.isPlaying()){
                    reproductor.pause();
                }else {
                    reproductor.start();
                }

            }
        });

        nueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reproductor=MediaPlayer.create(MainActivity.this,R.raw.nueve);
                if (reproductor.isPlaying()){
                    reproductor.pause();
                }else {
                    reproductor.start();
                }

            }
        });

        diez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reproductor=MediaPlayer.create(MainActivity.this,R.raw.diez);
                if (reproductor.isPlaying()){
                    reproductor.pause();
                }else {
                    reproductor.start();
                }

            }
        });



    }
}