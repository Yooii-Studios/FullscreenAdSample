package com.yooiistudios.fullscreenadsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.yooiistudios.fullscreenad.FullscreenAdUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void onMorningKitAdButtonClick(View view) {
        FullscreenAdUtils.showMorningKitAd(this);
    }

    public void onNewsKitAdButtonClick(View view) {
        FullscreenAdUtils.showNewsKitAd(this);
    }
}
