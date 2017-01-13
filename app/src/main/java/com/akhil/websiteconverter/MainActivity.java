package com.akhil.websiteconverter;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {
    private WebView myweb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myweb = (WebView) findViewById(R.id.web_view);
        WebSettings settings = myweb.getSettings();
        settings.setJavaScriptEnabled(true);
        myweb.loadUrl("http://manthanjamdagni.com/");
        myweb.setWebViewClient(new WebViewClient());

    }

    @Override
    public void onBackPressed() {
        if (myweb.canGoBack()) {
            myweb.canGoBack();
        } else

        {        super.onBackPressed();
    }

}

}