package io.flutter.plugins.googlemobileads;

import android.content.Context;
import android.util.Log;
import android.webkit.WebView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugins.webviewflutter.WebViewFlutterAndroidExternalApi;

public class FlutterMobileAdsWrapper {
    private static final String TAG = "FlutterMobileAdsWrapper";

    public void initialize(final Context context, final OnInitializationCompleteListener onInitializationCompleteListener) {
        new Thread(new Runnable() {
            public void run() {
                MobileAds.initialize(context, onInitializationCompleteListener);
            }
        }).start();
    }

    public void setAppMuted(boolean z) {
        MobileAds.setAppMuted(z);
    }

    public void setAppVolume(double d) {
        MobileAds.setAppVolume((float) d);
    }

    public void disableMediationInitialization(Context context) {
        MobileAds.disableMediationAdapterInitialization(context);
    }

    public String getVersionString() {
        return MobileAds.getVersion().toString();
    }

    public RequestConfiguration getRequestConfiguration() {
        return MobileAds.getRequestConfiguration();
    }

    public void openDebugMenu(Context context, String str) {
        MobileAds.openDebugMenu(context, str);
    }

    public void openAdInspector(Context context, OnAdInspectorClosedListener onAdInspectorClosedListener) {
        MobileAds.openAdInspector(context, onAdInspectorClosedListener);
    }

    public void registerWebView(int i, FlutterEngine flutterEngine) {
        WebView webView = WebViewFlutterAndroidExternalApi.CC.getWebView(flutterEngine, (long) i);
        if (webView == null) {
            Log.w(TAG, "MobileAds.registerWebView unable to find webView with id: " + i);
            return;
        }
        MobileAds.registerWebView(webView);
    }
}
