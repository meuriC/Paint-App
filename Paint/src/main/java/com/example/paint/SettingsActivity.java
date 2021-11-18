package com.example.paint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);


        Button btnBlue, btnYellow;

        // set button 1 with its id
        btnBlue = findViewById(R.id.btBlue);
        btnYellow = findViewById(R.id.btYellow);



        // onClick function for button 1
        btnBlue.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        Intent intent = new Intent(SettingsActivity.this, MainActivity.class);
                intent.putExtra("BCK_COLOR", Color.BLUE);
                setResult(2, intent);
                finish();
            }
        });

        // onClick function for button 1
        btnYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SettingsActivity.this, MainActivity.class);
                intent.putExtra("BCK_COLOR",String.valueOf(R.color.yellow));
                setResult(2, intent);
                finish();
            }
        });

    }
}