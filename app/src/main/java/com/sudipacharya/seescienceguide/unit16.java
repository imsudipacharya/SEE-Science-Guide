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

public class unit16 extends AppCompatActivity {

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

        dlink = "https://lh3.googleusercontent.com/sgSrjUcOBwMfORmWh1tZG45yZ1E_wJCSKYa4SZAk9oFIpudQWqwK9RPA_6TrkqG-G55SuJoaH2rDGjAiWAIgN2dnhJG97tMCyG5z0I_6VzbirjEQ0ewO75gSMyf4ZwGsRgEOG_r5Og=w1920-h1080";   glidee();



        Button prev1 = findViewById(R.id.prev1);
        prev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter14n();
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

        dlink = "https://lh3.googleusercontent.com/jJNTrhQAYyuPUTOabBwlCgefiMejHRpAJjQ_BpKkHG0t2PbhbSkGeOgI3TX06pmKQORyEhlW4v9IASWARtckhBcoHEhqEciw8dmZV7N09msvlV38ZVVXlhoW4_AMrzCteAw2qNwwow=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/H2j5KVmmU-KhYbELEKonCAUopfFd1yBCnoGu7GD85oqdL3cHcIFFrVX1RUNON_0yyVn0hep1jNgBRUnRyCwKEBnT9qk1XW73fZOR96FU8jUpw70XP4Dqukye8G3amMrJC-XBaHIm3g=w1920-h1080";   glidee();


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
        dlink = "https://lh3.googleusercontent.com/-xOwos-xHbAKUK9LC_vvnjoumfw9rtStxpGTuC7kw0RIrJn7eK-XNZvoogEMbJUwJx2gibW3dTYXOVCtQ6Xi2NljVpawwG3ZoOTXQm_2PMyXFSkhbjYsPIvZI7RRaW6yHjfXfB0oXw=w1920-h1080";   glidee();


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
        dlink = "https://lh3.googleusercontent.com/J9sZyHJkO8fVRNfj1EZvCKXZTE8CKfWL9v8G3ILTLACAGfZbSjNGJbCPsSeAie18-nB2YSd9a0cdpz3e_M8I9QSBaXZUex4toKrKFWe9n2Sqtp38pPbHq4GLgjJPesNPMqu1I3jaUg=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/PX7jIa8P9GTcRdQda2FJ8OPDvtnIBi9vYUGVA0WtGYO4xgKDq4m9BprDcWdG1_4SN-uINFZlO7L7nIOyCDAp_pAKTBbbwVjo3q4rRrAeA8UpzzmacKre3XZyK2tS_lwBqWqVZZ1ZHg=w1920-h1080";   glidee();


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
        dlink = "https://lh3.googleusercontent.com/IYXPklUwNt6vsSPJ22XYikM-oBz_oVbpLSFy2sZFTcC3Ns7kjmQ_-QoLNnQVHfrVl1pdk__i9Hb-Z4GmP339NDpwkoV7Gp0CwyLQ9LnhCN7z5OXAkM3S8W9Rsk_O7gSz6RIhLZ2ajQ=w1920-h1080";   glidee();


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
        dlink = "https://lh3.googleusercontent.com/aeYNYboKSP922s2uywZrDvZJ15DkEnrdrH_2tYeCW5H0GzPfDjwVBMWg6ObXUcVi-Ehi_8Tnt0mJJG3FWr6rwocuDPRQ-1lQBPLpfWwgmBlvsmAcT3Wz57L5g4nmLvjXwMcPqGRZDQ=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/VMG16AV_PSNyzVc6ZUId_USu_-s0vyAqwCyQZ0ePxiZ-pMmDLTZ-JXI6Xgrk_GgK7LBCvw6QDMSBa-n-soDmSECLFjK5Si4TJbyd1Vlk9pSjM7UKpYbDu3uO4_0U9S2pB1iwB6Y9eg=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/T61732pkPjzQKEKWVnhYYMr7gy5ddjIllETT6fvBCDGWUz0HAiz-aUH3rgmh8BQji7uqV1j7EFqFiDMdh3Ddm-_1b_2IyeEVydhILvq2hA4I-fgJfTzahkrTH2TjFNcskprD1O2jgg=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/Ankkl0nHrAGeTUqS-CcWRld1Xl_-aisl_p2ajwtKvBf-QZQ0-JZUuAsLpq4PM4C2rPRzrQHDv6-vWXIrLTRyvxeSI-l7EdhJPqLdEadlnzUFBnwj5QXOfatgviHIwvsmbzUFZo22BA=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/kp1vpGmCo8Awn5xP-t31zyylnkB7ivZvtrBrPCdENkJ_HIbtQInxtxokZ3B3r4omUnuxovLOCfpcMFICd4GatoNmmNVIV296UsKevnXkqDmhez7qvxCgAfaU3Z3H_DlQYiHzUPZKjQ=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/NFhhr1UAz_lPZeGPSdXa9RcoaX_G7AG4TJIdFf4wSe1gbydf_mREjCDiSHJggGctZi3giOzlwpDVnasrJppBe52vjyrb26Z5gzjjQ3QjbXTwJQm6Zza5kU4dx1fQmwObCjKQKjlzSw=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/KTyXEYGgOPzP5G1NuraArU2BKa-uGg2rtbCNEIyFfAUTKGyMaQVlEgJLgZzBlKnNftfznHDrT-XgsCKUHmu5rm7N3NjraYHSqZUb_XWCJ-piZ5-BsA2s-HqFNm12p6pw-IEb1zHWOg=w1920-h1080";   glidee();

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
                chapter14n();
            }
        });

    }


    public void chapter14n(){
        dlink = "https://lh3.googleusercontent.com/TmdQs_vBuD7BW_FYbotlP4V6aH2Gz8e2j80q8TsDLP7Vz0-47xuQPnQjvd75iirc-ANWciwvCL0MNOKIeDvJPuAd3U2fwq31gT_qfSQpvujKuBrywNguVk7FXkLD8ekKAIXTFUlihw=w1920-h1080";   glidee();


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
                chapter0n();
            }
        });

    }



    public void glidee(){
        ImageView guideimg = findViewById(R.id.guideimg);
        Glide
                .with(unit16.this)
                .load(dlink)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.ic_loading)
                .into(guideimg);

        guideimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yas = new Intent(unit16.this, fullimage.class);
                yas.putExtra("dlink",dlink);
                startActivity(yas);
            }
        });

    }



}
