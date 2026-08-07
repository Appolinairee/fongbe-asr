package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import kotlin.jvm.functions.Function1;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class PigeonApiWebViewClient$$ExternalSyntheticLambda16 implements BasicMessageChannel.Reply {
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ PigeonApiWebViewClient$$ExternalSyntheticLambda16(Function1 function1, String str) {
        this.f$0 = function1;
        this.f$1 = str;
    }

    public final void reply(Object obj) {
        PigeonApiWebViewClient.pigeon_newInstance$lambda$0(this.f$0, this.f$1, obj);
    }
}
