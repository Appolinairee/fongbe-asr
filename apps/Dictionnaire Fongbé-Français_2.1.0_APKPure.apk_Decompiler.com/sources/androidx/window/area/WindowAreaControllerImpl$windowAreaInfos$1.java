package androidx.window.area;

import androidx.core.app.NotificationCompat;
import androidx.window.extensions.area.ExtensionWindowAreaStatus;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "", "Landroidx/window/area/WindowAreaInfo;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.window.area.WindowAreaControllerImpl$windowAreaInfos$1", f = "WindowAreaControllerImpl.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
/* compiled from: WindowAreaControllerImpl.kt */
final class WindowAreaControllerImpl$windowAreaInfos$1 extends SuspendLambda implements Function2<ProducerScope<? super List<? extends WindowAreaInfo>>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ WindowAreaControllerImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    WindowAreaControllerImpl$windowAreaInfos$1(WindowAreaControllerImpl windowAreaControllerImpl, Continuation<? super WindowAreaControllerImpl$windowAreaInfos$1> continuation) {
        super(2, continuation);
        this.this$0 = windowAreaControllerImpl;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        WindowAreaControllerImpl$windowAreaInfos$1 windowAreaControllerImpl$windowAreaInfos$1 = new WindowAreaControllerImpl$windowAreaInfos$1(this.this$0, continuation);
        windowAreaControllerImpl$windowAreaInfos$1.L$0 = obj;
        return windowAreaControllerImpl$windowAreaInfos$1;
    }

    public final Object invoke(ProducerScope<? super List<WindowAreaInfo>> producerScope, Continuation<? super Unit> continuation) {
        return ((WindowAreaControllerImpl$windowAreaInfos$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ProducerScope producerScope = (ProducerScope) this.L$0;
            final WindowAreaControllerImpl$windowAreaInfos$1$$ExternalSyntheticLambda0 windowAreaControllerImpl$windowAreaInfos$1$$ExternalSyntheticLambda0 = new WindowAreaControllerImpl$windowAreaInfos$1$$ExternalSyntheticLambda0(this.this$0, producerScope);
            final WindowAreaControllerImpl$windowAreaInfos$1$$ExternalSyntheticLambda1 windowAreaControllerImpl$windowAreaInfos$1$$ExternalSyntheticLambda1 = new WindowAreaControllerImpl$windowAreaInfos$1$$ExternalSyntheticLambda1(this.this$0, producerScope);
            this.this$0.windowAreaComponent.addRearDisplayStatusListener(windowAreaControllerImpl$windowAreaInfos$1$$ExternalSyntheticLambda0);
            if (this.this$0.vendorApiLevel > 2) {
                this.this$0.windowAreaComponent.addRearDisplayPresentationStatusListener(windowAreaControllerImpl$windowAreaInfos$1$$ExternalSyntheticLambda1);
            }
            final WindowAreaControllerImpl windowAreaControllerImpl = this.this$0;
            this.label = 1;
            if (ProduceKt.awaitClose(producerScope, new Function0<Unit>() {
                public final void invoke() {
                    windowAreaControllerImpl.windowAreaComponent.removeRearDisplayStatusListener(windowAreaControllerImpl$windowAreaInfos$1$$ExternalSyntheticLambda0);
                    if (windowAreaControllerImpl.vendorApiLevel > 2) {
                        windowAreaControllerImpl.windowAreaComponent.removeRearDisplayPresentationStatusListener(windowAreaControllerImpl$windowAreaInfos$1$$ExternalSyntheticLambda1);
                    }
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }

    /* access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(WindowAreaControllerImpl windowAreaControllerImpl, ProducerScope producerScope, Integer num) {
        Intrinsics.checkNotNullExpressionValue(num, NotificationCompat.CATEGORY_STATUS);
        windowAreaControllerImpl.updateRearDisplayAvailability(num.intValue());
        SendChannel channel = producerScope.getChannel();
        Collection values = windowAreaControllerImpl.currentWindowAreaInfoMap.values();
        Intrinsics.checkNotNullExpressionValue(values, "currentWindowAreaInfoMap.values");
        channel.m1757trySendJP2dKIU(CollectionsKt.toList(values));
    }

    /* access modifiers changed from: private */
    public static final void invokeSuspend$lambda$1(WindowAreaControllerImpl windowAreaControllerImpl, ProducerScope producerScope, ExtensionWindowAreaStatus extensionWindowAreaStatus) {
        Intrinsics.checkNotNullExpressionValue(extensionWindowAreaStatus, "extensionWindowAreaStatus");
        windowAreaControllerImpl.updateRearDisplayPresentationAvailability(extensionWindowAreaStatus);
        SendChannel channel = producerScope.getChannel();
        Collection values = windowAreaControllerImpl.currentWindowAreaInfoMap.values();
        Intrinsics.checkNotNullExpressionValue(values, "currentWindowAreaInfoMap.values");
        channel.m1757trySendJP2dKIU(CollectionsKt.toList(values));
    }
}
