package com.example.phaseonechallengeandroid;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ActivityB extends AppCompatActivity {

    @BindView(R.id.webview_about)
    WebView webview_about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        ButterKnife.bind(this);
//        webView_about = findViewById(R.id.webview_about);
//        webView();
    }

//    public void webView(){
//        webView_about.loadUrl("https://andela.com/alc/");
//    }

    @OnClick(R.id.webview_about)
    public void aboutWebView(){
        webview_about.loadUrl("https://andela.com/alc/");
    }
}
