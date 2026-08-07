package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.PigeonApiCookieManager;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class PigeonApiCookieManager$Companion$$ExternalSyntheticLambda2 implements BasicMessageChannel.MessageHandler {
    public final /* synthetic */ PigeonApiCookieManager f$0;

    public /* synthetic */ PigeonApiCookieManager$Companion$$ExternalSyntheticLambda2(PigeonApiCookieManager pigeonApiCookieManager) {
        this.f$0 = pigeonApiCookieManager;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        PigeonApiCookieManager.Companion.setUpMessageHandlers$lambda$5$lambda$4(this.f$0, obj, reply);
    }
}
