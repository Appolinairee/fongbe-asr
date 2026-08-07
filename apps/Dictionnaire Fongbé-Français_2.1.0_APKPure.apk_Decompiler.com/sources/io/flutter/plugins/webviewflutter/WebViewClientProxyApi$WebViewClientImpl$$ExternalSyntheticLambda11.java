package io.flutter.plugins.webviewflutter;

import android.webkit.WebView;
import io.flutter.plugins.webviewflutter.WebViewClientProxyApi;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda11 implements Runnable {
    public final /* synthetic */ WebViewClientProxyApi.WebViewClientImpl f$0;
    public final /* synthetic */ WebView f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda11(WebViewClientProxyApi.WebViewClientImpl webViewClientImpl, WebView webView, String str) {
        this.f$0 = webViewClientImpl;
        this.f$1 = webView;
        this.f$2 = str;
    }

    public final void run() {
        this.f$0.m495lambda$onPageStarted$1$ioflutterpluginswebviewflutterWebViewClientProxyApi$WebViewClientImpl(this.f$1, this.f$2);
    }
}
