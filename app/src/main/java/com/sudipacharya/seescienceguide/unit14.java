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

public class unit14 extends AppCompatActivity {

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

        dlink = "https://lh3.googleusercontent.com/7nUywv2oOQUxmVdhnkeQBRaviQCd5jNCzKkQayVeCpW1UGygNS3QtH6uXNwL5t9Tf76gXRZE6KXVNTWhW96tcOBQvDSe5duqKn-0JuChVjuapL-xVpZHvHOwQ8WZ9ASD0r4e8tZg9w=w1920-h1080";   glidee();

        Button prev1 = findViewById(R.id.prev1);
        prev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter30n();
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

        dlink = "https://lh3.googleusercontent.com/xS3_RdJXVum5qjYWI2FTXVR4sqGj6edoydfOtYNAiyqGmzxdmXkWBVwiMm2zlTYN7z_zJ18vZIscr0XJKRzCF-p9jtLgCsRfnU8K2hgH9IsbQOq45-h3R9PqKlRgWU2VC_Q4YKrnVQ=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/6d-wqXF9AD_WMRvFLyBS6TCu2wK0mWdK-k9oWPSEMXPVF1UuOuygVJhJLahkt31gi_3AsfNoNhjzg8s6JXXmmrSQByP3MYBL_mlcCgLtaY2pRvJB-n7_iKKAl2OO6ZwCFW71LjhBlg=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/ET55QrLX4C8d0FM7qsQbytIca2AtRgo_HizQmdI2R_nhFIZwyoXFnbvUaCqqC-jSlQ_hdP_lT_rEDH_MWZmoteNN5EmwHufcZc0KXFewoa1uiUvMnhKtQAnHeemgdexCHoyFIg4aGA=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/lNsB5Yhv_0MJ0Ve7A7EzWUnH1LYrwWXw_5Hl5PPFBRix8UOcwhbYyuYJqSiXtre4WVwevZ5Zx3pa4RWdJmqPaVv3kup4pmNzy3_Q0bdwomkQt86YFdgUZFIlDkvkkzbohlR3k5oYmw=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/C-Ts0NgmXs_-xV_yYZM30tRhBXa7pTwv3T5T0Yg6IPZeROEgYnvsKOmU6NiParU_pEkO_tZE2QxenvLD-ooWOjwDSEx5PCbZ6tvJwqwrrVq6KefYg1xNZGcUOcunXopV_UndVrPV0g=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/--0mc7QWYLYKjuPYzEXcsLl458tsJ5cvg8dfa7yxu8RH1NT5NLAbZYZpwJRivN_jY6NCtL50zkQgBt_9QaTb1tRI4e8HOyj1JMYUKRxW7JmT764u4hWDmgI4BuvKNmh6bBTZEsihTQ=w1920-h1080";   glidee();

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
        dlink = "https://lh3.googleusercontent.com/oeyL6R5_bGrgXPtmL1yhQuKlCR80kZ_UKAbRSKIt9cHVzLzdr63oC9tTtaiWBGfx8Ojq34q0T9tRrOe-UEpcLjWXetQyN2mlMxkwXhgwMLC4x5aaIg6LCqvKTECXKtgJgTjhogyfNA=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/ssrYipZTplgtdcGuVhTbqLiKUdCQEiGfTZLcdMwz6lPvzbLMO7KRk1lBFu-c9Bp0YD3VNt-cNrURrMXhdA4AJGjzNE2V1OeD0Z0KuzBQv3GsvxEm48X13UUnUES9juj533Pu8vWroQ=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/IML_ONxc-84su6G5jvDpNdoLpFhIkqRXpaqzadcZvACyX1vf1YLIVh_kB2VPKwYWgl0UkUtmfIZhH484KiW4aMaGn-huYSOOmhjBTQ45CJGviiWO6nGtxcwcHdsLDgrNkqlgtb8RNw=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/T0HEPbzwy3W1vxyP-cOwmKaqygiuokgw6E1558z_pyy2zmHXz_8IwsqXN_W2j6eLL9zGRZVoPGh0kaMwJsNFfX-hJpDSMeJZ1x8YWhhjcQu5-xnzo5Sn2Ka7_wZEfmBjj7JQI60uFg=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/eTpKK_iwibr1E8PlSSywF3Glzjnp_Me4In8C1kpLn-lm1yZOeAPF8YOpuePy2iRIK9t2PViL1hq8h6MVsNs3BK3vC5XEG-wKS2l1MGimsMT3NmakEjMAC1xZ_hPzwoi9Vw4Tje0amQ=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/oohubAPR4s92r1l-ut-FvDup_6TUbjbNj2Ysa7z6Yjn4t-3WvRIoJ8lCteLpUn-uSVFr9S6gwzw8EXNVqG9zWjBwltJw05NxBfoKEe14ZrV8M-Ki2D9tC04uzoTAxktghCokFwQCSg=w1920-h1080";   glidee();

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
        dlink = "https://lh3.googleusercontent.com/U-RfcdSKUArghtDmEzndVivejn7jns20Si4Zq6uW6X-r6uBFBIW7DnLzNrA2OMmyKWOg-7qABJo9oUVd7CYo8cOtjVU8gLje5XiWVXriOv5npZfsWQLHnKtm1-XytMk573Ci79VCWQ=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/bEfwUeQsDdNHTR2wKTpZ9BO4BVi-3UK8h4rfBSiyQoSBT36X6Q0WvIqmG9mKddwr-Ww3wAYtmgZp6iFiCrjkW70wtUQChMhk8TFnIuzRiwoThPLVdtYMybO_GS9VtZ37eOb4Rm8_gw=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/ug_ORE8Rmz-V2_gjbykUer34pyvf-BggBcuTlR2U4A-NGi6d4l1jew3PcMpa9k9imtYzuzipRl46BmhlGC3EO3Zej3rVpA0gexNkK8JlYG6V_Uu9ExgaIPCbPeObLLGlcZc0FmI-QA=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/jdfu0JipyN-4KSslD_Xm5nEXhZbFhl_3G16NLOtYwlkpfNFQ-Ko0wZQB0cL6kTjXi1n1Pw2-LXNI5cSqSMzEljQizBhtv_MLMEbTglMgZ4MSGRdqO1WGeDlSDHW3uqMD2gQVhTukxw=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/JActN3GQqGl95nm4GkR7UIXq01atoyToAWEKh9ds2djMHSseGNgkKD4sRcHfxTLBQdbhjrrqsshpJ-P6fT2arMJhOmMtengkbZIl_1BgYyeJPKFR4OmGQY-uW4DbA6Nxupj-WfCSjQ=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/sRYHQj-_uOp-Bmzn1vSVLBte6tObYu22lm4fXbl_AqszCRL8Vw14BDjPw8R5PVM_MCkcKxaRc11dh4IPfY2VzShSV_VBU0DVtfBFk40Vud4vvEWlm20dKbWYwfhiQZW6X5xyPDRP0A=w1920-h1080";   glidee();


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
                chapter19n();
            }
        });

    }


    public void chapter19n(){

        dlink = "https://lh3.googleusercontent.com/gMj8-8kwdWN7UjPCsJKgNqnDIo_Gz6qh-4fIHSptWaPplVFiFsSrgof9wDEH1iU9sekRY2obCn8G9LjN_ZD6EGn3iFhyTw82-qROTgBg-6HQMQmMfC_FsLK8XXdX4AvnN3h_fLbrZg=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/_9LbJwazUurT6Tb7arIkoLa09I7nxObEqvOl9iG-Y6xS2NPeCYGTJBQQgo9DpNQ-nB3vkfZTpbI0FJEOI-YrpZr0hdtKzsjryoRE3h8UBbOXGv7Jqg9MckmNM0MShiRDAhIqsiimZA=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/O3kqkNCudYjacSuzlKLfF6EczEq_rW_ekNei4Xzk-Vz_CMSLtkst16iveQEV8GqRO9GJ9-I6b55diC0D69-GB3W0ZhSpcpr1as03pFsEO_jaLOM_zl9dEkEc1HRBv30BJK__zQfABg=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/TLHp9Uf2Vn6TsbUuJNpza99qV4bOTcMfxfU7YJcpoKiPRx_dodDPsh-L_QvWkBHGXf3gWABHv9z4dO0GszzC2lGwscrIAQsbnk3879eBYHLOeFq27PlE5JnRby9jmWVJT_eO-lFMwA=w1920-h1080";   glidee();

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
                chapter23n();
            }
        });

    }

    public void chapter23n(){
        dlink = "https://lh3.googleusercontent.com/nY1dMfuJTeIVcpIqrhIjtA5q4ig0AefFgzBaHbriFnmKXXxUnGUe0_opPQMgATkfQudevtRmQuxKb-UpXS6Rir63_i9u0gYi4drkQlf1ktCttOF_Fl1kK5JWy5FZbsHLajUf6hHG5Q=w1920-h1080";   glidee();


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
                chapter24n();
            }
        });

    }

    public void chapter24n(){

        dlink = "https://lh3.googleusercontent.com/IM0ZQ-wPB9F0jz3Eqx0P4CgWY8VwAlr2FNDPneaZtZBmdym_FunOcHKqs_PcsBPSsJLPAjG16JjQqslkawWth5eLN1_1VzACDPhdryxNTtjSnoAhwurNuYaxe9X57WZISGo01lPXPA=w1920-h1080";   glidee();

        Button prev1 = findViewById(R.id.prev1);
        prev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter23n();
            }
        });

        Button next1 = findViewById(R.id.next1);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter25n();
            }
        });

    }



    public void chapter25n(){

        dlink = "https://lh3.googleusercontent.com/dJFOFYrnTQb5EHtDlqcgoGfcse9-dZwVjS_JicUsxG33iZlw9VCyFzmSLsRXcN_H0sB8_2HhPEVAvDbswvc9nsEE0ko01rgA_EaKZ9RiiEX9c6eCGVLa03yebA6j7yQGuIUH2tHnuA=w1920-h1080";   glidee();


        Button prev1 = findViewById(R.id.prev1);
        prev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter24n();
            }
        });

        Button next1 = findViewById(R.id.next1);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter26n();
            }
        });

    }


    public void chapter26n(){

        dlink = "https://lh3.googleusercontent.com/qqJeaD3wIo6qw6BwmkHJpFWgTETo4Rpbx6IIH4dzAlabTMS0rgcfiquyld4-06fbrGAwwSBr-5yGbUO-EDYFYZtuYQe3CrUKCh3r9JDu1xvecElXBrrojUoklqPRWhRm2pIDHwLSCQ=w1920-h1080";   glidee();

        Button prev1 = findViewById(R.id.prev1);
        prev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter25n();
            }
        });

        Button next1 = findViewById(R.id.next1);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter27n();
            }
        });

    }

    public void chapter27n(){

        dlink = "https://lh3.googleusercontent.com/wid5BzjqDwKv4EfNwG57FrurmCjpBvnqZMNBRkx26cfrgjaULdVip_2uDMrsLzYFbGp5XTa_VshMrfjEyymXtpx7RsOL-i4y25Tg7hpt5Xg1pbPTuhBy5WBYaX7ip-4Fl7md6JF6DA=w1920-h1080";   glidee();

        Button prev1 = findViewById(R.id.prev1);
        prev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter26n();
            }
        });

        Button next1 = findViewById(R.id.next1);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter28n();
            }
        });

    }


    public void chapter28n(){

        dlink = "https://lh3.googleusercontent.com/__LqpktGcPGyfS-uTgfiuD_As2_VD0Xt09t1Qww-Dl3GDjCnoOW60NmWLcCtp41XR-n5kPb23It3Vb43b0i6Nn1GxNqnPr78Jn3pRotF9I0_VAsphDIfQ_kX0of1MXqlbIctXdGwQw=w1920-h1080";   glidee();

        Button prev1 = findViewById(R.id.prev1);
        prev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter27n();
            }
        });

        Button next1 = findViewById(R.id.next1);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter29n();
            }
        });

    }


    public void chapter29n(){

        dlink = "https://lh3.googleusercontent.com/3HfcZVUhSGXQBVsxhg3lAtBXe_FEq-sHiRJTsw-K-BWxcBF9NPqagU2ZNmA-bRtr2p6x3aemUbXFsYyGwrD0gbCHEJKD1MDm2ovO3p-QBv3k83sqCkDGMdRgTfd7w8MBKXzGpHGk9Q=w1920-h1080";   glidee();

        Button prev1 = findViewById(R.id.prev1);
        prev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter28n();
            }
        });

        Button next1 = findViewById(R.id.next1);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter30n();
            }
        });

    }


    public void chapter30n(){
        dlink = "https://lh3.googleusercontent.com/ZgLM7aeJ5ceqnzXtInMvfvguGC64lma970Eh93dFXmAEbf5HizI_pQ0_FZUm-HjvkWhmwztC0mL4QvsyGgD_tvBcpQm3VWpXKSS5xbKXsAIXg7fFjxBM0mFseTbQChTrmEzlttNWUg=w1920-h1080";   glidee();


        Button prev1 = findViewById(R.id.prev1);
        prev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapter29n();
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
                .with(unit14.this)
                .load(dlink)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.ic_loading)
                .into(guideimg);

        guideimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yas = new Intent(unit14.this,fullimage.class);
                yas.putExtra("dlink",dlink);
                startActivity(yas);
            }
        });

    }



}
