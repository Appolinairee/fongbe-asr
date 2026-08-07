package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.PigeonApiCertificate;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class PigeonApiCertificate$Companion$$ExternalSyntheticLambda0 implements BasicMessageChannel.MessageHandler {
    public final /* synthetic */ PigeonApiCertificate f$0;

    public /* synthetic */ PigeonApiCertificate$Companion$$ExternalSyntheticLambda0(PigeonApiCertificate pigeonApiCertificate) {
        this.f$0 = pigeonApiCertificate;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        PigeonApiCertificate.Companion.setUpMessageHandlers$lambda$1$lambda$0(this.f$0, obj, reply);
    }
}
