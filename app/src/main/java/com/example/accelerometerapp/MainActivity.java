package com.example.accelerometerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    Button acclerometer, proximity, lightSensor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        acclerometer = (Button) findViewById(R.id.button_acclerometer);
        proximity = (Button) findViewById(R.id.button_proximity);
        lightSensor = (Button) findViewById(R.id.button_lightSensor);
        acclerometer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, AcclerometerActivity.class);
                startActivity(intent);

            }
        });

 proximity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, ProximityActivity.class);
                startActivity(intent);

            }
        });

lightSensor.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, LightSensorActivity.class);
        startActivity(intent);
    }
});


    }

   }