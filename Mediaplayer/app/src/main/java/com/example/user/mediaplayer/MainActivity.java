package com.example.user.mediaplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button a,b;
    MediaPlayer m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a=(Button)findViewById(R.id.button);
        b=(Button)findViewById(R.id.button2);

       a.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               m= MediaPlayer.create(getApplicationContext(),R.raw.glowup);
               m.start();
           }
       });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m.stop();
            }
        });

    }
}
