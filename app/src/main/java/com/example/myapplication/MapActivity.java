package com.example.myapplication;

import android.os.Bundle;
import android.app.Activity;

import com.yandex.mapkit.Animation;
import com.yandex.mapkit.MapKitFactory;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.mapview.MapView;

public class MapActivity extends Activity {


    private MapView mapView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        MapKitFactory.setApiKey("ec9c5eca-4299-48f6-9ab1-12aaeeb7cbfd");

        MapKitFactory.initialize(this);

        setContentView(R.layout.map);
        super.onCreate(savedInstanceState);
        mapView = (MapView)findViewById(R.id.mapview);




        mapView.getMap().move(
                new CameraPosition(new Point(55.751574, 37.573856), 11.0f, 0.0f, 0.0f),
                new Animation(Animation.Type.SMOOTH, 5),
                null);
    }
//
//    @Override
//    protected void onStop() {
//
//        mapView.onStop();
//        MapKitFactory.getInstance().onStop();
//        super.onStop();
//    }

    @Override
    protected void onStart() {

        super.onStart();
        MapKitFactory.getInstance().onStart();
        mapView.onStart();
    }
}
