package com.example.user.referralhospital;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class Hospitallocation extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospitallocation);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng nairobi= new LatLng(-1.261631, 36.824348);
        mMap.addMarker(new MarkerOptions().position(nairobi).title("Nairobi branch Aghakhan hospital"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(nairobi));

        LatLng mombasa= new LatLng(-4.070143, 39.670459);
        mMap.addMarker(new MarkerOptions().position(mombasa).title("Mombasa branch Aghakhan hospital"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(mombasa));

        LatLng kisumu= new LatLng(-0.098439, 34.756297);
        mMap.addMarker(new MarkerOptions().position(kisumu).title("Kisumu branch Aghakhan hospital"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kisumu));
        
        mMap.animateCamera(CameraUpdateFactory.zoomTo(5.0f));


        mMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {
            @Override
            public void onInfoWindowClick(Marker marker) {

                if (marker.getTitle().toString().contains("nairobi")){
                    //do what you want to do
                }
                else if (marker.getTitle().toString().contains("mombasa")){
                    //
                }
                else if (marker.getTitle().toString().contains("kisumu")){
                    //
                }

            }
        });
    }
}
