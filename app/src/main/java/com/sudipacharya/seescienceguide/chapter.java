package com.sudipacharya.seescienceguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.InterstitialAd;

public class chapter extends AppCompatActivity {

    private String dlink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter);

getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent intent  = getIntent();
        String interstitalAds = intent.getExtras().getString("ads");
        AudienceNetworkAds.initialize(this);
      InterstitialAd  mInterstitialAd = new InterstitialAd(this, interstitalAds);
        mInterstitialAd.loadAd();
        if (mInterstitialAd.isAdLoaded()){
            mInterstitialAd.show();
        }
        chapter0n();
    }


    public void chapter0n(){

        dlink = "https://lh3.googleusercontent.com/Tdj9gvfEACvNOweXR4GBO4ia1B4fXs2WrM5XQj9niJww_AQSLjU-HPxyZJQbu6Fvu-YT8Hc6G9YlqCpl25P31jzxBxLm3b6R9iTxP2DbFpF4dY8MJdYbUeg6RGY6RO7hHbJrNhhUKw=w1920-h1080";
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
                chapter1n();
            }
        });

    }





    public void chapter1n(){


        dlink = "https://lh3.googleusercontent.com/PcgR9uf9wwOx2lvyUBymbgrR1xlwzqgQxDaBbc3Ox4O2h25ovO0d1BTHuYt0pI2rOEUTvftJC5NeC4U7B184JwuHmmAlC12xM-zvUfurTx5hXr8trdW9A4Nh8Do1JPIuu4NHmmFriw=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/YZDaJt0qNeZyznUCx3RnEHsPwEWU7zKmdffncIOTtNROalgMpWlL_L4uYqiXpm1IuxlsodoiVxlX3at0o-NAVyg6WKef-dM14RS9XsSIsjMwBKUEpjVkmHHZjJsAW9k89i2FavI40w=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/08XMO61nyb7CGpxasDUFmtOyuuhtKQHwII0f16FO98gHKG3tb4XofBgUKLFDxAp1UgBu66Og--Gm5aoFyw_JBGqAFYN_mRTMvEachce9-3kwne_pV6SuARo2ztqbQlJKsaxicpXwMQ=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/LnUYG4F6CGKOQgdv8k3_-kcIhsv3_FJifDA5V6vC7Bl8kgceFa3GGIVAl7gAi_ftxlVWdBahU8TvUC28SZfP6SLt_yb0C--2ra_VbI16nyTOeVF3hw_EbUJ6QXc2h_Clnmm75E_new=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/oTKVNzyOzgPUwNbkGW1_LGZubm2oenN2Ove5ZTLrUiY1nWsLunjQ4e1Ti_fHHn_NpvxTZ7E1SKsGCmYHjiqLasRdQgMybJgT9AC8-rUuvouX3ehwRka9cOiIO77l-ne8rFkqL-TYdw=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/PQGmdmxfLQUYvwUbLcuBnkJ4OTBB0LFDYN0WeloYohNCa0N-XXgY2lbiogMbb74NIDUe8HOYOhm1TjW3DW4jd9zxlOltdiJoojNh0ZB5bMQxf49dXsdUSKpaLcgRyIO04-4K7BjB1w=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/HWdyqAYrNoD5j5d8brlIeRXIoxA1SOZ-Wtm0eAQG0VYXe1qq3OiJtz3QN3zHRS77luUdVbxPUX8m2RfUnV4BswgsmF2TbxL_y5Egezf7rU0rxmLKcHjRq9HsrZmtSYw6MJ78uia9ag=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/j31GQIBKcLqNqJc-gzv9klg3c_mxgJSaCcmdV5S5AyvonZu2oQ5sFazdJJeVlsA5F2ydMZIFTRIZVzgiHgdL3GP-0SO31knhi3oI4ZY4Hbqgbn0W2g-6T-zxFCbkSECzBistII4GQQ=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/xf-KJUqOPqwzfgveza1W3YFplQqtSM1mGOyEOtlJoJxAfaMuPwAwpRKB-wwhskP5qBA_Fq1MdxZpWJ_i8jQB2SeRvNZY1GFeJcg8MTnKFGBYDeh5Yc-3p5Ll7E9U8u-IJMLPlB7Tzw=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/IO3NB7QGrBMkYlPwt34C-5QKId7nle6SPqKSyuiZCLCnHwSxzsV58Z5u4HGwf2KfE5IQ3O1WGn47j7h4pL-40fG5hTAx216DDEAycQSRg-BF-0Bg5KEmH2kKCopYDcCuy7xM0f-uRw=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/uqwcRF5f2b6Q2gA1ELbWUPwBzwCd1VKSgdRsobM1ZlmYc9H_dXB1tKQBdUU2SOF0q3R9IM9tdFX8Xk508r6zfeHFABR9ZqM2IJgCD0eGRFQA_v9bCoF9dvooLf5P1HrJydr2tY-dAQ=w1920-h1080";
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
                chapter0n();
            }
        });

    }







    public void glidee(){
        ImageView guideimg = findViewById(R.id.guideimg);
        Glide
                .with(chapter.this)
                .load(dlink)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.ic_loading)
                .into(guideimg);

        guideimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yas = new Intent(chapter.this, fullimage.class);
                yas.putExtra("dlink",dlink);
                startActivity(yas);
            }
        });

    }



}
