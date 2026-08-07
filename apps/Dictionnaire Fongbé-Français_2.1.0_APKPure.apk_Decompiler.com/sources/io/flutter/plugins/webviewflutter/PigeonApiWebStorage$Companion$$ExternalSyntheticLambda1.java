package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.PigeonApiWebStorage;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class PigeonApiWebStorage$Companion$$ExternalSyntheticLambda1 implements BasicMessageChannel.MessageHandler {
    public final /* synthetic */ PigeonApiWebStorage f$0;

    public /* synthetic */ PigeonApiWebStorage$Companion$$ExternalSyntheticLambda1(PigeonApiWebStorage pigeonApiWebStorage) {
        this.f$0 = pigeonApiWebStorage;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        PigeonApiWebStorage.Companion.setUpMessageHandlers$lambda$3$lambda$2(this.f$0, obj, reply);
    }
}
