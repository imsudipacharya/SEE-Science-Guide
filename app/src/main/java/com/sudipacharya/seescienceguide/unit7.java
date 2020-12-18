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

public class unit7 extends AppCompatActivity {

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

        dlink = "https://lh3.googleusercontent.com/beHxdMxz6_SX_JClDkmPDEsuJqX3nt1iqn5p09GfiFgTE6aN8O15tjDBIHOfpvy2tObMy5bHh6owhFr_mJ80SJtvYcpe46PrqHYXY0KfO_aD2Q_h4DNWNv_XfgRzZ4GVwSPKxioEDQ=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/XjNTDGklVSpcBFxML2Gmk1ylgiCzEADaSlIybfcOwaxoPmt0L-MGuafsW0Esm2hcw62W_CLXuRiP46B79AW2wLY-t_xvnO5fgRvP7FSI8pYBjrTeaBYqElLy0XMRUn2rS421v4QNxQ=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/0mGFL8JB0vdrycNGv55tk0mPRbK2Fa7tVTyKGgww_N0SlvisZ6TnLN_Xg-v5WiZNakvMw6zb3jJUTsRDR64-2_Bw1MwSNShMFBxkXRKqTbn7JzL9LFHnK9HpyVdPRkwVjIkkZGStXw=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/6M2uI6EVyAs07dhs5sLOZpomC7SThkNUvcZE7feF_Q3aGCEsKAmQZbX90OyUV1DuBFQxO2daIcBbG_ImZnIMgZkihvFhO_arFAuuoz79IoYVn0MFpJC4inuYWN7JUoUS_syQzRFkVw=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/IuZwTT6RT1sQNJQ4Rq8Ze3R438wgFvWUlpuQaaMsOqxHsvW3-yy0c1fgQIswXYZXeq725zZEdWFQMZdFkGRmfZF_FRdEMpsnzj32gHUZRPaSc5f5gVVeRrTPTWh12tCiNbVzmX7luw=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/UnX0mdaT7cuJu8rVwRafT-hUZvUgFCzVg9VWSbUUPihY3tvzlJtVQO_CkxL7MPMn0C9AFXhYnqvM7aFm1MHeEejNjcGcTOMYNUB2TUnlwlYb6YhHKEFYuyZaHOlCCqbwT_UncEBfmg=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/y95yanf3Mqw2mO9Mhjokq69SvD-y97cRKjte2Xhgp7zLVWJoRN1nK_f5_50SyDJDlii3wqvK4JiiC0LXgj5mSx_4gUnY_g6Em_lOudFDdArfHp3_QKPJ9tUZyuxcWKhTaMwWDoCFAQ=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/NCLMbrEWY89oy0jM04bKqepuHZFHIYMafSGdqY_UvhdJaZFO8PVc54dh1Z36Fu2_mKCVYOuBnE3DbMxTDMxQFlPKC-ftsm_ROPRefTOl0Q7r-YA_ksk_N8cJYiA8l2EWWJAItdLUdg=w1920-h1080";   glidee();

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
        dlink = "https://lh3.googleusercontent.com/693qTIOa0c-7uu6e3Bi17wuqixYNHiOaRgmEbgGZe82ttEt6EeBubmh_VawK0kxcd5S0gopmnJxxFVGcnXpeI2TNfToJw00h7NWUB0aaHs2x7C9jN8kAZ-gP2tvZj67qVQfHmDqxEw=w1920-h1080";   glidee();


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
        dlink = "https://lh3.googleusercontent.com/5P_H6hBWGbZQqDtrnOG1IFXqU7gIhP8FHBH7nFtqZmv9JuHAcc6PZiLOSQ7iAxYeDNnOxs6SZ_jD31jaKdk2CGOadUk1tpgBCPj842lU0KjlSCU08JtPHIroBejneRkKrBnB3GnNDg=w1920-h1080";   glidee();



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

        dlink = "https://lh3.googleusercontent.com/ON7Q4jxOwaC4HY4a2nAV69fqCHfPey36foGdWRsi7xSODpB0O0r7QDPbyq1LVyw2RYB2daCiG0QMudxl1UBvFbQX8k7aI4jIAZ8WwaKQN-hOpsbmFK3uOcH0K-U0LzR09TsH6JI6hA=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/n-1Bq1Onq7DLx6ssudoxCkeo-tr0YsXqrvFk7TsGaaH5tXqkJjpXTDbEu6AfjIS4zZFmV9WI5xny3eOQTlz306nVJ47F_VMaz3kAKLeG-BdEIcvSU4nEeBS3MGXSV0ZCtXJEaHWn1w=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/qLkkNvgRX17itdKBk5H3UHB0OZpslFZMzq5UqtlA7Nhy_cCdRR2wGdhYyxjUosnZrkFKMj8sW_7bSm23OkirIRpQRznUSCwgeiuI6bBzttIjIPRPryHVR8OBhtjodi_e5ZNQXf_r2w=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/_c64yjLDaodrokjAZX-Ra51vEyQCWE92TXt-uUiBw_M0AvF4TLmCw5bhzsWI7FIlIHIr9THZFglVMZDgrZG5PKGajgzx_sASmmGKFFHkf5-PtC5yilcu1x7Fo6Rsl5g0WiutCeudtg=w1920-h1080";   glidee();

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
        dlink = "https://lh3.googleusercontent.com/Zfzibl90XjGNhKxLxbPOOuDvxQmloT3ZJ5Qcl7XhR4WZDRePt9G7O1R89HXQayeL_f-KHLytqY9oLXFgCVKk-6KX2ddJ5rGkdD9AcLEO0Hf_-lIYEnNo8HrdasoXcBn5men8R35-cQ=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/gSU64gqPt3FJAFX0HnWa1ttiLMAw3q9Ec6mueT0lgKKCObwPZ_7YjkFsO8uLzBaiQbVngEidPEB0zS0bFYDabMPyofPwBNSyi6iUXBus0OarEtdqa2LZLu6G_7__Lp77TiOL2YassQ=w1920-h1080";   glidee();

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
                .with(unit7.this)
                .load(dlink)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.ic_loading)
                .into(guideimg);

        guideimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yas = new Intent(unit7.this,fullimage.class);
                yas.putExtra("dlink",dlink);
                startActivity(yas);
            }
        });

    }



}
