package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.PigeonApiSslErrorHandler;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class PigeonApiSslErrorHandler$Companion$$ExternalSyntheticLambda0 implements BasicMessageChannel.MessageHandler {
    public final /* synthetic */ PigeonApiSslErrorHandler f$0;

    public /* synthetic */ PigeonApiSslErrorHandler$Companion$$ExternalSyntheticLambda0(PigeonApiSslErrorHandler pigeonApiSslErrorHandler) {
        this.f$0 = pigeonApiSslErrorHandler;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        PigeonApiSslErrorHandler.Companion.setUpMessageHandlers$lambda$1$lambda$0(this.f$0, obj, reply);
    }
}
