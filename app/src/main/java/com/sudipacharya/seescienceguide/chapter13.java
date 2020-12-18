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

public class chapter13 extends AppCompatActivity {
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


        dlink = "https://lh3.googleusercontent.com/N8flEtwe0tqQ4CVBBeWJ7UrTDi7A-ltD-x6oge75VXnVaBFSQs35GT69HnI552-m-kTdatl_vOyeIwckwFsZy9YU2okXXt1cXUGi74Uv_USjX3CsbT8eQSvnWgtE8IeRtkVOE25VkA=w1920-h1080";
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
                chapter1n();
            }
        });

    }





    public void chapter1n(){


        dlink = "https://lh3.googleusercontent.com/LktQMAUhhvi-4OXnv83_-1oJejQ6sit2MfHYeE8SyYEg7O8k5_4Ms0suFzQIgdcpGRH1fuqUsTupH_M6AIc--G_iDXo-u3DD8SDXlMQj_0Ui1cT0mSr1CKe6XOi_R2T5p5YfubPZlg=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/H71uvGpuJK1k4La0mBBZhcn2OayzODyl7LHEeW-afF-kV0tc1giDN3M9antvUUi0Aqb4-iqenld2ANHENco4PIPJwXT3J1N6Yed_SMNEk3QbVqderobuZKuskUVg4X69xQ3hbRmttA=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/HTLYsI0hUY--0Vp2Z0bFQoXlfZtMFNsweGJB-hD5QDcOwS6eSQmvygtByIsT-vZrsjbl6UJzjMs3Gxslb0Juz9VuhlqRkF9jVY6DOegAvRJ4NU6v-NYHZDurWB6aDuRlUYSH5eU55A=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/27ECSxKiSzgtkt8-2uYlqZZrY-cgEkq7xAlYvgM2iJ1vpFq3MAAUfBBESJsTOYgxIiFrUOYdzcp2y3h1MnRg7Hg12pRx_YkSr3K-ks7NcpE1yMqjWxbHUAX8S4g6WwS0SOQLnH0djg=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/nYQ_uJZ9wI9hhFLmiMISkkEfh6e_YfE7ed__AopwuP-vI30JfwV49xY92ZRB2onDWXos8zt9OQIAsu4IHqsKDKhjKQpGCxdWeGnC2Xu8CEsA8czsTtlISPYdlreqwNeLAQSchU9FrQ=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/HGulzqypo3gYC-uP0l6Qksr-RuIIDrBNw3bETvqBQGhHF24RsEaPVkFmT5gLIsPF6QQElvkBB6viPTl_RAObob5FQza9H8HHtigkpeIMutmP9m9NHBX7xY8B4azcv2hBvyEZiV90lg=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/mPMJFwiapmls09lAEMRDw5F7zzQmcgObKp8ZT2e51MFhLCvF41V03SXYs1uxTYjElZ04CB0geVUfYemSw8oq1ns4d_geVm77u_7aJkrzTuBldT8mCpJcvC5t-IeGEWXBC7mlXdEoaA=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/MytZswHm4TzYFg_wAj5Wali10VjYOxoCSAEeiOJfL7kqyz23MLv0JM0gI1AoPqOJ9Ld6PsQHb0mbev9EzqoW6oXUV5pqQyFb3wzxXnkLp-WnZhCZUmZCanxhq9jApgFGJ_ooFgFe2Q=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/SCRdqNjv2lfLnU7Via3ZBgBoo4Kk9dqHse3Y2uXQzZQVnaBrk0unIM-nkQ_WexdWXBGGkfvp7gpUDuBuUa44fqqTOy8h_nK5LCIiSgSBB9q0AZfyeXWyT6YREMppRNDje6flkDxFtg=w1920-h1080";
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
                chapter0n();
            }
        });

    }




    public void glidee(){
        ImageView guideimg = findViewById(R.id.guideimg);
        Glide
                .with(chapter13.this)
                .load(dlink)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.ic_loading)
                .into(guideimg);

        guideimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yas = new Intent(chapter13.this,fullimage.class);
                yas.putExtra("dlink",dlink);
                startActivity(yas);
            }
        });

    }



}
