package com.example.phaseonechallengeandroid;

import android.app.ActionBar;
import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ActivityB extends AppCompatActivity {

    @BindView(R.id.webview_about)
       WebView webView_about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        ButterKnife.bind(this);
//        String url = "https://andela.com/alc/";
        WebSettings ws = webView_about.getSettings();
        ws.setJavaScriptEnabled(true);//enable javascript in my web app
        ws.setUseWideViewPort(true);
        ws.setLoadWithOverviewMode(true);
        webView_about.setWebViewClient(new WebClient());//prevents url from opening from browser
        webView_about.loadUrl("https://andela.com/alc/");

    }

}
