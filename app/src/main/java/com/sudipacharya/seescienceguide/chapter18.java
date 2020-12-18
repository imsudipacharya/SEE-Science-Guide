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

public class chapter18 extends AppCompatActivity {
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


        dlink = "https://lh3.googleusercontent.com/gU6q_QP0_7FHdyqt8lRIzjGXAaDuEneFdxusZlyPO-gq9E0HblLbtT3hiw0lv827AkHclMOo03RGoeuOCm86vthuyd4kIqxVOk9ysTDT-4Hv1k99tzDW3Ws3wWXV4tTPIsIETxnlbA=w1920-h1080";
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


        dlink = "https://lh3.googleusercontent.com/ttyjS9pomr2LDZhr4t-Ew31qHSYK0L2Wo3_8IuLDczW9-4qOQzJKQ-7or-D5pb7AT6g1KW8c-gOBxbpGV17S59a86eHw6hAJYNlWtOfpddRwlxbrgrRpyxvLwGMHwSA96ezpa8hgvg=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/SXmyJxc_L4tr8sTI7vCpan0dR-uMqe1xXRoQMjDmVYTQpA1JEwtH-QGTPFN_shjbvDLZE8y2QDJhJSufGRRRaQr-myLHEs96Lj0_uovn-Zn8458lal_UDRZ1sFrOITgyz8NhrwPClg=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/BmBQ2zzPcBVsNyAgy65lVvA5STvtklM6__vbmgLwnUZFy_eWpi97gIqerGvDRqpN6Ayhhh08Aose_bbr6u7ILOb9__tlYPG4Yce_LCAMTshZ10ftvNbjDdO7hQTz4Qr55SBgg5gpiw=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/0nt9RiCRvK56ZQtrwbzIO2VI9QuI0Oxn1xFExwpteOs6CA_eraZHSu2pIQSVr7WEDzEkH6HefY7xKV5L1RnwXU08CrT5xxHINNgIbY-fYHRxCh5bktxWva6sZx8tyw0ua3oMINMHhQ=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/2hPF4Pdp9eenpJfOi3xCmSSGf7AKoDPK6GSIdACQw6xtRDmQGkHvVZfZV-2x97NxkqUV3wtBctr4r9I_OhE-Noi0g0CqNk8SLMeI56U0aUIuLTy7Tjmau5DhVUGfu50s7Fve13u_ug=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/qsHaufkm2eUldQgMefwSMYkyNSrh4i7zpXVwPAD1-wwOZ-SR9YedwfYT20rgt4ByDHnX9q_eOiJWFysBgE1_wO_mJPQCC-RaHVGxpCgTY9Y5lEFrxTj5lSsANx7KL_4aTSjQ4iBClg=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/MDcnR6erlnHKZcAHPcodf4rRYz_XXNwQIJFXIeagPyWE0a3QESIvlKXZgJ9gIP8Kisa7ZYw8rBL9gYGBCQEuuc1K14ywf6bljguGdNni2QUpIzjrnPwkjL0GIt1M5_FxavSiSeWcyg=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/yf27e-SWFmt80nTpGruKlA_GjEkm6llkFaXtTsDqQgyYpCKl3cVoZhuwIuRhZxEPfNx7EvxMWTz7dQKCC-8DlXLKT68LUEIWQMimfMRx5VYCr1VcOtq86O9g_ykKYQBBng4X6TuntA=w1920-h1080";
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
                .with(chapter18.this)
                .load(dlink)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.ic_loading)
                .into(guideimg);

        guideimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yas = new Intent(chapter18.this, fullimage.class);
                yas.putExtra("dlink",dlink);
                startActivity(yas);
            }
        });

    }



}
