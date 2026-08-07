package io.flutter.plugins;

import io.flutter.Log;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugins.googlemobileads.GoogleMobileAdsPlugin;
import io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin;
import io.flutter.plugins.urllauncher.UrlLauncherPlugin;
import io.flutter.plugins.webviewflutter.WebViewFlutterPlugin;

public final class GeneratedPluginRegistrant {
    private static final String TAG = "GeneratedPluginRegistrant";

    public static void registerWith(FlutterEngine flutterEngine) {
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new GoogleMobileAdsPlugin());
        } catch (Exception e) {
            Log.e(TAG, "Error registering plugin google_mobile_ads, io.flutter.plugins.googlemobileads.GoogleMobileAdsPlugin", e);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new SharedPreferencesPlugin());
        } catch (Exception e2) {
            Log.e(TAG, "Error registering plugin shared_preferences_android, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", e2);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new UrlLauncherPlugin());
        } catch (Exception e3) {
            Log.e(TAG, "Error registering plugin url_launcher_android, io.flutter.plugins.urllauncher.UrlLauncherPlugin", e3);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new WebViewFlutterPlugin());
        } catch (Exception e4) {
            Log.e(TAG, "Error registering plugin webview_flutter_android, io.flutter.plugins.webviewflutter.WebViewFlutterPlugin", e4);
        }
    }
}
