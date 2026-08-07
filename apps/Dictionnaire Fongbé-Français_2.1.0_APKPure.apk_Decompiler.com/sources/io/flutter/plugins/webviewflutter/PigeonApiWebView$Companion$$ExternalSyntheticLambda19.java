package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.PigeonApiWebView;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class PigeonApiWebView$Companion$$ExternalSyntheticLambda19 implements BasicMessageChannel.MessageHandler {
    public final /* synthetic */ PigeonApiWebView f$0;

    public /* synthetic */ PigeonApiWebView$Companion$$ExternalSyntheticLambda19(PigeonApiWebView pigeonApiWebView) {
        this.f$0 = pigeonApiWebView;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        PigeonApiWebView.Companion.setUpMessageHandlers$lambda$31$lambda$30(this.f$0, obj, reply);
    }
}
