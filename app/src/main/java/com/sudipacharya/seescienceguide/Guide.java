package com.sudipacharya.seescienceguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Guide extends AppCompatActivity {
    private String interstital1 = "1058134071322685_1058136274655798";
    private String interstital2 = "1058134071322685_1058136354655790";
    private String interstital3 = "1058134071322685_1058136444655781";
    private String interstital4 = "1058134071322685_1058136524655773";
    private String interstital5 = "1058134071322685_1058136601322432";
    private String interstital6 = "1058134071322685_1058136711322421";
    private String interstital11 = "1058134071322685_1058135861322506";
    private String interstital21 = "1058134071322685_1058135914655834";
    private String interstital31 = "1058134071322685_1058135994655826";
    private String interstital41 = "1058134071322685_1058136064655819";
    private String interstital51 = "1058134071322685_1058136147989144";
    private String interstital61 = "1058134071322685_1058136211322471";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.ic_book);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jkl = new Intent(Guide.this,chapter.class);
                jkl.putExtra("ads", interstital1);
                startActivity(jkl);
            }
        });

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jkl = new Intent(Guide.this,chapter2.class);
                jkl.putExtra("ads", interstital2);
                startActivity(jkl);
            }
        });


        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jkl = new Intent(Guide.this,chapter3.class);
                jkl.putExtra("ads", interstital3);
                startActivity(jkl);
            }
        });

        Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jkl = new Intent(Guide.this, chapter4.class);
                jkl.putExtra("ads", interstital4);
                startActivity(jkl);
            }
        });


        Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jkl = new Intent(Guide.this, chapter5.class);
                jkl.putExtra("ads", interstital5);
                startActivity(jkl);
            }
        });

        Button button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jkl = new Intent(Guide.this, chapter6.class);
                jkl.putExtra("ads", interstital6);
                startActivity(jkl);
            }
        });


        Button button7 = findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jkl = new Intent(Guide.this, chapter7.class);
                jkl.putExtra("ads", interstital11);
                startActivity(jkl);
            }
        });

        Button button8 = findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jkl = new Intent(Guide.this, chapter8.class);
                jkl.putExtra("ads", interstital21);
                startActivity(jkl);
            }
        });


        Button button9 = findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jkl = new Intent(Guide.this, chapter9.class);
                jkl.putExtra("ads", interstital31);
                startActivity(jkl);
            }
        });

        Button button10 = findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jkl = new Intent(Guide.this, chapter10.class);
                jkl.putExtra("ads", interstital41);
                startActivity(jkl);
            }
        });


        Button button11 = findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jkl = new Intent(Guide.this,chapter11.class);
                jkl.putExtra("ads", interstital51);
                startActivity(jkl);
            }
        });



        Button button12 = findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jkl = new Intent(Guide.this, chapter12.class);
                jkl.putExtra("ads", interstital61);
                startActivity(jkl);
            }
        });

        Button button13 = findViewById(R.id.button13);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jkl = new Intent(Guide.this, chapter13.class);
                jkl.putExtra("ads", interstital1);
                startActivity(jkl);
            }
        });


        Button button14 = findViewById(R.id.button14);
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jkl = new Intent(Guide.this,chapter14.class);
                jkl.putExtra("ads", interstital2);
                startActivity(jkl);
            }
        });

        Button button15 = findViewById(R.id.button15);
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jkl = new Intent(Guide.this, chapter15.class);
                jkl.putExtra("ads", interstital3);
                startActivity(jkl);
            }
        });


        Button button16 = findViewById(R.id.button16);
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jkl = new Intent(Guide.this, chapter16.class);
                jkl.putExtra("ads", interstital4);
                startActivity(jkl);
            }
        });


        Button button17 = findViewById(R.id.button17);
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jkl = new Intent(Guide.this,chapter17.class);
                jkl.putExtra("ads", interstital5);
                startActivity(jkl);
            }
        });


        Button button18 = findViewById(R.id.button18);
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jkl = new Intent(Guide.this, chapter18.class);
                jkl.putExtra("ads", interstital6);
                startActivity(jkl);
            }
        });


        final Button button19 = findViewById(R.id.button19);
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button19.setVisibility(View.GONE);
            }
        });


        Button button20 = findViewById(R.id.button20);
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jkl = new Intent(Guide.this,chapter20.class);
                jkl.putExtra("ads", interstital11);
                startActivity(jkl);
            }
        });


        Button button21 = findViewById(R.id.button21);
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jkl = new Intent(Guide.this, chapter21.class);
                jkl.putExtra("ads", interstital21);
                startActivity(jkl);
            }
        });


        Button button22 = findViewById(R.id.button22);
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jkl = new Intent(Guide.this, chapter22.class);
                jkl.putExtra("ads", interstital31);
                startActivity(jkl);
            }
        });


        Button button23 = findViewById(R.id.button23);
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jkl = new Intent(Guide.this, chapter23.class);
                jkl.putExtra("ads", interstital41);
                startActivity(jkl);
            }
        });




    }
}
