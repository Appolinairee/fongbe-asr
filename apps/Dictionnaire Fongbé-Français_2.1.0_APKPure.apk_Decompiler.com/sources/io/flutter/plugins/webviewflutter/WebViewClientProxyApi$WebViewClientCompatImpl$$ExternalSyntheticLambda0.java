package io.flutter.plugins.webviewflutter;

import android.webkit.WebView;
import io.flutter.plugins.webviewflutter.WebViewClientProxyApi;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class WebViewClientProxyApi$WebViewClientCompatImpl$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ WebViewClientProxyApi.WebViewClientCompatImpl f$0;
    public final /* synthetic */ WebView f$1;
    public final /* synthetic */ int f$2;
    public final /* synthetic */ String f$3;
    public final /* synthetic */ String f$4;

    public /* synthetic */ WebViewClientProxyApi$WebViewClientCompatImpl$$ExternalSyntheticLambda0(WebViewClientProxyApi.WebViewClientCompatImpl webViewClientCompatImpl, WebView webView, int i, String str, String str2) {
        this.f$0 = webViewClientCompatImpl;
        this.f$1 = webView;
        this.f$2 = i;
        this.f$3 = str;
        this.f$4 = str2;
    }

    public final void run() {
        this.f$0.m482lambda$onReceivedError$9$ioflutterpluginswebviewflutterWebViewClientProxyApi$WebViewClientCompatImpl(this.f$1, this.f$2, this.f$3, this.f$4);
    }
}
