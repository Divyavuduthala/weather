package com.lewisu.indira.weatherlabandroid;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;


public class Main2Activity extends AppCompatActivity {

    private Button GraphButton;
    private Button TableButton;
    private TextView displayTextView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        GraphButton=(Button)findViewById(R.id.graph);
        TableButton =(Button)findViewById(R.id.table);

        GraphButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WebView webView = (WebView) findViewById(R.id.graphs);
                WebSettings webSettings = webView.getSettings();
                webSettings.setJavaScriptEnabled(true);
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl("http://cs.lewisu.edu/~indiramukhanayeva/weather/Lab4Week7/graph.html");

            }
        });


        TableButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WebView webView = (WebView) findViewById(R.id.tables);
                WebSettings webSettings = webView.getSettings();
                webSettings.setJavaScriptEnabled(true);
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl("http://cs.lewisu.edu/~indiramukhanayeva/weather/Lab4Week7/table.html");


            }
        });



    }



}
