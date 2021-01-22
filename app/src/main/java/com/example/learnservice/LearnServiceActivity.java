package com.example.learnservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class LearnServiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void startService(View view) {
        startService(new Intent(getBaseContext(), TheService.class));
    }

    public void stopService(View view) {
        stopService(new Intent(getBaseContext(), TheService.class));
    }


}