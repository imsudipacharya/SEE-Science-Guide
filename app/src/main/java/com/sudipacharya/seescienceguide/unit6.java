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

public class unit6 extends AppCompatActivity {

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

        dlink = "https://lh3.googleusercontent.com/HxCjQ2S-aWnrLbBeltNW4bDMAaxzD87FKAokBiOMViY_8gYl2VtdtViXAtaGTFlGSIzdFqNccnu_6Spd_jl1zOKbo7cWRaCewqb1ARvNRveSLrkGgsAb-oI6ag-nx7VlBm_NGs3X0Q=w1920-h1080";   glidee();


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
                chapter1n();
            }
        });

    }





    public void chapter1n(){

        dlink = "https://lh3.googleusercontent.com/4ruE8YBpYPp4AcaMXhm9TTFIkIuI_Xe1s5RBhvcFqIyy8_oo1bf3rgzZrinXjP29pidGLykKSncX6vZXLGedQvNBAWt5sxvr6odWsmKCDHvKRziJXbcgIyrcsGJwbe0lIMy_QVCLyQ=w1920-h1080";   glidee();


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
        dlink = "https://lh3.googleusercontent.com/bkFKGq4EvqKFZlSWG3gk-E_39KY_tU3QP8-BBT4HV1VVlyinEC4euKv7yBh-KkHgyWtQL5VvCV1VbI36yeBFZYaR60ZjNehoggcnifMC182tDBBa9DxmO9_XNPvZ9KrjHFTnVfIfmg=w1920-h1080";   glidee();


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
        dlink = "https://lh3.googleusercontent.com/DcQ6KKTeDCLVi4IIfP_ggcr4AFhKekWcBbPIYIJLIRBPiZ6YGPlsPeKBKbW_XJRysS3EgNzbs21cMIDLJIYTKEzFsqAJYVNjvuE87j6Ed4dHKsld5qbSGiIhht-yuEBFGnsYO62N8w=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/rNMqp5CT6KqKQ-qoyAhjW97tikOznR-CmOCfJr3kJu3YMTHCXxTpXYuhXomf8AA9DWzewqO2hBniGa90RPvSUCSK_8f1T_vBqWHRAnQsFUmG5LuENJ-T2Rm_31NI0rwqvP0rXfO0Xg=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/8qBSN2kt1uW-B0KXrTj9WwEB7s9ThVj7ugEv-_luAyfQRuRoetWeGzm0k2x6u2Gz_fqbxlj9biUMVPmmQ6-abTdBZTXOyHx-v90H5AomOsTm-DuBJhqvNxH-Yk6IuHYOdH2ymJ1YLA=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/i4YwA5QTa5WCFqkT_ccJCq3bDnNZIJ-Z_3XJLUSMRUV791aVgTxzW8y8-BDuh-FsRC73O4p6tPTi7FJretXadceJkRmhgM6NuqGT_jF4K_usuEqJBS_F4ao5lp6cBPeXt4wD7nYtRw=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/AN2NndD_gBg1e2tXDb_DykyI1fx64K5nAx8Q0B_9hMx0Yf7Zb6GscuEgC18hMAuvoSQiSBSOnLV8ILtoC0LRyx37OX8gIZqOcWfzaYE2dM0hkauWWa7QT6kvkITIMZR5lY3s3wtp2A=w1920-h1080";   glidee();

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
        dlink = "https://lh3.googleusercontent.com/MqUzsapMBbU4SX48PbbtwPJEkH3tJCOSMpQmhh3RTFuflWb2yuBFmDzbqMFn8BSEo24z12vtjRkZ50I20DQE1dNByWzYH_9PmNFkkha1Aw7NvQQHv_GvKSn5u_HYtB9AHklTT2-rKA=w1920-h1080";   glidee();


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
        dlink = "https://lh3.googleusercontent.com/zpan5SrWM4N22Tv9aTiYTydzqZov8jFuWaojGlBYrnYpm2CSN-dfaxGtPr__TLEzT3yKFBq2-W93DmYnfed_F8JNIP7u6L_65gDt29OL6_1JdBdiADOFVE5UXzMjGr41GmybnFbDNA=w1920-h1080";   glidee();



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

        dlink = "https://lh3.googleusercontent.com/0JgRhkleuS_9CbcbLuzqgGH7j88PL1D4M2wrp9f_ORzfNRTlXpfpjwdfisaDDqvG8oKe4-vZUuLobx4miakTivG2ZLzMwqt9DF2OAObroNcFHeJZhXZeH5eEOZea9NrvYjn0px814A=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/xpQT3XyYKGX8PDLae1mPW5Kw_7ApFnivOJHc70IC3YjEflF9jvqLrBg86ZJr50JMzCyqcBYFA26EHUBqBBH8ykIlGDv9OIMZehmlEtFEVeH46QExaO8cMaWqXWvsceLonbWL-rBUBg=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/QyD0s5K9bPB4nxdpmT7zRRa2x7NnkUCPu6GGstoLJTfI7JMlFvK69Ev6SeAMTTbbUk9qemjViGWYNbZt1zZ9HIFea813hA5_z5iyoTgq_tqtaVk7PbYvLoJJt25sUIO1MBgtv-ZRIQ=w1920-h1080";   glidee();

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
        dlink = "https://lh3.googleusercontent.com/PjCzWvVKddpgd8B84RGxoMSP_39-ZaPV2abQWX35InrBY8xPOIvnvlpbaOQrGq0gU9pl3dxPFrHkmaKoZJUv_p4AUemMj4Sv8mr0n58SZ1WG4gAQiHz_TTvrfAZSINTezkH-vk0-5A=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/JfUSaHfOn607AbSHvyya1skLOh6YvPyfukdfQrtFT8Uzq5k0eZhLKYUnJb4fS8IwS53oR4dSiWCebLe_Z7mpVA1RDroAWreyqy1Pgk83JkmfV5TlPu50cQn05_RDl5Li7UBPQLkvpA=w1920-h1080";   glidee();


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
        dlink = "https://lh3.googleusercontent.com/MdpbiWO6MOnwlRjRbBzuf_YQ7DrFZTdxcBdFd-qYeYx_GTVSwIR2pWV5Rk8HN88btE6jS4WD1C-PkdEOsk1s8jSaaURVuzlmexO5UMyxjOlGhBFQ-gEMbTlIO-XxCoPZgjr1A-bZPw=w1920-h1080";   glidee();


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
        dlink = "https://lh3.googleusercontent.com/iO_TnFCoGoIAORTBnpe-VbiRkkuawGBl7X7tO0jxSgKPjZQCK0cJzr7EVXCT7GpbCZ2NU9PELVkmnEQ510kSMX7QEyB3-UtxkibWMoUK6TPuZOoBHBL5s6gNghMqL3cnS__A0dLATg=w1920-h1080";   glidee();


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
        dlink = "https://lh3.googleusercontent.com/Tq5svlwMBuE-dXEBmG_WKMx7eDXAcJfKMgjaWBZ3YLSxdw4X6iTBMJl1Ua99Akmw88-4esiSuSLiArYZ-7kP6nZS95hGRDgHcxI13uw_bgXD3iK9XQG_rSGq1BQPYG-TAByb59TMUQ=w1920-h1080";   glidee();



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

        dlink = "https://lh3.googleusercontent.com/w70RFPMUt6eVXu4r4HFNDCi3atJOFo9mmubSPIoCRllbjXufdR1B9F0Un1ngwsGgQyBvr_SKqnszlO_xMl3N19HoQHCGg_ykX2SrRAu9S2ygHVbojSabvJyqgtjg8SZINv0SZtjzNg=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/mP1D9zeL_7xSj7BBkXfXdEFSVuB7zgYlTgG9Oo6by8muFs-ZRJAOe2srAay0Wp_KbTrn4dnj4ocUiHaDfv2xYS1Ibazk8T7ohcsIshmCnz_Ejnn0lKUfEB1i2ISMVCaCx6gvJhfYfQ=w1920-h1080";   glidee();

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
        dlink = "https://lh3.googleusercontent.com/Bq3SWXAWAZ7mWGwJiujSmFnY7HDRrg1jq-t0ZPUwpHHF4qKa9g4oR_ggFVFJmtjcOjVVJUSO_PEUYj_kL1WdsK6FTWPHWVRqZaMGBEfpXzfCOr3Ackl6T-dvzrHAcTOdseiBA2gW2w=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/HoEedO62P0aipLCHO5Rho73xdaOx-9IjqE75bbf7dE_ayX6LvTXPSAzTG5heDzUASfXc47IC3T58R5iAE1VhgvgKMehxK7QxsJz-cB2VQxhyJbmAsMxm13wPSXh_md019pZE9nUKeA=w1920-h1080";   glidee();

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
        dlink = "https://lh3.googleusercontent.com/G6tUVRLnLA-kGQTiu4MasZ7XNgjqaxVrwGXMFJVTIgfu__JLOckkhIR-FiuP8ipFL8F0x7pFknaQ1_PWA5txGuhECIMZHPwPYwFjj56_0HvHQVqGjgi6COv82T129DdU5mRXGna-Yw=w1920-h1080";   glidee();


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
        dlink = "https://lh3.googleusercontent.com/m8wVFqkNz8PdMDEi58v7QfMXF8ympC5fqB3cdNsJm1V_dM6wEua3uFEMQaqmlihZgtQR-DDI1T_wAk0zWKeqC78EXtVNhCUFHKj5FO9F5qYnKHjNtrjQE6UEvitmWfTioI7LzRrWSg=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/W-_huH6gPkPt5lrzaNgsHH7DW1TUJPWHGYZKAz3UzT7zEy-PjSooQaSlnrtDpN1-iFWXf0eA2ufvMhzAarpsAM-6WvFdyCsYXdNDJewBhvgnqMnvTa0jS8fy8tgbU--Ypy20uaW9yQ=w1920-h1080";   glidee();

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
                chapter0n();
            }
        });

    }







    public void glidee(){
        ImageView guideimg = findViewById(R.id.guideimg);
        Glide
                .with(unit6.this)
                .load(dlink)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.ic_loading)
                .into(guideimg);

        guideimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yas = new Intent(unit6.this,fullimage.class);
                yas.putExtra("dlink",dlink);
                startActivity(yas);
            }
        });

    }



}
