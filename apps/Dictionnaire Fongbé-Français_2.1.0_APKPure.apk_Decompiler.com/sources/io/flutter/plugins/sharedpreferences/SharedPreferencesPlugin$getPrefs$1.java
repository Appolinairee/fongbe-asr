package io.flutter.plugins.sharedpreferences;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", f = "SharedPreferencesPlugin.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {256, 258}, m = "getPrefs", n = {"this", "allowSet", "filteredMap", "this", "allowSet", "filteredMap", "key"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$4"})
/* compiled from: SharedPreferencesPlugin.kt */
final class SharedPreferencesPlugin$getPrefs$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SharedPreferencesPlugin this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SharedPreferencesPlugin$getPrefs$1(SharedPreferencesPlugin sharedPreferencesPlugin, Continuation<? super SharedPreferencesPlugin$getPrefs$1> continuation) {
        super(continuation);
        this.this$0 = sharedPreferencesPlugin;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getPrefs((List<String>) null, this);
    }
}
