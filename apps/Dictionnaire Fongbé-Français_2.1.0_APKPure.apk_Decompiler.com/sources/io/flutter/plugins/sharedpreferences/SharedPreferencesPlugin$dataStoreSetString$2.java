package io.flutter.plugins.sharedpreferences;

import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H@"}, d2 = {"<anonymous>", "", "preferences", "Landroidx/datastore/preferences/core/MutablePreferences;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$dataStoreSetString$2", f = "SharedPreferencesPlugin.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* compiled from: SharedPreferencesPlugin.kt */
final class SharedPreferencesPlugin$dataStoreSetString$2 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
    final /* synthetic */ Preferences.Key<String> $stringKey;
    final /* synthetic */ String $value;
    /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SharedPreferencesPlugin$dataStoreSetString$2(Preferences.Key<String> key, String str, Continuation<? super SharedPreferencesPlugin$dataStoreSetString$2> continuation) {
        super(2, continuation);
        this.$stringKey = key;
        this.$value = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SharedPreferencesPlugin$dataStoreSetString$2 sharedPreferencesPlugin$dataStoreSetString$2 = new SharedPreferencesPlugin$dataStoreSetString$2(this.$stringKey, this.$value, continuation);
        sharedPreferencesPlugin$dataStoreSetString$2.L$0 = obj;
        return sharedPreferencesPlugin$dataStoreSetString$2;
    }

    public final Object invoke(MutablePreferences mutablePreferences, Continuation<? super Unit> continuation) {
        return ((SharedPreferencesPlugin$dataStoreSetString$2) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            ((MutablePreferences) this.L$0).set(this.$stringKey, this.$value);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
