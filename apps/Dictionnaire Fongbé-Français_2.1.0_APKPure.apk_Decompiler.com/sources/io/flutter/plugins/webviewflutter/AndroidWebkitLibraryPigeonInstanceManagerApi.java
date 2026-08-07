package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J+\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0018\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\r\u0012\u0004\u0012\u00020\b0\fø\u0001\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonInstanceManagerApi;", "", "binaryMessenger", "Lio/flutter/plugin/common/BinaryMessenger;", "(Lio/flutter/plugin/common/BinaryMessenger;)V", "getBinaryMessenger", "()Lio/flutter/plugin/common/BinaryMessenger;", "removeStrongReference", "", "identifierArg", "", "callback", "Lkotlin/Function1;", "Lkotlin/Result;", "Companion", "webview_flutter_android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: AndroidWebkitLibrary.g.kt */
final class AndroidWebkitLibraryPigeonInstanceManagerApi {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final Lazy<AndroidWebkitLibraryPigeonCodec> codec$delegate = LazyKt.lazy(AndroidWebkitLibraryPigeonInstanceManagerApi$Companion$codec$2.INSTANCE);
    private final BinaryMessenger binaryMessenger;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eR#\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonInstanceManagerApi$Companion;", "", "()V", "codec", "Lio/flutter/plugin/common/MessageCodec;", "getCodec", "()Lio/flutter/plugin/common/MessageCodec;", "codec$delegate", "Lkotlin/Lazy;", "setUpMessageHandlers", "", "binaryMessenger", "Lio/flutter/plugin/common/BinaryMessenger;", "instanceManager", "Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonInstanceManager;", "webview_flutter_android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: AndroidWebkitLibrary.g.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final MessageCodec<Object> getCodec() {
            return (MessageCodec) AndroidWebkitLibraryPigeonInstanceManagerApi.codec$delegate.getValue();
        }

        public final void setUpMessageHandlers(BinaryMessenger binaryMessenger, AndroidWebkitLibraryPigeonInstanceManager androidWebkitLibraryPigeonInstanceManager) {
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            Companion companion = this;
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.removeStrongReference", getCodec());
            if (androidWebkitLibraryPigeonInstanceManager != null) {
                basicMessageChannel.setMessageHandler(new AndroidWebkitLibraryPigeonInstanceManagerApi$Companion$$ExternalSyntheticLambda0(androidWebkitLibraryPigeonInstanceManager));
            } else {
                basicMessageChannel.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.clear", getCodec());
            if (androidWebkitLibraryPigeonInstanceManager != null) {
                basicMessageChannel2.setMessageHandler(new AndroidWebkitLibraryPigeonInstanceManagerApi$Companion$$ExternalSyntheticLambda1(androidWebkitLibraryPigeonInstanceManager));
            } else {
                basicMessageChannel2.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
        }

        /* access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$1$lambda$0(AndroidWebkitLibraryPigeonInstanceManager androidWebkitLibraryPigeonInstanceManager, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
            try {
                androidWebkitLibraryPigeonInstanceManager.remove(((Long) obj2).longValue());
                list = CollectionsKt.listOf(null);
            } catch (Throwable th) {
                list = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(list);
        }

        /* access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$3$lambda$2(AndroidWebkitLibraryPigeonInstanceManager androidWebkitLibraryPigeonInstanceManager, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            try {
                androidWebkitLibraryPigeonInstanceManager.clear();
                list = CollectionsKt.listOf(null);
            } catch (Throwable th) {
                list = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(list);
        }
    }

    public AndroidWebkitLibraryPigeonInstanceManagerApi(BinaryMessenger binaryMessenger2) {
        Intrinsics.checkNotNullParameter(binaryMessenger2, "binaryMessenger");
        this.binaryMessenger = binaryMessenger2;
    }

    public final BinaryMessenger getBinaryMessenger() {
        return this.binaryMessenger;
    }

    public final void removeStrongReference(long j, Function1<? super Result<Unit>, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "callback");
        new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.removeStrongReference", Companion.getCodec()).send(CollectionsKt.listOf(Long.valueOf(j)), new AndroidWebkitLibraryPigeonInstanceManagerApi$$ExternalSyntheticLambda0(function1, "dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.removeStrongReference"));
    }

    /* access modifiers changed from: private */
    public static final void removeStrongReference$lambda$0(Function1 function1, String str, Object obj) {
        Intrinsics.checkNotNullParameter(function1, "$callback");
        Intrinsics.checkNotNullParameter(str, "$channelName");
        if (obj instanceof List) {
            List list = (List) obj;
            if (list.size() > 1) {
                Result.Companion companion = Result.Companion;
                Object obj2 = list.get(0);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                Object obj3 = list.get(1);
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
                function1.invoke(Result.m510boximpl(Result.m511constructorimpl(ResultKt.createFailure(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))))));
                return;
            }
            Result.Companion companion2 = Result.Companion;
            function1.invoke(Result.m510boximpl(Result.m511constructorimpl(Unit.INSTANCE)));
            return;
        }
        Result.Companion companion3 = Result.Companion;
        function1.invoke(Result.m510boximpl(Result.m511constructorimpl(ResultKt.createFailure(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)))));
    }
}
