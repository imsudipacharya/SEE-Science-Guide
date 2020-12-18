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

public class chapter2 extends AppCompatActivity {
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


        dlink = "https://lh3.googleusercontent.com/H1mScqrgDBrELAcOYpWJmJ268l4TKMhjBjMqntpEgq1ensby0s-_M8Cu9tnDAX9uXter4_RKIKYUfBiyzAENKoWaft2OaQ_yc-2ckKn5Ag4gfVAGQCilX6fSqmjG6_pgDf08Nkb5FA=w1920-h1080";
        glidee();

        Button prev1 = findViewById(R.id.prev1);
        prev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter17n();
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


        dlink = "https://lh3.googleusercontent.com/GbVgN56qYP5wNVvzsArRiAtKleKILNVfehfUWLWNGwHlU3SIXJb-o1i0JZayCCBui06oPIpL5fIxUz31PNmv353RyI-pC9Cec_t8V7uPGttKlMjhesyaEEkXI8cLJOYebmyeDD2ytg=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/gWxDu8YDTpRuER1szLolNSsXvJgQJiL3wLpbT2WYlP1I6kLVrPrz63PRb03AG5OTCwpULhs81dhv44HSH-PP8LVRhx-Y-EUGSoQmWT6b0vXgnUwgT_WeOOJUoy8F125X_P9GkINELA=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/2JrgK1RWmHjtI2eDRvTl9JXGUWuVXYU2nZC_Ygm1fjhrux7-XoLR1gMl9sKlJg-5JQzoPdRPZ-r7GfrEKiNOlVRge9iwyW89vaqtO4F_xCxX6BytCq9X29Q_YwL5TCK-IOJSfLMl7g=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/jTE6ggQkXombm-6S9ovgfuhiB9wCGQ6eFlHqsVvQCwx5gqcN7qEjNw9d5d9gg9Qy95JZdCg0DHzBRaX1O6buaaWb1kmMhUNjM89Q8n-dsscagS6yemoM7_ifhTAjP9CdexTOIFEOtQ=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/lsnHcItryMsefQzLw1MqprrGkw66Bo2KqdGG3rJG44TvQp6pMeV-8Uzl-uFAH0XIWQ_PK_-4AIsiDVnGOdX_Ywm4I5g7B88o8GJP0Ji1BVD153Wi1vyGbW0N7LV71aB9qAp_vzJQqg=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/o-9kHHpqsKEjKTYajKS2VEbnQxknSWCPovPl6O6pGKY9WtD-cpLKFFV_TcUsginMzgt1HCSfjrPgouFaAOI_CQ-ec4ad8I9FP_ZtA_5YCbSgif4LxUxPbTdG7hoIX-87ygm01ZLFng=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/FnxTpiOeCLBe4X_DkLGqVQu03cgpY4wq4BB65oY2rxhEymBeW1MrFDuEbQqkADxXD-ShDSsVc5V_yd7G0GvmTvs4AHOPB0FtDSA-j12taJTdbhUXoL45-yF4S-0j1JpUxgQKGtI8Qw=w1920-h1080";
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
                chapter8n();
            }
        });

    }


    public void chapter8n(){

        dlink = "https://lh3.googleusercontent.com/4FOFvyT1sYXSCMNrPAkfgFKCJnhL9hbrbUYEumK0vZ_6RnizosPWErkWYsYRfudhkeBZcsu9niy0H4Xwyag6SqfeHICg6d2PP6EKjjrQmwwlZmKB5C6-PLezDQhD4RIPHbibBFMsyA=w1920-h1080";
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
                chapter9n();
            }
        });

    }


    public void chapter9n(){

        dlink = "https://lh3.googleusercontent.com/-_qk6e-xAWRK-sd3zvlmdVa5fmkprM1L8TTQJrKAD87ZXoWtAwFx1e9IM10h0pq9C3tIuzebEvkJisUgXEvGc3LNVxcglO_CAJ1BwXH7Nx9K4mmSglk_rv5oY_-Zyw3gJLprEECCtw=w1920-h1080";
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
                chapter10n();
            }
        });

    }


    public void chapter10n(){

        dlink = "https://lh3.googleusercontent.com/MhSSZXt0J9HyUcHvtlz0HfKR0kR1MvFRDDq6fj8xc2j0XC77SZ7eJrwZnyp6QRtMxRI1fd79Eec5hMs-TKHccEK7zvec6e-dhSXj-n6NHyfi1YqbNzhEzOLCEBYHpxZeSf-W7NN3uA=w1920-h1080";
        glidee();

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

        dlink = "https://lh3.googleusercontent.com/rhhN20ImK24CTwXM3Qc4mAPg0FVgIctbh8QkWdGp96ac9xwnxtq8-xL_GmrFf6Z6HOijYPc29fT-JwWbDHnT30pGvI__cqToChHXRCL-QP253khIRxZSEZQqu1cf6jPJ2DOXaxrhwg=w1920-h1080";
        glidee();

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

        dlink = "https://lh3.googleusercontent.com/N57SQ1mpKrDy05xNeVfzjRfX6l2CLeS_-vxL3y7X68WMD72vVc6kJvjPxlzU16AZkajcxAzBtnR-ssWjBRGmGVPJ98EiQ32YeazGs2s-cWqohF3tTwzx4gSwyvKpiJp6ZkDm06oFnQ=w1920-h1080";
        glidee();

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

        dlink = "https://lh3.googleusercontent.com/w9xA1st9CIfSI46IHUJuhsTjQvff47bCKf0bEPSjt6GsaCc_bfN0T5SqP0eF_S6SspyWVgSNlv6U9eUPNOV-aLlpDAYdgsVaFiDB3tat-iXPfEnl3ScrFVD4u3U24aO0Nq37LAaRrw=w1920-h1080";
        glidee();

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


    public void chapter14n(){

        dlink = "https://lh3.googleusercontent.com/Ea_jAKXg3X6Qb8rqvTpdjqy0EUY5TGaPOLZ9R4curLc8ID004KKYXV_lZkeAOwkIO-xKvXGQIyOruCRbK9d8fPj6O2ObOgENfXANGoba-K4-zbnIT6013rmFl2vp9tH_0oJVc7VUSg=w1920-h1080";
        glidee();

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
                chapter15n();
            }
        });

    }

    public void chapter15n(){

        dlink = "https://lh3.googleusercontent.com/CMpCTQzEbMzuoV3A2RxDDWA1XxSrt7uLIIShY2T3RQKgJWsVpDDdSUt0rdUOlymPBcJsRZYRsMyU4go1_knUdTW3fRbxmFlE-q9_fpvlf7nOp2sjN3V2S9cL8PJwedSUK-t7oDF-aw=w1920-h1080";
        glidee();

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
                chapter16n();
            }
        });

    }


    public void chapter16n(){

        dlink = "https://lh3.googleusercontent.com/AtA4L9T69jmNffalxoVbGSILPTNDAluTJu_qQs0IOUqO4zpR_OPH8g34k9WvF6w6PrJ-7uPhU9qmSAmfAweJMlJvH3-0YsE95_8DhbaDR4AKbXO_V68uOYYX7yeikhLhgKHgrHRrKQ=w1920-h1080";
        glidee();

        Button prev1 = findViewById(R.id.prev1);
        prev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter15n();
            }
        });

        Button next1 = findViewById(R.id.next1);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter17n();
            }
        });

    }


    public void chapter17n(){

        dlink = "https://lh3.googleusercontent.com/gai9l5eyaSi2mC7SYhBbA5gMkMpTxPDZ6Ap0fYoA_pugMUKfmnHNBICXEqUXlrxaLFS4Fgc7mko9lL2r-DXPmf6CehjJhpJ4pmQ5YU6yoQ6h6qJB5baCcHTI3skAEtXNQ3lHawfKeA=w1920-h1080";
        glidee();

        Button prev1 = findViewById(R.id.prev1);
        prev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter16n();
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
                .with(chapter2.this)
                .load(dlink)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.ic_loading)
                .into(guideimg);

        guideimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yas = new Intent(chapter2.this, fullimage.class);
                yas.putExtra("dlink",dlink);
                startActivity(yas);
            }
        });

    }



}
