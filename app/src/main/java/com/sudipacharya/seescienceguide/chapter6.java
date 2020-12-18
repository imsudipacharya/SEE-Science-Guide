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

public class chapter6 extends AppCompatActivity {
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


        dlink = "https://lh3.googleusercontent.com/qFbF1ihQmQpOVL8xclKzQ2S5-SbLgmIwdNTVMvr-I0ebIkHR-t2biaL3llK6xi3jJNqM4K98J3N3ySuNrV-SW0ZNBufIdh3DCLAnZ9_eZ0dVtnOpBtyGNkEbucCsP_ZmbMUAxQ5RUA=w1920-h1080";
        glidee();

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
                chapter1n();
            }
        });

    }





    public void chapter1n(){


        dlink = "https://lh3.googleusercontent.com/RTmlPIDjb9iWM8HEuQIJYvNuN_99xIbMVbg10LwNnRFBpczN-EXnzOrkaEXcKnl_nXL6w4OBaNGA3k9ryRQ4J5dYfsCCYgK596EUJ9xTyC_aAUT29htrCo54MOtZBvsK5O8JK13M7g=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/eW_0Hdvq04_LIMdkmHtWOvNtmVm21CkfwsuqkIQSWWS6SMHy8KEvcdJktjWD9eDkT99MqK-GnwgIO8pp4bVIQGsyBBFcSHNnylzFGfHc5AyhFcgwte_cQMJ2LELAwpKiidV0rYtDIg=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/zvxPWE_3Kp_aFSBp8japrzaxCqiV5_0NcenZ4-WBSMmD3aFJ-QbmzESgc-Dn-pFW9-60wB9_OaVAm-3u5NmGowR8vtaMEygCP54JVtI6aQmkgfcArFQC2sMCbW09iD1n81vLVmVr7Q=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/PA2sFj1Pf1kamKf6TgB5cjfqVJO_AVpyn5fSK31aOqHl9j4u1KMCXOcH8pS7_76yJYPMQ4qFT-Bj4vEFBMU8MrVHHdFRQ0KAwMrQjylpFL4q-aY9e4OE07stx0BGYk5YDBuUP4Yt2w=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/UEl8qkcxy7_8DS3bdrWRS696RZlspFMj76F230gU0V-rLBtTwcL2CGM0V47qYa2xgqQBZWZGI4sFSyDHcgzYtZEV6Sm-bz05KdRos9WxTdMENqqCyzgaF3gZVYrnlJj4UGfs4uYqSQ=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/oPJ9W2xtpgxgX44-hdlY4bG-cTv1q-rx2xm4dI02LQHtBo12NBb2amAHF9rm00Jc4HGDdQswuF6rc8anHZUUdiwhIWMAn-KdvS3_S2KDJIxQHvXxiwI8CFdq1oVc8txkIgVnEjloUw=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/PQT1sTznpF07kyes5fQOllgRK71jlIgbPIbFELCGftqiP4tyATTQNBnGRPKKmz6WqLRQS5afwq5r0B9WDOTMpA7NehlgQmdDrvMRe2Gdy-2-iqDH19qWZZITbPtoi0Kue85rdDyDMw=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/jy3QvCfhLfOiqaMMaHjhDIcfKkvZFFdp2EB2Z882Q1Lwbr5aSNLz8YgUfb2LAlW5N7jlwidV_gL_J-fN9x3bkPi3hGCstXJG0ZNuzOrpgUvM4M01s41ktwjwjeS0WPzMEBJp9fnB4Q=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/OcK5vovgMxVYmbyELMAbD5wjS8x1-3YCf4OVwwuBRvKIXa9E24__K4CxS8Z3AQklJVGib67qJmG3iQuCaaUvVAhF2pgamBA-bdGYz_ZFrSQ4qsEzaEj4CNlxrq4OSks1EeCZt_h59Q=w1920-h1080";
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
                chapter0n();
            }
        });

    }



    public void glidee(){
        ImageView guideimg = findViewById(R.id.guideimg);
        Glide
                .with(chapter6.this)
                .load(dlink)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.ic_loading)
                .into(guideimg);

        guideimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yas = new Intent(chapter6.this,fullimage.class);
                yas.putExtra("dlink",dlink);
                startActivity(yas);
            }
        });

    }



}
