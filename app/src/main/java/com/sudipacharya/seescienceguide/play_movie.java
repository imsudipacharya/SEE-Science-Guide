package com.sudipacharya.seescienceguide;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class play_movie extends AppCompatActivity {

    ProgressBar spinnerView;
    private TextView tvdlink;
    WebView webView;
    private String currentUrl;
    String dlin = "https://";
String dlink;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playmovie);


        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

         dlink = getIntent().getExtras().getString("dlink");

        tvdlink = (TextView)findViewById(R.id.downlink);
        tvdlink.setText(dlink);


        spinnerView = (ProgressBar) findViewById(R.id.my_spinner);

        webView = findViewById(R.id.vview);
        webView.getSettings().setJavaScriptEnabled(true);


        webView.setBackgroundColor(Color.BLACK);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(dlink);
        webView.setWebViewClient(new MyWebViewClient());



    }


    private class MyWebViewClient extends WebViewClient {

        // show the web page in webview but not in web browser
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            if(url.contains(dlin)){
                WebView webView = findViewById(R.id.vview);

                webView.getSettings().setJavaScriptEnabled(true);
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl(dlink);
                webView.setWebViewClient(new MyWebViewClient());
            }


            return true;
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
        }

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
        }

        @Override
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
            spinnerView.setVisibility(View.GONE);

        }
    }


    @Override
    public AssetManager getAssets() {
        return getResources().getAssets();
    }







}
