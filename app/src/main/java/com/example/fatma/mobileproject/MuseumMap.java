package com.example.fatma.mobileproject;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import static com.google.android.gms.maps.model.BitmapDescriptorFactory.*;

public class MuseumMap extends FragmentActivity implements OnMapReadyCallback, GoogleMap.OnMarkerClickListener {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museum_map);
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

        //set icon height width
        int height = 60;
        int width = 60;

        BitmapDrawable bitdraw = (BitmapDrawable)getResources().getDrawable(R.drawable.me);
        Bitmap b = bitdraw.getBitmap();
        Bitmap smallmarker = Bitmap.createScaledBitmap(b,width,height,false);
        LatLng myLoc = new LatLng(38.373968, 27.192315);


        //Adding museum marker
        MarkerOptions marker = new MarkerOptions().position(new LatLng(38.413661, 27.1284484)).title("Museum");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.m1));
        googleMap.addMarker(marker);



        mMap.addMarker(new MarkerOptions().position(myLoc).title("my Location").draggable(true).icon(fromBitmap(smallmarker)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(myLoc));

        googleMap.setOnMarkerClickListener(this);




    }
    @Override
    public boolean onMarkerClick(final Marker marker) {

        if (marker.equals(marker)) {
            Intent i = new Intent(this, MobileProje.class);
            startActivity(i);
            return true;
        }
        else{
            return false;
        }
    }



}
