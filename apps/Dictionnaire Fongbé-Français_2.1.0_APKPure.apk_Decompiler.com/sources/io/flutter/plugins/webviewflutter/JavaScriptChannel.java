package io.flutter.plugins.webviewflutter;

import android.webkit.JavascriptInterface;
import kotlin.Result;
import kotlin.Unit;

public class JavaScriptChannel {
    private final JavaScriptChannelProxyApi api;
    final String javaScriptChannelName;

    static /* synthetic */ Unit lambda$postMessage$0(Result result) {
        return null;
    }

    public JavaScriptChannel(String str, JavaScriptChannelProxyApi javaScriptChannelProxyApi) {
        this.javaScriptChannelName = str;
        this.api = javaScriptChannelProxyApi;
    }

    @JavascriptInterface
    public void postMessage(String str) {
        this.api.getPigeonRegistrar().runOnMainThread(new JavaScriptChannel$$ExternalSyntheticLambda1(this, str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$postMessage$1$io-flutter-plugins-webviewflutter-JavaScriptChannel  reason: not valid java name */
    public /* synthetic */ void m414lambda$postMessage$1$ioflutterpluginswebviewflutterJavaScriptChannel(String str) {
        this.api.postMessage(this, str, new JavaScriptChannel$$ExternalSyntheticLambda0());
    }
}
