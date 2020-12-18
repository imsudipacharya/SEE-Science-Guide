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

public class unit15 extends AppCompatActivity {

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

        dlink = "https://lh3.googleusercontent.com/mlN-BFMCvVL6X2U5dc7ORAn7HvrL3AB7XLZ-2mzi2Jw4_f8hLr1y5_w5UE96mBDGgVEBZzvywGj4puEYaR1GunMGvIVGzMW2VzQ6WlW7_ECM_2IlepXMp4OBh31anD3hByfKtx0pZA=w1920-h1080";   glidee();


        Button prev1 = findViewById(R.id.prev1);
        prev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter22n();
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

        dlink = "https://lh3.googleusercontent.com/HDsQA0MBJRi0wxtfbZAxRvY0bn4fY8Qxz8PvufMx-lZXYQa_tGXZ6SRiYRrPFveQfRlu3qYEAMF9B9qvW0QRzL5ak4fzZoBeYrs0T8Aqz2PRxhoCfgHO8Xg3XE2IZAw8w2Cpq1oX-w=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/EHQ9tDawYzBEeA7424j26Yh4ljjT_PX5wVymH9mZgO8zjhyomE6c7TBRFOqwO5RSeV4YDz9hj5S1QE2S1mp6PTJByEmxUA57fez_D82mAXudnM8_ECmj_nYLrojG0DG169ikac5vMQ=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/1W_dJDxqna-ser8ajHbtJhHlt6EcO0c6sedDmTP4fgeC6-l1hz2OTjpeRbPY8c_cYLjI7Bu2sn1GhSifTLmdPHCGoGOLzBYMyr-GG4UIWC3DvmcxkQEerrewFyi5izp-Yr6IwULdvA=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/Fr66r7QwvXrdYhrTJDRHqAaZwfz32toZbOonT782wn0qAf3zqdjqqBtTDvqreDSajVAp1hpLwuAbjsc1eGRUvSzdBW6DdVe5adF5F8on2JmsDIbyxasvWU8Ecsfz8yxowf-1pw-cpA=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/cW5M9obVmZsalXaY3Oy6CIx-5j3Vt1fqQ4RGMtDi_bESKw3JRCbFB317qNr_IsI9wNfYbvd6r6HZcB9JXGgB5ueIXbvvFKgcan3UcfBH5NTu0Uae3nIEX8NvYix7jhwQUycLA6zo6w=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/v7UqrAIXhoVJmUsvzY9_E-ZRc0Przgo_reAVdVbqRNJH7dhVZ1VS4BRHqQOD2IbMosKOaab7Tbe7zy4HndEBlokX1l9TIzCNylVcPEEC-c1CfCLRpU9dTN31oBR4wQBXbqHOczIw7g=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/tJSEUm0jMgDl58zLLyNW81HGLcfc08CQWHHJn-xDBDWkcuIlVyI7RvE_WGhxcE81k0cVB8dx2NZKnC49fIunsNvoL_EuuhC6d5O8spwxBBWPdj8og1yKXZE2comdx3txyK8hFrtB9Q=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/E8lSANcaVIDc5F_VqSvEXIDAKUtF7OnGP5qKuWVYy7DJxv5SAvtF457Fapnwc7EY8sa_lPWKS8ygpmYyxwjyhAbqxeWMTV27obNvRnDPuEfvokAJDQtPS7IyznIsqllxX6IeIe5iWw=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/2Nw6y_CXIiTMpMc-OIPisWv205T96CzHkqqJu1OqNjoD06R5Nu7tqDRwte6dASI1qe8W4mJI3jc17xTNhnK7OwNu5wWMHGd3Svq4mRPVK_t7PlHd9ovS6yLybeE05r7WZPZdZKtKYQ=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/rvkkq5azN3hTbCAoYqd3OvjOZCJoH6k7P7RvtJfzD8Swb8PkqmE-wK-7j57hPjY5gjUfc4Cy5_qQDHWEkwcie8BHCYOX2RG6kn6hoKf_sT5XBK1Xu5p9eDn_x3-_ztpRfqdBb_b1Tw=w1920-h1080";   glidee();



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
        dlink = "https://lh3.googleusercontent.com/oBNaV-Bo7QyVJ1d2H9WT2m5jC-wIA1D_SYixABWpmjV-lJSGKxYnrafpTVdV_NgqYyjE9RRgQ6HaiRUtDURjsrNAtVrEJHGvUHM4fYcMBtm73eZJMbCv5SnHkUsMNcUe0eTyZ8Idag=w1920-h1080";   glidee();



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
        dlink = "https://lh3.googleusercontent.com/2q59-eAnqv_y04_7jYxsnzDEWNnjRgvHuLfX-XFFk-XUyZe71bvSN4UBFD9JFSx9LlW2Innf9SW-3iiZbHZAV87yeQ_fjmiUFsgzTjgIe3lWichqw_T9eC7lReg1UXkx7YgO6idXDw=w1920-h1080";   glidee();



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

