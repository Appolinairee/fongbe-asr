package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.PigeonApiFlutterAssetManager;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class PigeonApiFlutterAssetManager$Companion$$ExternalSyntheticLambda0 implements BasicMessageChannel.MessageHandler {
    public final /* synthetic */ PigeonApiFlutterAssetManager f$0;

    public /* synthetic */ PigeonApiFlutterAssetManager$Companion$$ExternalSyntheticLambda0(PigeonApiFlutterAssetManager pigeonApiFlutterAssetManager) {
        this.f$0 = pigeonApiFlutterAssetManager;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        PigeonApiFlutterAssetManager.Companion.setUpMessageHandlers$lambda$1$lambda$0(this.f$0, obj, reply);
    }
}
