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

public class chapter4 extends AppCompatActivity {
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


        dlink = "https://lh3.googleusercontent.com/t6icIsyjdL8Yc6f_Lp8wJIQWk2LOKk7zyV9bfyc9x2tf54hner4jXCSAJUjw6P_qUKFZnBmDFkg0mXsz0Gv3rDCCj8DvQqVPkIArlCZQVRSLYcT4o76b7f4GBelIKGiEw8CpswEUng=w1920-h1080";
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
                chapter1n();
            }
        });

    }





    public void chapter1n(){


        dlink = "https://lh3.googleusercontent.com/LIrZoJHMsBcBwWcETkJpVRe8SZYf1i6-wwTZ8hqzNs3283XW2g-1jleJ5FcrdtFWl4ek1-f-N4mAFPEY66bWRrkvx6Bn7U2j0VMM3MTSdydFRKtOHRZfdNrRrnAImjR4ecdvWBJO8Q=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/99JJbGkPYgEVRZvsD_8n7apht-o-Kjtb5ZZ7nsh4fgMUb0lJrhPoNWPKjREnTio31XTmEhHpcdPB4zooTaYMyk3xYHsOcrZa3wk55cQ8h1KKmqnhx3nsg4pUA5o7P-Es08xhHAyyaQ=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/vXJr1aLoOxKNaigS9Ht1EiwZWAI5FuA-I2UnTJJLhjenRHw33JDovX6wFIfbtNC6m-t7LfntnP5RRnOnpbXCEFj924f0kTJB-9hQ-ZnU1XfXmArKyV-nI8oZQi_Wy87WDXqLLk1kew=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/ho-rSqtmqvvEdOZzrYzoEXsRQqo-uOZuAMrrR8Hh7CNdCm_7BhNtBOgmCT3DW8ZLsDh6eXMpbPW0TKVEDbU3hHTE-7--YpVBis2Od8nt01JzI2C5Hb0j07tByNDPAxbM5MYqvvtkUg=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/sBV0Ga_jK661RUHeI67YL-vsOzIf-6n9oihZREFjTahPTqEn7FGFIz7_EQ2WaQ4OyrVRjdNDHzxNtxtN2Uf-Y9f_QxQe4ddp8meKVMIJHrWG_Yn6JaLaU7zxwiIwwe45gYHTBzMycA=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/oX-73zZ3IoIblJGAptAzh4WOlLdDawZAVMGOnG3IEHeVcnTx8p7OB6pAT3nANqWLhOGj7r9wekiiBxk6_roGNtebHpkkuYVabeCdMSFEgqJtKJhQlx2id4ogz3rJ4Aox011u1grjdQ=w1920-h1080";  glidee();

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

        dlink = "https://lh3.googleusercontent.com/WrQ6_BG0KcLtJIF_leJVyoOHwc6tZ7sMoXvo9bGOpRFWimekl8X14Z1mJ51HF4jHHc98xLQq3uTdXJHZEHoXmeCd8mNq-QZIsxGLbxUxRWw09et11x_lDs9Ab1RzxmNMdG3Yi7d7nA=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/vWQFvM60h4LIHygHdyHMNkAEjjxcIVQAI68WVIRQN6Q4sU7xHquncnDLSC7gbym1voldd352pt268XCfizZ4_adid4bFtt2woSJh-4isBGV9Teaywe7KbSItR18cYulHdQIRKvAV9Q=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/mx1cS7qKHbv9cP-eHuitro6yA9ZPtaedHHszErJDW6hnfm81httzszEbyjJVV_8av4QAnY8KijxnZxwEdFAciDeHPKPxw_nr-lznKHuqwQgJY-5dIF1_f2Rsw8u1OXhM5kWGptTXzQ=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/fGnSW6BzQdif5XruQUqoAqudXu4pY7a8OCwabpZNqsdiNOwkjr9o1W51n3eWuCiugNKsqepomvyJptbr7A-j1MiB7HA6iQCgPnhKGIc1sjz9zMVqQLS08wfAQTIAzMrLWexqlTYHxw=w1920-h1080";
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
                chapter0n();
            }
        });

    }




    public void glidee(){
        ImageView guideimg = findViewById(R.id.guideimg);
        Glide
                .with(chapter4.this)
                .load(dlink)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.ic_loading)
                .into(guideimg);

        guideimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yas = new Intent(chapter4.this,fullimage.class);
                yas.putExtra("dlink",dlink);
                startActivity(yas);
            }
        });

    }



}
