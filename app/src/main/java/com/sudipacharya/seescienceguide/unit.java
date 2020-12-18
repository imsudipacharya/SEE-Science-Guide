package com.sudipacharya.seescienceguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.InterstitialAd;

public class unit extends AppCompatActivity {

    private String dlink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        Intent intent  = getIntent();
        String interstitalAds = intent.getExtras().getString("ads");
        AudienceNetworkAds.initialize(this);
        InterstitialAd mInterstitialAd = new InterstitialAd(this, interstitalAds);
        mInterstitialAd.loadAd();
        if (mInterstitialAd.isAdLoaded()){
            mInterstitialAd.show();
        }

        chapter0n();


    }


    public void chapter0n(){

        dlink = "https://lh3.googleusercontent.com/ZwInf1KGl80KLlJE-kxKuKau9ISjg4VCZcj1ieyuoYS4HOrKXfMil9K0Dx_8-9ySfH7M7ZkI5tyNYdQenBDtQG8IKyB8J8GHdGiYeRyZxmZsTE-RAne9rcM_FIbDejWRTMgeSXwvyA=w1920-h1080";   glidee();


        Button prev1 = findViewById(R.id.prev1);
        prev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter14n();
            }
        });

        Button next1 = findViewById(R.id.next1);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter1n();
            }
        });

    }





    public void chapter1n(){

        dlink = "https://lh3.googleusercontent.com/j23m8NwFJE7VIM1QJarGyauxb28R9TomC3zD8461yyUlYVs6b79dp7EvpsKry3PE5Xl1oIqXKJgDaN0gHAdGY7QXMZRnmQpXkiON4OUAzZ6YgkOA2d4-5Z2i_uHYZ6dOdgB0pFMSmw=w1920-h1080";   glidee();


        Button prev1 = findViewById(R.id.prev1);
        prev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter0n();
            }
        });

        Button next1 = findViewById(R.id.next1);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter2n();
            }
        });

    }

    public void chapter2n(){
        dlink = "https://lh3.googleusercontent.com/FNnMNxJLFeQtV7XiDVCYJoU7qLc7XEhzuU6lRLOqasRy4fY2VcNguhrUvizi2X3sw462RsCVRzbh8I4t8RLk-Z55A123Xhz9oygIh8F2sIyD-Zb3LFOSLj2f-c91AMsZsIeqz3iYvA=w1920-h1080";   glidee();


        Button prev1 = findViewById(R.id.prev1);
        prev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter1n();
            }
        });

        Button next1 = findViewById(R.id.next1);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter3n();
            }
        });

    }


    public void chapter3n(){
        dlink = "https://lh3.googleusercontent.com/03KRcVkThaxazhHjl-ewIujrnfGXb_ad8DBgikaLNHm9pMg9F11blmrTiu3lbyQLvk6AYI4cAHa0R-yqnCGQie5AcBzK7iXscXWdI9tAfWqhJcdK8nxV6T-W9sF9ljONTsdYE5JeGg=w1920-h1080";   glidee();


        Button prev1 = findViewById(R.id.prev1);
        prev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter2n();
            }
        });

        Button next1 = findViewById(R.id.next1);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter4n();
            }
        });

    }


    public void chapter4n(){

        dlink = "https://lh3.googleusercontent.com/q2A70rc58W9-i4WM6BKfC-RoNUrZkrk5_YpAv8tFX7ZETJWUVwKI-xV2xfibVkcxq4SlukVJKf_GtkUmdbT3dTiXgQebXQZvKuMtSApQSepdSCpUe1RwkezrKs1wZUwo5fRa9zGqWA=w1920-h1080";   glidee();

        Button prev1 = findViewById(R.id.prev1);
        prev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter3n();
            }
        });

        Button next1 = findViewById(R.id.next1);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter5n();
            }
        });

    }


    public void chapter5n(){

        dlink = "https://lh3.googleusercontent.com/rZ0--spIe_9M-TsMIrpRE5i9g13ypeginI6cqggst6aojnL-Ha3IxhPUsjTD6wX8B8Xwkip512h7cxkDJYJu1VzXcSujAM2m9C83XrDfAvxG8InZYlZ_c4TjEhJ6vqoRq5oEU40w9Q=w1920-h1080";   glidee();


        Button prev1 = findViewById(R.id.prev1);
        prev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter4n();
            }
        });

        Button next1 = findViewById(R.id.next1);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter6n();
            }
        });

    }


    public void chapter6n(){

        dlink = "https://lh3.googleusercontent.com/1Zzm7cBVSYI2uL-CBwNkI-FjWxbQd_KnL260DtP6fJ2-aKxGHTY8YQjsI8o-HWq_kqCkQHz39GxcfkdCcqAXkogLSsO50MdBZiXLnk8FwiHRUlhpBZ4vgmJCQ_kcfv97dW8HMc2zzQ=w1920-h1080";   glidee();

        Button prev1 = findViewById(R.id.prev1);
        prev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter5n();
            }
        });

        Button next1 = findViewById(R.id.next1);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter7n();
            }
        });

    }


    public void chapter7n(){

        dlink = "https://lh3.googleusercontent.com/30RtTaeodXEzNLSg2Vi77Nb8p3ehcY25s6GK-2UeeKtt8rouOy_yUBD4X_E-qelZW97SqayEzUsBlM-OKGm9xt9rZw-5S5x38TxVS0zrd7xgHjTZnYTgvDTjDJ5iVSbFdFWe9RAEUw=w1920-h1080";   glidee();

        Button prev1 = findViewById(R.id.prev1);
        prev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter6n();
            }
        });

        Button next1 = findViewById(R.id.next1);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter8n();
            }
        });

    }


    public void chapter8n(){

        dlink = "https://lh3.googleusercontent.com/X8rUqX948HatmuyM0ps-tkLOxfu8Bo7pgnus0YoQke_FLVSoRnEtHviVdiAT4wqMG6_J-resKA-dwlcswgK8eFHeSZRzjr6XXXn72pBPV8tV7EOYfyQrJN9czjRPEVaDq-b6mHjsnA=w1920-h1080";   glidee();


        Button prev1 = findViewById(R.id.prev1);
        prev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter7n();
            }
        });

        Button next1 = findViewById(R.id.next1);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter9n();
            }
        });

    }


    public void chapter9n(){

        dlink = "https://lh3.googleusercontent.com/KGHfKInnrnoUp-KAsZlkW3TghAWGpjJvoZqnzcQttiS7LPCEOaBYfkiR09x3BX66TQQWSTtd6n4Y-lNL26IgOCmWcUi3B4CIDdLIXii4vx59K2ncH_dV2URggrQtK3E2qPAzwFkqpA=w1920-h1080";   glidee();

        Button prev1 = findViewById(R.id.prev1);
        prev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter8n();
            }
        });

        Button next1 = findViewById(R.id.next1);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter10n();
            }
        });

    }


    public void chapter10n(){

        dlink = "https://lh3.googleusercontent.com/Tf4V7T05kSIAzutgp3A99ZC8ixcMEcJVt663taGIcI283kuuk-4utDfN33T2frn7LYp3xvbiwY7SiFrzYqjmY0CnY1J1P7gSVH-mPACjq03VmpXi1IsM7abFN_3C-6_EsztC-Nrdwg=w1920-h1080";   glidee();

        Button prev1 = findViewById(R.id.prev1);
        prev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter9n();
            }
        });

        Button next1 = findViewById(R.id.next1);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter11n();
            }
        });

    }


    public void chapter11n(){

        dlink = "https://lh3.googleusercontent.com/jF_QMy754uTjlm7CJytr-_v_XmU9KJqmk2UQvgKV-K2DlevIC0FMQkqjx9ikQMHKTeikRTNW7eSLKG1mMNHiJAGdaIlfHyp28igr2OrIZwh0HYOxzDXXyHUZ_DuOOuo6sE7X_KP3vw=w1920-h1080";   glidee();

        Button prev1 = findViewById(R.id.prev1);
        prev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter10n();
            }
        });

        Button next1 = findViewById(R.id.next1);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter12n();
            }
        });

    }


    public void chapter12n(){

        dlink = "https://lh3.googleusercontent.com/Fgy1s2DZKr8YU4nScYUhnJs011RetjYUhWdJ349N9qGzqVCpef5AQKa53p9TD5jGd7fEXFPBnz1NB2ZGEfecesT8tPRlS-CtYQ4sW2mIwJ-uweUraiq6n2HRCfPWJWkUgeGEIHG7Og=w1920-h1080";   glidee();

        Button prev1 = findViewById(R.id.prev1);
        prev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter11n();
            }
        });

        Button next1 = findViewById(R.id.next1);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter13n();
            }
        });

    }


    public void chapter13n(){

        dlink = "https://lh3.googleusercontent.com/wOdqSqS6wE0SCynLhcUO8VJwpVZWowBiyOipUf-Vx0la9nPp8MfUPlEUtWTvFR7QvYtIK20oyW7eApHtGm5fAUdzG4XX8uoD2Bzji0b3K5y7gaAZzMOtdRc9b8XrDIXNvO4LZ6c7Lw=w1920-h1080";   glidee();

        Button prev1 = findViewById(R.id.prev1);
        prev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter12n();
            }
        });

        Button next1 = findViewById(R.id.next1);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter14n();
            }
        });

    }


    public void chapter14n(){
        dlink = "https://lh3.googleusercontent.com/ZF8cN51bu-5BZXu-kVCpv_yhUDCnEZBS5yrBP7I-_lAZZQsB2ld0UHji3356IJ8-2zRJHUPc03kQZ9CrZCZffM2T00pevMphZiIgj1xFtq9_ArfJt57r9wJtPPH0MbZjxYCQg0vzTw=w1920-h1080";   glidee();


        Button prev1 = findViewById(R.id.prev1);
        prev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter13n();
            }
        });

        Button next1 = findViewById(R.id.next1);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter0n();
            }
        });

    }





    public void glidee(){
        ImageView guideimg = findViewById(R.id.guideimg);
        Glide
                .with(unit.this)
                .load(dlink)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.ic_loading)
                .into(guideimg);

        guideimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yas = new Intent(unit.this,fullimage.class);
                yas.putExtra("dlink",dlink);
                startActivity(yas);
            }
        });

    }



}
