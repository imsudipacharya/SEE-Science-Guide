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

public class chapter5 extends AppCompatActivity {
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


        dlink = "https://lh3.googleusercontent.com/e-fYibt6JTnuZCA8ijcJB72Wogr8ANcWChPksJK4yUizjS2vI-bg_3Fv_gAuI__EV5wqe4tVoKeAo-m3ElcN2sjG4ypg3yjRiyvF2ctD2KSu5QTH05t4kwOhrvrh4LAOF5F7Px8goA=w1920-h1080";
        glidee();

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


        dlink = "https://lh3.googleusercontent.com/7AwiU9fiboyMBW_P01vNYNXkRLOHz0rZC0vG6exF0djnh2FvAuy2wfAPoB5Vk5w6ssOT2jCecjOMW-sr7XZwd5tMAlgoeasvos538QJOCCpl6LmoexSZjViVwyM83Od0iDIp4BvZIA=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/eurM8me_K6asF8_egjSvBnNnpLQxs4MOcGYhjs5l3BOe2Yxp6V3OeQN01g7dtNv672QAR5Abf-RUMFvL4Hz1MpLCgKNWY2Wxti-3yt6MgIs9vYBte6_tkGFZ23Yw7SMgKUR9moNnng=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/PH3WN0i8aarORnUj3JVKbVLSDPGUH28EpRH7yUADgTAVZUBsDKbu9uRCZztTOB4RWSCdoJQUQDbUXe2epTpxgROxzCDADoEsMDzcLxMr3jUQ1ZRJ1JkKyag3E8AsnAUHEUxa18INLA=w1920-h1080"; glidee();

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

        dlink = "https://lh3.googleusercontent.com/RVXEAIoS7f4_2uJxcUgtNIX0ihTXJFHOvF8mjSLYaoWoj9Txeaz0kWWRHIXget8DiT_6Cya1ROy9f7h9_-DJIeQimV_0Qk4O8wV-rM44e4orLbvU8ZRf9sW4U5TLZbWVsYMaQ3dz6Q=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/07LOeVE010tatKNREoo_l0bvuKD3e85imdG1E58zwzwDECQ64jYHa4ULWXJ8XacgUetkmyQhDb1hbQGvdo5ISnkboFKkv3FFj67S3rJeGYOwJ3zgeXRrZvnws3N6-aBMD9h1vk9lqg=w1920-h1080";  glidee();

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

        dlink = "https://lh3.googleusercontent.com/A5VMGZkFihQZcBoJg9IgJoCAV2_u8NPdTCN7zTk_5uMpiXVuMJYHrPm-6BPXTX9q11S_mVA14paGMCOaLo-0os8M7-jsQJNQ1SNY0vasMtWWm8_mmGiksrBO84Cm4Tv7sX5Si5EJbw=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/kuSnOWMhh4JBZqsbdK9KT2Fyp1vHIJZ8pWGFT2CqcYu4jV_kOu0jKkyNiVG85vyjD6-76v9BaKOEI2iAISs4BrJFidjq_Wnh059ZOoEopS6PJEi2R0lRt-_T9e8T6TRj0jRVOH0GPA=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/6PkwLe-mMmi-seoTIluGkCAf4OKkTIrKEoHXzlIgeIeXApnjxH1abJGZI0nC8UO_ckYBxVPfuwbyeln5xH3O5Gpv7EXtLxNcRBPHXrjdl_MRDrDok_JCca-ujzvRQYl2E3zVdgGZbQ=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/f2tH9d4_0mIYTVB2BMt-zmdN0kvyfk8-PnkCR3WGu2Kl4IS2W8Oljk__nzFU_J27d4O29rNEuJxpqH2-CORvzp-FF4f_i-VjzaKb8DLAnqTanGC61I0nGzM0GHPjLlz0VBLysnuWDw=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/G2zkzYUmhxhRcwRj2iM6wkex3MoW3LQ_slND_7VtMoAoe4KQdODX1AzWUSxD4JJze-Jsv2yOnqnQYmKOMpyuINnLCScMg1YKC7zBWJMq52KyW5HTvZQEeu9xSqnGbw0vvNbeAexv6A=w1920-h1080";
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

        dlink = "https://lh3.googleusercontent.com/2WSAtvNZz875nwcJkGztmemhHs1zjsLH0gSn5HH7ftn9Uc7wV6se5JWaXT8tzASNmZbVC24RO-I14u68KibOl0eughWqgXqqkKip8GSJrPj2tT923kVJHV8kqWHog0Lz3t3pN5OEbQ=w1920-h1080";
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
                chapter12n();
            }
        });

    }


    public void chapter12n(){

        dlink = "https://lh3.googleusercontent.com/Lxf9E9w7yn9LwKuUlsqu1udYZKx3ez8NRRA4g9PfoQtwYniwy2pPr1duCvCcGaSU7s2h7gGTPi54B1-JAHNY9vdo4Tufi7GAtRRdNT4-0dzjoyL3R2N5JOLUvwJNnUek1QEZrjlVNA=w1920-h1080";
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
                chapter13n();
            }
        });

    }


    public void chapter13n(){

        dlink = "https://lh3.googleusercontent.com/fenY5ZhedSyW51Ur6NKAvvXe41fUyPzRclEOjdxRPIKmzomAFApHdNKUpdsXostRhyqHPFuhV44x739pjX-Ssl5I202-JBpw1kPzvXBvYYNtC4pLFfzanwsqicKWG8xvV1Ll2KALfw=w1920-h1080";
        glidee();

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
                .with(chapter5.this)
                .load(dlink)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.ic_loading)
                .into(guideimg);

        guideimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yas = new Intent(chapter5.this,fullimage.class);
                yas.putExtra("dlink",dlink);
                startActivity(yas);
            }
        });

    }



}
