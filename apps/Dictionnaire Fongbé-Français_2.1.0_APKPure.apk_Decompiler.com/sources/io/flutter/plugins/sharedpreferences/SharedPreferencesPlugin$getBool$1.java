package io.flutter.plugins.sharedpreferences;

import android.content.Context;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getBool$1", f = "SharedPreferencesPlugin.kt", i = {}, l = {174}, m = "invokeSuspend", n = {}, s = {})
/* compiled from: SharedPreferencesPlugin.kt */
final class SharedPreferencesPlugin$getBool$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $key;
    final /* synthetic */ Ref.ObjectRef<Boolean> $value;
    Object L$0;
    int label;
    final /* synthetic */ SharedPreferencesPlugin this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SharedPreferencesPlugin$getBool$1(String str, SharedPreferencesPlugin sharedPreferencesPlugin, Ref.ObjectRef<Boolean> objectRef, Continuation<? super SharedPreferencesPlugin$getBool$1> continuation) {
        super(2, continuation);
        this.$key = str;
        this.this$0 = sharedPreferencesPlugin;
        this.$value = objectRef;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SharedPreferencesPlugin$getBool$1(this.$key, this.this$0, this.$value, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SharedPreferencesPlugin$getBool$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(T t) {
        Ref.ObjectRef<Boolean> objectRef;
        T coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(t);
            Preferences.Key<Boolean> booleanKey = PreferencesKeys.booleanKey(this.$key);
            Context access$getContext$p = this.this$0.context;
            if (access$getContext$p == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                access$getContext$p = null;
            }
            Ref.ObjectRef<Boolean> objectRef2 = this.$value;
            this.L$0 = objectRef2;
            this.label = 1;
            T firstOrNull = FlowKt.firstOrNull(new SharedPreferencesPlugin$getBool$1$invokeSuspend$$inlined$map$1(SharedPreferencesPluginKt.getSharedPreferencesDataStore(access$getContext$p).getData(), booleanKey), this);
            if (firstOrNull == coroutine_suspended) {
                return coroutine_suspended;
            }
            objectRef = objectRef2;
            t = firstOrNull;
        } else if (i == 1) {
            objectRef = (Ref.ObjectRef) this.L$0;
            ResultKt.throwOnFailure(t);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        objectRef.element = t;
        return Unit.INSTANCE;
    }
}
