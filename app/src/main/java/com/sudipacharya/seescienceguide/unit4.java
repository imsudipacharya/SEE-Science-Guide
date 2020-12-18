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

public class unit4 extends AppCompatActivity {

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

        dlink = "https://lh3.googleusercontent.com/p88bDY2LKtK4-Cf2Fbbjj4bciwoKuvzyE6Iz6IVORo918kwh40c7oHXbuTaJRke8zaoFTd1VHcRLbaok4e9V68Jns8TriIFTCvWXIAlCb48rdtdTFZ9VMFaUo7NptytzkHotjoz08w=w1920-h1080";   glidee();


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
                chapter1n();
            }
        });

    }





    public void chapter1n(){

        dlink = "https://lh3.googleusercontent.com/WkMjEYK0M_ef5m_-r6bkeC0Aspa8GQ6dU-qhuVAqBL5NmExBZVHbcyl6tL8OV2okWKv2yK_Rx47y3Jo-vX4Rsbcy7UlDkrdlsqHgfVclCtbgckiM9VOCpIY6uwgHLtYGTcGVlTRxUA=w1920-h1080";   glidee();



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
        dlink = "https://lh3.googleusercontent.com/Cljru-OaqnShqZXdnOA8RS2lX9Eua6uGcP8-Yw5mnCaHBxIgI8M_TIQoU71lgHtghi3t16b1zbMB15iMLlfS0RYTmpCnlIi4YOC5zz_p0xRzLA8rWuI2lN1PkpuSQVlZqXgjS_UjXA=w1920-h1080";   glidee();


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
        dlink = "https://lh3.googleusercontent.com/5p7Pza35TzfaLyoyD3h5VUx9pvTQV6C_TMeiv9m5Lifq3jMa9MgtuJssyt6ClpDtYGFOzGsYj4uXA24ykkaMYkuRWhumlDWtdr1gvZShsrGQxn2skwHLrjY8iBw1cwq4HWu2UOXXUw=w1920-h1080";   glidee();


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
        dlink = "https://lh3.googleusercontent.com/bNdM4Za7nFh6id2LP_UurGWin8cnxDap3ThO97eUWe16T0gi9BeJGwu5zlAmUj1-t0J1saCIpslRkyMdJveZww6PWEEvKCX--qoz4sS-gGIqL6FHyzSGQ-d5sKatNNcTj2IktwdmGA=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/koDZ_VuRNr9WftbKm8rJD_fW-9P9N_wtvgXn4e5T-2Zk7JtujWXK92mnxcAIHXA0u8OhjMcxW7Dfzzdo3zC-GiJrwhYAdUutkgbucBDanB91R_EScaLf4kkP_1tuH-7apVuOblKbYw=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/4mj_HE9SR1lt-PqQqrH9sHGS03vM1ybugGeH6lPLCSO1oXZlEBoLSLT-8Vz4Gl9DYO3_FuLH0tTKIcgsO4reppNUW6GgTkS33pdHtSxb2jVUMZsfkAUVLd3K05ej52WlSfDRTcWjyg=w1920-h1080";   glidee();

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
        dlink = "https://lh3.googleusercontent.com/6ngY8yTo1kT0_eyCoLrHH9K0iihCJtgf90yToNh_RCZc7PCf7RmbuCEyrgY3tSbE5d8dwGNEXBcuxLl2Nf9hjwZgCt3vxeeNe_n1yQe-pzWE0zoC68YK8fm4_d1AyZKB9i_gxp1-KQ=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/21YXW3pL3yLdOEjtW4870-amPw7-MpyBC-CRvAjiB8_dK6hviMT1CX33eEgF7KDnGjhkbDWuE30xBklebMwn2oA6vimBl_vwkvhEMblxgqCbdcSC9oq7_BSvi_2CnE5XEek-l9GjAg=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/mKc76t7-mWmbFIvW3mgxUbpgGX5F5zJwIRQMa_8cJUWVqSXUsqn4WnShZnmAiLzma47z8nWnG9-CmCvuodvc_knqXj741n0FrGbGjb3aJGTpyE5rax20OI_c8-p--HfCn8r4Vl7JMw=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/FN4RvrZTK8l8ZKPOb3RbP67Me4R6cz6Cn8XqiRn4-sBg6cvq-XB1NZ5_UgpKkhcgBfV-zAOy4j_B385LWHoHyqQd9acsHkAyBg7fik_3gLquT8aKKej_cSA_KtCVYAjA2AwDtTb_Gw=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/kSorLqZfGm7sKKxssb26NmGEqdlmoLpu7IKPPTLuHoRL7Fuj_KBh5sDjS-z1_fq4LEIq65mdVVmzs-raamCquMvBc2pNeO890jvMIa0bF_6SClNpIloguA7e9U92eo5GD3xdbm1pvw=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/1YA3Jw7JafpRQRWzN2wbCGHoszhHPWRWPZ8QGNz5XmUPHdorH8Dpyq5vg1lNiija7uv1pXqWpaJ5UWOzXea-WN2uK5fuXDrw_NukU5g7BXBDnTasICoHHHcuGXiN7hnQ7IDn68WItg=w1920-h1080";   glidee();

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
        dlink = "https://lh3.googleusercontent.com/Y7g8ph0HzioDr9fSt6weIcARN90UTalOEWxictmMEAeOP5LvQ6N4sqTNgkPtIJpjBkpa9Pr3FlKpcoo1GKB8tQNRzDauRBicAud1IqHTT3DMWOdl3I9oa-oaJfLC9T1Qsx9lObklCQ=w1920-h1080";   glidee();


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




    public void glidee(){
        ImageView guideimg = findViewById(R.id.guideimg);
        Glide
                .with(unit4.this)
                .load(dlink)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.ic_loading)
                .into(guideimg);

        guideimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yas = new Intent(unit4.this,fullimage.class);
                yas.putExtra("dlink",dlink);
                startActivity(yas);
            }
        });

    }



}
