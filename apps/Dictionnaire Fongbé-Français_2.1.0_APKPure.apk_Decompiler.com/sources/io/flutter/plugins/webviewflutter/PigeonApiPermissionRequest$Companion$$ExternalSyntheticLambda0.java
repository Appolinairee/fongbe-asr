package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.PigeonApiPermissionRequest;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class PigeonApiPermissionRequest$Companion$$ExternalSyntheticLambda0 implements BasicMessageChannel.MessageHandler {
    public final /* synthetic */ PigeonApiPermissionRequest f$0;

    public /* synthetic */ PigeonApiPermissionRequest$Companion$$ExternalSyntheticLambda0(PigeonApiPermissionRequest pigeonApiPermissionRequest) {
        this.f$0 = pigeonApiPermissionRequest;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        PigeonApiPermissionRequest.Companion.setUpMessageHandlers$lambda$1$lambda$0(this.f$0, obj, reply);
    }
}
