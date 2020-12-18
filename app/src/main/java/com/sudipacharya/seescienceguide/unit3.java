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

public class unit3 extends AppCompatActivity {

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

        dlink = "https://lh3.googleusercontent.com/Bi2Oa5HX7jSYS-mr2eAYOrvUiY0EUDufowIYjF2aKtxcvVLQW7yoYrYjCSpzsXh63nuxfNdI6hm-r_4Dg8G7oHvT0B751wAMihwovYdslQXMQL9oyqmMq4Zi02Iv-gxXXuvbMO-Zug=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/bstUW1ptldfAPfvn5Ayq4wwJK7F18H4X0nqqPp5hzAYfvsaOEcj5g5NUUTlH6QMQJjVa1gObYheJqA7b5_Q_SunV2LJpU6wKgROkylPcjHfhokML5QWrGQRqtqoKSDqUhj0KTn1SVQ=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/5QamXHrU8L85pMtMz9NdF4u8Yjj4sZX41HTMnr7zNhTbVovrf7qGZkNDh-k6t--ZS49xvsX8oOhkcDeEBMbMPjlmI82yrBmT7-ofbWJsuhC7N3xCAiwE3q9KQd89YOvfqW1XV67b4w=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/Q98rqMk0igiHRhIHsb1lFc4GMn63vpgX3iNCvY6gj3Y7TMWG4s3Rpr5aQ6LDEqGILanV9TDc4d_f4N11d7Jh-6FwsUy_P0QVzqOMpA0n27ipm2Z3cvUZHlBljoEC5o14QY15orNTXA=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/PSA381S5MX4JdST17x1584KyJrEo6Qz7YqM_E6qfprCg079tCRBOCdN22DNo9sV2WRM0M_jC-B0-rho8NTz882jfMzjzblgELjWzOFz5NSQrkhSRrtRge5h1a_Vm5bonmitwCtI8uA=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/zWAJWoCj4yHrhs6s1o382hVqL3m8xwTeHqxcfMdpYFi0IGvKxvJAijMs-ObjCn_-KWllGY6WWkDIXTh29fl_1p9ski1XyBTs5gRWIpZ0iDyvlY2nV7kxPrHTOqZlOMIu42gnQfb98w=w1920-h1080";   glidee();

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
        dlink = "https://lh3.googleusercontent.com/O8CfxdYeGGgwv71P1mKeMpp0_2bAeKYDRcQOWfg7zojENYYehSd-VJ8CFZCm0g5mi6JcsqDg59GZ-Q-HIXQuMrffPZzyYAKdE1hDymgNO0nCUVehuvrQ_zcPCU6ppNFd4pK1RjJdKA=w1920-h1080";   glidee();


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
        dlink = "https://lh3.googleusercontent.com/UHQs6QN-jY1y-oNUYiRVXzbMQAXiHWh3yZKuFyX1-GyRslKfO2agFPqzLl0Kmb87VKNJ9NqRM55-zTRFjWN-tjs1_BXkV79vS9aHd6x0yEKzS9LjbUIZhag8binftLh3aFF9xkek9A=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/XCWubhK6PkYb85rL4EwyZJbmpp5GGthN2xRZqM1KhxvpyHIEiGzTBtvDZDNirc9kPh3ckSoSd3eXP_4Xl5E4z7Qx_aeRmE6JC_Lb9LrL11iYGkS8Zojg_uD0jfDax-HCWPT0qq_q3A=w1920-h1080";   glidee();

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
        dlink = "https://lh3.googleusercontent.com/dIe4tQAUn8xJUeSY7fyZXtsHfQmuX6hI_t98FpaI96B4rQM0WUxSSi3zLXL2G0Qi2XveIpzN3ub-AyVdJaDy4EijqknyNtcdc5GY6RaU7cPt3iVnYj_9GVqsBNusUCNDnaOzIC1IDA=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/h1Q6vop_2U7GpxfCXvKApk5fo1xNiNOWcIQNsSqcVL2i82tXOjcmrW1wUBCPfDfo-UAHM27TW65zRQbawgxUeWps-KstDYvrNUnW-BFWjb_pVRjH1rhiA1v4y9hOcOmvt3rkBOgUxQ=w1920-h1080";   glidee();

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
                .with(unit3.this)
                .load(dlink)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.ic_loading)
                .into(guideimg);

        guideimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yas = new Intent(unit3.this, fullimage.class);
                yas.putExtra("dlink",dlink);
                startActivity(yas);
            }
        });

    }



}
