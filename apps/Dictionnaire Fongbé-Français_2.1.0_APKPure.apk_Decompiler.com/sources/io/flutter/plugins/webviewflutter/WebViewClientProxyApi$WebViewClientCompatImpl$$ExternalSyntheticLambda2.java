package io.flutter.plugins.webviewflutter;

import android.os.Message;
import android.webkit.WebView;
import io.flutter.plugins.webviewflutter.WebViewClientProxyApi;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class WebViewClientProxyApi$WebViewClientCompatImpl$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ WebViewClientProxyApi.WebViewClientCompatImpl f$0;
    public final /* synthetic */ WebView f$1;
    public final /* synthetic */ Message f$2;
    public final /* synthetic */ Message f$3;

    public /* synthetic */ WebViewClientProxyApi$WebViewClientCompatImpl$$ExternalSyntheticLambda2(WebViewClientProxyApi.WebViewClientCompatImpl webViewClientCompatImpl, WebView webView, Message message, Message message2) {
        this.f$0 = webViewClientCompatImpl;
        this.f$1 = webView;
        this.f$2 = message;
        this.f$3 = message2;
    }

    public final void run() {
        this.f$0.m475lambda$onFormResubmission$19$ioflutterpluginswebviewflutterWebViewClientProxyApi$WebViewClientCompatImpl(this.f$1, this.f$2, this.f$3);
    }
}
