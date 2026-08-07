package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.PigeonApiClientCertRequest;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class PigeonApiClientCertRequest$Companion$$ExternalSyntheticLambda1 implements BasicMessageChannel.MessageHandler {
    public final /* synthetic */ PigeonApiClientCertRequest f$0;

    public /* synthetic */ PigeonApiClientCertRequest$Companion$$ExternalSyntheticLambda1(PigeonApiClientCertRequest pigeonApiClientCertRequest) {
        this.f$0 = pigeonApiClientCertRequest;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        PigeonApiClientCertRequest.Companion.setUpMessageHandlers$lambda$3$lambda$2(this.f$0, obj, reply);
    }
}
