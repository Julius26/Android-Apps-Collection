package com.example.user.newactivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
     Button a,b,c,d,e;
        a=(Button)findViewById(R.id.btnfacebook);
        b=(Button)findViewById(R.id.btncall);
        c=(Button)findViewById(R.id.btnmap);
        d=(Button)findViewById(R.id.btncamera);
        e=(Button)findViewById(R.id.btnphonebook);


        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent facebook=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/julius.mutunga.71"));
                startActivity(facebook);
            }
        });


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent call=new Intent(Intent.ACTION_DIAL,Uri.parse("tel:(+254)708094353"));
                startActivity(call);
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //z=19 this is the zooming level
                Intent map=new Intent(Intent.ACTION_VIEW,Uri.parse("geo:50.123,7.121 q=query"));
                startActivity(map);
            }
        });

        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent camera=new Intent("android.media.action.IMAGE_CAPTURE");
                startActivity(camera);
            }
        });

        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent phonebook=new Intent(Intent.ACTION_VIEW,Uri.parse("content://contacts/people"));
                startActivity(phonebook);
            }
        });
        //floating button action
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //launching toolkit
                Intent toolkit=new Intent(getPackageManager().getLaunchIntentForPackage("com.android.stk"));
                startActivity(toolkit);
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
