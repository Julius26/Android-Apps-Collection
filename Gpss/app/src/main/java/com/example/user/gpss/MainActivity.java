package com.example.user.gpss;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    //declare buttons
    Button gps;
    ProgressBar bar;
    LocationManager loc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find your buttons
        gps = (Button) findViewById(R.id.gps);
        bar = (ProgressBar) findViewById(R.id.progressBar);
        //make progress bar disappear
        bar.setVisibility(View.GONE);

        loc = (LocationManager) getSystemService(Context.LOCATION_SERVICE);


        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        loc.requestLocationUpdates(LocationManager.GPS_PROVIDER, 3000, 10, (LocationListener) this);

        //set onclick listener to the gps button
        gps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //make progress bar visible
                bar.setVisibility(View.VISIBLE);

            }
        });


    }
}
