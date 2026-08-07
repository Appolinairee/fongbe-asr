package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.PigeonApiSslCertificate;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class PigeonApiSslCertificate$Companion$$ExternalSyntheticLambda2 implements BasicMessageChannel.MessageHandler {
    public final /* synthetic */ PigeonApiSslCertificate f$0;

    public /* synthetic */ PigeonApiSslCertificate$Companion$$ExternalSyntheticLambda2(PigeonApiSslCertificate pigeonApiSslCertificate) {
        this.f$0 = pigeonApiSslCertificate;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        PigeonApiSslCertificate.Companion.setUpMessageHandlers$lambda$5$lambda$4(this.f$0, obj, reply);
    }
}
