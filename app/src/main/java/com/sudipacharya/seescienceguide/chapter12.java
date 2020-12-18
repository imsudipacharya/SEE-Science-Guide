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

public class chapter12 extends AppCompatActivity {
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


        dlink = "https://lh3.googleusercontent.com/IcXCKYPnD_XqEOBNfF_vSQ1eAHGp77_aCpf4IxkFjN7JUNxY4qnaaP02c5kXfhH8ojApGz4B8P41GPj3sZyZ1Cib-QGwqxpUrKOnw1eeQwA9NL5BDkfYJ0Rso_DyIczoGkIec_okSQ=w1920-h1080";
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


        dlink = "https://lh3.googleusercontent.com/PmC48XS3nUAoNuChtEaLPdWaWJzbtx_ljWBo6hDSoPdpj_gn9FVex3VVzGrN9CPFkvQIethwV-LOuPGsy--xIK_7Cor-uOSUa6SuwrMFXTrNkJAV0dRSIq5jWYXL-AEzWiBSjAIpyA=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/ZWkPAecok6RPJNcgc4jv08pOckND0tTOnIYodst1K9EgCeIOgmYYshIOq62UioqAHWg5ly-UgAIoCwB2I-quJNjo13Qkbq_V5orXPeGm4irm2HSUIi6xPfDm6SBwHRsPhKb3rWQP7g=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/-EjJuFMK-2Goy3lhsbMZ0RsYc60FRVA8Yp-sA3vCm9NjxVQx3TZujqhLg_lLc0CitkloOAICC5oAsCjz1Ri9WXXX8XFRtw4pYeqmHalZWhjFEq2XBWQC3v0-mlPGPaTe049sIU4aKg=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/tkhPurJIkQYwfVrmaR9CkUrvjQilSN9nPbVtFX1ur71MkJGX8fQpRmZjqQk24XS0B08zNKamoqyRFEzGGjsWXlpXAsvREri8c1C2zwT5s4gwVS96bZE_9HDW22lY1UqcJYdr8POOgg=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/4Db09z8KiuSyuRJekeRk0ev5vHyixbUpKKADuKbS1A7ZVOqvHWIV_mGw-7hwZ1m5R6wQTE0M64oIxHMY-1z0NoF5IJ0DEWWC9kzr6xridAjH9HGocORI0ieMH2cfc7_YH1XPBak6UQ=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/dcDjtr9tYEePbhqS4DNhVKXnNBD-HujQitE6RrsR45M_Dvxm5o87BR8WiOwd93mZ85I6lo5K2qZr_CYBi1Expua6TFwfFVFsUNpw5pxw_cD__OXiA37ooa94qeusCbWqpOZY1DoWeQ=w1920-h1080";
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
                .with(chapter12.this)
                .load(dlink)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.ic_loading)
                .into(guideimg);

        guideimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yas = new Intent(chapter12.this,fullimage.class);
                yas.putExtra("dlink",dlink);
                startActivity(yas);
            }
        });

    }



}
