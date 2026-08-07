package io.flutter.plugins.webviewflutter;

import android.webkit.WebView;
import io.flutter.plugins.webviewflutter.WebViewClientProxyApi;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class WebViewClientProxyApi$WebViewClientCompatImpl$$ExternalSyntheticLambda13 implements Runnable {
    public final /* synthetic */ WebViewClientProxyApi.WebViewClientCompatImpl f$0;
    public final /* synthetic */ WebView f$1;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ String f$3;
    public final /* synthetic */ String f$4;

    public /* synthetic */ WebViewClientProxyApi$WebViewClientCompatImpl$$ExternalSyntheticLambda13(WebViewClientProxyApi.WebViewClientCompatImpl webViewClientCompatImpl, WebView webView, String str, String str2, String str3) {
        this.f$0 = webViewClientCompatImpl;
        this.f$1 = webView;
        this.f$2 = str;
        this.f$3 = str2;
        this.f$4 = str3;
    }

    public final void run() {
        this.f$0.m485lambda$onReceivedLoginRequest$27$ioflutterpluginswebviewflutterWebViewClientProxyApi$WebViewClientCompatImpl(this.f$1, this.f$2, this.f$3, this.f$4);
    }
}
