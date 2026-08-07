package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.PigeonApiWebSettingsCompat;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class PigeonApiWebSettingsCompat$Companion$$ExternalSyntheticLambda0 implements BasicMessageChannel.MessageHandler {
    public final /* synthetic */ PigeonApiWebSettingsCompat f$0;

    public /* synthetic */ PigeonApiWebSettingsCompat$Companion$$ExternalSyntheticLambda0(PigeonApiWebSettingsCompat pigeonApiWebSettingsCompat) {
        this.f$0 = pigeonApiWebSettingsCompat;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        PigeonApiWebSettingsCompat.Companion.setUpMessageHandlers$lambda$1$lambda$0(this.f$0, obj, reply);
    }
}
