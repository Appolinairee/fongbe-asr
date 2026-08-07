package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import kotlin.jvm.functions.Function1;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class PigeonApiWebViewClient$$ExternalSyntheticLambda0 implements BasicMessageChannel.Reply {
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ PigeonApiWebViewClient$$ExternalSyntheticLambda0(Function1 function1, String str) {
        this.f$0 = function1;
        this.f$1 = str;
    }

    public final void reply(Object obj) {
        PigeonApiWebViewClient.onReceivedRequestErrorCompat$lambda$5(this.f$0, this.f$1, obj);
    }
}
