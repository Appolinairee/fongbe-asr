package io.flutter.plugins.webviewflutter;

import android.webkit.ValueCallback;
import kotlin.jvm.functions.Function1;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class WebViewProxyApi$$ExternalSyntheticLambda0 implements ValueCallback {
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ WebViewProxyApi$$ExternalSyntheticLambda0(Function1 function1) {
        this.f$0 = function1;
    }

    public final void onReceiveValue(Object obj) {
        ResultCompat.success((String) obj, this.f$0);
    }
}
