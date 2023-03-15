package com.example.privatetransportservice;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Map extends FragmentActivity implements OnMapReadyCallback {

    GoogleMap map;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        SupportMapFragment supportMapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        supportMapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        map = googleMap;
        LatLng maharashtra = new LatLng(19.168257, 73.341601);
        map.addMarker (new MarkerOptions().position(maharashtra).title("Maharashtra"));
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(maharashtra,4));
        map.addCircle(new CircleOptions().center(new LatLng(19.168257, 73.341601)).radius(100).strokeColor(Color.RED).fillColor(Color.BLUE));
        map.animateCamera(CameraUpdateFactory.newLatLng(maharashtra));
        map.setBuildingsEnabled(true);
        map.getUiSettings().setMapToolbarEnabled(true);
        map.getUiSettings().setZoomControlsEnabled(true);
    }
}