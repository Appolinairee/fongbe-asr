package io.flutter.plugins.webviewflutter;

import android.webkit.WebView;
import io.flutter.plugins.webviewflutter.WebViewClientProxyApi;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda10 implements Runnable {
    public final /* synthetic */ WebViewClientProxyApi.WebViewClientImpl f$0;
    public final /* synthetic */ WebView f$1;
    public final /* synthetic */ float f$2;
    public final /* synthetic */ float f$3;

    public /* synthetic */ WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda10(WebViewClientProxyApi.WebViewClientImpl webViewClientImpl, WebView webView, float f, float f2) {
        this.f$0 = webViewClientImpl;
        this.f$1 = webView;
        this.f$2 = f;
        this.f$3 = f2;
    }

    public final void run() {
        this.f$0.m503lambda$onScaleChanged$31$ioflutterpluginswebviewflutterWebViewClientProxyApi$WebViewClientImpl(this.f$1, this.f$2, this.f$3);
    }
}
