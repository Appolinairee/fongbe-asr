package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonInstanceManagerApi;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class AndroidWebkitLibraryPigeonInstanceManagerApi$Companion$$ExternalSyntheticLambda0 implements BasicMessageChannel.MessageHandler {
    public final /* synthetic */ AndroidWebkitLibraryPigeonInstanceManager f$0;

    public /* synthetic */ AndroidWebkitLibraryPigeonInstanceManagerApi$Companion$$ExternalSyntheticLambda0(AndroidWebkitLibraryPigeonInstanceManager androidWebkitLibraryPigeonInstanceManager) {
        this.f$0 = androidWebkitLibraryPigeonInstanceManager;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        AndroidWebkitLibraryPigeonInstanceManagerApi.Companion.setUpMessageHandlers$lambda$1$lambda$0(this.f$0, obj, reply);
    }
}
