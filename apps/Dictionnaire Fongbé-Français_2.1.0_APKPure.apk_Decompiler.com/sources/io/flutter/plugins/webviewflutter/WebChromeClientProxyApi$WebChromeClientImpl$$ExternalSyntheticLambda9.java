package io.flutter.plugins.webviewflutter;

import android.webkit.ValueCallback;
import io.flutter.plugins.webviewflutter.WebChromeClientProxyApi;
import kotlin.jvm.functions.Function1;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class WebChromeClientProxyApi$WebChromeClientImpl$$ExternalSyntheticLambda9 implements Function1 {
    public final /* synthetic */ WebChromeClientProxyApi.WebChromeClientImpl f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ ValueCallback f$2;

    public /* synthetic */ WebChromeClientProxyApi$WebChromeClientImpl$$ExternalSyntheticLambda9(WebChromeClientProxyApi.WebChromeClientImpl webChromeClientImpl, boolean z, ValueCallback valueCallback) {
        this.f$0 = webChromeClientImpl;
        this.f$1 = z;
        this.f$2 = valueCallback;
    }

    public final Object invoke(Object obj) {
        return this.f$0.m473lambda$onShowFileChooser$5$ioflutterpluginswebviewflutterWebChromeClientProxyApi$WebChromeClientImpl(this.f$1, this.f$2, (ResultCompat) obj);
    }
}
