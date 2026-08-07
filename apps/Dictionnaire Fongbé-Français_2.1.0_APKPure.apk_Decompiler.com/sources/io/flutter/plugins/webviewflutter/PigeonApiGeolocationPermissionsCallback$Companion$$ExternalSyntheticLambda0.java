package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.PigeonApiGeolocationPermissionsCallback;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class PigeonApiGeolocationPermissionsCallback$Companion$$ExternalSyntheticLambda0 implements BasicMessageChannel.MessageHandler {
    public final /* synthetic */ PigeonApiGeolocationPermissionsCallback f$0;

    public /* synthetic */ PigeonApiGeolocationPermissionsCallback$Companion$$ExternalSyntheticLambda0(PigeonApiGeolocationPermissionsCallback pigeonApiGeolocationPermissionsCallback) {
        this.f$0 = pigeonApiGeolocationPermissionsCallback;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        PigeonApiGeolocationPermissionsCallback.Companion.setUpMessageHandlers$lambda$1$lambda$0(this.f$0, obj, reply);
    }
}
