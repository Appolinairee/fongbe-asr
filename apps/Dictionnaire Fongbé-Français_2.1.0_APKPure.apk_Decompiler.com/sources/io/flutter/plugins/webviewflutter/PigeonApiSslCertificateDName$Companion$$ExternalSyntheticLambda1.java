package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.PigeonApiSslCertificateDName;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class PigeonApiSslCertificateDName$Companion$$ExternalSyntheticLambda1 implements BasicMessageChannel.MessageHandler {
    public final /* synthetic */ PigeonApiSslCertificateDName f$0;

    public /* synthetic */ PigeonApiSslCertificateDName$Companion$$ExternalSyntheticLambda1(PigeonApiSslCertificateDName pigeonApiSslCertificateDName) {
        this.f$0 = pigeonApiSslCertificateDName;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        PigeonApiSslCertificateDName.Companion.setUpMessageHandlers$lambda$3$lambda$2(this.f$0, obj, reply);
    }
}
