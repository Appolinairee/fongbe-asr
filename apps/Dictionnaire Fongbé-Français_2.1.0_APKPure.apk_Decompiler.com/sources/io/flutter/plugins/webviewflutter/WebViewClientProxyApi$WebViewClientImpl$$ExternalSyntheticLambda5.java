package io.flutter.plugins.webviewflutter;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import io.flutter.plugins.webviewflutter.WebViewClientProxyApi;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda5 implements Runnable {
    public final /* synthetic */ WebViewClientProxyApi.WebViewClientImpl f$0;
    public final /* synthetic */ WebView f$1;
    public final /* synthetic */ WebResourceRequest f$2;

    public /* synthetic */ WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda5(WebViewClientProxyApi.WebViewClientImpl webViewClientImpl, WebView webView, WebResourceRequest webResourceRequest) {
        this.f$0 = webViewClientImpl;
        this.f$1 = webView;
        this.f$2 = webResourceRequest;
    }

    public final void run() {
        this.f$0.m504lambda$shouldOverrideUrlLoading$11$ioflutterpluginswebviewflutterWebViewClientProxyApi$WebViewClientImpl(this.f$1, this.f$2);
    }
}
