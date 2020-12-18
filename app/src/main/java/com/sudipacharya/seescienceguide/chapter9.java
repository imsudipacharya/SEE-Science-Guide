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

public class chapter9 extends AppCompatActivity {
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


        dlink = "https://lh3.googleusercontent.com/RXqoOC6VtoWIKGe9oQ83-sAYQqwkgmbidJc7likhcCVEkisyTSJSu1cDGykk1ylSym5VkDAjC3knTnNfAE-O2NyXXLYVApW7dhzl9EYwJAU901sYwqbFTn2fxegFl5d8MjSI5dW9DQ=w1920-h1080";
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
                chapter1n();
            }
        });

    }





    public void chapter1n(){


        dlink = "https://lh3.googleusercontent.com/7Ic7Az8mg7I063xPaY7dxxhkrT6V9wzUHm0G1ARfyeCC9-zVlVA0o7LgyucZ4D5YfNonW4IXlrfp8wCpM1YFz_kXLYbQkvLJc8HKcmTMZ_OMartoeSn4xEfXO-8LD1L4DEfBmADTVg=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/Ja3IHoN2pBKt21CDjgFHhw4zY0PoPG9_MRt4UZsib-pDlThCZW7VHHJ35jsLSOwTcGqPeq1ipo2i_cZtmMeLcFI3zF_PjYkEJLg5h7_2qFwFmchhadDWbggsQaRWJg0lOVJoX9nvoA=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/Me_U-pPP9nHQPkRDaVFOOcdei3piio8_-T_xd0NKowsnxVqW5fup9e52SLiflFNMswywbDXJPsmvBOgavbNPJ6puV0jnaaCJRinLyEuA-lZLISD8eUBVld6OEekkIRHfR5oGG04krg=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/a6eGz2Lrt1hDwLDJYjGw8zm2E8whCPfbg9BbFoElI3Wj6J8DpT29a7iD3VsGmUxD-kG8IGKaTTkmP8Aog63drhifxrj0s1HGDR5pCdGBCeZU59o0fXtuEYrxj4guHv2rjJIxTvHUnw=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/g7qrNuFLkL6LRYW075-bbo7NWZHzCOUU1Fxpsr7W1vdD9-6FWKhIFAzmny6-tT6Fdt4mNXgWG5NcrLNnsynhhSqU2Ci-Q6ZmNPn-l5-jeGbEi1VJDd1ztm66Cbikw40YaNjvk4X1mg=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/y-xl1wvSx1qca-N3EJQjU5ZOvVqPsGHgOCP_2zY_khtb_iazXWdFkdACR3skBnwZWywfKemMAHYGaJYW_Wb-Wt-adWC1T3Ui_HJnVDLmuN7iW17yEyDtAwAgryuGf5l_XJoTMXk5aQ=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/zhPdtm7d_AToMlCvtQj-WbsxICUqyXpDUf42X0plT8ppXVdc6sF8ZtKVNnDzNNKzYHmP7_ustW5CdoeC3w2R90zw67qoTWp5jw7XyICZzukXBugj1Y-Uy4T45ZDq2x-pqh0tpTSB8w=w1920-h1080";
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
                chapter0n();
            }
        });

    }




    public void glidee(){
        ImageView guideimg = findViewById(R.id.guideimg);
        Glide
                .with(chapter9.this)
                .load(dlink)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.ic_loading)
                .into(guideimg);

        guideimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yas = new Intent(chapter9.this,fullimage.class);
                yas.putExtra("dlink",dlink);
                startActivity(yas);
            }
        });

    }



}
