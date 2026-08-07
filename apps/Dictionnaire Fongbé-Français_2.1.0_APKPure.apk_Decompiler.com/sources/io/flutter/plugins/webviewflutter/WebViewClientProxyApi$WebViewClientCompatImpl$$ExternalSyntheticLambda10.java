package io.flutter.plugins.webviewflutter;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import androidx.webkit.WebResourceErrorCompat;
import io.flutter.plugins.webviewflutter.WebViewClientProxyApi;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class WebViewClientProxyApi$WebViewClientCompatImpl$$ExternalSyntheticLambda10 implements Runnable {
    public final /* synthetic */ WebViewClientProxyApi.WebViewClientCompatImpl f$0;
    public final /* synthetic */ WebView f$1;
    public final /* synthetic */ WebResourceRequest f$2;
    public final /* synthetic */ WebResourceErrorCompat f$3;

    public /* synthetic */ WebViewClientProxyApi$WebViewClientCompatImpl$$ExternalSyntheticLambda10(WebViewClientProxyApi.WebViewClientCompatImpl webViewClientCompatImpl, WebView webView, WebResourceRequest webResourceRequest, WebResourceErrorCompat webResourceErrorCompat) {
        this.f$0 = webViewClientCompatImpl;
        this.f$1 = webView;
        this.f$2 = webResourceRequest;
        this.f$3 = webResourceErrorCompat;
    }

    public final void run() {
        this.f$0.m481lambda$onReceivedError$7$ioflutterpluginswebviewflutterWebViewClientProxyApi$WebViewClientCompatImpl(this.f$1, this.f$2, this.f$3);
    }
}
