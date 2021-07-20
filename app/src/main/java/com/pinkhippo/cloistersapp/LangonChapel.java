package com.pinkhippo.cloistersapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LangonChapel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_langon_chapel);
    }

    // Zoom out function, going back to main floor [main activity]
    public void launchFirstFloor (View v) {
        Intent i = new Intent(this,MainActivity.class );
        startActivity(i);
    }
}