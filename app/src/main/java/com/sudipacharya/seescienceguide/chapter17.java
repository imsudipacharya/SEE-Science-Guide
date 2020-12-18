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

public class chapter17 extends AppCompatActivity {
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


        dlink = "https://lh3.googleusercontent.com/YWV-E2bwfmngGe3kA3WbRmixpqxCfYUIJh_XCcUsLJ6wONA2M1tctU4wSNUihllrECIyQUVj4XsQzBKj5jkLkljAJCJcDgF3sHLpIfFbhJkaefVi8n7EFCftumDVdkDT6K9nr2xaGQ=w1920-h1080";
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


        dlink = "https://lh3.googleusercontent.com/tYsTiH8-kK3JFlud2Lt19q6CstJXvEvGLAEg_z3egzPK5P2sp7ofTTq0FDfdjPu9dm5IMBmgDkCqfJrX4SzrlhmYt5pEmUDaKEQo8wgp2v3Hrny3k0yNeHGo1WnRqjQgJVWpSqOAvw=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/OVLdQV9LtlyMVkoZ3taONAYT94URj-Pr5PistZe8n7QJ27Mz83DWFfvOSq-u2VSc_CyNH0_FDxRrN0sM_j_9iGTMAAOiFB3F_lEBuo2IaQK4B0ydAEs-sDtZuFFNk4e8DuusiBQBGg=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/qKY8zuLyWSAX-1s01rhEh3OQohVOClGm0Z0YYqCqpbDrw-cUU-JYZWwVL3K1bWcZiq3-uHFraIKEE4Kpwd3mutDpU4p6FeX639ERXBsc-DuYAsRlCLT9bnfybH20RPFvq9NQJk06nQ=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/lAI4cpfUbQCEH-EsFLopu3TqmVhmqc-u3F9gDRTsYGEtIPfCGQ8c00ZgMywJkWicrlQoe3AkZIXvWujSNQrUbfAkG3UnIUERN6oSFkkYYn_UuDFDJlrQ_VxYaDXzBlwnbJjuPh8hYQ=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/r1BH_WW1g43RNYirva2b1sma-ZaewRlUxIwVOybPd08I6A9ZK2N5-Zc6I9sskqT3jTMgo__dhSEcg4lVqtRNynxCl-WUx0OO1Y7NJKwFQvVP7qnwt96Uc15SGzkmjY1SQN9_kA1Adg=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/nr8iM3vn6thSneMr47XFu_KsJ2cYNWP9lRhRldeKR_u0XiOSPR7dplJCFriE2Wg7V6Nzg_39uDka-MtiucTMqUVxMutdQsRtor29yn-FlaXsvydDZtNUxnuLphWqeHcr_1aL704vGA=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/LM0ff4UHCHx4BJ7RADY-Rx3dwfpleDZjrdIoI5xXyTwsvKuWhs0T4Ur5Y6aEZHad-TJUvIZP0H2T1NHeTIBHmgmDsv3doo3JG00A-xuEWHN3u5ofAptCWw1wOyrVX83NpdnUvqB5uA=w1920-h1080";
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
                .with(chapter17.this)
                .load(dlink)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.ic_loading)
                .into(guideimg);

        guideimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yas = new Intent(chapter17.this, fullimage.class);
                yas.putExtra("dlink",dlink);
                startActivity(yas);
            }
        });

    }



}
