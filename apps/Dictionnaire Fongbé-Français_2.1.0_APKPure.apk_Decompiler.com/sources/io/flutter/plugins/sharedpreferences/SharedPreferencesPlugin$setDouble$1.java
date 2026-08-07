package io.flutter.plugins.sharedpreferences;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.datastore.preferences.core.PreferencesKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setDouble$1", f = "SharedPreferencesPlugin.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, s = {})
/* compiled from: SharedPreferencesPlugin.kt */
final class SharedPreferencesPlugin$setDouble$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $key;
    final /* synthetic */ double $value;
    int label;
    final /* synthetic */ SharedPreferencesPlugin this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SharedPreferencesPlugin$setDouble$1(String str, SharedPreferencesPlugin sharedPreferencesPlugin, double d, Continuation<? super SharedPreferencesPlugin$setDouble$1> continuation) {
        super(2, continuation);
        this.$key = str;
        this.this$0 = sharedPreferencesPlugin;
        this.$value = d;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SharedPreferencesPlugin$setDouble$1(this.$key, this.this$0, this.$value, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SharedPreferencesPlugin$setDouble$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final Preferences.Key<Double> doubleKey = PreferencesKeys.doubleKey(this.$key);
            Context access$getContext$p = this.this$0.context;
            if (access$getContext$p == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                access$getContext$p = null;
            }
            DataStore<Preferences> sharedPreferencesDataStore = SharedPreferencesPluginKt.getSharedPreferencesDataStore(access$getContext$p);
            final double d = this.$value;
            this.label = 1;
            if (PreferencesKt.edit(sharedPreferencesDataStore, new AnonymousClass1((Continuation<? super AnonymousClass1>) null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H@"}, d2 = {"<anonymous>", "", "preferences", "Landroidx/datastore/preferences/core/MutablePreferences;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setDouble$1$1", f = "SharedPreferencesPlugin.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setDouble$1$1  reason: invalid class name */
    /* compiled from: SharedPreferencesPlugin.kt */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 r0 = new AnonymousClass1(doubleKey, d, continuation);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(MutablePreferences mutablePreferences, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                ((MutablePreferences) this.L$0).set(doubleKey, Boxing.boxDouble(d));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
