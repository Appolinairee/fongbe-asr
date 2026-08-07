package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.PigeonApiAndroidMessage;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class PigeonApiAndroidMessage$Companion$$ExternalSyntheticLambda0 implements BasicMessageChannel.MessageHandler {
    public final /* synthetic */ PigeonApiAndroidMessage f$0;

    public /* synthetic */ PigeonApiAndroidMessage$Companion$$ExternalSyntheticLambda0(PigeonApiAndroidMessage pigeonApiAndroidMessage) {
        this.f$0 = pigeonApiAndroidMessage;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        PigeonApiAndroidMessage.Companion.setUpMessageHandlers$lambda$1$lambda$0(this.f$0, obj, reply);
    }
}
