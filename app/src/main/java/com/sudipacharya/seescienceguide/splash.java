package com.sudipacharya.seescienceguide;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class splash extends AppCompatActivity {
    private final int splashtime = 4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent main = new Intent(splash.this, MainActivity.class);
                splash.this.startActivity(main);
                splash.this.finish();
            }

        }, splashtime);

    }
}
