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

public class chapter14 extends AppCompatActivity {
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


        dlink = "https://lh3.googleusercontent.com/Jp6Z1FNIx3QkNdZm2O1TLru3gb-apg1oz6pzFiXAduIZijG8yOcwTj_7ehYG-919QQNKzAH-2o78mdjd9E7Xl-bnK8f3dNyCGJpJJDbxir2OTaQD_nmFHbH_WDN1AG34_fyhKo9T2w=w1920-h1080";
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
                chapter1n();
            }
        });

    }





    public void chapter1n(){


        dlink = "https://lh3.googleusercontent.com/NuhoTccfqR5PH33s5mOhBL_9YZ_NVbjZYQHxmcx7_u95Z_2kirX0V8gHmzK2OCJnLBY7ZVoyzFKTKI7ShuZNEtWytuQu7Q1qXdihuXNCSMMyoH5YZ_FvRj7T9sUhy5Zg8NFADnYiXg=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/A_gYyaE3S4YD2F0b4ciwCeGruYhuYEUXED9Fvi3D3Wz-7N0i6kyJie2xqvYxfbOkqdIGFt5L-xWItrsj_skMPyp3KMfg2W9UJule2uAZXAnj3xVB2layi2BGZ6ZywnG3wagJf5IlsQ=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/vNennjQFJN0hTSmvTLWnf_ttec67CTYKHRuoqFitjM4RYbQ1b0OWRgskBebz2PZCqdU_rgtjbNlMbiaR5URVO6YK-mlFOJgFW70qRQm4QBusgwXOOhJCPE_-2CkLWb6Tl8Dz4xVRuA=w1920-h1080";

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

        dlink = "https://lh3.googleusercontent.com/s2L9i_MB6Wtx2SC8gCQj293LfxWc5tiBCNyWfbFJbHJUIZdUL0nHite_P93ADbbWBU7dPI9sG715grkUgJ2eNxhJJ-zt0sEtt5g6XDc1kzonYfnhSojDtD82J5cPge6BQ3zl1vKNAw=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/cDzvKaF1isuywd2iqvnzOWNsxLK1iErrjUhaVXKC7gzc8uhUxsQNcKZ310m7Y__Ux024uF6fkeV3f-kYts_pVThNUXGb0rtz9DqAZd5Epop3YEZhUWA9tybJY643FYXFr3jxnrDiAw=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/4AvDwouAy2K3Yqhh5XvLAmjwdqqeg4pRsLyM1tEnsKHS_4tShq4ZEXMFCuKG3FjMLJyjyTlZW7ECIe5Yw2dVDFTp-6I4ixk0rid4GKTJEbCT3HAxulbefTwB_T7oYuia1hG9GGdB4Q=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/YA8YR-XkexQIRXG_giGbz19o3E9pbKFIGyrLRX6SM-fzqu6MCP4I5jdzzSsq3hvcL8ZMROqGfusu9QNPid8fpapdeI64ofQk3YekFTnH1DxnRWKtn1tvdu2NSAutwjUC-hYy3_cWOQ=w1920-h1080";
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
                chapter0n();
            }
        });

    }



    public void glidee(){
        ImageView guideimg = findViewById(R.id.guideimg);
        Glide
                .with(chapter14.this)
                .load(dlink)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.ic_loading)
                .into(guideimg);

        guideimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yas = new Intent(chapter14.this, fullimage.class);
                yas.putExtra("dlink",dlink);
                startActivity(yas);
            }
        });

    }



}
