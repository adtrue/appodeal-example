package com.adtrue.appodeal.demo;

import android.app.Activity;
import android.util.Log;
import android.widget.Toast;

import com.appodeal.ads.BannerCallbacks;

class AppodealBannerCallbacks implements BannerCallbacks {

    private final Activity activity;

    AppodealBannerCallbacks(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void onBannerLoaded(int height, boolean isPrecache) {
        showToast(activity, String.format("onBannerLoaded, %sdp, isPrecache: %s", height, isPrecache));
    }

    @Override
    public void onBannerFailedToLoad() {
        showToast(activity, "onBannerFailedToLoad");
    }

    @Override
    public void onBannerShown() {
        showToast(activity, "onBannerShown");
    }

    @Override
    public void onBannerShowFailed() {
        showToast(activity, "onBannerShowFailed");
    }

    @Override
    public void onBannerClicked() {
        showToast(activity, "onBannerClicked");
    }

    @Override
    public void onBannerExpired() {
        showToast(activity, "onBannerExpired");
    }

    static void showToast(Activity activity, String text) {
        Toast.makeText(activity, text, Toast.LENGTH_SHORT).show();
    }
}
