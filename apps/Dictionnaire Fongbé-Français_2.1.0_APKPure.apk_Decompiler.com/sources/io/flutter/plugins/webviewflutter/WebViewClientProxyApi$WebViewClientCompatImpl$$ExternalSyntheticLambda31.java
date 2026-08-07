package io.flutter.plugins.webviewflutter;

import android.webkit.WebView;
import io.flutter.plugins.webviewflutter.WebViewClientProxyApi;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class WebViewClientProxyApi$WebViewClientCompatImpl$$ExternalSyntheticLambda31 implements Runnable {
    public final /* synthetic */ WebViewClientProxyApi.WebViewClientCompatImpl f$0;
    public final /* synthetic */ WebView f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ WebViewClientProxyApi$WebViewClientCompatImpl$$ExternalSyntheticLambda31(WebViewClientProxyApi.WebViewClientCompatImpl webViewClientCompatImpl, WebView webView, String str) {
        this.f$0 = webViewClientCompatImpl;
        this.f$1 = webView;
        this.f$2 = str;
    }

    public final void run() {
        this.f$0.m478lambda$onPageFinished$3$ioflutterpluginswebviewflutterWebViewClientProxyApi$WebViewClientCompatImpl(this.f$1, this.f$2);
    }
}
