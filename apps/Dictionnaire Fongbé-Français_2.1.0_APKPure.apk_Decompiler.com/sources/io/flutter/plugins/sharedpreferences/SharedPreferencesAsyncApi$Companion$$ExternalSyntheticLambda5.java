package io.flutter.plugins.sharedpreferences;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class SharedPreferencesAsyncApi$Companion$$ExternalSyntheticLambda5 implements BasicMessageChannel.MessageHandler {
    public final /* synthetic */ SharedPreferencesAsyncApi f$0;

    public /* synthetic */ SharedPreferencesAsyncApi$Companion$$ExternalSyntheticLambda5(SharedPreferencesAsyncApi sharedPreferencesAsyncApi) {
        this.f$0 = sharedPreferencesAsyncApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        SharedPreferencesAsyncApi.Companion.setUp$lambda$19$lambda$18(this.f$0, obj, reply);
    }
}
