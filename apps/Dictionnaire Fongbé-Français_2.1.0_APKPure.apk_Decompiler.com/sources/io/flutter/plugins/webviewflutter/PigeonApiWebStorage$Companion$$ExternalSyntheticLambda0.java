package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.PigeonApiWebStorage;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class PigeonApiWebStorage$Companion$$ExternalSyntheticLambda0 implements BasicMessageChannel.MessageHandler {
    public final /* synthetic */ PigeonApiWebStorage f$0;

    public /* synthetic */ PigeonApiWebStorage$Companion$$ExternalSyntheticLambda0(PigeonApiWebStorage pigeonApiWebStorage) {
        this.f$0 = pigeonApiWebStorage;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        PigeonApiWebStorage.Companion.setUpMessageHandlers$lambda$1$lambda$0(this.f$0, obj, reply);
    }
}
