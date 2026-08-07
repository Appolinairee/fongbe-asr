package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.PigeonApiDownloadListener;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class PigeonApiDownloadListener$Companion$$ExternalSyntheticLambda0 implements BasicMessageChannel.MessageHandler {
    public final /* synthetic */ PigeonApiDownloadListener f$0;

    public /* synthetic */ PigeonApiDownloadListener$Companion$$ExternalSyntheticLambda0(PigeonApiDownloadListener pigeonApiDownloadListener) {
        this.f$0 = pigeonApiDownloadListener;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        PigeonApiDownloadListener.Companion.setUpMessageHandlers$lambda$1$lambda$0(this.f$0, obj, reply);
    }
}
