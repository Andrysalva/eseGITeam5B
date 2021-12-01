package com.example.esegiteam5b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        String testo = "toast";
        Toast toast = Toast.makeText(context,testo, duration);
        toast.show();
    }
}