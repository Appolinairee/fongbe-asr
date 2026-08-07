package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.PigeonApiWebSettings;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class PigeonApiWebSettings$Companion$$ExternalSyntheticLambda10 implements BasicMessageChannel.MessageHandler {
    public final /* synthetic */ PigeonApiWebSettings f$0;

    public /* synthetic */ PigeonApiWebSettings$Companion$$ExternalSyntheticLambda10(PigeonApiWebSettings pigeonApiWebSettings) {
        this.f$0 = pigeonApiWebSettings;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$25$lambda$24(this.f$0, obj, reply);
    }
}
