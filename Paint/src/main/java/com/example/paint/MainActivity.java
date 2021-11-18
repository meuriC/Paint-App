package com.example.paint;

import static java.lang.Integer.parseInt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity  implements SensorEventListener {

    private static final int REQUEST_CODE = 2 ;
    private static  int bckGdColor ;
    private SensorManager sensorManager;
    private Sensor mLight;
    private SharedViewModel model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(android.R.id.content).setBackgroundColor(bckGdColor);

        FloatingActionButton fab = findViewById(R.id.paletteBtn);
        // Portrait Mode
        if(fab != null)
        {
            fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    View v = findViewById(R.id.fragment_palette);
                    if(v.getVisibility() == View.VISIBLE)
                        v.setVisibility(View.INVISIBLE);
                    else
                        v.setVisibility(View.VISIBLE);
                }
            });
        }


        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        mLight = sensorManager.getDefaultSensor(Sensor.TYPE_LIGHT);

    }

    public void goToSettings(View v) {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivityForResult(intent, REQUEST_CODE);
    }

    public void goToAbout(View v) {
        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);
    }
    public void goToMaps(View v) {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 2) {
            if (data != null) {

                Bundle extras = data.getExtras();
                int color = extras.getInt("BCK_COLOR");


                //int color = data.getIntExtra("BCK_COLOR", R.color.blue);
                findViewById(android.R.id.content).setBackgroundColor(color);
                bckGdColor = color;
            }
        }
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        float value = sensorEvent.values[0];

      if(value < 1 ){
          WindowManager.LayoutParams params = getWindow().getAttributes();
          params.screenBrightness = 1.0f;
          getWindow().setAttributes(params);
      }

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
    public void onResume() {
        super.onResume();
        sensorManager.registerListener(this, mLight, SensorManager.SENSOR_DELAY_NORMAL);
    }


    public void onPause() {
        super.onPause();
        sensorManager.unregisterListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        View v = findViewById(android.R.id.content).getRootView();
        switch (item.getItemId()) {
            case R.id.mnAbout:
                goToAbout(v);
                return true;
            case R.id.mnSettings:
                goToSettings(v);
                return true;
            case R.id.mnMaps:
                goToMaps(v);
                return true;
            default:
                return super.onOptionsItemSelected(item);
    }
    }
}