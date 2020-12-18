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

public class unit9 extends AppCompatActivity {

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

        dlink = "https://lh3.googleusercontent.com/1U2JpnreV0M8h3i6FDd294ix5ATAf-t2u3bZygXNALZxO-YMRgreOoFwpX6JbnHuGww9zRl8lxDR5_cgaiep_NFQfUl8Gs05_c_P269jMZCOuU8pZcblDruZPo25inSc9FykwjanNQ=w1920-h1080";   glidee();


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
                chapter1n();
            }
        });

    }





    public void chapter1n(){

        dlink = "https://lh3.googleusercontent.com/5VxAWsaKjHEXEOTOsTYeWBmCxtYVxCaYOHcwkU7aK4XikLrGOGa0UQ954fE6UcxV9XGsGCszxlsf5A0xtwNAyOqvXLY8JrhirIwE8oh_GE8-AiN4Rdr2oVmS64pT4XnAM_BjjgCOKw=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/GZYfN4FrmbBrM6dMd1ePUfc3eVYBVMrLqhnmZVSBxrXlSNZ9K_VZx0xuFNLo6a2RnHH72DNqnWgO0kWixbrcDk_PdAcbLxXt3znnt29GrJOb4J6kr9PGhiLMWVhWI9rg6xNyZit_uA=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/dW-zpkzZbEBjGuG16A_wIKdRc6nP_F6IatJYxGcDg35gbNHXushLcSYNhJAeft3-iQUckNRusR6QY-CaAmGuU0DL36HDkBCpMmac9EiizeQwemBvNQN1nwOiuvRBxjv1TDYCahP24A=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/TZlhPVeias4Sj44cFcqt_o5SuWAk-MfxADprA54bq3fOJT9uYMgeti9kAe2slQmudIgXV15CIGEw91Li-pXc9f6MLO0TyPkurMxjaOFvCHL0DKBdPqio3ViYmkmM7jHvs6DdA891qQ=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/2Q3rLko1OGK5UaSKxemXK194ImX43T_WfTIoy-oX5gAqa2BA5tkPSA3zcHXG-px-nk4hsCJs8C0WqOm4DBM4649QOALItirkeh63VFkZzYT6Je15ae4JuoiW4GQLnoAq1mLFnIusWg=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/xNnE0xsPVMmrPgWIJgcH5PyneYoMZ47GSsBEyN7cxQv7Me3MpRb3-ZKxtfqJEAdunKLJeS4CGZPU-ep5u_z3K4rQNDITQOH8peydd7h6kYp69o6pKvbp9P6SYRNvUR4-hzFP8Mjc7g=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/TqZtIUWREOw3QskIPK7we7zj5S3077zJIDjq_Nppgimf0thg1bfBEqf3x1rLVk-BN97w5VVoQYTVaMdlW0iaotcQtmSULlqWFfHadOIx4nvZ8e6VGDb9lbNgKDYicuzWpQyI95PN2Q=w1920-h1080";   glidee();

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
        dlink = "https://lh3.googleusercontent.com/fd6aZDk5V6hpHVd7JL_yB9v6vkTgHuDRy0hJceW8LrC12UIfnONooqlBAlEDq_mU696wbo6yAXVaYStbQsG971dWRYRgKNnsOUTZd_iGzNlnp3RDV7vsfV0Gl8dPz1d4u8bh-iNRGQ=w1920-h1080";   glidee();



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
        dlink = "https://lh3.googleusercontent.com/G4Z-uZ4WYzmOMwqjQowhnw3LEasupsYI578tP6nOrXTmqQPat6jlvcSYsN-nOUA9_NkKnEMyR8K0xwMRMXGcOIKKxfI1U6GI9iN4KZYA5xOPENi0NFzTUEiGaZuT9M9eGBL-Xg-62Q=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/ZUxxP8D2ZwXQIeYTp0w535FsatcGDL_UZm8d5I7NDrlXg-UWD0pPDiYMVbsqiBNAneeJWV2Mri19-61LCuVvauTCofrHO1-AtTkh5ZdPlpvvmynVEscGMChUdQePfCW3Jq5T6DzzFA=w1920-h1080";   glidee();

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
        dlink = "https://lh3.googleusercontent.com/ykwhA6aqCN4riLC5LBtvBt2XlbMxY0-2iJILSdN1_P64MGz_S-I5_RIiYr7IE94GSLhx0egakobrUYnOH-uW-k7ZNLuTHOlx5UP0f8FDZoN3cg9v5gVG4QY0B_DY34u4KiRJdgh8lA=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/2fVV1szvpA0KMQICoeYbsZx5A7Jv6CwNUROYyFDe8lXZYSIPiuZTM22K5SsM-ycK3mbhIcMvKgdgVUrkUln2Q0AwGEgrQxrURoLbEbs00OExp88tskQzf7ME-vsi_1PbOKJ9Od4QCA=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/v_02uMhkz8f5qPj9WT8aJyWabQgL0u6iPIR_nkmkWHl2zUASEcCOU-OwAN8EjKDbU4eBNV0ISk0Z16tAfKKzwYSIH7m96eArrVVa6Y2fTiJRcJ-89KxZQ3WZCH4ix8Z70ovl2rswIA=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/MAlY9y5jCoS3X36lEt7kEKw0vbsOyKQSxB78sMjCHVEaeEhUdOAFBr3k7ByElvRqP4ZGzjtuJqGB_W9grunBeNff8D9rvQDg6_pqLAhK2c3SAEh4mgJKW7yQlabEWUhD2iqlMJItgw=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/cCbXWY9PO0c0VUrl5skS4z0P0ziJfV8amaoBxpTH0nihpQ7E2xXrFxnSfxzl1OpusrmujLY60dkvGd7GX0oVTttZlSaH_VXzQ8DIHXC1yIvPjgnfSkW20M8r5tY0tIE20_i9EMMmrw=w1920-h1080";   glidee();


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
                chapter0n();
            }
        });

    }






    public void glidee(){
        ImageView guideimg = findViewById(R.id.guideimg);
        Glide
                .with(unit9.this)
                .load(dlink)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.ic_loading)
                .into(guideimg);

        guideimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yas = new Intent(unit9.this, fullimage.class);
                yas.putExtra("dlink",dlink);
                startActivity(yas);
            }
        });

    }



}
