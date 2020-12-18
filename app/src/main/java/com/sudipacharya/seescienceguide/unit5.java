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

public class unit5 extends AppCompatActivity {

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

        dlink = "https://lh3.googleusercontent.com/8E3NOp6-Z9MVPnImvPn9Avbk3tbzBcq0duoBZTKaKb74Vm11mEH7ia4thfuNhu_vg9bzZuEpFnhGWrYrLVc2cPrtz5z-yZqHMAZOUB75Pv_8slsZt60Dcp2fJXlQARr4WcQXsHo2UA=w1920-h1080";   glidee();


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
                chapter1n();
            }
        });

    }





    public void chapter1n(){

        dlink = "https://lh3.googleusercontent.com/dORHDOzfVCMOLBwjUtzWQ9loY9EVVOgAjygMG_rgYr3NyJr5jPOGmOJCKEhRFRfdGdCn4qqt-x290CVFyNCNxj7qAoXOZ0G8Ej_Fs1ni5Smt__CFukj-gI_HD8rk9PDNAHopRpakiw=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/VrYzKLr6ogg84bNTTmK1WPm81V3bhQA5aOckrjFSjtzmgXWzJ6Ldgc8mfLuF8qcIaGRFuhNMB7INhBZYeqHoXIo-RcxpPlh0ao5dvDrP8YAiYBvMoZ7L07jxmTQ2M7TG1EYaS7g2Gw=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/NqecPtPSCYCEiH-9xTVKCkGvCgHRGfnchDmITOP0ojII3B8v7b-_feC3TgX9TMmQTcDqSi6lw4WE1pA7kVqGWtN46rxTfT7A6RO5AUt4XwmNfTWV2Vptj-_FYDx6WPb8e7QW54aF0A=w1920-h1080";   glidee();

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
        dlink = "https://lh3.googleusercontent.com/bDsIBzU8kkpDOnhRUTAbupDD9V6xsKay-D0f0qMnCPf7L06DYnE6KHcrbugqFFdPBQjENZT-71KIp1oClrydk3LNOZt8OsEdcYc1sMe9ZuwlcyTynm-Wt3JLFreXSJedlCqrx8h1eQ=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/3I5T1hkFuwaA_dT66dNWGXsClFgGAqmo5qR4DQ41JGc1JUn_ZikaomU2NRz5VThmqgySiLy7TM-5w1XRVu7QAul8QChMYVH7lvcOpQkLgG3rz7VEV0ZkkckqRkmhXYqty0iVeIlp0w=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/QaR13grwoBVQmqR4E6zzGFkyyVmHWH8K4pnT99gAb3g9fY4_tta4cdKLHrNQDejla7zy69QgqNyTtV-QoeLNzsIFYXNHvXlRQY_7N1KrazOWS3Wpn1QAi1arpQ9OUq5BLFEGPdadiw=w1920-h1080";   glidee();

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
        dlink = "https://lh3.googleusercontent.com/6skEA-9a1YGb_K0Lg8ccu7LfaT7dWxt340s33qwvLakqRjbZn5EXhGI7AI-VHUyida0c4CF3J8-dtgtMEE4brFVqgnq6d0RyB4L7U0hyYTSX8IosSnROLsHtnkF5mUvNIFV3A-IBcw=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/re0uEJ-E5NX6Op7pWM5KFfewEcD05251A692h-MtYkiq6gCnX8Svjo82x41w83AW52w-l6ZN4KbRKLTWF6HvlySsRLhpWOXHKOSEJz3B_2eaEn2RVVlu-oUEjUU6TgXjXnDyC4vGew=w1920-h1080";   glidee();

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
        dlink = "https://lh3.googleusercontent.com/mC0qnZxcXU3dat7KHohJzEV4V17jHY1KImc6meu-pnKMmcR_LN-vZ7XgjadvTWwAfqovwA4Bpyo0OFQojK5JeCeFXvF4hkVP9Apfyf1eM66g7vidYPtvdzCuWVfMOBcVn8y7eFmJsg=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/PVv0jWcJkiPhB3vXMZG1ZxpfWT4WqUhbz3TBH3LzdhSeNsO8GprrJ75W8IuoHvge5Rqi8bNcJuVgY_P5LLuX7yQ5Vw0070_JNRg55C2ij2O3ZYPx-iklO2C4YFsqGaNgapcrMwPj8Q=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/HjNP76EdHeOVgsjdj8_qJC-r88eA1huKnDE9ySsn6QX62eYbM1wtIu4PnW0fInRUAdwydAAZN1s1YNZ7VrSjhd9LOB9W7eUV7xvBbTDJpz-FL8vxKD0vD0BQI_il_jTLt7jbRhBAwQ=w1920-h1080";   glidee();

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
        dlink = "https://lh3.googleusercontent.com/HC8mQOqLs-OGIhBpmBav2PvIMVetRFoUoTW4aUmkM6g4Utq49G2napfDcQHFS_VaorDgMnZGpAu6v9rT7-xnJOcy8cJTXunL65s56gsM-Emkbm-ZLXH8KKviSZkrQqIElMzapC8kTg=w1920-h1080";   glidee();

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
                chapter0n();
            }
        });

    }








    public void glidee(){
        ImageView guideimg = findViewById(R.id.guideimg);
        Glide
                .with(unit5.this)
                .load(dlink)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.ic_loading)
                .into(guideimg);

        guideimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yas = new Intent(unit5.this, fullimage.class);
                yas.putExtra("dlink",dlink);
                startActivity(yas);
            }
        });

    }



}
