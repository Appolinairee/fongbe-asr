package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.PigeonApiWebViewFeature;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class PigeonApiWebViewFeature$Companion$$ExternalSyntheticLambda0 implements BasicMessageChannel.MessageHandler {
    public final /* synthetic */ PigeonApiWebViewFeature f$0;

    public /* synthetic */ PigeonApiWebViewFeature$Companion$$ExternalSyntheticLambda0(PigeonApiWebViewFeature pigeonApiWebViewFeature) {
        this.f$0 = pigeonApiWebViewFeature;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        PigeonApiWebViewFeature.Companion.setUpMessageHandlers$lambda$1$lambda$0(this.f$0, obj, reply);
    }
}
