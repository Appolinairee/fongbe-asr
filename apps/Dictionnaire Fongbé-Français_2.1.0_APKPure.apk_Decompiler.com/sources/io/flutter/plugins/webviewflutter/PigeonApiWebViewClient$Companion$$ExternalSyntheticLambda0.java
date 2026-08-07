package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.PigeonApiWebViewClient;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class PigeonApiWebViewClient$Companion$$ExternalSyntheticLambda0 implements BasicMessageChannel.MessageHandler {
    public final /* synthetic */ PigeonApiWebViewClient f$0;

    public /* synthetic */ PigeonApiWebViewClient$Companion$$ExternalSyntheticLambda0(PigeonApiWebViewClient pigeonApiWebViewClient) {
        this.f$0 = pigeonApiWebViewClient;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        PigeonApiWebViewClient.Companion.setUpMessageHandlers$lambda$1$lambda$0(this.f$0, obj, reply);
    }
}
