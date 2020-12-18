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

public class unit11 extends AppCompatActivity {

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

        dlink = "https://lh3.googleusercontent.com/trBwdShEIs7UCOr-xyv06j8-Y6RXMClTCDbGeSre4CYixUB5ciFQTM0t9X-C5rVjFbMS5xAoP2SfgZLsM0AKOfSR5xRl9zoukZz4aSlQAG61BQyk8MnAE53utskpG_f1DT_fKQu7fg=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/lDp1hhB19Lp60fvgY1cJ01V6YRcvKc1HMCiPaxOCvDfqLWZSCwaCmSvC4AuZXN7T9dkuxdPoElDBlP_WSc0fiX9ftqj1jbisEnoWYfYGeuGDzYAoFFnQ_5821WQoTmJo_yV2jY8Lmw=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/T23twYNXQHVYq_h-Dz59jzWZcW1gpicsdQDkUwyYDaLqp58JdblQUCbZqqZ6yMKXk9in2He2yVjFLDRK8DTbrQKCbEyYLhGROWQ0E5TKkr2CJnAMmfIp6Gh23VAI02ckx-P7J8zsyg=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/BEwD4UnnLs5hcuyePjzC4e-xawBMd7pDRnSYOtBEeinmxIGSFAy82AcS74ifQ7LvHCvyOcXFM_7uaPaqoV8cShdSAYo8Tnq4TbSfCFQYs1wxYTJO1XIAhJajmVzFX0H1wHc2fyz0dQ=w1920-h1080";   glidee();

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
        dlink = "https://lh3.googleusercontent.com/iG7fuUskMpbmf_2WP0r39iUCx9CxHyXYKQkMexIijSe275I7CpZndYmnzd4ruOfu7JikUXUg1gccBEwFTsoNenVwMHL0wPEdIKl-h6zM02OHEsq0QVPCPrl71VJQqwR9PnNdNBf_tQ=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/eTEYQN2tlgq8IkvQ5Uf5vFKhFM8Zde7DO9TPkakAzNxSmJTDkI39frqxwP0KiS1gG43ifFpHsXNAadvWHdSABSjGGEM03EQo9UUQqypK221s0bZuB67EiOfU8R-SG2I1lJhEZABPvQ=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/VnHQA8eUgKNpT5uSwGxWHf6PKSvyseCnPUYMEmvd6hhPvRR-j2GDuPIETbBhp8mt0R4RhExTJC6L7bsP0exWSTI6JJ6SFDQYKXyx_4x3xe3BJZ4l9Wk4GXqupE5yCe6y4teW9IIg3w=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/8vMZtWN9VLzeSXDVRh-ABkLHt1wwVyQ9T-N6-46FfqLN6n3IfTJ2EjGnI764hzVGRFEv__HFeOfURqBrz54qfRfy34hpncKZ4v22p0h89jzJnOipvvdrpEWcSnWVloMTXJqMb3CA6A=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/6cwALowU4VfJTjv18iQMvUr8VtNWENJq4MYDEAwEaj9vjTjgPIhMz4zoiTjrZcjttk-ArQYdAQnuCGOIap80VsWb04ePJWEVDW8KZmlFR0VeKf09RlBZeK0C5zNB8RvrBWPmApSEUQ=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/7B7FTFnIGlE3gnDvwn5nKb67WfotFajGsrgeGB2DFgZoAMeO2D8fRMEqOK-7WtDyfaso7imB2XvZDA3za_kJiMKHJAix7aEk1BlNrbXNu84UVOgSNRxfr67fcoWjJPeP9ZOgVM5jQg=w1920-h1080";   glidee();

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
                .with(unit11.this)
                .load(dlink)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.ic_loading)
                .into(guideimg);

        guideimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yas = new Intent(unit11.this, fullimage.class);
                yas.putExtra("dlink",dlink);
                startActivity(yas);
            }
        });

    }



}
