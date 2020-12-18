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

public class chapter15 extends AppCompatActivity {
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


        dlink = "https://lh3.googleusercontent.com/tzqNiseLqhRR6_X6xNKRvlIVRzhQ5CTlJg6omaBYwpYPUR7oTgU8WK0-xnaib2Z6PZAjcOXLF8pyvqRT2BoBafkNMWjNnUf2qQUgy2gOZQ7ZKSUsT67oiv2r9K6wxAMl6cYfKn5zzg=w1920-h1080";
        glidee();

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
                chapter1n();
            }
        });

    }





    public void chapter1n(){


        dlink = "https://lh3.googleusercontent.com/YRlsyZxLwhC5Rshzg6Vsbawtd5Hc9ZmsM3OK3fJV6UjOroNtjvB2SOJDUGrZWi6s-_u0_zUTykxfabuGTOZjrW5kjg6k3Sfl1bINoAclIoDK1k7T6SbGohsAhLuIR068NQ-VtV8Yfw=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/OP1fcW96c9D8IYjPbGo31FIF5zJS71vNZlZQGlmGtvgaKylw8ZQK15eihCG2FOcCT-L0JeedEFBg6Cldi1Gbg4QbJ0FF5gjY8pdMBKlw2nwC3dafrnEr4PXqY-v0WmfOJFnI9p5kCw=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/9UdVO9AYvFPcDsD4Nc7GYtyvgLj-2VDd0s1xtl4EPVmMtet9mll5GFqImNpzHl2hwPb28gachdOyUbHG_p649lSb3wqDer8EL19HsQVwsqY8tVlCc8FkvMzKhtOhB9npoLVFYugRIA=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/ajOtbGsE7QsFFUXqzkvDgjuVukL5VBwVb8rYcWHumjsjKEJL73XMg2ybWCBeuqalsfcbhthtgTF1QfIjWZaejCA9DnHKFc2njtvg1TBvVWw9r0C1mmsJ5GE-tE_wvCRBm6TQ8pmFbA=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/KMTGEZUM7jj5tyOHK3fA_lfX_1O31Ld7ef0ofQqrKLzeXbZNvkbmZQzpTxxiKz5WCa1MdE-xjgT9i1OU1WG5JQLnfaBWxBXgvWg-Ha_e3SW7Izr2PiRXNnIMzHX-19nXzIz6VgW-gQ=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/4PhrW-m6fG0AplfZLV1dIe37-MxxYjTr8J01xRIUUeALkkFw6ibs9-2hXDacMDYa24FJFUFNoJ4iP6AvgSXxl7jwBm2N9nmNlzu3X0HPPTZecrontpCi0I8Xl1ysiAitbMVQcNL3dw=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/td6Vl86QmQsZnNQ_4bdZOZBnMdCPgy1-C1ZvrKlMsvdXWP-3hRSinNGhpzt0_gRPM1GhyqbI6qasuG82aMiFdlAmf_dG2S04uyb5ZvaJbT7S1xx7PXzVKcGTgR7w99xdQJOSzJiAFQ=w1920-h1080"; glidee();

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

        dlink = "https://lh3.googleusercontent.com/fit13SCO01ypqVVquncLaFga_B2XWEtpJ-UR0KU2Ydb2mPU9OEdQGYjBkauViA5SDlWxBt29uO0YlTprXHGaW0ZNWbrWlYhIhI1w9vbwaUTXkznhRtW35SuQVplPkkcsbY42BxnlIw=w1920-h1080";
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
                chapter0n();
            }
        });

    }



    public void glidee(){
        ImageView guideimg = findViewById(R.id.guideimg);
        Glide
                .with(chapter15.this)
                .load(dlink)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.ic_loading)
                .into(guideimg);

        guideimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yas = new Intent(chapter15.this,fullimage.class);
                yas.putExtra("dlink",dlink);
                startActivity(yas);
            }
        });

    }



}
