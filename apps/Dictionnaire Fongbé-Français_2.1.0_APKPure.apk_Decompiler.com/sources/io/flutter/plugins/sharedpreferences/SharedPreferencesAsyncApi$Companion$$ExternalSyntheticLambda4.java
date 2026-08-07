package io.flutter.plugins.sharedpreferences;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class SharedPreferencesAsyncApi$Companion$$ExternalSyntheticLambda4 implements BasicMessageChannel.MessageHandler {
    public final /* synthetic */ SharedPreferencesAsyncApi f$0;

    public /* synthetic */ SharedPreferencesAsyncApi$Companion$$ExternalSyntheticLambda4(SharedPreferencesAsyncApi sharedPreferencesAsyncApi) {
        this.f$0 = sharedPreferencesAsyncApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        SharedPreferencesAsyncApi.Companion.setUp$lambda$17$lambda$16(this.f$0, obj, reply);
    }
}
