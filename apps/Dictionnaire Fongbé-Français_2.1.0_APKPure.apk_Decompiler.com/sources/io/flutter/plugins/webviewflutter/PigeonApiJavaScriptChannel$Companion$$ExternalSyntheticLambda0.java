package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.PigeonApiJavaScriptChannel;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class PigeonApiJavaScriptChannel$Companion$$ExternalSyntheticLambda0 implements BasicMessageChannel.MessageHandler {
    public final /* synthetic */ PigeonApiJavaScriptChannel f$0;

    public /* synthetic */ PigeonApiJavaScriptChannel$Companion$$ExternalSyntheticLambda0(PigeonApiJavaScriptChannel pigeonApiJavaScriptChannel) {
        this.f$0 = pigeonApiJavaScriptChannel;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        PigeonApiJavaScriptChannel.Companion.setUpMessageHandlers$lambda$1$lambda$0(this.f$0, obj, reply);
    }
}
