package com.example.hp.swelltech;


import android.graphics.Bitmap;
import android.os.Trace;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView mywebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mywebView = (WebView) findViewById(R.id.webview);
        WebSettings webSettings = mywebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mywebView.loadUrl("http://www.swelltech.ga/");
        mywebView.setWebViewClient(new WebViewClient());


    }
    @Override
    public void onBackPressed(){
        if (mywebView.canGoBack()){
            mywebView.goBack();}
        else{
            super.onBackPressed();
        }
    }
}
