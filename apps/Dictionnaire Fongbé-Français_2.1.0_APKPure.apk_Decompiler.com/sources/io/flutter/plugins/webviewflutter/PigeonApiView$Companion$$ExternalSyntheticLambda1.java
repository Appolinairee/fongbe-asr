package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.PigeonApiView;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class PigeonApiView$Companion$$ExternalSyntheticLambda1 implements BasicMessageChannel.MessageHandler {
    public final /* synthetic */ PigeonApiView f$0;

    public /* synthetic */ PigeonApiView$Companion$$ExternalSyntheticLambda1(PigeonApiView pigeonApiView) {
        this.f$0 = pigeonApiView;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        PigeonApiView.Companion.setUpMessageHandlers$lambda$3$lambda$2(this.f$0, obj, reply);
    }
}
