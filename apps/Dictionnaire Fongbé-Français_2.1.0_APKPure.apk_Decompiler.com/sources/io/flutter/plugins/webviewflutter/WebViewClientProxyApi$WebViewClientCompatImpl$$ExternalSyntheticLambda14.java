package io.flutter.plugins.webviewflutter;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import io.flutter.plugins.webviewflutter.WebViewClientProxyApi;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class WebViewClientProxyApi$WebViewClientCompatImpl$$ExternalSyntheticLambda14 implements Runnable {
    public final /* synthetic */ WebViewClientProxyApi.WebViewClientCompatImpl f$0;
    public final /* synthetic */ WebView f$1;
    public final /* synthetic */ WebResourceRequest f$2;
    public final /* synthetic */ WebResourceResponse f$3;

    public /* synthetic */ WebViewClientProxyApi$WebViewClientCompatImpl$$ExternalSyntheticLambda14(WebViewClientProxyApi.WebViewClientCompatImpl webViewClientCompatImpl, WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        this.f$0 = webViewClientCompatImpl;
        this.f$1 = webView;
        this.f$2 = webResourceRequest;
        this.f$3 = webResourceResponse;
    }

    public final void run() {
        this.f$0.m484lambda$onReceivedHttpError$5$ioflutterpluginswebviewflutterWebViewClientProxyApi$WebViewClientCompatImpl(this.f$1, this.f$2, this.f$3);
    }
}
