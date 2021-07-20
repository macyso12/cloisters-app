package com.pinkhippo.cloistersapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RomanesqueHall extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_romanesque_hall);
    }

    // Zoom out function -> go back to main floor/ ground floor
    public void launchFirstFloor (View v) {
        Intent i = new Intent(this,MainActivity.class );
        startActivity(i);
    }
}