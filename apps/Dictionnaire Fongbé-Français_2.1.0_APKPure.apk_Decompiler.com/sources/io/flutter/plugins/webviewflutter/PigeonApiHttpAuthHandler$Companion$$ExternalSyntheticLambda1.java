package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.PigeonApiHttpAuthHandler;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class PigeonApiHttpAuthHandler$Companion$$ExternalSyntheticLambda1 implements BasicMessageChannel.MessageHandler {
    public final /* synthetic */ PigeonApiHttpAuthHandler f$0;

    public /* synthetic */ PigeonApiHttpAuthHandler$Companion$$ExternalSyntheticLambda1(PigeonApiHttpAuthHandler pigeonApiHttpAuthHandler) {
        this.f$0 = pigeonApiHttpAuthHandler;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        PigeonApiHttpAuthHandler.Companion.setUpMessageHandlers$lambda$3$lambda$2(this.f$0, obj, reply);
    }
}
