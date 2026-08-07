package io.flutter.plugins.sharedpreferences;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H@"}, d2 = {"<anonymous>", "", "", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getAll$1", f = "SharedPreferencesPlugin.kt", i = {}, l = {150}, m = "invokeSuspend", n = {}, s = {})
/* compiled from: SharedPreferencesPlugin.kt */
final class SharedPreferencesPlugin$getAll$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Map<String, ? extends Object>>, Object> {
    final /* synthetic */ List<String> $allowList;
    int label;
    final /* synthetic */ SharedPreferencesPlugin this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SharedPreferencesPlugin$getAll$1(SharedPreferencesPlugin sharedPreferencesPlugin, List<String> list, Continuation<? super SharedPreferencesPlugin$getAll$1> continuation) {
        super(2, continuation);
        this.this$0 = sharedPreferencesPlugin;
        this.$allowList = list;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SharedPreferencesPlugin$getAll$1(this.this$0, this.$allowList, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Map<String, ? extends Object>> continuation) {
        return ((SharedPreferencesPlugin$getAll$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = this.this$0.getPrefs(this.$allowList, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
