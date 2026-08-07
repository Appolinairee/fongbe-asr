package io.flutter.plugins.webviewflutter;

import android.os.Message;
import android.webkit.WebView;
import io.flutter.plugins.webviewflutter.WebViewClientProxyApi;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda18 implements Runnable {
    public final /* synthetic */ WebViewClientProxyApi.WebViewClientImpl f$0;
    public final /* synthetic */ WebView f$1;
    public final /* synthetic */ Message f$2;
    public final /* synthetic */ Message f$3;

    public /* synthetic */ WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda18(WebViewClientProxyApi.WebViewClientImpl webViewClientImpl, WebView webView, Message message, Message message2) {
        this.f$0 = webViewClientImpl;
        this.f$1 = webView;
        this.f$2 = message;
        this.f$3 = message2;
    }

    public final void run() {
        this.f$0.m491lambda$onFormResubmission$19$ioflutterpluginswebviewflutterWebViewClientProxyApi$WebViewClientImpl(this.f$1, this.f$2, this.f$3);
    }
}
