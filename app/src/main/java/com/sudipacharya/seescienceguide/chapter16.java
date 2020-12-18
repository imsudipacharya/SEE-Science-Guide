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

public class chapter16 extends AppCompatActivity {
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


        dlink = "https://lh3.googleusercontent.com/60mYtUN9GDYi9Dy4XdgmrSzDr9K1R6uE2kmBlELp4ps4AmL8rEa6Nc0oPePQ8DS4Re9GV41EdpRr8Oh-JEIpAhNOLm-_MUdfp6DPKR3VaX-w4GiPAo0GeGLlFrwP59qHi8S_9Q3DgA=w1920-h1080";
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
                chapter1n();
            }
        });

    }





    public void chapter1n(){


        dlink = "https://lh3.googleusercontent.com/NP24SEmomxokxRKlPqT38CSB7Llq0ElsCBSCaw9Jja09dlkPBNwj3MjH7WClsJeMkh1ahQkAwEOQQHpbNxn5CpHXLOBHTzglePDHIrcK_JpPElvkY-wVIvA0PB6zdVTUAjZuRrFXSg=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/hufZsNOgwHA9j8zknYBNPQAXvkuNIm9DIi5SKbSnMvta8pwxJ32L_ukJ7LyPt-46WxC5Su7JPcgtZN8oIbzXQ1_EV0wSnUyncG4_7Gy94zWD55u_DVf67XYZC4M0y2NOa0qziCiopw=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/bixgLXN4J6TYrie5dKpCnBEI3aYwvTu8UxC6jSYHhOMssxmVUG7PmwDCbeJP8HVxP81m-SUcsfysS-Veenb4CiqVxbPth2o7PqmXnRju7MIRL8qlt3Oo891rQ4-zqy2VUqcmv_hnyQ=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/sTD26sx7Sdvj6qUxIg693nX2ww4sKfXsg6Ukd2ZFl7htXfg8Q5n9RiQ93i2rVkA-Du_b84a4aCuyfSJtqunl9tFmsmWl3Bzugl8HRgdfnrcz8r22r41Q1qh4NQ5HK560tRGRaGo7wQ=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/-6SSkK8UCgD94GvNPdVYiGSnyFyGkSWoeSo3xkp_2PuXA-ZZ0j1Amr1hKIDUqkvcRFqBVsyMaPr544TPkzdYEGE5d32ko2X4s4EGDFi_UNwbhel_QzwKDdpwnufOMZm3jsVctWvS7g=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/r6hjsPNfSluUQTEoo7u3uhyE1sCS67Ub5gO8cKChVno9zrQuQZQt9g0rGapk33DIQe_6ePyOUW_O-Mh0Dr2IcTMOfO4rrnn8H4IuNrnVw1wbiiYq4t63ttYlJZREGltDP66z8aUhGw=w1920-h1080";
        glidee();

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

        dlink = "https://lh3.googleusercontent.com/AYU3pEixmfzgCpQPjuXOVmMKer9SbE3OJY0Bt-A5lmLbvpNcQOOPkHDu5152JneNPEpzMbJczn9NZB2HMDeblXn2_w1jUVVgLtfKn72WhhcjxIURXmd7puVp8IkLJ8TdwkLHzIe-tw=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/k8un3S9TVd6vOQrq4K0SBwsGRzVPSfMLNwLpcrHVVLWii3USU4tMpz05VayTg-mW28wD3c-qyRSoGeajcrukuz5yFIqXEq3vWcxdTGAhp_p11j1P11stPNBTaJAy5uLPvbqtVy6Cag=w1920-h1080";
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
                chapter0n();
            }
        });

    }



    public void glidee(){
        ImageView guideimg = findViewById(R.id.guideimg);
        Glide
                .with(chapter16.this)
                .load(dlink)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.ic_loading)
                .into(guideimg);

        guideimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yas = new Intent(chapter16.this,fullimage.class);
                yas.putExtra("dlink",dlink);
                startActivity(yas);
            }
        });

    }



}
