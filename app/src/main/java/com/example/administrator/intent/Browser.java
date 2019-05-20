package com.example.administrator.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Browser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser);

        final WebView webView = (WebView) findViewById(R.id.webView);



        webView.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {

                webView.loadUrl(url);
                return true;
            }
        });
        Intent intent = getIntent();

        webView.loadUrl(intent.getStringExtra("url"));
    }
}
