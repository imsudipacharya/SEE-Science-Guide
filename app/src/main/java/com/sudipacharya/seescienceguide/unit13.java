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

public class unit13 extends AppCompatActivity {

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
        dlink = "https://lh3.googleusercontent.com/ORzGU56HCUzAhYNSRU7Op_KuTRkVtnlsZIW0GoULHS_bXCLDi37WYL-lkK7YzwK_dIv7abo4Qd2TakP9OcDQB-nYwG4htBaap0y5dAv_aTTXyZ85TMr-26kYhXXPxEb5CR3LXi0ncw=w1920-h1080";   glidee();



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
                chapter1n();
            }
        });

    }





    public void chapter1n(){

        dlink = "https://lh3.googleusercontent.com/Men89teqvSwdvPUKOkuxyFES4nemel42p_Ck_LTU2lODrYQtpWIlXaIkXCJh4BcCNjPvxcLO5Eutvv_dnfNizaAe0LigywvyFsf0akGwjvVE43aiH5Y4BRV2luLEgAA7krOvzQnB_A=w1920-h1080";   glidee();


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
        dlink = "https://lh3.googleusercontent.com/Y1RO58AcpCraaa4jzr9vP0F-hMOlk630cLLazXesKEdxWR9bTyzZUrppTZdzNkiRiG8QYQ34YWaDVHGC2rRpE6QJPD-hRmsuP5uwUvTpn6sSmBYr0rCxL-SzjOwamc1RNWzhnAfFow=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/H5VYoMYTSMDP229SPIgepzoO6kT12glwWZlGjT2exnTFTue-bM9dlRvuivTV4vC_nLxEAAJpAN8c_9romAjEllL9PLcn0iTrB8N8PDNBrdFJkFunn0ZOf5rRRImu-4Vw84RwGJGDOA=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/ND1eTZeXIYWQasZiTZse5waUoP4W4jPqGwIh3VZdIEWPx2gBi_-q1zqJrfsV_VNg_R0ltgV08r4hWUeB5aCWbZiokL-M9OCtPEeYIQYFHqON015C_6azIJBs_kCAWN6nHxM90jKQPw=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/29h1ENqS801erib6holEFN4nKJNS__KwP9PpWTbuOqQjWBvRqbK8lJjLoqNT9BovtxT_C1wWn9YDMtqNNVYno0HXBwIaHr2zloByHoJMHojZdksN3w7Bv32s4X2hZSFxl6IhDV07UQ=w1920-h1080";   glidee();

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
        dlink = "https://lh3.googleusercontent.com/zOxh-ii-vqZ0Z-SPd0Y9bl6FzLeAdHwKR-Ftk8c2jTMzNfmSYShaoRCtuGWLUsGWh924EwX-Vy0DqVEO6Eg3ObaX1FaJQNk3gew3Hfv5srGcBFAZYOsEOOyojT_lBaR9vD8E9WdUEA=w1920-h1080";   glidee();


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
        dlink = "https://lh3.googleusercontent.com/R1PTxC1a30-I2mFkGIUTsaYgK3Mi33mV4FOfKx6WQcMq03gasWhDBm4BnnkUjhcDLHM23WyHvnead9v0cQWn-gT54Ql0FuQ4H4SpGN5dUMHxDWAyc4yGZUE7t4cB0gwYIVTB_23Neg=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/DQFrX8ZiyVwDex5eGiIwFR1MfIEM44SR1y2Vsf75C8lOsrwSlK0gsPldybXZ35IJvXpfkNgQmGYrT8C91cMX-XsM1UCzCvwHgJy-sze_F1lHecspRNiVHhpBq4srfc2ZYhAcjUUVXw=w1920-h1080";   glidee();

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
        dlink = "https://lh3.googleusercontent.com/7WL-v5laSjO7v3P-NMLelcm_6TN0fU54WcPPa20VBePjYW3AvBwZhywBchQAnVnSkOolZ2hjtR_wp4Z52snSSo-hYqWY4z2uPSnulI2xUdpP_Ioa17ZMzU2qmSo5T4iVL7SGgtMjhQ=w1920-h1080";   glidee();


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
        dlink = "https://lh3.googleusercontent.com/ujnno-xtiaLlVf144qo5lNaOMI9lGnVeCOx1oBeyroIMn7iEfcNlSMITUiiQNyOqV1H1LIXWs_hy9eUhQ0QXXlVNweqk2tXtC9yIVS5lXLvjphTFc6eK1xTF8Ao9ZuDSVV94Wn4wVw=w1920-h1080";   glidee();



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
                chapter0n();
            }
        });

    }




    public void glidee(){
        ImageView guideimg = findViewById(R.id.guideimg);
        Glide
                .with(unit13.this)
                .load(dlink)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.ic_loading)
                .into(guideimg);

        guideimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yas = new Intent(unit13.this,fullimage.class);
                yas.putExtra("dlink",dlink);
                startActivity(yas);
            }
        });

    }



}
