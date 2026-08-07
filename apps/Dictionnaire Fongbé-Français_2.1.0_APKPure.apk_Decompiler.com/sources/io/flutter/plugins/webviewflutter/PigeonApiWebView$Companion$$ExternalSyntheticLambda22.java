package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.PigeonApiWebView;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class PigeonApiWebView$Companion$$ExternalSyntheticLambda22 implements BasicMessageChannel.MessageHandler {
    public final /* synthetic */ PigeonApiWebView f$0;

    public /* synthetic */ PigeonApiWebView$Companion$$ExternalSyntheticLambda22(PigeonApiWebView pigeonApiWebView) {
        this.f$0 = pigeonApiWebView;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        PigeonApiWebView.Companion.setUpMessageHandlers$lambda$37$lambda$36(this.f$0, obj, reply);
    }
}
