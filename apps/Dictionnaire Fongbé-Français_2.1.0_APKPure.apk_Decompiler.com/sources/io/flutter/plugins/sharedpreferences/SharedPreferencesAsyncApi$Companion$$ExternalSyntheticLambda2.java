package io.flutter.plugins.sharedpreferences;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class SharedPreferencesAsyncApi$Companion$$ExternalSyntheticLambda2 implements BasicMessageChannel.MessageHandler {
    public final /* synthetic */ SharedPreferencesAsyncApi f$0;

    public /* synthetic */ SharedPreferencesAsyncApi$Companion$$ExternalSyntheticLambda2(SharedPreferencesAsyncApi sharedPreferencesAsyncApi) {
        this.f$0 = sharedPreferencesAsyncApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        SharedPreferencesAsyncApi.Companion.setUp$lambda$13$lambda$12(this.f$0, obj, reply);
    }
}
