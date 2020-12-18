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

public class chapter21 extends AppCompatActivity {
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


        dlink = "https://lh3.googleusercontent.com/lXmvUIS3GIopaCS82PCNKkFfjvReWolh7urcU8iCgHsopaslF9ZbyZN3PX-hTUvB3gHIjn1QCalY3pLwPr_Bigkh02Iqq33H1iq2lrkqWcJcO9Jrq6JtT4duLNXpk11cDRBGXNYPRA=w1920-h1080";
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
                chapter1n();
            }
        });

    }





    public void chapter1n(){


        dlink = "https://lh3.googleusercontent.com/478mHmvteptc9bmqS1roJNwuCTDGo2vTAqNKxzRSmlbYtF2-ns4OFmkOmlmczmj9FG4PVx95G1dRjGzzmjlltzFlzJIVUqTj5YUE5snF7Lo44KsHwsYu2-FmiDEl7Vu9lxiTYb6OXQ=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/YfrgNsF84TwXxzDr90kcGFHZtg-8mTuAWg0fcaSmwtF5ZhrmSoXkRByrRfOGFjZSPqK8QzC5IjfCYzNXrgLhWsVykdfL3F2KDsxsz9_MqNBBoFeehIVBOftZkiqnYY3qawr_XP_0Kw=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/KKXH2g1iX04eZFxnPFrVKXveSf1YYxZJW7ia8XMcIN6ZR5fA5sDPu-sPeUpiYrmklYMx4rYrweLdspPoxWuWuKbSWpSmez1KbAVvq9habdrh-Hlz8gACNX7JQTL7FHoJsCqu6otF2g=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/F4DSAIh8Mwv5v1heq9K6Ld92sjdN6I1CqR44wEwjOl3cqGCtwO8jVSy_CjWKbk5FmCuPqVW-3nUPPTXbvs_gu3-iqQVui-hRXErPh7k6wL6BWzVtTVz8nbQ5B0Ri73hNUAUxpHpkOg=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/lzydS3E-I2EykSG7ugwrclKIe2Dvaa8Q3x0E5PH0TIWJSpdqofWKCwOs3m9rOce1Q2bUqSOndZHeoj1QS2aA8n3epiarqdUn3lAmz8QbmOFgHZm_PxLd9n_kYc6bKUwbKk6ycq7EUw=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/nL7pOzUW3I_Tl_bLNuRApMKPKOccpZ1WZlV_QP8TKvvvpIUWyzYZL379hv4lWIEfNYazEacGaHbQHPFHDYHn5iQlT-VeKcxOmEaD1WJFd1-WFggVNnVaPCjZI4nrjATUfzy4TN-K5w=w1920-h1080";
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
                chapter0n();
            }
        });

    }



    public void glidee(){
        ImageView guideimg = findViewById(R.id.guideimg);
        Glide
                .with(chapter21.this)
                .load(dlink)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.ic_loading)
                .into(guideimg);

        guideimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yas = new Intent(chapter21.this,fullimage.class);
                yas.putExtra("dlink",dlink);
                startActivity(yas);
            }
        });

    }



}
