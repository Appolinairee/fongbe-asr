package io.flutter.plugins.webviewflutter;

import android.webkit.WebView;
import io.flutter.plugins.webviewflutter.WebViewClientProxyApi;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda25 implements Runnable {
    public final /* synthetic */ WebViewClientProxyApi.WebViewClientImpl f$0;
    public final /* synthetic */ WebView f$1;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ String f$3;
    public final /* synthetic */ String f$4;

    public /* synthetic */ WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda25(WebViewClientProxyApi.WebViewClientImpl webViewClientImpl, WebView webView, String str, String str2, String str3) {
        this.f$0 = webViewClientImpl;
        this.f$1 = webView;
        this.f$2 = str;
        this.f$3 = str2;
        this.f$4 = str3;
    }

    public final void run() {
        this.f$0.m501lambda$onReceivedLoginRequest$27$ioflutterpluginswebviewflutterWebViewClientProxyApi$WebViewClientImpl(this.f$1, this.f$2, this.f$3, this.f$4);
    }
}
