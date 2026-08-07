package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.PigeonApiCustomViewCallback;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class PigeonApiCustomViewCallback$Companion$$ExternalSyntheticLambda0 implements BasicMessageChannel.MessageHandler {
    public final /* synthetic */ PigeonApiCustomViewCallback f$0;

    public /* synthetic */ PigeonApiCustomViewCallback$Companion$$ExternalSyntheticLambda0(PigeonApiCustomViewCallback pigeonApiCustomViewCallback) {
        this.f$0 = pigeonApiCustomViewCallback;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        PigeonApiCustomViewCallback.Companion.setUpMessageHandlers$lambda$1$lambda$0(this.f$0, obj, reply);
    }
}
