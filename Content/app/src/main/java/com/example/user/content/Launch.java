package com.example.user.content;

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

public class Launch extends AppCompatActivity {
   Button a,b,c,d,e;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);

        a=(Button)findViewById(R.id.btnfacebook);
        b=(Button)findViewById(R.id.btncall);
        c=(Button)findViewById(R.id.btnmap);
        d=(Button)findViewById(R.id.btncamera);
        e=(Button)findViewById(R.id.btncontacts);

    a.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent j=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com/"));
            startActivity(j);
        }
    });

    b.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        Intent k=new Intent(Intent.ACTION_DIAL,Uri.parse("tel:(+254)708094353"));
            startActivity(k);
        }
    });


    c.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //z=19 default zooming level
          Intent s=new Intent(Intent.ACTION_VIEW,Uri.parse("geo:50.123,7.1434?q=query"));
            startActivity(s);
        }
    });

    d.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
     Intent c=new Intent("android.media.action.IMAGE_CAPTURE");
            startActivityForResult(c,0);
        }
    });


    e.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent phone=new Intent(Intent.ACTION_VIEW,Uri.parse("content://contacts/people"));
            startActivity(phone);
        }
    });

//


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //added today for launching app
                Intent kkk=new Intent(Launch.this,secondactivity.class);
                startActivity(kkk);
                //adding a toolkit
                Intent toolkit=getPackageManager().getLaunchIntentForPackage("com.android.stk");
                startActivity(toolkit);

                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_launch, menu);
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
