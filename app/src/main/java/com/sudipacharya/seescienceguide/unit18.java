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

public class unit18 extends AppCompatActivity {

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

        dlink = "https://lh3.googleusercontent.com/b3u0nGm0BJ69zpdURRzFnFQj1_4C_7ZYYvybaslCrPB1wwPkjRoi55wYiUEcdFTKXlSFI0MnmmLlvVXFllM72ndF4w-RiRun_Zc0Xcgje0aqIDs6HBbOrD9Wviuub5a7lJugHoWJdg=w1920-h1080";   glidee();


        Button prev1 = findViewById(R.id.prev1);
        prev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter13n();
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


        dlink = "https://lh3.googleusercontent.com/D5FcZSq50TESXbBTp9qIfeesUVtCav23SB3IqmiRxTJN3oi-u7mErs_zOKYlIBk2kw0hyFxBx3QrJdu4EBAVvqO8BNfPQfnPMKZMPx6AJ1VKEgqkOltLUP-bDAtwjurwAwXCX5Chyw=w1920-h1080";   glidee();

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
        dlink = "https://lh3.googleusercontent.com/lH4_E5IWlhX3LCrJsOsyqxzvSvGYMJRNyaBa-RuuS5dCO5ZUcO2A6_GtnMqTg55ETTApvfjmZLCGefI4jO1hOZ0OTfHOuxpRKsNS-RMaWOe3W0kcYymBC58RpYrOSrE9Huy-SGDrWw=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/u9dGH0UVeLwgBmCADzc6oZm10PGRXYDNNy4LwiGOPIK-57-mVHXOfYAaYQAhOFdTBZC6PUa72eu5otZYS3FN6_Q0FV-04MPwJ-e95ij0Vf5fVluSxoBr_qwhiF3S8mjPcAfdpMLJiQ=w1920-h1080";   glidee();

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
        dlink = "https://lh3.googleusercontent.com/85DBCIWHfmYPwyKkd05PNvB-GHmxpajym8e9Ro6FlCS8nhJIlHxWcElexRbU88Lk1B5zTM6xEv2ylOkicxRFTj82ucHjPtrjJO864oQwK9oWuwBvOTtUkuxnekNIjSFMTnbRmhFevw=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/dcZVW29ZvA2_Ozg9IyAYAmbA-Sz66ugqPj4VGtQTT8zuWEI8QS4rdT35sS4B7qL5b8SOqsRKub4Hk21Mpab8Bu5dgPdhB83TKYeqcX7X-fd9HAP8z7d90xyxjf0thsqsdL-lYobVnQ=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/eJf-cFTJD4rzBVAfCG6E0lgGRxZykM6AG9HQLAf0BFlvpU5KiEJtDyGPXjyyyQAQogJSWIGt5LUP6SO5o95Z9bADMzS0P95UQd9ijEcoqXY9ww8_jkZB4WjGUPFs7cbec__Cf3CKZA=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/5ohhzeHFJhcEH7VIniuT7xVC1_-SnKae6Y9iGcgDhEDfFzmXPAF9fDoBw1SzlgafDQ4fXsqW77vV1RaPlN39GLVNi2LVSo5mcgcsPSxnf7L5QZsquynU2JqkfmxPQ6jsb7Dp3mt5QA=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/HTlbiJacFCLQwronNMWh1kvJDcD-zDjhIUW_O6_K9TG-GTWBptwT8zPYAv_W7kZu44FEL0YX7uDFmFA6aKtcP3JbwH2vf9A8XhI1URq72Df8EdQYeapYsx71taFGSJy1Q8fMBhIADQ=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/i7VXHo3PYdLEX0akaXkOH8cMc3SUgs6EnB3TX1yYdxa6q__IcEc7AUwcD8s9gGGg1sJTvyStqeoNAlICIJFAZ1KPnhiSoLhFfouJF4SPtf8OzkDzMtD4YeH2oCIktw7qyNBCLZ5owA=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/TZ3LA8qTl-NLEmyWdRSVsBopscyV6ltnyJxEwzUXrk22SBFllzl-zhNXYpqenuyNZsT7nHEubCyEQ36kmcY13XMtEgNcGsqzkEsjHfHbFoXjqdKlFKuKu8zbZd5-eGQO3nSi733gUA=w1920-h1080";   glidee();

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
                chapter11n();
            }
        });

    }


    public void chapter11n(){

        dlink = "https://lh3.googleusercontent.com/0CKJV4_Xq6O40YgMIIeGhPsUIN7FSX-mQTr2cMad-9HjSQ2YV98yvzRmDOxc0dRmfTIpcx9pZ77D1-dxkVD3PL9iz_HWMxukEvT7DVH1aP2Us_HSIWlVjW1pE6vTD5NE7XYsPeFk3Q=w1920-h1080";   glidee();


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
                chapter12n();
            }
        });

    }


    public void chapter12n(){

        dlink = "https://lh3.googleusercontent.com/BRtcWimUkiGiBiz6NKPVF076UfxhtY2NyH1Z16DmP65bxOu8-h7DmbRp-9P57jzsEMDoWnHnrWSM6PwSxHA5TN2R9EtHhYha_Y-ytpMDnkINV3PF3qh79Dt5g3LIGG0MW7FNPa-8IQ=w1920-h1080";   glidee();

        Button prev1 = findViewById(R.id.prev1);
        prev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter11n();
            }
        });

        Button next1 = findViewById(R.id.next1);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter13n();
            }
        });

    }


    public void chapter13n(){

        dlink = "https://lh3.googleusercontent.com/9Lf0fZSdX5WUCo6U9UP_p_pRWB25imSz7u7LZttAqQX6lJU-JYwVf47aUD5hCx6Uz5s9SE56Sy_pfUrH5GPRpnuCIVJxaH-4G5HuZA1jOJvDWjYrzL0c7x_uu0GcNq24yyE33pl0MA=w1920-h1080";   glidee();

        Button prev1 = findViewById(R.id.prev1);
        prev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter12n();
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
                .with(unit18.this)
                .load(dlink)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.ic_loading)
                .into(guideimg);

        guideimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yas = new Intent(unit18.this,fullimage.class);
                yas.putExtra("dlink",dlink);
                startActivity(yas);
            }
        });

    }



}
