package io.flutter.plugins.webviewflutter;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import io.flutter.plugins.webviewflutter.WebViewClientProxyApi;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda26 implements Runnable {
    public final /* synthetic */ WebViewClientProxyApi.WebViewClientImpl f$0;
    public final /* synthetic */ WebView f$1;
    public final /* synthetic */ WebResourceRequest f$2;
    public final /* synthetic */ WebResourceError f$3;

    public /* synthetic */ WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda26(WebViewClientProxyApi.WebViewClientImpl webViewClientImpl, WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.f$0 = webViewClientImpl;
        this.f$1 = webView;
        this.f$2 = webResourceRequest;
        this.f$3 = webResourceError;
    }

    public final void run() {
        this.f$0.m497lambda$onReceivedError$7$ioflutterpluginswebviewflutterWebViewClientProxyApi$WebViewClientImpl(this.f$1, this.f$2, this.f$3);
    }
}
