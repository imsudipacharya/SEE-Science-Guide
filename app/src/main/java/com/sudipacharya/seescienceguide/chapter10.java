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

public class chapter10 extends AppCompatActivity {
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


        dlink = "https://lh3.googleusercontent.com/Mtny0wHe1pmg_BckABlpVgkaDxY6UVqxkVW2Ck0DBiOk3xCejh9Hp5WVmtaONDWPN2Qq99sWdWtbrnPTmiYT92TrWatFsWIBbv2eS6Z4xqf5EfxmzRKTIO8ef_HSlYy9vJ2OyOJxlQ=w1920-h1080"; glidee();

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


        dlink = "https://lh3.googleusercontent.com/UxkguUKzqAa3Lt-z30eywhNep_6AbLdthQEEdyO00ZgDSpZwJt1EURJQQ-y_w_JSN9Ec3JksaqHu5najUDFm4AiKs3M0IogCYuHPQJAPED5VaGk31SOpK08egYgquxLkCP5c8Dw9dA=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/3ASp84bD4p4hLQ5m19FfgUYp6mYkMB89rVRoi09zj_RPLVYL_6Eifl5d5xsgT3hceW2n_5oRlASXdPdpQwnWT4IeaxMJ3niYfD4Xg7apIjdNNIy3B--ihVw-D2JCnzJ847jYDWBcpw=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/hnZJY7FdPtEa8KlQyhQOlP_bLXbVNz42VsjhWYf4Zctz8zMp_g_rx3roF_G0uvB1VLEUmNzGMx26xJEAYsUjhxaIJhS3GWn1YrhaY3_ZuH_1rrsy27FFI0Zfzd8DX7sW0ckc1aD36Q=w1920-h1080"; glidee();

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

        dlink = "https://lh3.googleusercontent.com/bNvRohXbN9Dln8y3AZqICM25OHd5Um1RXLy1w0ZyUQTIZqAq2XfmMyGh6CRiV_cgPFt7qAX7GvNmYweyOkG3Q0NYW2VoY9-uzWzQ4fIP-7suFi3DRvyv5xiUSPapIpoaZstwEd-oMA=w1920-h1080";
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


        dlink = "https://lh3.googleusercontent.com/3cEpy5R34Ma3WRBrOpzp-sBKRLp8K5dzcHlsTxu80EDB5vjso79UUGlULVLfvt-L9O0zgiD0ABYlH1593AeX61YGvnfMPAjty9TsC3aASJwqNU0LipIMzLRupiuO16j2m4oNIUuX5w=w1920-h1080";
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
                chapter0n();
            }
        });

    }



    public void glidee(){
        ImageView guideimg = findViewById(R.id.guideimg);
        Glide
                .with(chapter10.this)
                .load(dlink)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.ic_loading)
                .into(guideimg);

        guideimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yas = new Intent(chapter10.this,fullimage.class);
                yas.putExtra("dlink",dlink);
                startActivity(yas);
            }
        });

    }



}
