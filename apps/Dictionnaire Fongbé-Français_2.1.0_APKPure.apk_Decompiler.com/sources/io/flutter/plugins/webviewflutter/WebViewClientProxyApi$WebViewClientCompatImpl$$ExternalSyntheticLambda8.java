package io.flutter.plugins.webviewflutter;

import android.webkit.HttpAuthHandler;
import android.webkit.WebView;
import io.flutter.plugins.webviewflutter.WebViewClientProxyApi;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class WebViewClientProxyApi$WebViewClientCompatImpl$$ExternalSyntheticLambda8 implements Runnable {
    public final /* synthetic */ WebViewClientProxyApi.WebViewClientCompatImpl f$0;
    public final /* synthetic */ WebView f$1;
    public final /* synthetic */ HttpAuthHandler f$2;
    public final /* synthetic */ String f$3;
    public final /* synthetic */ String f$4;

    public /* synthetic */ WebViewClientProxyApi$WebViewClientCompatImpl$$ExternalSyntheticLambda8(WebViewClientProxyApi.WebViewClientCompatImpl webViewClientCompatImpl, WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        this.f$0 = webViewClientCompatImpl;
        this.f$1 = webView;
        this.f$2 = httpAuthHandler;
        this.f$3 = str;
        this.f$4 = str2;
    }

    public final void run() {
        this.f$0.m483lambda$onReceivedHttpAuthRequest$17$ioflutterpluginswebviewflutterWebViewClientProxyApi$WebViewClientCompatImpl(this.f$1, this.f$2, this.f$3, this.f$4);
    }
}
