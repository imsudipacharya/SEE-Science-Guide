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

public class chapter3 extends AppCompatActivity {
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


        dlink = "https://lh3.googleusercontent.com/kOgLDndFuHiP3EaueVfi5wGoHN1FHqu9cGdxI74nQJ15OURASTEMDknFur_24aZVsvLhTVmaUqZyg9-GZJrg8_btvO3V-r2KDGUo9jYaSplCe7BsBqBRixv0s5sg8CDvMc3WHIhi6A=w1920-h1080";
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
                chapter1n();
            }
        });

    }





    public void chapter1n(){


        dlink = "https://lh3.googleusercontent.com/NHNMsAeVfhu1HqZpWX3ADRdNl9HFLjzNoHvSYhCWRwv67LJR9SrVUgDK86PoF8CAdMM6i84-rpKwF-4U-CgkAlJOldtriXdO2kvokrWSduKW-nCdHGbnAZxRbaAtt33X46D-KEyJCA=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/siKXW1nv6zybxadthq3ObaGf8JuHBuiuKtGA5avvVEKtpmmg5crJgAedGF_3UUqeb4cMgJtFxDqbYy7umMVUhmJLaEeN_W6G3JpMFdkZGt33cQeh4z9cxXbtG3DSy38cuj7IZ7MI9A=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/H_vYJa3-MmXYpq-qRU6dnn2zGj355f8C8edjGwF56K_cGpnyLlXH5yUrmibuUi6_1Uk1LK67mraHmPjSOPjt18W4mVL8gJ3rHyKwE7QP_H0EDFWV6LAGEb4CorTw_v7YMcpeM_T5rg=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/GbM5xLYn1Re4lm-hOcJnsox5XMRZVhuHmoO4BxnSihWwbvn01q-6dV7fHBSirVP-vr63YAJoQYPlfAzcFO2K0KMDnwad801o-6_CdHsJ7-uvlcZvjT6mLdofnxi2ndsYNaQLSkV9yw=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/5ggbBB3VB9sDXiH6AeFNVWPlna1W5OFNa-Nfh-N60khuw8gZ6DKSAVDPShO4yFvcxvI3duYKBWXS1poBFBHoqN4iVTy3Vyy-l6a6ZaxijowBoWf-4Kelb1Wmuv0NMikPhHVVP5Z-bQ=w1920-h1080"; glidee();

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
                chapter0n();
            }
        });

    }



    public void glidee(){
        ImageView guideimg = findViewById(R.id.guideimg);
        Glide
                .with(chapter3.this)
                .load(dlink)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.ic_loading)
                .into(guideimg);

        guideimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yas = new Intent(chapter3.this, fullimage.class);
                yas.putExtra("dlink",dlink);
                startActivity(yas);
            }
        });

    }



}
