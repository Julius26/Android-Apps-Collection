package com.example.user.healthyfamilies;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class Splashscreen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        //start of handler
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //start of main activity
                Intent load=new Intent(Splashscreen.this,MainActivity.class);
                startActivity(load);
                finish();
            }
            //loading time is 3secs
        },3000);
    }
}
