package com.adtrue.appodeal.demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.appodeal.ads.Appodeal;

public class MainActivity extends Activity {
    private boolean consent;
    public static final String APP_KEY = "1d77a5376f165bf7a991e8d65b18e01fb8da4683a658d595";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void bannerHideButton(View v) {
        Appodeal.hide(this, Appodeal.BANNER);
    }

    public void initBannerSdkButton(View v) {
        Appodeal.initialize(this, APP_KEY, Appodeal.BANNER, consent);
        Appodeal.setBannerCallbacks(new AppodealBannerCallbacks(this));
    }

    public void isBannerLoadedButton(View v) {
        if (Appodeal.isLoaded(Appodeal.BANNER)) {
            Toast.makeText(this, "true", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "false", Toast.LENGTH_SHORT).show();
        }
    }

    public void bannerShowButton(View v) {
        Appodeal.show(this, Appodeal.BANNER_BOTTOM);
    }

}