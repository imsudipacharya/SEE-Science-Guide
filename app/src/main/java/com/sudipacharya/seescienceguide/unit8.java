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

public class unit8 extends AppCompatActivity {

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

        dlink = "https://lh3.googleusercontent.com/goGV-dAWPTcUq7zzYRyejHuCoNMxvxYwtwpLuhTVl-E7hW35aCvpksSxFkFbqImJ7TDO9NySZJB9rVt4J-AHWAWZku4SmqsJtpM0llOIQ5ASg4wQpeFCcCbmkq-K9cuWWN19atIHHA=w1920-h1080";   glidee();


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
                chapter1n();
            }
        });

    }





    public void chapter1n(){

        dlink = "https://lh3.googleusercontent.com/CMDtQNDZtLOSFBp4Ak5YYSvyNMscJ2rHkmq6Cja_JYxv_xFK97Pwj-QR_e6RYJWkQDehxvy3Cx7MkOEQRDaR3WYAU68iDX990nAt2XbIv15r3F3YJUZ-WDCymYUlXPW__MoooUPs8A=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/nYKkX3hAUlDTEXlW_Vhrd2LvAU8sgLfQ_lYULxYzSoJaNnpFK1A46WT2OaKJ_GnsA5PbFJT4b_VkpFOlHLgdqQMewQebfrpujgxgivA3XVeEoYhuciIg4o2ChruOIH7wcx3EwhDGyw=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/wKiK2A-5QNKRPNZEVjlFFVRACa2IJeadbo53AHYOAidAZi0FhicKzl08yiiVFegR6599ps-zz5fW91tCPVixhje1_SeNXP49CZ7-mT6XPRaKQ8kNMc7lWUvEyAssgd5bVw-Nzeg-Yw=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/EtcHHIf7E0bWCFetJ2tAPAm1WMFu4Q7DaoOMRtdDTGDgSs7qokmG09TQv5W7wkzw8TlJzrFQJ4n8sMLtF_5aaq9UMf_Z-K4SZezgclSPdVm6kaiXWQ9RFGuXUHx50atbKWOsln21bg=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/R4jsb8YLcQyxmzckY_GvZ0wTzclKi7dB61LblMNWLj1LZxZFkYVUAcIwrTtTQCGSVrBDFmIhSau-HVukxThTdZHjx_d1ZGNh2JmBmx7reiwXrcNiVTi9HC8hyvMfs_LNRLmgZmLIFA=w1920-h1080";   glidee();

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
        dlink = "https://lh3.googleusercontent.com/8tQLqQU3ZTXLVcmMonnCB1YUBsNJVxMOezWJD8p70UDOHlH2i5oU7HP2eRlvqEaEtfvdl2EL-dZeDfSiYJpbYrLoP_zrspaA-kjQT89zPCd-JaDKyeoBnNGhu1_4tZpBxWQ4HWN8iQ=w1920-h1080";   glidee();



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
        dlink = "https://lh3.googleusercontent.com/zdC7WuOuu_xTc05px2tKkX9xrgzmj8bGACFOa9w2KpfHSFUmmDvh0mQRY-QO-_ihJXAmpbzfnRJkKn9MxidlyVo1Z14LjdkHFBQ29n8o037Soe43XWciRZ0XfU0mHKDlya8JlJLfFQ=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/4s14gx-z0HRACje2oHacLh7vEOvAUby_xcksAvi382zlGom4GeCALdHDV7UYiGMpyO1JJm1cQJ0UBVrrRqbjssFGxX63ka14nz8E2t8tzT3ELB5CB4cNm7OcW_kjmYyL15JmlaiitA=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/ju0LpmleeSuMs0Ls0Q-BILfBxhZhPQ03uKLxwp6LdqDHA523fOsw_Dn0ohYOSQjFkJsSrXr1b5CEzOrUz2F_ePbiPb6ma9In7TN93iN-wHFXF5Xz8KKYuAZAno72N6Vp2UAOgIbsQw=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/kq3Ij9B9agbJTVzJHyYB9zGu1X4exNV56VjHxPjvY-QeAfxvwjgPddepllP39g42MOiawdKiAuAdr_UB6A8zUCUu_L79snn1fsoJgNfBpwudFkIJle9L9xFzMD7QAvZzwyoaIr3Low=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/aNYZ2HLB8WJBRdOUfPxdM_1ToEtpyFVvas4tNsqz0Izd77x9dw5tpiOzHtbQz4XN8ltXvCvLCQA3Mk-YkgP9Cxez1NZUXF7aqKq-b_MxyfcJ5KkBjRXa26kNpy4pl8p-H_vdXXsa0Q=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/4lXziJ2wvBJYCaZU6d19lXw3v7srf2FDiB_12fnfqgIKfolCm7QUu_75l-Sj-dmkq10u2xbWOzz-2eN6O3I2u03mIourXwyQVDSgQn9tQsy7btrRQFV-z_MVc-UxnG_fxp73DdpOjQ=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/SVhXM0innoJBTc30FHEGbccRAzh7StkwAKJ-ciHgOMuW5QXgXESAjZlklWti8oVJQrcKd5Ma2-CuVUFNarW_x1EfMeGSMAzQ2wBCHBP0V-_ub36NUpyIUrk1TyYjoGMZjl7exRS6sQ=w1920-h1080";   glidee();

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
        dlink = "https://lh3.googleusercontent.com/_TexvLiVE9tEkZgL1vmAFCZ7a1nfgxaVtmZrDspSMF6wxLsu7_1mI5NEhLEK5WiYOV0g2Oq_Cch3Vk35iWgYyQbokA8MPxesLKvVQrUREpE-j33VQcLiEGLNxIvfYMuov5395NOlSA=w1920-h1080";   glidee();



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

        dlink = "https://lh3.googleusercontent.com/Uf51VtHbxECqj7JqoNZM6hO3uMC1xQPJ_FLHjRIA0-4HokG3MRTOcEDyZbQMK3uDQLqunynfPWR6ZwNKMdjpNRqqIXjDHXEW98KUGJRjKl4urM0uZdcSYZcfLZ2Zqw-AmUUtcpY2HQ=w1920-h1080";   glidee();

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

        dlink = "https://lh3.googleusercontent.com/XwA9yPaAQ4JLlNQMuiNa4--WKssHWvZYeCT4icQ_bYzmd66GAPzuzMdSUCafG4wALE-U_c6yuC-tC4PTIpufK6hXI7OF4e4V-mnnoBMzm2txQ1pcYu1Ii2nLMafxa81pqzHBgsNPmA=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/1yHsSjFiM_Ih_ROVBLrA9SzPiVHy8-bemeEEEmXg_rOFalSDTm9VIKxHnPEyP-3mcqYvZ5eDIPGRwsGADvwUDjBNS_0kL8w391nB410XUx_qKGwmYNVgIRg3vw7j7jSlWXFi-jVzRA=w1920-h1080";   glidee();


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

        dlink = "https://lh3.googleusercontent.com/ufXXerjx_rW-NGfuY6yg5HztI9j4qVi0U4xBQo947omziYhKT7EwJMtz6EFC9pygeWq4DuWRcYXUPiMWZE6-4ZO4ZX-cKw9hgALX3kKk5S_GXzdXqCN9AuDcJ5-rRfH1-2j2usWnQg=w1920-h1080";   glidee();

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







    public void glidee(){
        ImageView guideimg = findViewById(R.id.guideimg);
        Glide
                .with(unit8.this)
                .load(dlink)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.ic_loading)
                .into(guideimg);

        guideimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yas = new Intent(unit8.this, fullimage.class);
                yas.putExtra("dlink",dlink);
                startActivity(yas);
            }
        });

    }



}
