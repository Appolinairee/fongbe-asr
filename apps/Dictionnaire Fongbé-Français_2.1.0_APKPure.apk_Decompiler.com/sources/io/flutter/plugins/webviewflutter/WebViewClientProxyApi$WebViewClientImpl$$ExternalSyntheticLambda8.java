package io.flutter.plugins.webviewflutter;

import android.webkit.WebView;
import io.flutter.plugins.webviewflutter.WebViewClientProxyApi;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda8 implements Runnable {
    public final /* synthetic */ WebViewClientProxyApi.WebViewClientImpl f$0;
    public final /* synthetic */ WebView f$1;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ boolean f$3;

    public /* synthetic */ WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda8(WebViewClientProxyApi.WebViewClientImpl webViewClientImpl, WebView webView, String str, boolean z) {
        this.f$0 = webViewClientImpl;
        this.f$1 = webView;
        this.f$2 = str;
        this.f$3 = z;
    }

    public final void run() {
        this.f$0.m490lambda$doUpdateVisitedHistory$15$ioflutterpluginswebviewflutterWebViewClientProxyApi$WebViewClientImpl(this.f$1, this.f$2, this.f$3);
    }
}
