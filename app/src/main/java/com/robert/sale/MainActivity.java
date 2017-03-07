package com.robert.sale;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import lal.adhish.gifprogressbar.GifView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GifView pGif = (GifView) findViewById(R.id.progressBar);
        pGif.setImageResource(R.drawable.sale);
    }
}
