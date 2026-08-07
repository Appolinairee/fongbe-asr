package io.flutter.plugins.webviewflutter;

import android.webkit.WebView;
import io.flutter.plugins.webviewflutter.WebViewClientProxyApi;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class WebViewClientProxyApi$WebViewClientCompatImpl$$ExternalSyntheticLambda3 implements Runnable {
    public final /* synthetic */ WebViewClientProxyApi.WebViewClientCompatImpl f$0;
    public final /* synthetic */ WebView f$1;
    public final /* synthetic */ float f$2;
    public final /* synthetic */ float f$3;

    public /* synthetic */ WebViewClientProxyApi$WebViewClientCompatImpl$$ExternalSyntheticLambda3(WebViewClientProxyApi.WebViewClientCompatImpl webViewClientCompatImpl, WebView webView, float f, float f2) {
        this.f$0 = webViewClientCompatImpl;
        this.f$1 = webView;
        this.f$2 = f;
        this.f$3 = f2;
    }

    public final void run() {
        this.f$0.m487lambda$onScaleChanged$31$ioflutterpluginswebviewflutterWebViewClientProxyApi$WebViewClientCompatImpl(this.f$1, this.f$2, this.f$3);
    }
}
