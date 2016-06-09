package com.example.ngoc1414.phaimanhmobi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWebView = (WebView) findViewById(R.id.webview);
        WebSettings webSettings = mWebView.getSettings();
        mWebView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return false;
            }
        });

        webSettings.setJavaScriptEnabled(true);

        mWebView.loadUrl("http://phaimanh.mobi/media/th/Video_Top_dien_vien_phat_dien_vi_qua_nhap_tam_vai_nhan_vat.mp4");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mWebView.destroy();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        if (mWebView != null) {
            mWebView.loadUrl("http://phaimanh.mobi/media/th/Video_Top_dien_vien_phat_dien_vi_qua_nhap_tam_vai_nhan_vat.mp4");
        }
    }
}

