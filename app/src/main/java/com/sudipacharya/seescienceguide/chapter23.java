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

public class chapter23 extends AppCompatActivity {
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


        dlink = "https://lh3.googleusercontent.com/FmWeQXVgECjow6apXPIW-MMSdm1EXuyRm1tP-KtVR9epjxdFvAnAm1h_Fiq1agawOtjONY6N2DBCAf99viRTt6L5F9S2aaguwYu4oIksfTE5kCuGWOfzyNjdH2t0cyCPOSnyeRlUnQ=w1920-h1080";
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


        dlink = "https://lh3.googleusercontent.com/DIzvEXD9CFyU5Z4n-EZGt3NAdSBVeKye6u5uxRyLc6MdNGPQXYg3xTp020un0OV57sIBW3ti5Gw7DT-rpULtqZ9_sNCnkgBffbY4a9qlPubgP_6N5jeWfGFnJ2GCSY2bemCnA-t32w=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/i-hjy5aLjNxueYqv2vunXiuPRTzIawQxxsQJz6DDBG6qrT60OZhJssYqLKs0NWvjScff6aowpMcF5PzLmmBhKBAmGC36qap3uA47Mfl4FVY0vGB6MncKRBOmT4rznXC6NfhlFLKmEw=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/QakKCWdia6-bs7wwskXMAb7VYD9igtXxiqdxI0kIVc2AYdn2VbX4V9wt1-J0iFb8PKYrlGY3Y8ie1NjswhnP43YR16vO4WSO945Jxqn1vTrCp2LcXcf-6C9_VIGyzHWvfL_jYiYsuw=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/Qpt4VeWEFckBQvcIJ7LE1U2yxgNdtaPLT7zbFGUxJu2ywcwkZV3REsBQGhCDpENLwFlXrKbEH7o95zinavAPXAypduPoyUuRfsz4YHyHyMVH5EkrrFa0XcA-0xAU-acVF4ua4001tQ=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/mT_AFQHdPiS4ZsZiPFdY9qBMWbM55-jmugou1ZfqL4voMEtQ0PQbxvNBn348XW8NEEOGyN_HS1vCW8mz5TlVJHoDVz9PQm7FUx-wT-5NTuADO48fk5dJwoSzrg7ovMivuNcCKQonCw=w1920-h1080";  glidee();

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

        dlink = "https://lh3.googleusercontent.com/6wRC_oIwQF-RZRiyIGpO6QBgpwezjqWkiiNfsBdMt_zCT1pfKY82r3A2vMV97O-_i7aWLPqG3MI0l7RcH4BG0bwn5QNYeqdJrBUIlGAUly3vKckEBPnNUlBHS8zAG1gkBTvhnF85yQ=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/CpjSfBLPDkq19XDXXECQuVZlP9dHCB6wLF98tMB3zrrhxCwLmnLTtEYkdMJT9q3aiA1ZQZRGBoHE421bvXv9eJ7vojuxSEM-gPU367DQ4TO3BVnrY6RgcEDzts99cfvV_BO0va6Aiw=w1920-h1080";
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
                .with(chapter23.this)
                .load(dlink)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.ic_loading)
                .into(guideimg);

        guideimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yas = new Intent(chapter23.this, fullimage.class);
                yas.putExtra("dlink",dlink);
                startActivity(yas);
            }
        });

    }



}
