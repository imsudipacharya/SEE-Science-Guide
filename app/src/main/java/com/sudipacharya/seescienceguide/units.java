package com.sudipacharya.seescienceguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class units extends AppCompatActivity {
    private String interstital1 = "1058134071322685_1058135861322506";
    private String interstital2 = "1058134071322685_1058135914655834";
    private String interstital3 = "1058134071322685_1058135994655826";
    private String interstital4 = "1058134071322685_1058136064655819";
    private String interstital5 = "1058134071322685_1058136147989144";
    private String interstital6 = "1058134071322685_1058136211322471";
    private String interstital11 = "1058134071322685_1058136274655798";
    private String interstital21 = "1058134071322685_1058136354655790";
    private String interstital31 = "1058134071322685_1058136444655781";
    private String interstital41 = "1058134071322685_1058136524655773";
    private String interstital51 = "1058134071322685_1058136601322432";
    private String interstital61 = "1058134071322685_1058136711322421";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.ic_booke);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jkl = new Intent(units.this, unit.class);
                jkl.putExtra("ads", interstital1);
                startActivity(jkl);
            }
        });

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jkl = new Intent(units.this, unit2.class);
                jkl.putExtra("ads", interstital2);
                startActivity(jkl);
            }
        });


        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jkl = new Intent(units.this,unit3.class);
                jkl.putExtra("ads", interstital3);
                startActivity(jkl);
            }
        });

        Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jkl = new Intent(units.this, unit4.class);
                jkl.putExtra("ads", interstital4);
                startActivity(jkl);
            }
        });


        Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jkl = new Intent(units.this, unit5.class);
                jkl.putExtra("ads", interstital5);
                startActivity(jkl);
            }
        });

        Button button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jkl = new Intent(units.this, unit6.class);
                jkl.putExtra("ads", interstital6);
                startActivity(jkl);
            }
        });


        Button button7 = findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jkl = new Intent(units.this, unit7.class);
                jkl.putExtra("ads", interstital11);
                startActivity(jkl);
            }
        });

        Button button8 = findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jkl = new Intent(units.this, unit8.class);
                jkl.putExtra("ads", interstital21);
                startActivity(jkl);
            }
        });


        Button button9 = findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jkl = new Intent(units.this, unit9.class);
                jkl.putExtra("ads", interstital31);
                startActivity(jkl);
            }
        });

        Button button10 = findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jkl = new Intent(units.this, unit10.class);
                jkl.putExtra("ads", interstital41);
                startActivity(jkl);
            }
        });


        Button button11 = findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jkl = new Intent(units.this,unit11.class);
                jkl.putExtra("ads", interstital51);
                startActivity(jkl);
            }
        });



        Button button12 = findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jkl = new Intent(units.this, unit12.class);
                jkl.putExtra("ads", interstital61);
                startActivity(jkl);
            }
        });

        Button button13 = findViewById(R.id.button13);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jkl = new Intent(units.this, unit13.class);
                jkl.putExtra("ads", interstital1);
                startActivity(jkl);
            }
        });


        Button button14 = findViewById(R.id.button14);
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jkl = new Intent(units.this, unit14.class);
                jkl.putExtra("ads", interstital2);
                startActivity(jkl);
            }
        });

        Button button15 = findViewById(R.id.button15);
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jkl = new Intent(units.this, unit15.class);
                jkl.putExtra("ads", interstital3);
                startActivity(jkl);
            }
        });


        Button button16 = findViewById(R.id.button16);
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jkl = new Intent(units.this,unit16.class);
                jkl.putExtra("ads", interstital4);
                startActivity(jkl);
            }
        });


        Button button17 = findViewById(R.id.button17);
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jkl = new Intent(units.this, unit17.class);
                jkl.putExtra("ads", interstital5);
                startActivity(jkl);
            }
        });


        Button button18 = findViewById(R.id.button18);
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jkl = new Intent(units.this, unit18.class);
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
                Intent jkl = new Intent(units.this, unit20.class);
                jkl.putExtra("ads", interstital11);
                startActivity(jkl);
            }
        });

    }
}
