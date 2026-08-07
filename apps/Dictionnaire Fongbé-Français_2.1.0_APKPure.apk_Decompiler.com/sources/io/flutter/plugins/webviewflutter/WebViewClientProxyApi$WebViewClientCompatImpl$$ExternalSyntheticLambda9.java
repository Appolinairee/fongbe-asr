package io.flutter.plugins.webviewflutter;

import android.webkit.ClientCertRequest;
import android.webkit.WebView;
import io.flutter.plugins.webviewflutter.WebViewClientProxyApi;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class WebViewClientProxyApi$WebViewClientCompatImpl$$ExternalSyntheticLambda9 implements Runnable {
    public final /* synthetic */ WebViewClientProxyApi.WebViewClientCompatImpl f$0;
    public final /* synthetic */ WebView f$1;
    public final /* synthetic */ ClientCertRequest f$2;

    public /* synthetic */ WebViewClientProxyApi$WebViewClientCompatImpl$$ExternalSyntheticLambda9(WebViewClientProxyApi.WebViewClientCompatImpl webViewClientCompatImpl, WebView webView, ClientCertRequest clientCertRequest) {
        this.f$0 = webViewClientCompatImpl;
        this.f$1 = webView;
        this.f$2 = clientCertRequest;
    }

    public final void run() {
        this.f$0.m480lambda$onReceivedClientCertRequest$25$ioflutterpluginswebviewflutterWebViewClientProxyApi$WebViewClientCompatImpl(this.f$1, this.f$2);
    }
}
