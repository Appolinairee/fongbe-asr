package io.flutter.plugins.webviewflutter;

import android.net.http.SslCertificate;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\nR\u00020\u000bH&J\u0014\u0010\f\u001a\u00020\b2\n\u0010\t\u001a\u00060\nR\u00020\u000bH&J\u0014\u0010\r\u001a\u00020\b2\n\u0010\t\u001a\u00060\nR\u00020\u000bH&J\u0014\u0010\u000e\u001a\u00020\b2\n\u0010\t\u001a\u00060\nR\u00020\u000bH&J/\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\nR\u00020\u000b2\u0018\u0010\u0012\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u0014\u0012\u0004\u0012\u00020\u00100\u0013ø\u0001\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lio/flutter/plugins/webviewflutter/PigeonApiSslCertificateDName;", "", "pigeonRegistrar", "Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;", "(Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;)V", "getPigeonRegistrar", "()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;", "getCName", "", "pigeon_instance", "Landroid/net/http/SslCertificate$DName;", "Landroid/net/http/SslCertificate;", "getDName", "getOName", "getUName", "pigeon_newInstance", "", "pigeon_instanceArg", "callback", "Lkotlin/Function1;", "Lkotlin/Result;", "Companion", "webview_flutter_android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: AndroidWebkitLibrary.g.kt */
public abstract class PigeonApiSslCertificateDName {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar;

    public abstract String getCName(SslCertificate.DName dName);

    public abstract String getDName(SslCertificate.DName dName);

    public abstract String getOName(SslCertificate.DName dName);

    public abstract String getUName(SslCertificate.DName dName);

    public PigeonApiSslCertificateDName(AndroidWebkitLibraryPigeonProxyApiRegistrar androidWebkitLibraryPigeonProxyApiRegistrar) {
        Intrinsics.checkNotNullParameter(androidWebkitLibraryPigeonProxyApiRegistrar, "pigeonRegistrar");
        this.pigeonRegistrar = androidWebkitLibraryPigeonProxyApiRegistrar;
    }

    public AndroidWebkitLibraryPigeonProxyApiRegistrar getPigeonRegistrar() {
        return this.pigeonRegistrar;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\t"}, d2 = {"Lio/flutter/plugins/webviewflutter/PigeonApiSslCertificateDName$Companion;", "", "()V", "setUpMessageHandlers", "", "binaryMessenger", "Lio/flutter/plugin/common/BinaryMessenger;", "api", "Lio/flutter/plugins/webviewflutter/PigeonApiSslCertificateDName;", "webview_flutter_android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: AndroidWebkitLibrary.g.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void setUpMessageHandlers(BinaryMessenger binaryMessenger, PigeonApiSslCertificateDName pigeonApiSslCertificateDName) {
            MessageCodec<Object> messageCodec;
            AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar;
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            if (pigeonApiSslCertificateDName == null || (pigeonRegistrar = pigeonApiSslCertificateDName.getPigeonRegistrar()) == null || (messageCodec = pigeonRegistrar.getCodec()) == null) {
                messageCodec = new AndroidWebkitLibraryPigeonCodec();
            }
            Companion companion = this;
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getCName", messageCodec);
            if (pigeonApiSslCertificateDName != null) {
                basicMessageChannel.setMessageHandler(new PigeonApiSslCertificateDName$Companion$$ExternalSyntheticLambda0(pigeonApiSslCertificateDName));
            } else {
                basicMessageChannel.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getDName", messageCodec);
            if (pigeonApiSslCertificateDName != null) {
                basicMessageChannel2.setMessageHandler(new PigeonApiSslCertificateDName$Companion$$ExternalSyntheticLambda1(pigeonApiSslCertificateDName));
            } else {
                basicMessageChannel2.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getOName", messageCodec);
            if (pigeonApiSslCertificateDName != null) {
                basicMessageChannel3.setMessageHandler(new PigeonApiSslCertificateDName$Companion$$ExternalSyntheticLambda2(pigeonApiSslCertificateDName));
            } else {
                basicMessageChannel3.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getUName", messageCodec);
            if (pigeonApiSslCertificateDName != null) {
                basicMessageChannel4.setMessageHandler(new PigeonApiSslCertificateDName$Companion$$ExternalSyntheticLambda3(pigeonApiSslCertificateDName));
            } else {
                basicMessageChannel4.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
        }

        /* access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$1$lambda$0(PigeonApiSslCertificateDName pigeonApiSslCertificateDName, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
            try {
                list = CollectionsKt.listOf(pigeonApiSslCertificateDName.getCName((SslCertificate.DName) obj2));
            } catch (Throwable th) {
                list = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(list);
        }

        /* access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$3$lambda$2(PigeonApiSslCertificateDName pigeonApiSslCertificateDName, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
            try {
                list = CollectionsKt.listOf(pigeonApiSslCertificateDName.getDName((SslCertificate.DName) obj2));
            } catch (Throwable th) {
                list = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(list);
        }

        /* access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$5$lambda$4(PigeonApiSslCertificateDName pigeonApiSslCertificateDName, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
            try {
                list = CollectionsKt.listOf(pigeonApiSslCertificateDName.getOName((SslCertificate.DName) obj2));
            } catch (Throwable th) {
                list = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(list);
        }

        /* access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$7$lambda$6(PigeonApiSslCertificateDName pigeonApiSslCertificateDName, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
            try {
                list = CollectionsKt.listOf(pigeonApiSslCertificateDName.getUName((SslCertificate.DName) obj2));
            } catch (Throwable th) {
                list = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(list);
        }
    }

    public final void pigeon_newInstance(SslCertificate.DName dName, Function1<? super Result<Unit>, Unit> function1) {
        Intrinsics.checkNotNullParameter(dName, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(function1, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            Result.Companion companion = Result.Companion;
            function1.invoke(Result.m510boximpl(Result.m511constructorimpl(ResultKt.createFailure(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (getPigeonRegistrar().getInstanceManager().containsInstance(dName)) {
            Result.Companion companion2 = Result.Companion;
            function1.invoke(Result.m510boximpl(Result.m511constructorimpl(Unit.INSTANCE)));
        } else {
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.pigeon_newInstance", getPigeonRegistrar().getCodec()).send(CollectionsKt.listOf(Long.valueOf(getPigeonRegistrar().getInstanceManager().addHostCreatedInstance(dName))), new PigeonApiSslCertificateDName$$ExternalSyntheticLambda0(function1, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.pigeon_newInstance"));
        }
    }

    /* access modifiers changed from: private */
    public static final void pigeon_newInstance$lambda$0(Function1 function1, String str, Object obj) {
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
