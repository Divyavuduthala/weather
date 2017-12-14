package com.lewisu.indira.weatherlabandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static final String TAG ="MainActivity";
    Button ClickhereButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ClickhereButton =(Button)findViewById(R.id.go_button);
        ClickhereButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this,Main2Activity.class);
                MainActivity.this.startActivity(myIntent);
            }
        });

    }
}