package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.PigeonApiWebChromeClient;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class PigeonApiWebChromeClient$Companion$$ExternalSyntheticLambda0 implements BasicMessageChannel.MessageHandler {
    public final /* synthetic */ PigeonApiWebChromeClient f$0;

    public /* synthetic */ PigeonApiWebChromeClient$Companion$$ExternalSyntheticLambda0(PigeonApiWebChromeClient pigeonApiWebChromeClient) {
        this.f$0 = pigeonApiWebChromeClient;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$1$lambda$0(this.f$0, obj, reply);
    }
}
