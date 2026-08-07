package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.PigeonApiSslError;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class PigeonApiSslError$Companion$$ExternalSyntheticLambda1 implements BasicMessageChannel.MessageHandler {
    public final /* synthetic */ PigeonApiSslError f$0;

    public /* synthetic */ PigeonApiSslError$Companion$$ExternalSyntheticLambda1(PigeonApiSslError pigeonApiSslError) {
        this.f$0 = pigeonApiSslError;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        PigeonApiSslError.Companion.setUpMessageHandlers$lambda$3$lambda$2(this.f$0, obj, reply);
    }
}
