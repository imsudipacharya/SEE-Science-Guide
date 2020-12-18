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

public class chapter7 extends AppCompatActivity {
private String dlink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter);
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


        dlink = "https://lh3.googleusercontent.com/_9WHg3oQryxJfzKzBXg-RreoDT9fz62XiK6PajzVCY1uvxZ6ZmpAA_9ccn0Uyo9izM8ZOPsddlUfoFAzDM8cYrNrZ_WNN8QEXYy__PO9WejRCNC5UbukyjL4bqwS80_eKj3YzFnU1g=w1920-h1080"; glidee();

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
                chapter1n();
            }
        });

    }





    public void chapter1n(){


        dlink = "https://lh3.googleusercontent.com/bhMO3k8tPpr12mH8ddpKeD2puRE98aVJB365iangaGiYpLJ87XiQN7AEnQ_6nrdGVuWwzBOfcWg6akrOovWH6NnbQ-rAQDsAT7Y13a8nA7peNacBhuqqoqcLiG3zH_SY5XTqh9e71A=w1920-h1080";
        glidee();

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

        dlink = "https://lh3.googleusercontent.com/GUAECaQGZEr6XfKerAJ7KWBh3i3cUmH9NdXEKhTPhb2mJtFfLOPURy8G881A-ieNy0gnYVZNHN0NiHWT7YE4jg4YUjr10H1e_ePD3hNKEiHOEwLK4dBs8hlW_F8BluEjXEoxlBWaUg=w1920-h1080";
        glidee();

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

        dlink = "https://lh3.googleusercontent.com/gWcD6gPOCUHUqpOzQiXMx0GwPupxgI216MDpwVzMJnNAtYppGc9B8hJX6NnkMJIGt5QckkgcbgamibzWXEeyaxpLs-h4zXP1je8jm1x-SfyeUyF5TrefJDSn6QHc5swICxbLSetSIg=w1920-h1080";
        glidee();

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

        dlink = "https://lh3.googleusercontent.com/hhdVM9LUNpZj2KYsocK0-akWQJC2uZgAc3OCNgzQbO-FXTpMEVXwFlk1p-OA4sBdkWYQn4aHjzF9t6I5pcq1eQwU1rHoy1tgQihsH0jb2J4N03xH6YZqs-VkSrHZAA8rtfP-6T9AfQ=w1920-h1080";
        glidee();

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

        dlink = "https://lh3.googleusercontent.com/Xz7WswlQMc5cJNDqv5MS7PaYqi0z2VOO9W9K4KLWBAdZ_sUcH775YqU2ZF0jjJM8-dPdVEBYIxLlsciFWoYAvCEjiel7J6BoPuJ1lhxosJ-Ih9joENXBZtMX0lgbUqka-veLD35row=w1920-h1080";
        glidee();

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

        dlink = "https://lh3.googleusercontent.com/01NvBW-ztLwgbweyGDyXSiPfnpLwWltpo7YG4MOHYFpRh5BWoI5tOvMmAhmwnTycBpds7TRkWqpHLGbsx8PvJlzAPVR7SZk_e5bwe2o2wB1Ipt_Kuza02JSfRsFh7aMAQ3NQiEMRgg=w1920-h1080";  glidee();

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

        dlink = "https://lh3.googleusercontent.com/_r_mNlS1A2bUmTaWWm0xbJVdPBWiae3Pj2e5GJjoEFYBb_Vlld-9j80k-Od58P8CJaJETd2ahAgo2WrKC6_u55pjog8z7jb4d8N2v5Len7bSr3PJjYv8g1Hv15g10EEXAHl3y0nIOg=w1920-h1080";
        glidee();

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

        dlink = "https://lh3.googleusercontent.com/RrZuX2nVNujN7RB4Ddln1_-iwLj6WATTXIViqqwZvXFu2tL9JE06HrgoTOmrWF4ZB2oZSb4evfsQswXzxjMXnrgX5hNritvlAsd0naV82S4d7-IaKtb-fXrccALYfUtIVjRH0O-MMA=w1920-h1080";
        glidee();

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

        dlink = "https://lh3.googleusercontent.com/IsurU1alxu2kjcuM-zMSjJaQ0FyXnvzLAEmUrU041slw7REvngEBgmz6TZm4qVysHsNXINUAahGyXtsCrbPoE2RtfxA_tM5sxdZm9P4Is4nlM5aaiN4117MPmUYeKVyw49uA9n7xHA=w1920-h1080";
        glidee();

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

        dlink = "https://lh3.googleusercontent.com/jOTnZJYfV-oWrc3Y33Jw9VHPI_yYMvsdL6-8S72QdUPEh1rw7irXYMXxTEfwUGvmAQ1yLKJUHRnkU5lLvU4MCkot1PjXsTrticiZOtDZBhpGX7pC2_gfYStmjzWcBR0FT71ZCXZ2oQ=w1920-h1080"; glidee();

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

        dlink = "https://lh3.googleusercontent.com/v69ZRoOGGLgFhHAsFA2_nUZc_SASdrYy_KU1uR1bejmSC5wjaDBeD40jsxBh_c0Lo2suTB5xuW1u1T0qG4W_wscWKYmx2OntGeNZG--7Eix0nPHnAbkK79_yxTqeL1WTtGRlh_OpDg=w1920-h1080"; glidee();

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
                chapter0n();
            }
        });

    }



    public void glidee(){
        ImageView guideimg = findViewById(R.id.guideimg);
        Glide
                .with(chapter7.this)
                .load(dlink)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.ic_loading)
                .into(guideimg);

        guideimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yas = new Intent(chapter7.this,fullimage.class);
                yas.putExtra("dlink",dlink);
                startActivity(yas);
            }
        });

    }



}
