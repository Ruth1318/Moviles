package com.example.myappformytheacher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class EnglishActivity extends AppCompatActivity {

    MediaPlayer reproductor;
    ImageButton uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,diez;
    Button Boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);



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





        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reproductor=MediaPlayer.create(EnglishActivity.this,R.raw.one);
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
                reproductor=MediaPlayer.create(EnglishActivity.this,R.raw.two);
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
                reproductor=MediaPlayer.create(EnglishActivity.this,R.raw.three);
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
                reproductor=MediaPlayer.create(EnglishActivity.this,R.raw.four);
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
                reproductor=MediaPlayer.create(EnglishActivity.this,R.raw.five);
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
                reproductor=MediaPlayer.create(EnglishActivity.this,R.raw.six);
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
                reproductor=MediaPlayer.create(EnglishActivity.this,R.raw.seven);
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
                reproductor=MediaPlayer.create(EnglishActivity.this,R.raw.eight);
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
                reproductor=MediaPlayer.create(EnglishActivity.this,R.raw.nine);
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
                reproductor=MediaPlayer.create(EnglishActivity.this,R.raw.ten);
                if (reproductor.isPlaying()){
                    reproductor.pause();
                }else {
                    reproductor.start();
                }

            }
        });

    }
}