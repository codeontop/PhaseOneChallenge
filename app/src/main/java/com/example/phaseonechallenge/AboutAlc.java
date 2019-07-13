package com.example.phaseonechallenge;

import android.app.Activity;
import android.app.ProgressDialog;
import android.net.http.SslError;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutAlc extends AppCompatActivity {




    private WebView myWebView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        myWebView = findViewById(R.id.andela_webview);




        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.getSettings().setLoadsImagesAutomatically(true);
        myWebView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);

        myWebView.loadUrl("https://www.andela.com/alc/");

        myWebView.setWebViewClient(new WebViewClient() {
            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                handler.proceed(); // Ignore SSL certificate errors
            }
        });

        
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


}
