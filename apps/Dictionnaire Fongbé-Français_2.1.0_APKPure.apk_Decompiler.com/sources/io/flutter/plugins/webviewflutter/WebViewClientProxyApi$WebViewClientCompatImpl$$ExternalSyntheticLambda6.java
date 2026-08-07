package io.flutter.plugins.webviewflutter;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import io.flutter.plugins.webviewflutter.WebViewClientProxyApi;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class WebViewClientProxyApi$WebViewClientCompatImpl$$ExternalSyntheticLambda6 implements Runnable {
    public final /* synthetic */ WebViewClientProxyApi.WebViewClientCompatImpl f$0;
    public final /* synthetic */ WebView f$1;
    public final /* synthetic */ SslErrorHandler f$2;
    public final /* synthetic */ SslError f$3;

    public /* synthetic */ WebViewClientProxyApi$WebViewClientCompatImpl$$ExternalSyntheticLambda6(WebViewClientProxyApi.WebViewClientCompatImpl webViewClientCompatImpl, WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.f$0 = webViewClientCompatImpl;
        this.f$1 = webView;
        this.f$2 = sslErrorHandler;
        this.f$3 = sslError;
    }

    public final void run() {
        this.f$0.m486lambda$onReceivedSslError$29$ioflutterpluginswebviewflutterWebViewClientProxyApi$WebViewClientCompatImpl(this.f$1, this.f$2, this.f$3);
    }
}
