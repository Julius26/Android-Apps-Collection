package com.example.user.gps;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

//implementing location listener
public class MainActivity extends AppCompatActivity implements LocationListener {

    Button a;
    ProgressBar bar;
    LocationManager loc;

    double latt;
    double longt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a = (Button) findViewById(R.id.gps);
        bar = (ProgressBar) findViewById(R.id.gpspbar);
        //make progress bar disappear
        bar.setVisibility(View.GONE);

        //Location manager
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
        loc.requestLocationUpdates(LocationManager.GPS_PROVIDER, 3000, 10, this);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

         bar.setVisibility(View.VISIBLE);
            }
        });

    }

    @Override
    public void onLocationChanged(Location location) {

         latt=location.getLatitude();
         longt=location.getLongitude();
        //loading a map
        Intent map=new Intent(Intent.ACTION_VIEW, Uri.parse("geo:"+latt+","+longt+"?z=19"));
        startActivity(map);

    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(String provider) {

    }

    @Override
    public void onProviderDisabled(String provider) {

    }
}
