package io.flutter.plugins.webviewflutter;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import io.flutter.plugins.webviewflutter.WebViewClientProxyApi;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda24 implements Runnable {
    public final /* synthetic */ WebViewClientProxyApi.WebViewClientImpl f$0;
    public final /* synthetic */ WebView f$1;
    public final /* synthetic */ SslErrorHandler f$2;
    public final /* synthetic */ SslError f$3;

    public /* synthetic */ WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda24(WebViewClientProxyApi.WebViewClientImpl webViewClientImpl, WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.f$0 = webViewClientImpl;
        this.f$1 = webView;
        this.f$2 = sslErrorHandler;
        this.f$3 = sslError;
    }

    public final void run() {
        this.f$0.m502lambda$onReceivedSslError$29$ioflutterpluginswebviewflutterWebViewClientProxyApi$WebViewClientImpl(this.f$1, this.f$2, this.f$3);
    }
}
