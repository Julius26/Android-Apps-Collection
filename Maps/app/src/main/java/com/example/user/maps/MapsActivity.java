package com.example.user.maps;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
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

        mMap.animateCamera(CameraUpdateFactory.zoomTo(15.0f));

        // Add a marker in Sydney and move the camera
        LatLng nairobi = new LatLng(1.02921, 36.8219);
        mMap.addMarker(new MarkerOptions().position(nairobi).title("Nairobi"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(nairobi));

        LatLng mombasa = new LatLng(4.0435, 36.6669);
        mMap.addMarker(new MarkerOptions().position(mombasa).title("Mombasa"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(mombasa));


        LatLng kisumu = new LatLng(0.538, 34.536);
        mMap.addMarker(new MarkerOptions().position(kisumu).title("Kisumu"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kisumu));


        LatLng makueni = new LatLng(0.2827, 151);
        mMap.addMarker(new MarkerOptions().position(makueni).title("Makueni"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(makueni));


        LatLng embu = new LatLng(0.1457, 34.1547);
        mMap.addMarker(new MarkerOptions().position(embu).title("Embu"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(embu));


        LatLng machakos = new LatLng(0.4532, 39.6461);
        mMap.addMarker(new MarkerOptions().position(machakos).title("Machakos"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(machakos));

        LatLng transnzoia = new LatLng(0.1123, 36.1785);
        mMap.addMarker(new MarkerOptions().position(transnzoia).title("Transzoia"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(transnzoia));

        LatLng tharakanithi = new LatLng(1.1245, 37.2594);
        mMap.addMarker(new MarkerOptions().position(tharakanithi).title("Tharakanithi"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(tharakanithi));


        mMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {
            @Override
            public void onInfoWindowClick(Marker marker) {
                if (marker.getTitle().contains("Nairobi")){
                    //
                }
                else if (marker.getTitle().contains("Mombasa")){
                    //
                }
                else if (marker.getTitle().contains("Transnzoia")){
                    //
                }
                else if (marker.getTitle().contains("Tharakanithi")){
                    //
                }
                else if (marker.getTitle().contains("Kisumu")){
                    //
                }
                else if (marker.getTitle().contains("Makueni")){
                    //
                }
                else if (marker.getTitle().contains("Embu")){
                    //
                }
            }
        });
    }
}
