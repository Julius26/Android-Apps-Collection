package com.example.user.emobillis;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //loading time
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent home= new Intent(MainActivity.this,home.class);
                startActivity(home);
                finish();
            }
        }, 3000);
    }
}
