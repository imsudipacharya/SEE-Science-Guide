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

public class chapter22 extends AppCompatActivity {
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


        dlink = "https://lh3.googleusercontent.com/GC8p0itlHsqJKV9RhSZmjo3kRJtkrLHLcMwjyInOMhNd25R4o_z2yiFiLMeD7Y8kaFXYPIIiES3xRj1T-oH4dakVqhK1FOS3gUzeo3FqOKx_ZOWW5zHf8eJn2D6Qv8v6PS0gu8793A=w1920-h1080";
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


        dlink = "https://lh3.googleusercontent.com/5WS4P4KlxoXVJ5L6_kTkI-04wXuNmv_lilVvLB8GJGc_dbwknIfDNJDQ1glv3swdUuJJmUgVqRZ43kHBVZTIeKECacJT-VbLkwepde9itJzm2jSe3J6_EIaWspMhdsHGfbGKPXHEiA=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/XPvwy7vixuxwHkR6nWP3hHaUzQSYzodyu1j3_3w3mNLOPw867lk6JuHwHEhP6Org2vaRtYRpe2u_P4-L9kE8jyLCbnj2F0BTHc1iD4umthMuSU3HB5SjkEjKnc5HrR-DRW4hsIBsvQ=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/9f6seMCyaMn3ks3cJxZYYUsJXLUn9gc7RYMtGTugvGCewleerc61UP43IbMBwpsNATtpbQ3CElJBsoN-Or6rWnwSXAuhKyDXc_4exJ3Lp-1h4rNvPRgAiavZo_rg-s1ngSuQRuWj_g=w1920-h1080";

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

        dlink = "https://lh3.googleusercontent.com/BjcfBfI533chTMAiVZlxFf68ME135yCvUhjolTpkUT86xyLYHV6OUx7pp1kq8B6iA-HlMQIPxYw0vvKbY4TI6QnBC3S7x-_ZKy2KRYAbU5WtHkB-bclpv7SMmUOcxpp7fezEeNky2A=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/2lbabhHj1Qt3KOXHhX2UzZQIfY4b4OnRo9jNPTvO-FIial2_SZwSJpQ4TwJdRrliA_1Q1XsyVvHoh-LDt5e3sXHj_qDpXkvT3r9xpU0anJG-MnF_w3SczoUq6kiZ5vGPR7sWUaBY8Q=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/BbAC5YCPKtV30vvXkUJ5tYum5_vZZh6iiT4ilUV7XxFAFZoO-afQfQrrADWL1fHM33MT74HD2zQ7SCQn3YdRWnEmI5rpZ7FTUfFKGRfAHWwPLhOLO5YReCJt7bObBxjKxrue_WbFkA=w1920-h1080";
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
                .with(chapter22.this)
                .load(dlink)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.ic_loading)
                .into(guideimg);

        guideimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yas = new Intent(chapter22.this, fullimage.class);
                yas.putExtra("dlink",dlink);
                startActivity(yas);
            }
        });

    }



}
