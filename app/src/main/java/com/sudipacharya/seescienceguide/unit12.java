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

public class unit12 extends AppCompatActivity {

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

        dlink = "https://lh3.googleusercontent.com/kxADw-g4WRsEc-RNpIEs8zbOXphdGjCmwvlcI162PAnT1D-FOFCukwl1S9QBMmYnJ9-62mBS7NDBFlkh1uEK2eAGIJiJD66Ii-fP78rVrH8BKTMQa_OsNjPuXMiHk2gaj-rErctu-A=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/DY1xTlRFq135ytnQoFvd0zUNwYMo6Jxt7ezNKsv2nO4CDwm5MeXZaETAFvk4G1_0M7Qi1VCg42BQV1__5lwYtvsuG9q0J0reemOkXAQgEGAnQxj7oM749m9f0EdP5utmcT89MSbpLA=w1920-h1080";   glidee();



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
        dlink = "https://lh3.googleusercontent.com/wsVWkCtifK44yR0oG0l700leG8YLoZ7BertCM2Ibor1Dly8TyQlAMw7Dsc9VX8voAIR538bD4MpdmSiq1KQ4nDD4UHR1H31FoaEAg8RbXVU01ARQPlygSoJphG2Rl0ud90xTM4PmPQ=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/d6MhMqtJdBTD_7TQrSrBNHKNOQJY5tRD_bliKEzcr4LPV7P0DN_SUc11x_lyIZFPAOanSxZXvxY6AQkab75JuIJW_OK_bty1IHo_it1VUuTOT9qhYVRJ5Mm45BOfxtjK8_QzRPh3uw=w1920-h1080";   glidee();


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
        dlink = "https://lh3.googleusercontent.com/x9Ori4iWr-Qpr4TTYAQm7GEnB6r2VgkJkOjodHU71cO2COuzbMeWxm3MVFcsL3QGDDxLDj2A2jS367EjRTFVipvSxIeLuTmv7gQFp8WUBymmtYBvE8dHexCZsb79-BPAoiJC-BQivg=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/M8UdXA_kg01IJpYwYRNeEpAgHRlyQRwCnovNxvxshcMBVtLy9uADr4EMPg7t82foI_epoNj08WlOOGah6AUYlPTrcm7dEaKjrMJEgufffFyBoaS4rk3n2ZBrJw7nlqyrfM7YkDQi5w=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/XV8hLMlvn-nRj1NuDXZXAJ4jA_mQLYDv3vISJMfhssin4GzqDibZ1quXVYfqpFkfngSVybu1u4Z2GL5ualZSJwYe13qSOrrGgCXeOkmFwmC-m-nNZZ21XdEcL01VUfeZ0GcRDkI9hQ=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/m0rQVz_3afIBwvICxQ1ZERteIxPqPrU3k6E96G2zqNtUD5pw6UVmaOmNLd_O-3oxfJh-NUdmvKzmuHnu-K3B-begaLi-UMONj8tA66I65RNmvrvh2oLYwFM_UxS__Wa9TFDlc6JGig=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/zgXHpyhJaUACuybSBmr-YosOQnTDd_Alrlo-rcV4VhLjoPn2dHPkPW7jg0bO4IbQXmsvGv8tXA0G03-8sxobyuq_g3I6iLvBD4cqQW7NQXqR09tuQ_jrY29zkfckHiF0WZtwXPF4cA=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/6ovypDTq6abhgmfUEztMHp9lSW57nrmEjd09UMq2JaUvkYSdFcZUAf_3lQJURci3pHokDMZUIStw5hermyyzBFAsi3TgR4hY11ZCAgvU0tJ8a0vyTdSLssGq-v2aZBRCz1h1OfsO-w=w1920-h1080";   glidee();

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
        dlink = "https://lh3.googleusercontent.com/Rq4MF-7bdMsBe4AmEA6wcGK8_BAhC8gdeYllp-6L5bEcR8NP5V6FpoImruQtEjaD55iDuCvvI5BQ4ZsULX_PCPO7qzziSAq9xQka_JorK2y68rgPDvMQ__z1v2dxuZIAmuPD-KacwQ=w1920-h1080";   glidee();



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

        dlink = "https://lh3.googleusercontent.com/Br41ZAN7dGMl4Ye10XQ23SbbRR9JGjK44h5sduclXDTEkT4WgBO8hJi9aoqBXAwsMel4Vjc_WHECLZY8LMigfxArmvsfwmYAbw4fiKT5DFDBLjJlm6_45RA7IJsYXDkP4uo-gtaZmQ=w1920-h1080";   glidee();


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
                .with(unit12.this)
                .load(dlink)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.ic_loading)
                .into(guideimg);

        guideimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yas = new Intent(unit12.this, fullimage.class);
                yas.putExtra("dlink",dlink);
                startActivity(yas);
            }
        });

    }



}
