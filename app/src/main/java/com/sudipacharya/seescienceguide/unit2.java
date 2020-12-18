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

public class unit2 extends AppCompatActivity {

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

        dlink = "https://lh3.googleusercontent.com/ncUruyUBBpuMvXLk6VKy-pfbFiGoIowC0We0JbypJhQjbYxadRJHx6y4DilaxJKJJS-C2Z61H9y_O7oeEIqcQ4evjKG_mXMAtGlV7BgI1VLwJLeDh4tMrMSm7k_iNUQ4RmqYo0NxzQ=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/Qz0vFwhGVOcog1np5Yw-kulu0vPNXgwSJesleDrmkAVisyuJzvDJ9_AuH7ZyMSdMLTEDhKsLODNFp8U-aJ5DlykpRY7qvRrfFxvaQyVWebCiadKTAA_P4BH-Pq-y0S3p2jtc-fDnAg=w1920-h1080";   glidee();



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

        dlink = "https://lh3.googleusercontent.com/-tjCLwm4_7RcDtnfr0Rmp9xKgsFGifbR_wmdTQ5Xhqd3V3J8Q9y_dxa6imWIP15bxgTAUpXnu4-Z4LXT3raIKS1NKSBc7So8c6YdTCsdMxVSFdxZVcfgqqOF16x0VsqDW_ywKtTNiw=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/iV3sZfjxp9RAUMe3_3KQWf-0S77utAn1mUyUx67B7Xd35GyLNLYCF5EfvRg8Cd74U-YxnDJZvwi7RRb7ph9BNYkMojZCFvEjshuI67LxhEATEvheLmMoWrNqml8jzbkf6N255TjcWA=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/bNB91hHo4_JK9PIEFOAeE4HfXkrY7h_gWRgPBYLM9dLgSh8hb5Rnc67g1GU9TbsAIfh1SoLbBb1AluYqmpCSbyCtN3ylxJ7-t7RJ-eoxaSZ-_LM4Egmmjuaadqmab0fvIg8uNkhHxA=w1920-h1080";   glidee();

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
        dlink = "https://lh3.googleusercontent.com/OUwRIuAkiF7_CMfZga-wS98hHaiWYkDa9o0RVem7a6SWONWRRFT6oBjiNoJAGaIno-Aw6WkqW6bkuNkFZDJBomQXUXbJp6LN5Ud9FoRdh_gn7QnvZUHfefxENHAOOMDRTJX5D19kxQ=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/V-67si3ix-9hyzSEa-proARu__Hu3V5_6rMAIoagGl3IbzQ1eg5huMFxMTBFOzet-uJGYnua1sTksCqawSJyY6VNdTO_bMyjja9Hc27pVAnc_JuPF20Pzfi5pX4V2Yf6WxaMalWi0Q=w1920-h1080";   glidee();

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
        dlink = "https://lh3.googleusercontent.com/evvBHKJIanfkGgXDWyPgkV-Ifx0D8iHHO5pXpnAOxPHsVaMn8wX1LuxXIiSj9ICW6sSAGDlk3Rz72NE3dPwM9NU8dm8bmILcT30UjrkhRc9gY93yUxVt1TSHeLiI5dz6LYdkzvG45g=w1920-h1080";   glidee();



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

        dlink = "https://lh3.googleusercontent.com/WycuZh7kiw0pARPKO6YIymAD6HYXCeqds19whkJLzu5GxKJhcLQ9YCGI5M-mElaGoISDoxTdrXSDK7RRv4oR78KjFdDusUyntWZfPBqRWmbp6KUNphjRgZmeRXwcBVJYNS30Lz85cw=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/ki7PTjUj-B2v1N40CZt-nZD7abcJ_my6C_AItLFEOCLJTBCg_9h9C8ZhGKKdvq6SQHp6J5cseFdFM06jrEeUJGECNNk9r8Fj7rE_-K0J2xxDCqXlyTe3Qmm9McAQKfRArgkp-K7FRw=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/RjgcagbmbFd7slOuGhSqHlxCjoEF0vqsQpvzYG6fqLt043nURozYf2SLBUkC7ttDA_oe2EQHTl-J78XyoipE919-1TLzX0yKnTZYo2lukwD4d_YHP8xZtSnDCWstPugMtWCcxlNY3A=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/rqqxqAuekFwD5dVGeQMCi_9XaNU5110rm7cB67a50AIq2AqlQFcJm3zQS8ePRHH4Ji2-xx1qgkMpl27avimJGBz0zcpnetUo9EEsWASSpqfGWgN1JZQvdGH9XKx46JsmqRT3UqvMGA=w1920-h1080";   glidee();

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
                .with(unit2.this)
                .load(dlink)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.ic_loading)
                .into(guideimg);

        guideimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yas = new Intent(unit2.this, fullimage.class);
                yas.putExtra("dlink",dlink);
                startActivity(yas);
            }
        });

    }



}
