package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.PigeonApiWebSettings;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class PigeonApiWebSettings$Companion$$ExternalSyntheticLambda7 implements BasicMessageChannel.MessageHandler {
    public final /* synthetic */ PigeonApiWebSettings f$0;

    public /* synthetic */ PigeonApiWebSettings$Companion$$ExternalSyntheticLambda7(PigeonApiWebSettings pigeonApiWebSettings) {
        this.f$0 = pigeonApiWebSettings;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$19$lambda$18(this.f$0, obj, reply);
    }
}
