package com.example.user.website;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    //Declaring webview
    WebView webid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //finding webview
        webid=(WebView)findViewById(R.id.webid);
        //enabling java
        webid.getSettings().setJavaScriptEnabled(true);

        webid.loadUrl("file:///android_asset/index.html");
    }
}
