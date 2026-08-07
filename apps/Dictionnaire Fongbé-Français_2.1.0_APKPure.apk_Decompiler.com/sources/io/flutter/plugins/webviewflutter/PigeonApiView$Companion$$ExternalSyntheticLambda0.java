package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.PigeonApiView;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class PigeonApiView$Companion$$ExternalSyntheticLambda0 implements BasicMessageChannel.MessageHandler {
    public final /* synthetic */ PigeonApiView f$0;

    public /* synthetic */ PigeonApiView$Companion$$ExternalSyntheticLambda0(PigeonApiView pigeonApiView) {
        this.f$0 = pigeonApiView;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        PigeonApiView.Companion.setUpMessageHandlers$lambda$1$lambda$0(this.f$0, obj, reply);
    }
}
