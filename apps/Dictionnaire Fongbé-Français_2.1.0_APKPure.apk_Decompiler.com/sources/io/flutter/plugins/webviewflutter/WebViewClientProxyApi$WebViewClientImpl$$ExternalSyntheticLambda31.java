package io.flutter.plugins.webviewflutter;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import io.flutter.plugins.webviewflutter.WebViewClientProxyApi;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda31 implements Runnable {
    public final /* synthetic */ WebViewClientProxyApi.WebViewClientImpl f$0;
    public final /* synthetic */ WebView f$1;
    public final /* synthetic */ WebResourceRequest f$2;
    public final /* synthetic */ WebResourceResponse f$3;

    public /* synthetic */ WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda31(WebViewClientProxyApi.WebViewClientImpl webViewClientImpl, WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        this.f$0 = webViewClientImpl;
        this.f$1 = webView;
        this.f$2 = webResourceRequest;
        this.f$3 = webResourceResponse;
    }

    public final void run() {
        this.f$0.m500lambda$onReceivedHttpError$5$ioflutterpluginswebviewflutterWebViewClientProxyApi$WebViewClientImpl(this.f$1, this.f$2, this.f$3);
    }
}
