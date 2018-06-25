package com.example.hackdavis2017;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.View;
import android.content.*;

import java.io.IOException;

public class PlayMedia extends AppCompatActivity {

    private Button play;
    private Button pause;
    private Button stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_media);


        ImageButton play = (ImageButton) findViewById(R.id.play);
        ImageButton pause = (ImageButton) findViewById(R.id.pause);
        ImageButton stop = (ImageButton) findViewById(R.id.stop);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.audio_1);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mediaPlayer.start();
            }
        });

        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mediaPlayer.pause();
            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    mediaPlayer.stop();
                    mediaPlayer.reset();
            }

        });


    }
}
