package com.example.esegiteam5b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String t="Daniele Pandolfoooo"
        Toast to = Toast.makeText(getApplicationContext(), t, Toast.LENGTH_SHORT);
        to.show();
    }
}