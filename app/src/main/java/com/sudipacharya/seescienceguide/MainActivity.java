package com.sudipacharya.seescienceguide;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.InterstitialAd;

public class MainActivity extends AppCompatActivity {

    private InterstitialAd mInterstitialAd4,mInterstitialAd5, mInterstitialAd,mInterstitialAd1,mInterstitialAd2,mInterstitialAd3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        AudienceNetworkAds.initialize(this);
        mInterstitialAd = new InterstitialAd(this, "1058134071322685_1058135197989239");
        mInterstitialAd.loadAd();


        AudienceNetworkAds.initialize(this);
        mInterstitialAd1 = new InterstitialAd(this, "1058134071322685_1058135424655883");
        mInterstitialAd1.loadAd();


        AudienceNetworkAds.initialize(this);
        mInterstitialAd2 = new InterstitialAd(this, "1058134071322685_1058135491322543");
        mInterstitialAd2.loadAd();


        AudienceNetworkAds.initialize(this);
        mInterstitialAd3 = new InterstitialAd(this, "1058134071322685_1058135651322527");
        mInterstitialAd3.loadAd();

        AudienceNetworkAds.initialize(this);
        mInterstitialAd4 = new InterstitialAd(this, "1058134071322685_1058135687989190");
        mInterstitialAd4.loadAd();

        AudienceNetworkAds.initialize(this);
        mInterstitialAd5 = new InterstitialAd(this, "1058134071322685_1058135774655848");
        mInterstitialAd5.loadAd();




        LinearLayout guide = findViewById(R.id.guide);
        guide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isAdLoaded()) {

                    mInterstitialAd.show();
                }
                Intent kas = new Intent(MainActivity.this,Guide.class);
                startActivity(kas);
            }
        });


        LinearLayout video = findViewById(R.id.grammer);
        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd1.isAdLoaded()) {

                    mInterstitialAd1.show();
                }
                Intent kas = new Intent(MainActivity.this,Main4Activity.class);
                startActivity(kas);
            }
        });

        LinearLayout unitbook = findViewById(R.id.book);
        unitbook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd4.isAdLoaded()) {

                    mInterstitialAd4.show();
                }
                Intent kas = new Intent(MainActivity.this,units.class);
                startActivity(kas);
            }
        });


        LinearLayout study = findViewById(R.id.study);
        study.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd5.isAdLoaded()) {

                    mInterstitialAd5.show();
                }
                Intent kas = new Intent(MainActivity.this, studymaterials.class);
                startActivity(kas);

            }
        });



        LinearLayout question = findViewById(R.id.question);
        question.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd2.isAdLoaded()) {

                    mInterstitialAd2.show();
                }
                Intent kas = new Intent(MainActivity.this,Question.class);
                startActivity(kas);
            }
        });


        LinearLayout exit = findViewById(R.id.exit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd3.isAdLoaded()) {

                    mInterstitialAd3.show();
                }
                onBackPressed();
            }
        });


    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder ab = new AlertDialog.Builder(MainActivity.this);
        ab.setTitle("DO YOU WANT TO CLOSE GUIDE ?");
        ab.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if (mInterstitialAd3.isAdLoaded()) {

                    mInterstitialAd3.show();
                }
                dialog.dismiss();
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
                MainActivity.this.finish();
            }
        });
        ab.setNegativeButton("NOT", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        ab.show();
    }
}