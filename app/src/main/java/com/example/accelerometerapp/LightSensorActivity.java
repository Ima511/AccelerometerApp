package com.example.accelerometerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.TokenWatcher;
import android.widget.TextView;
import android.widget.Toast;

public class LightSensorActivity extends AppCompatActivity implements SensorEventListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_light_sensor);

        SensorManager sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);

        if (sensorManager != null){

            Sensor lightSensor = sensorManager.getDefaultSensor(Sensor.TYPE_LIGHT);

            if (lightSensor != null ){

                sensorManager.registerListener(this, lightSensor,SensorManager.SENSOR_DELAY_NORMAL);

            }else{

                Toast.makeText(this, "Light Sensor is damaged" , Toast.LENGTH_SHORT).show();
            }

        }else{
            Toast.makeText(this, "Light sensor not found", Toast.LENGTH_SHORT).show();
        }


    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {

        if(sensorEvent.sensor.getType() == Sensor.TYPE_LIGHT){

            ((TextView) findViewById(R.id.text_lightSensorValue)).setText( "Value: " +sensorEvent.values[0]);
        }

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}