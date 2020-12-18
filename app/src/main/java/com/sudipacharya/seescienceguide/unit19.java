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

public class unit19 extends AppCompatActivity {

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

        dlink = "https://lh3.googleusercontent.com/5Lmb81e2w_ixMUpE_tRVEJxJqYhF7eRPRicTeoHqw7lzZNWD50uwdrGmUPYZFFNKFWVdU7WIFDYO4iG04HtqKtYJ_FJqC-uybUdPh82I2Gjxi7rVoWcybymEDZNT-pA7JJFneAWQ6w=w1920-h1080";   glidee();


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
                chapter1n();
            }
        });

    }





    public void chapter1n(){

        dlink = "https://lh3.googleusercontent.com/PQYvV3dy9ZU3m295zUGxMCoRzkafEMJNq4f6JGS7mdRg1bSDZyWR-41dDkShHTaaTFOtfC6piyi5OtFzcyYVpjIQaZfs8es0mCxb-ySYc5kqzekeWLtBE_SEvyeF6amx8A04VqvlaQ=w1920-h1080";   glidee();



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
        dlink = "https://lh3.googleusercontent.com/nMcU7WNUFbbTHuZxpdr_1t-qk7p9VlcV3hEm14Jcb6lvIv-FnMA0I9NezzIrR5f111Rh5P0A0Juv38ESAcOrXkVxVu1FVCvfc248qQ4JRGMxgxoG-GiBIy8u94qxaE6rvI_S63ka9Q=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/uParyo0I7eZsVVVAwh7uNYxplwUolA5RxFgQcIYyCc53-gSGb_tQFXA6x8e5B6djZ2wcJHIU-mzU4h3Pu7YSnn74SAZwcQ-Y_0ogmo0n_IIbQ6Zqhq9jOk59XvZfpV0nfQxHAtUY4w=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/d2Eau4DBlwnirs9iqJmFa4dwLf23EtWCRqpotplNEFjpuVsRM20iLzh_uUm4q2Q5JgGKcjuOH4zQ_eTsgw94HhmpWdtwgK1koZLwGadOKK-H4xmlJn1_j_L_9IW_HybnqhcKtUr6xg=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/z2grQwzosDukYHhbmh_tN-Sbgh17EUY45A7wLYuV6bqbFYGx36yC4EZWClJBfXTI5Hk4d1qjFiYlCCId3qUgMk6gD6cFP0PS0bk8KZpm3tN9amUOFY98kDLelhNJGYcWy3nnsfksaw=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/PeriLls5AVPiHHtXGYflA2gWXQWibYCg3Teuncd5yhbXgbolX7g3RfH0oZshkgsp3zdqpBu2jiwtDvB-n22cEvTNuYXRIlHfWz2fPu7MkgkQVmPiZICfNWT5S1DGvqEXDeYoQZdgGA=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/IZC_RGFtH6j0mBH3meOCwnd4y5fC1KvAg_keKO7oFgMc1x3OxgFi6wSjgX3XM-jCjscPfBJMsw4nYUXz-sDn3T-YMWvjvdOM6fxV1qth73be_w3pbfQ6OG6t8bz_OUhNi08CmZhu3A=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/GcVPxZXfouIwL9Bp1c0Cr9IYOEkirCdpfwgrND6PpVAJpGqMMmf7BgYFHSuVCVoc3uQKPZUTEAk_y4hPP4rfEFEhJObJp4Ft23J8ipaNGG-IAjdZS8N8MbHY7UIb-eU__kvk_ISeLg=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/60AbqCn3b11_7nCOC7-qpXMs1cVJZZx9cJ3pZLFT23_iys4bb3WkCjYLPpdgt41ktBaDzSKsZErcCn-vaJqKUXrhnkmPpAXFGCvS9LbIMkDCWld7cGjEQ9g6kTfME5A-HiDGqTR5FQ=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/RgIPFG2VsPykSczpekU6YYosAo6vuCKgfryrDOGsbs1jTLoQkHLGEnzINzJRaLVk-dcuE2esNRKilXILSwKFIOBRF-TnDJasHazPqzk63DDQBhVcBwuvAADtgwJ72zvk-58i5JOQ1A=w1920-h1080";   glidee();


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
        dlink = "https://lh3.googleusercontent.com/TsFb2ehkw8W51sbN9ge1C1ieEZY2-wB6xbE6LTkmbTl_BPzFPC_u4qFEb5SQYv2PSzmRTSU0T518h7Bm1OtqdR6Ggg2am4s0zQgPjG7PpwFPOzNWtIvJSJPqgLeik6Za2S0ilJJjUA=w1920-h1080";   glidee();


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
                chapter0n();
            }
        });

    }



    public void glidee(){
        ImageView guideimg = findViewById(R.id.guideimg);
        Glide
                .with(unit19.this)
                .load(dlink)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.ic_loading)
                .into(guideimg);

        guideimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yas = new Intent(unit19.this, fullimage.class);
                yas.putExtra("dlink",dlink);
                startActivity(yas);
            }
        });

    }



}
