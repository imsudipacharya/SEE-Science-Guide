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

public class unit17 extends AppCompatActivity {

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

        dlink = "https://lh3.googleusercontent.com/DpzASZLKuU0tmRyBNg7brjEwMoQgD1SzT7AtjeWxdULuem-3lFdqR_pc1UQaRHhgwHBq_mAzNx4MfAXWnpcqVA3y2xjMYqlYgpeDMbjZ69HBnVzysR0CbrG--E3c8wqWJGj_A9HkQw=w1920-h1080";   glidee();


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
                chapter1n();
            }
        });

    }





    public void chapter1n(){

        dlink = "https://lh3.googleusercontent.com/r2942hn9BHNAHlLVTvIU9USkrdIzP-4gN6a27OVDjdLIiYMBmI-OL-YslxY0j18irrauD6jIyp3jvL3MXdNK7TAabYbesDnO7HrEuhi3zoSpDcxGVxhLnLh0iFSBw65FXmi-435dGQ=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/6TDl05S-kw5s-edTzrOJYaNm1q51jW8nS2itdgMQrk1GLgsyjdSAvW9v4qJQtPkX04N3qLnetFHZtMH5FSK82DNjE55lUG8xA6xU1VFX30kvpSt2wKA38teJFug3PGgJ7ly8ElqUwg=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/E4EAp_XpbY-XZELPodSND18tSTojsEWY8t43xniO2vUbpdQ3vwV5JNbsFfHYGCib2DoluQaxR3sAtRdj60fuQWf1T56quLFKXpyEbPBgeCrd0CMFjkNEkq7S-z-r-SS61mdghvoKpQ=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/ZO_k_Rh769_CuKuvnNzXApxT-m7Umi1PJv7vHCbR7I6zO2InCqaJl9rgt_aVZ-jJLmXVVy7_i-oY-fux8N6pz8H1ffzV5fX5ivoOkMcscLPao90EGWSSfJxpkQ-nh8tVq280EgSbvQ=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/fEVLqQPslt-JldDHKgyte-3wqgL51fVYI6IxM928m880KS1hIPf8y6m9hhOwqKRLDtg8cVqh3WmwDFnwNp5jHxHGJFJiuWcncBlZwqc5obYwjro0-59gh3NdXQATv3qcQEwDm9_iPA=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/GKyTSNaWVimj0lf8HYt5fMXuX72GuTBYsFPHNCbE1YBCb96fON4VtDTlwziUIfdY9rN-g_3sQY1fiOID-AABctvkmWXLnTiED33hrGK2hKXkvc1zweZe2auKgRY6MwWpIsPQDFtRtw=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/f65ki4bh1wjXtHgjKe5xZW96Jww1s-QXgnt_EcPZbwkp4nI-9oN3WKUkTjrb4QVh9RyqHdfn9EWhzrfVm6VLSMDdiryboKGExwNiKIfNZSeW13mDnhru5whrySqL1Rxj-f5RElpFNA=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/FNcrAtU-1lRgkE9QlU9rIF_fxPWGZt3WCzE-2vIm2lSnQKmj1V0gGG9jnssBDl99vNgSpL5_ram8WooKQpR86Iq4x9-cuSpB-HNvPQQPjJw0Sd6n238aptGZyxSMGlXC_XKeDKjcxQ=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/TaL9okxCZOFRx5rDPZ-fmRDTFQdZY0A92uAJW2WfFytxRo8WRQUZ-NwWo-JnH25iv_AoSZ4ytnTMSBJY9v7v7pQLWkuR8oOckC393VYNLYH4wAr-LkKMQCwX1S4eiBqYr72JAQgobw=w1920-h1080";   glidee();


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
        dlink = "https://lh3.googleusercontent.com/vXMrQtpt3ax8pX29TW6igZfZ1Yt3E9O_j54jaJQR8cWza74m8spdAw2GKe831sTOE4PXtloWtPZbrOHF3egmen4hsvfTa6-F9fywMEa3wKAuaWQ-5lGwz1CILCXp3mvRvfFTrdI_lQ=w1920-h1080";   glidee();



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

        dlink = "https://lh3.googleusercontent.com/SS4SsjzlDcPrWzAgYjDVWghRFP-fi6NOiMN1qF_wNsHE6zCKsdkJvNRHWoiHPiCEwduvGSl7erl1jRJr4ixUDGaJiyB0zeXzuaTrmEPACnTww17CQP-P4MJrfo57EJvBZj92sYsiTA=w1920-h1080";   glidee();


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
        dlink = "https://lh3.googleusercontent.com/QsRKqHWdzBWZ1BRjpC5pVXJH9a0Twt5t8xmuIXjwdNHTLbdmyyPxMgv0yJ4vsd7T2C-Z-eFA_xy2IrOGa7vwdTAtNQ9TCrM4lntMQy05YTSNPq6OsQUK6r3HsSklZ4bMPAn6Gs-LbQ=w1920-h1080";   glidee();


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
                chapter0n();
            }
        });

    }









    public void glidee(){
        ImageView guideimg = findViewById(R.id.guideimg);
        Glide
                .with(unit17.this)
                .load(dlink)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.ic_loading)
                .into(guideimg);

        guideimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yas = new Intent(unit17.this, fullimage.class);
                yas.putExtra("dlink",dlink);
                startActivity(yas);
            }
        });

    }



}