        dlink = "https://lh3.googleusercontent.com/WwD2I6MZ8J6SwzFsC7WzHUWm1X54kqw7bQWxZFMIjAk23E5Mpk23Y9Iw6Ekaii_qYXHKvZrBZ6KB06Xlj1RUUQb6I5G7HTJFwMtqDpWp4GYR1aAgPs1zWogtKzf73PyK1XdRQVF4Fw=w1920-h1080";   glidee();

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
        dlink = "https://lh3.googleusercontent.com/2--NzWZ5unNxIK19ulkgHYrLRpPqpkPFBz2Zf2dTcvXCnHqFAbx52S8fahRgxCvB2iKcn-Z9RGNRFY-TLD-aFPi_VpvKFavDTHJg7sleyl85U3gOD4fjXH0jN0RR2LrqqHUavz0wGw=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/TV4swEJD8YCdgrfyoo0Kx3BtxMbIl6JfojE3rStg5VVMAnlTmRlxb0dI8UTiDOsTOTL9dF8o7ynXy0X81OkHU1mGA3Jp8qb68TgoVmc1mwhZia0exOqjnp6gTsUWIstcS3jFJx-wmg=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/SRqKYdjpNNWrzO3BkMeHheajvMnvYNDCfdQnOUrs290NPVyeZ_Og0rW6TCJkAx6qmsEQmjIlaW0Y8RbpoTISxXqyuZ3bkMB8vl-YhNuA1opzmdjG3gnvKys5HFSt1WPIeX3xpUzW4g=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/WDeT9A8loSLX_CvJe7F1pKdQEyNv3lQreXYa0utEfcW24UR_7IkQiVQ6DQGL2_dTtQzP4UiE4xRV0IP-f2fmKrkrcl9O3HIeb8f8tfednWKCmEe194uWfzBgwxXkIdEsuxStQFXW4Q=w1920-h1080";   glidee();


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
                chapter18n();
            }
        });

    }


    public void chapter18n(){

        dlink = "https://lh3.googleusercontent.com/1SBkzZSIdRUkOuGJof3rZjLifpInEL61JcvFQAvu4oQhqvIX8dFNnW9GDLqxY3ii-AIDOY0uCY3VcghixjheZkEqfyvzKo8AdnGDnTzhT-X2usU4L0XEDDGLgPojK_TNSavczEG2RA=w1920-h1080";   glidee();

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
                chapter0n();
            }
        });

    }

    public void chapter19n(){

        dlink = "https://lh3.googleusercontent.com/TSDaldiDDlT3R-vDUWVrzCpXfhYFZZ-V9-T62V69M7WX4yk4NyqrBxHFGnE0sCiduMiG6EtsJpkacmHToPvIk9adfS4qold9U2zjcOs1vnQn87MrfmQK9f6Ej5b5OL1D2KfTXOw1fw=w1920-h1080";   glidee();

        Button prev1 = findViewById(R.id.prev1);
        prev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter18n();
            }
        });

        Button next1 = findViewById(R.id.next1);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter20n();
            }
        });

    }


    public void chapter20n(){

        dlink = "https://lh3.googleusercontent.com/Iq5EtmWCmIrSEbxj1tOU6Pg9jjJjGy-SsBD7ZGZ6Bh41QUF51YCY8nwjQnCi55Nc5a45WfRA_9kBhtBnxxQw7j70tIhi3b2GOqe7BAJ-MxXaEfH3Ms5q_vec2MYc_qmguW7fWNZA3A=w1920-h1080";   glidee();

        Button prev1 = findViewById(R.id.prev1);
        prev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter19n();
            }
        });

        Button next1 = findViewById(R.id.next1);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter21n();
            }
        });

    }


    public void chapter21n(){
        dlink = "https://lh3.googleusercontent.com/Q8FfRcXHr9FMrrjQbTU2uh81wQQoQgPCXa5Bf2iYQnhhBb9xUAd_3YofO9t25LFwnA0x7E2R-mRM2bpn5p-7CryA6OHKnLZYBc-RZpXzinPr7b4Cl_AW_-Uehgl2HCqa-Qg0po5tjw=w1920-h1080";   glidee();


        Button prev1 = findViewById(R.id.prev1);
        prev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter20n();
            }
        });

        Button next1 = findViewById(R.id.next1);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter22n();
            }
        });

    }


    public void chapter22n(){
        dlink = "https://lh3.googleusercontent.com/e4QtxIDtj6-KQ8XqRt9oLOf3zahyivLwYfXNxnmn5btGPG0DkpYeoZXfg4MW7aNksXPrU7qj51FQVIG-VsXegzHm_IgGPdl1ux4t7rOYLWevV-UAp9FUxaGgR7Z6ucwYR6a1aXDE7A=w1920-h1080";   glidee();


        Button prev1 = findViewById(R.id.prev1);
        prev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter21n();
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
                .with(unit15.this)
                .load(dlink)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.ic_loading)
                .into(guideimg);

        guideimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yas = new Intent(unit15.this,fullimage.class);
                yas.putExtra("dlink",dlink);
                startActivity(yas);
            }
        });

    }



}
