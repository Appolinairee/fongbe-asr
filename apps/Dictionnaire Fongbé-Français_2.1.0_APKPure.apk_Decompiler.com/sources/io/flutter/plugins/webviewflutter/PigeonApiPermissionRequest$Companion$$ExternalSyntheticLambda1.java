package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.PigeonApiPermissionRequest;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class PigeonApiPermissionRequest$Companion$$ExternalSyntheticLambda1 implements BasicMessageChannel.MessageHandler {
    public final /* synthetic */ PigeonApiPermissionRequest f$0;

    public /* synthetic */ PigeonApiPermissionRequest$Companion$$ExternalSyntheticLambda1(PigeonApiPermissionRequest pigeonApiPermissionRequest) {
        this.f$0 = pigeonApiPermissionRequest;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        PigeonApiPermissionRequest.Companion.setUpMessageHandlers$lambda$3$lambda$2(this.f$0, obj, reply);
    }
}
