package io.flutter.plugins.webviewflutter;

import android.webkit.WebView;
import io.flutter.embedding.engine.FlutterEngine;

public interface WebViewFlutterAndroidExternalApi {

    /* renamed from: io.flutter.plugins.webviewflutter.WebViewFlutterAndroidExternalApi$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static WebView getWebView(FlutterEngine flutterEngine, long j) {
            WebViewFlutterPlugin webViewFlutterPlugin = (WebViewFlutterPlugin) flutterEngine.getPlugins().get(WebViewFlutterPlugin.class);
            if (webViewFlutterPlugin == null || webViewFlutterPlugin.getInstanceManager() == null) {
                return null;
            }
            Object instance = webViewFlutterPlugin.getInstanceManager().getInstance(j);
            if (instance instanceof WebView) {
                return (WebView) instance;
            }
            return null;
        }
    }
}
