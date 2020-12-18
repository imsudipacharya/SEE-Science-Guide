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

public class unit10 extends AppCompatActivity {

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

        dlink = "https://lh3.googleusercontent.com/6Li_9E9pV73kId5q99rMNa9cwz0BSK89fDW2R3FUWWgsrIhjh-tQdI_HJ8d1F0TW8eh-5dLPLTdLRwGuzpXao9JVDJIriUyWpHPgSOu1t53QiEfqroBKTmZVwgimJqEFzgs16oB6IA=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/jU33HfKZoRzxHCiHBNO01_2xDBUIJtSmceKNT_rGdbosAJ-xjOEEhcSrV7mgOKZr_cDg0CKRfcQYrAqd7yxAJe-ex5Dc8nfoYRA7SOb_8Ah-mloih7aiTHjafn5y0JjHNThh7XZa4A=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/8jwfFhdLH71faURPL5_6wm_FBIiSYg0HdlD-VaiJFlbs63ZFdN5NilITj5-UTkqdDzzSn7a-1pqmp-NSmdoRX_qRmAnIkabajj88WKrrmQmpumAmZY8v5OdlSmJlEz98BVJlyEsYCg=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/NeDJzprPLqymtcPBYzTD-hThrad3dJJP-P0gv6dbSQLCemzcJqkHNgyVaFSe1vJ8cCNFNX1R4ZpRpAZvf7o2IxE-ZAAoAbbYZIiWCdBrjdXld-QnAPIA1NqGzLoA1CYx_66vXgCBVg=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/wfF40I9bE3fo-gLjP4qeE_TYaWBZY0vj0AeItsIYSwW0Goo_ioQHa6akj0IBrBrYkp0fZXdBiIFzYjzKoXzqs_gq2m0hmVlk8CPDrVRYKLjuMY1Lo30vGvehL6iXfpEWxtKMPwSChA=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/X5qIG3npMtyXqj3hSTd1qKNcaHbuFhg-z486jqmvFdAGrJAlhxjKSBeYSvfwWXag_UM3mDJlaJANHz2lQt83otloxSvWVL0aARPgKBiYHjTvLBvyp-2jfYz1-Cx4kO6J796La2szvA=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/Lbdf52tGg5CekI8Kh66z2EEu4I3LCmH2XOMpvVcJryJxwFiwDm_eOi-A4DKDCm-AnxtlluTdCp5gTVdq8LBSjJaZy8E87V5T6vn1nn-ZHOa9B3ZwhMmao6gUgWSueasuZPTP4AszvA=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/NccqJqoH3xU1hZ37qtxFjL_7IJ8D2oW5e1KCLJgsMVDaiCtzdntLUmg8nKDX3f8VAYlSCFOiwua-oNgp1Ts8NoKvjJYdz3bXZn2jEHMWw2WsBeK9UmCXBXDWRtdVwpLeDjUoET1_Yw=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/OPnKrvC1C46feMy_q8kG5OSIESYnac5wfN9viQtbRtCCWUjivLrsLuqBev9PktHD8DsEewuNHVH_TrR0KSaPIwUxPQM6_-TBmYkFQ48DRXPAiJsxjlRgR4nJ9v85f-YGJMlWkJc-RQ=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/IIqs51sv4NFHj9w6UiXS-8fQwcJloCl-ddProCUiHNAIddahxe_YhQ0cGa4tdwmPDo-eOHXIiFlAhxZtqfEauTRTdtkD2JW2zMRIp9HBJQpuvotbAiHfZYXVPC1apoGCzobx8a7QXQ=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/pGVpaB8Chyl7tkFPanb4aN43_1EQe7wB3pTbKUFbUXNdsFt83nYmy5-Q_kVTLlU_aHmYLPmc6sV5rbKpeUJhcutmq9CZyilE6fM7Hwfurf6otNie4aQHiNDu83mws-wXXUfDSVlhCg=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/0DX6rC1wa7ux62Ei9BaQkblR640CUiPPsh3CvYlnXqFoFEQfbujsouDgWu8-D5dpYZvtMBrmZywcKaxNX_0iEokX-On3MOVoqlkc6XG6PGMrkUrAkFC3CE56I7yoK020UFn24IjYTA=w1920-h1080";   glidee();

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
        dlink = "https://lh3.googleusercontent.com/vT-Xt2-RtiXchVrbguOijVlaArtAfuB3LNiShesg5S6-yzthOcAZ7r0_32sYCy-dE4qGT0DWQGugSukafW_RAmAbBAX4pq_mt55663QYAB5-LEpd0KKp4KFbiiopnBLjfEGCzPWI0g=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/MvCgoKISeWwksY9jibS6SETozrZIx3bY1-RdMGpxTAr84FaV2wmAZNcW0YJIeLMCHoXahHt5Z3rj6PtkgDnj0J8Ka3EgpPixSF51dtBryQP7atEHJs7b3QqSbxLC-rDO-3UzVvV7JA=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/BrawDV4VrnYVfn5U6BcitStB_qLm-0AQMUjnmLoGhoMEe-sjunEDf5NAMp_3x1u513_i-5Y72FK2gFbP7R2V-iiCXXYGdg-Czn_HdUNnPozWr1ReJEOc8n_kuHwm30BNvsee1vmPPw=w1920-h1080";   glidee();


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
                .with(unit10.this)
                .load(dlink)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.ic_loading)
                .into(guideimg);

        guideimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yas = new Intent(unit10.this,fullimage.class);
                yas.putExtra("dlink",dlink);
                startActivity(yas);
            }
        });

    }



}
