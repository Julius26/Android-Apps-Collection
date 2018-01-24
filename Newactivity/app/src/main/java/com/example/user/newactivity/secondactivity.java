package com.example.user.newactivity;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class secondactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);
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
        if (id == R.id.call) {
            Intent id1 = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:(+254)708094568"));
            startActivity(id1);
            return true;
        }

        if (id == R.id.search) {
            Intent site = new Intent(Intent.ACTION_VIEW, Uri.parse("http//www.ccpafdrica.net"));
            startActivity(site);
            return true;
        }
        return super.onOptionsItemSelected(item);

    }
}

