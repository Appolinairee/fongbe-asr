package io.flutter.plugins.webviewflutter;

import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugins.webviewflutter.WebChromeClientProxyApi;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u000b\b&\u0018\u0000 62\u00020\u0001:\u00016B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J3\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000f\u0012\u0004\u0012\u00020\b0\u000eø\u0001\u0000J+\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000f\u0012\u0004\u0012\u00020\b0\u000eø\u0001\u0000J;\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000f\u0012\u0004\u0012\u00020\b0\u000eø\u0001\u0000J+\u0010\u0016\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000f\u0012\u0004\u0012\u00020\b0\u000eø\u0001\u0000JC\u0010\u0017\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u00132\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000f\u0012\u0004\u0012\u00020\b0\u000eø\u0001\u0000JC\u0010\u001b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u00132\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u000f\u0012\u0004\u0012\u00020\b0\u000eø\u0001\u0000JM\u0010\u001d\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00132\u001a\u0010\r\u001a\u0016\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000f\u0012\u0004\u0012\u00020\b0\u000eø\u0001\u0000J3\u0010\u001f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010 \u001a\u00020!2\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000f\u0012\u0004\u0012\u00020\b0\u000eø\u0001\u0000J;\u0010\"\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$2\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000f\u0012\u0004\u0012\u00020\b0\u000eø\u0001\u0000J;\u0010%\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010&\u001a\u00020'2\u0006\u0010\u0014\u001a\u00020(2\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000f\u0012\u0004\u0012\u00020\b0\u000eø\u0001\u0000JA\u0010)\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010*\u001a\u00020+2\u001e\u0010\r\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130,0\u000f\u0012\u0004\u0012\u00020\b0\u000eø\u0001\u0000J\b\u0010-\u001a\u00020\nH&J+\u0010.\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000f\u0012\u0004\u0012\u00020\b0\u000eø\u0001\u0000J\u0018\u0010/\u001a\u00020\b2\u0006\u00100\u001a\u00020\n2\u0006\u00101\u001a\u00020\u001cH&J\u0018\u00102\u001a\u00020\b2\u0006\u00100\u001a\u00020\n2\u0006\u00101\u001a\u00020\u001cH&J\u0018\u00103\u001a\u00020\b2\u0006\u00100\u001a\u00020\n2\u0006\u00101\u001a\u00020\u001cH&J\u0018\u00104\u001a\u00020\b2\u0006\u00100\u001a\u00020\n2\u0006\u00101\u001a\u00020\u001cH&J\u0018\u00105\u001a\u00020\b2\u0006\u00100\u001a\u00020\n2\u0006\u00101\u001a\u00020\u001cH&R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u00067"}, d2 = {"Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient;", "", "pigeonRegistrar", "Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;", "(Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;)V", "getPigeonRegistrar", "()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;", "onConsoleMessage", "", "pigeon_instanceArg", "Lio/flutter/plugins/webviewflutter/WebChromeClientProxyApi$WebChromeClientImpl;", "messageArg", "Landroid/webkit/ConsoleMessage;", "callback", "Lkotlin/Function1;", "Lkotlin/Result;", "onGeolocationPermissionsHidePrompt", "onGeolocationPermissionsShowPrompt", "originArg", "", "callbackArg", "Landroid/webkit/GeolocationPermissions$Callback;", "onHideCustomView", "onJsAlert", "webViewArg", "Landroid/webkit/WebView;", "urlArg", "onJsConfirm", "", "onJsPrompt", "defaultValueArg", "onPermissionRequest", "requestArg", "Landroid/webkit/PermissionRequest;", "onProgressChanged", "progressArg", "", "onShowCustomView", "viewArg", "Landroid/view/View;", "Landroid/webkit/WebChromeClient$CustomViewCallback;", "onShowFileChooser", "paramsArg", "Landroid/webkit/WebChromeClient$FileChooserParams;", "", "pigeon_defaultConstructor", "pigeon_newInstance", "setSynchronousReturnValueForOnConsoleMessage", "pigeon_instance", "value", "setSynchronousReturnValueForOnJsAlert", "setSynchronousReturnValueForOnJsConfirm", "setSynchronousReturnValueForOnJsPrompt", "setSynchronousReturnValueForOnShowFileChooser", "Companion", "webview_flutter_android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: AndroidWebkitLibrary.g.kt */
public abstract class PigeonApiWebChromeClient {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar;

    public abstract WebChromeClientProxyApi.WebChromeClientImpl pigeon_defaultConstructor();

    public abstract void setSynchronousReturnValueForOnConsoleMessage(WebChromeClientProxyApi.WebChromeClientImpl webChromeClientImpl, boolean z);

    public abstract void setSynchronousReturnValueForOnJsAlert(WebChromeClientProxyApi.WebChromeClientImpl webChromeClientImpl, boolean z);

    public abstract void setSynchronousReturnValueForOnJsConfirm(WebChromeClientProxyApi.WebChromeClientImpl webChromeClientImpl, boolean z);

    public abstract void setSynchronousReturnValueForOnJsPrompt(WebChromeClientProxyApi.WebChromeClientImpl webChromeClientImpl, boolean z);

    public abstract void setSynchronousReturnValueForOnShowFileChooser(WebChromeClientProxyApi.WebChromeClientImpl webChromeClientImpl, boolean z);

    public PigeonApiWebChromeClient(AndroidWebkitLibraryPigeonProxyApiRegistrar androidWebkitLibraryPigeonProxyApiRegistrar) {
        Intrinsics.checkNotNullParameter(androidWebkitLibraryPigeonProxyApiRegistrar, "pigeonRegistrar");
        this.pigeonRegistrar = androidWebkitLibraryPigeonProxyApiRegistrar;
    }

    public AndroidWebkitLibraryPigeonProxyApiRegistrar getPigeonRegistrar() {
        return this.pigeonRegistrar;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\t"}, d2 = {"Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient$Companion;", "", "()V", "setUpMessageHandlers", "", "binaryMessenger", "Lio/flutter/plugin/common/BinaryMessenger;", "api", "Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient;", "webview_flutter_android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: AndroidWebkitLibrary.g.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void setUpMessageHandlers(BinaryMessenger binaryMessenger, PigeonApiWebChromeClient pigeonApiWebChromeClient) {
            MessageCodec<Object> messageCodec;
            AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar;
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            if (pigeonApiWebChromeClient == null || (pigeonRegistrar = pigeonApiWebChromeClient.getPigeonRegistrar()) == null || (messageCodec = pigeonRegistrar.getCodec()) == null) {
                messageCodec = new AndroidWebkitLibraryPigeonCodec();
            }
            Companion companion = this;
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.pigeon_defaultConstructor", messageCodec);
            if (pigeonApiWebChromeClient != null) {
                basicMessageChannel.setMessageHandler(new PigeonApiWebChromeClient$Companion$$ExternalSyntheticLambda0(pigeonApiWebChromeClient));
            } else {
                basicMessageChannel.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnShowFileChooser", messageCodec);
            if (pigeonApiWebChromeClient != null) {
                basicMessageChannel2.setMessageHandler(new PigeonApiWebChromeClient$Companion$$ExternalSyntheticLambda1(pigeonApiWebChromeClient));
            } else {
                basicMessageChannel2.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnConsoleMessage", messageCodec);
            if (pigeonApiWebChromeClient != null) {
                basicMessageChannel3.setMessageHandler(new PigeonApiWebChromeClient$Companion$$ExternalSyntheticLambda2(pigeonApiWebChromeClient));
            } else {
                basicMessageChannel3.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsAlert", messageCodec);
            if (pigeonApiWebChromeClient != null) {
                basicMessageChannel4.setMessageHandler(new PigeonApiWebChromeClient$Companion$$ExternalSyntheticLambda3(pigeonApiWebChromeClient));
            } else {
                basicMessageChannel4.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsConfirm", messageCodec);
            if (pigeonApiWebChromeClient != null) {
                basicMessageChannel5.setMessageHandler(new PigeonApiWebChromeClient$Companion$$ExternalSyntheticLambda4(pigeonApiWebChromeClient));
            } else {
                basicMessageChannel5.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsPrompt", messageCodec);
            if (pigeonApiWebChromeClient != null) {
                basicMessageChannel6.setMessageHandler(new PigeonApiWebChromeClient$Companion$$ExternalSyntheticLambda5(pigeonApiWebChromeClient));
            } else {
                basicMessageChannel6.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
        }

        /* access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$1$lambda$0(PigeonApiWebChromeClient pigeonApiWebChromeClient, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
            try {
                pigeonApiWebChromeClient.getPigeonRegistrar().getInstanceManager().addDartCreatedInstance(pigeonApiWebChromeClient.pigeon_defaultConstructor(), ((Long) obj2).longValue());
                list = CollectionsKt.listOf(null);
            } catch (Throwable th) {
                list = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(list);
        }

        /* access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$3$lambda$2(PigeonApiWebChromeClient pigeonApiWebChromeClient, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list2 = (List) obj;
            Object obj2 = list2.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
            WebChromeClientProxyApi.WebChromeClientImpl webChromeClientImpl = (WebChromeClientProxyApi.WebChromeClientImpl) obj2;
            Object obj3 = list2.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebChromeClient.setSynchronousReturnValueForOnShowFileChooser(webChromeClientImpl, ((Boolean) obj3).booleanValue());
                list = CollectionsKt.listOf(null);
            } catch (Throwable th) {
                list = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(list);
        }

        /* access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$5$lambda$4(PigeonApiWebChromeClient pigeonApiWebChromeClient, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list2 = (List) obj;
            Object obj2 = list2.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
            WebChromeClientProxyApi.WebChromeClientImpl webChromeClientImpl = (WebChromeClientProxyApi.WebChromeClientImpl) obj2;
            Object obj3 = list2.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebChromeClient.setSynchronousReturnValueForOnConsoleMessage(webChromeClientImpl, ((Boolean) obj3).booleanValue());
                list = CollectionsKt.listOf(null);
            } catch (Throwable th) {
                list = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(list);
        }

        /* access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$7$lambda$6(PigeonApiWebChromeClient pigeonApiWebChromeClient, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list2 = (List) obj;
            Object obj2 = list2.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
            WebChromeClientProxyApi.WebChromeClientImpl webChromeClientImpl = (WebChromeClientProxyApi.WebChromeClientImpl) obj2;
            Object obj3 = list2.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebChromeClient.setSynchronousReturnValueForOnJsAlert(webChromeClientImpl, ((Boolean) obj3).booleanValue());
                list = CollectionsKt.listOf(null);
            } catch (Throwable th) {
                list = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(list);
        }

        /* access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$9$lambda$8(PigeonApiWebChromeClient pigeonApiWebChromeClient, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list2 = (List) obj;
            Object obj2 = list2.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
            WebChromeClientProxyApi.WebChromeClientImpl webChromeClientImpl = (WebChromeClientProxyApi.WebChromeClientImpl) obj2;
            Object obj3 = list2.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebChromeClient.setSynchronousReturnValueForOnJsConfirm(webChromeClientImpl, ((Boolean) obj3).booleanValue());
                list = CollectionsKt.listOf(null);
            } catch (Throwable th) {
                list = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(list);
        }

        /* access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$11$lambda$10(PigeonApiWebChromeClient pigeonApiWebChromeClient, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list2 = (List) obj;
            Object obj2 = list2.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
            WebChromeClientProxyApi.WebChromeClientImpl webChromeClientImpl = (WebChromeClientProxyApi.WebChromeClientImpl) obj2;
            Object obj3 = list2.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebChromeClient.setSynchronousReturnValueForOnJsPrompt(webChromeClientImpl, ((Boolean) obj3).booleanValue());
                list = CollectionsKt.listOf(null);
            } catch (Throwable th) {
                list = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(list);
        }
    }

    public final void pigeon_newInstance(WebChromeClientProxyApi.WebChromeClientImpl webChromeClientImpl, Function1<? super Result<Unit>, Unit> function1) {
        Intrinsics.checkNotNullParameter(webChromeClientImpl, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(function1, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            Result.Companion companion = Result.Companion;
            function1.invoke(Result.m510boximpl(Result.m511constructorimpl(ResultKt.createFailure(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (getPigeonRegistrar().getInstanceManager().containsInstance(webChromeClientImpl)) {
            Result.Companion companion2 = Result.Companion;
            function1.invoke(Result.m510boximpl(Result.m511constructorimpl(Unit.INSTANCE)));
        } else {
            Result.Companion companion3 = Result.Companion;
            function1.invoke(Result.m510boximpl(Result.m511constructorimpl(ResultKt.createFailure(new AndroidWebKitError("new-instance-error", "Attempting to create a new Dart instance of WebChromeClient, but the class has a nonnull callback method.", "")))));
        }
    }

    public final void onProgressChanged(WebChromeClientProxyApi.WebChromeClientImpl webChromeClientImpl, WebView webView, long j, Function1<? super Result<Unit>, Unit> function1) {
        Intrinsics.checkNotNullParameter(webChromeClientImpl, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(webView, "webViewArg");
        Intrinsics.checkNotNullParameter(function1, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            Result.Companion companion = Result.Companion;
            function1.invoke(Result.m510boximpl(Result.m511constructorimpl(ResultKt.createFailure(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
            return;
        }
        new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onProgressChanged", getPigeonRegistrar().getCodec()).send(CollectionsKt.listOf(webChromeClientImpl, webView, Long.valueOf(j)), new PigeonApiWebChromeClient$$ExternalSyntheticLambda1(function1, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onProgressChanged"));
    }

    /* access modifiers changed from: private */
    public static final void onProgressChanged$lambda$0(Function1 function1, String str, Object obj) {
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

    public final void onShowFileChooser(WebChromeClientProxyApi.WebChromeClientImpl webChromeClientImpl, WebView webView, WebChromeClient.FileChooserParams fileChooserParams, Function1<? super Result<? extends List<String>>, Unit> function1) {
        Intrinsics.checkNotNullParameter(webChromeClientImpl, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(webView, "webViewArg");
        Intrinsics.checkNotNullParameter(fileChooserParams, "paramsArg");
        Intrinsics.checkNotNullParameter(function1, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            Result.Companion companion = Result.Companion;
            function1.invoke(Result.m510boximpl(Result.m511constructorimpl(ResultKt.createFailure(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
            return;
        }
        new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowFileChooser", getPigeonRegistrar().getCodec()).send(CollectionsKt.listOf(webChromeClientImpl, webView, fileChooserParams), new PigeonApiWebChromeClient$$ExternalSyntheticLambda4(function1, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowFileChooser"));
    }

    /* access modifiers changed from: private */
    public static final void onShowFileChooser$lambda$1(Function1 function1, String str, Object obj) {
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
            } else if (list.get(0) == null) {
                Result.Companion companion2 = Result.Companion;
                function1.invoke(Result.m510boximpl(Result.m511constructorimpl(ResultKt.createFailure(new AndroidWebKitError("null-error", "Flutter api returned null value for non-null return value.", "")))));
            } else {
                Object obj4 = list.get(0);
                Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                Result.Companion companion3 = Result.Companion;
                function1.invoke(Result.m510boximpl(Result.m511constructorimpl((List) obj4)));
            }
        } else {
            Result.Companion companion4 = Result.Companion;
            function1.invoke(Result.m510boximpl(Result.m511constructorimpl(ResultKt.createFailure(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)))));
        }
    }

    public final void onPermissionRequest(WebChromeClientProxyApi.WebChromeClientImpl webChromeClientImpl, PermissionRequest permissionRequest, Function1<? super Result<Unit>, Unit> function1) {
        Intrinsics.checkNotNullParameter(webChromeClientImpl, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(permissionRequest, "requestArg");
        Intrinsics.checkNotNullParameter(function1, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            Result.Companion companion = Result.Companion;
            function1.invoke(Result.m510boximpl(Result.m511constructorimpl(ResultKt.createFailure(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
            return;
        }
        new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onPermissionRequest", getPigeonRegistrar().getCodec()).send(CollectionsKt.listOf(webChromeClientImpl, permissionRequest), new PigeonApiWebChromeClient$$ExternalSyntheticLambda5(function1, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onPermissionRequest"));
    }

    /* access modifiers changed from: private */
    public static final void onPermissionRequest$lambda$2(Function1 function1, String str, Object obj) {
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

    public final void onShowCustomView(WebChromeClientProxyApi.WebChromeClientImpl webChromeClientImpl, View view, WebChromeClient.CustomViewCallback customViewCallback, Function1<? super Result<Unit>, Unit> function1) {
        Intrinsics.checkNotNullParameter(webChromeClientImpl, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(view, "viewArg");
        Intrinsics.checkNotNullParameter(customViewCallback, "callbackArg");
        Intrinsics.checkNotNullParameter(function1, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            Result.Companion companion = Result.Companion;
            function1.invoke(Result.m510boximpl(Result.m511constructorimpl(ResultKt.createFailure(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
            return;
        }
        new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowCustomView", getPigeonRegistrar().getCodec()).send(CollectionsKt.listOf(webChromeClientImpl, view, customViewCallback), new PigeonApiWebChromeClient$$ExternalSyntheticLambda6(function1, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowCustomView"));
    }

    /* access modifiers changed from: private */
    public static final void onShowCustomView$lambda$3(Function1 function1, String str, Object obj) {
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

    public final void onHideCustomView(WebChromeClientProxyApi.WebChromeClientImpl webChromeClientImpl, Function1<? super Result<Unit>, Unit> function1) {
        Intrinsics.checkNotNullParameter(webChromeClientImpl, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(function1, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            Result.Companion companion = Result.Companion;
            function1.invoke(Result.m510boximpl(Result.m511constructorimpl(ResultKt.createFailure(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
            return;
        }
        new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onHideCustomView", getPigeonRegistrar().getCodec()).send(CollectionsKt.listOf(webChromeClientImpl), new PigeonApiWebChromeClient$$ExternalSyntheticLambda0(function1, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onHideCustomView"));
    }

    /* access modifiers changed from: private */
    public static final void onHideCustomView$lambda$4(Function1 function1, String str, Object obj) {
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

    public final void onGeolocationPermissionsShowPrompt(WebChromeClientProxyApi.WebChromeClientImpl webChromeClientImpl, String str, GeolocationPermissions.Callback callback, Function1<? super Result<Unit>, Unit> function1) {
        Intrinsics.checkNotNullParameter(webChromeClientImpl, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(str, "originArg");
        Intrinsics.checkNotNullParameter(callback, "callbackArg");
        Intrinsics.checkNotNullParameter(function1, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            Result.Companion companion = Result.Companion;
            function1.invoke(Result.m510boximpl(Result.m511constructorimpl(ResultKt.createFailure(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
            return;
        }
        new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsShowPrompt", getPigeonRegistrar().getCodec()).send(CollectionsKt.listOf(webChromeClientImpl, str, callback), new PigeonApiWebChromeClient$$ExternalSyntheticLambda8(function1, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsShowPrompt"));
    }

    /* access modifiers changed from: private */
    public static final void onGeolocationPermissionsShowPrompt$lambda$5(Function1 function1, String str, Object obj) {
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

    public final void onGeolocationPermissionsHidePrompt(WebChromeClientProxyApi.WebChromeClientImpl webChromeClientImpl, Function1<? super Result<Unit>, Unit> function1) {
        Intrinsics.checkNotNullParameter(webChromeClientImpl, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(function1, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            Result.Companion companion = Result.Companion;
            function1.invoke(Result.m510boximpl(Result.m511constructorimpl(ResultKt.createFailure(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
            return;
        }
        new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsHidePrompt", getPigeonRegistrar().getCodec()).send(CollectionsKt.listOf(webChromeClientImpl), new PigeonApiWebChromeClient$$ExternalSyntheticLambda10(function1, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsHidePrompt"));
    }

    /* access modifiers changed from: private */
    public static final void onGeolocationPermissionsHidePrompt$lambda$6(Function1 function1, String str, Object obj) {
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

    public final void onConsoleMessage(WebChromeClientProxyApi.WebChromeClientImpl webChromeClientImpl, ConsoleMessage consoleMessage, Function1<? super Result<Unit>, Unit> function1) {
        Intrinsics.checkNotNullParameter(webChromeClientImpl, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(consoleMessage, "messageArg");
        Intrinsics.checkNotNullParameter(function1, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            Result.Companion companion = Result.Companion;
            function1.invoke(Result.m510boximpl(Result.m511constructorimpl(ResultKt.createFailure(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
            return;
        }
        new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onConsoleMessage", getPigeonRegistrar().getCodec()).send(CollectionsKt.listOf(webChromeClientImpl, consoleMessage), new PigeonApiWebChromeClient$$ExternalSyntheticLambda7(function1, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onConsoleMessage"));
    }

    /* access modifiers changed from: private */
    public static final void onConsoleMessage$lambda$7(Function1 function1, String str, Object obj) {
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

    public final void onJsAlert(WebChromeClientProxyApi.WebChromeClientImpl webChromeClientImpl, WebView webView, String str, String str2, Function1<? super Result<Unit>, Unit> function1) {
        Intrinsics.checkNotNullParameter(webChromeClientImpl, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(webView, "webViewArg");
        Intrinsics.checkNotNullParameter(str, "urlArg");
        Intrinsics.checkNotNullParameter(str2, "messageArg");
        Intrinsics.checkNotNullParameter(function1, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            Result.Companion companion = Result.Companion;
            function1.invoke(Result.m510boximpl(Result.m511constructorimpl(ResultKt.createFailure(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
            return;
        }
        new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsAlert", getPigeonRegistrar().getCodec()).send(CollectionsKt.listOf(webChromeClientImpl, webView, str, str2), new PigeonApiWebChromeClient$$ExternalSyntheticLambda3(function1, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsAlert"));
    }

    /* access modifiers changed from: private */
    public static final void onJsAlert$lambda$8(Function1 function1, String str, Object obj) {
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

    public final void onJsConfirm(WebChromeClientProxyApi.WebChromeClientImpl webChromeClientImpl, WebView webView, String str, String str2, Function1<? super Result<Boolean>, Unit> function1) {
        Intrinsics.checkNotNullParameter(webChromeClientImpl, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(webView, "webViewArg");
        Intrinsics.checkNotNullParameter(str, "urlArg");
        Intrinsics.checkNotNullParameter(str2, "messageArg");
        Intrinsics.checkNotNullParameter(function1, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            Result.Companion companion = Result.Companion;
            function1.invoke(Result.m510boximpl(Result.m511constructorimpl(ResultKt.createFailure(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
            return;
        }
        new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsConfirm", getPigeonRegistrar().getCodec()).send(CollectionsKt.listOf(webChromeClientImpl, webView, str, str2), new PigeonApiWebChromeClient$$ExternalSyntheticLambda9(function1, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsConfirm"));
    }

    /* access modifiers changed from: private */
    public static final void onJsConfirm$lambda$9(Function1 function1, String str, Object obj) {
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
            } else if (list.get(0) == null) {
                Result.Companion companion2 = Result.Companion;
                function1.invoke(Result.m510boximpl(Result.m511constructorimpl(ResultKt.createFailure(new AndroidWebKitError("null-error", "Flutter api returned null value for non-null return value.", "")))));
            } else {
                Object obj4 = list.get(0);
                Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                Boolean bool = (Boolean) obj4;
                bool.booleanValue();
                Result.Companion companion3 = Result.Companion;
                function1.invoke(Result.m510boximpl(Result.m511constructorimpl(bool)));
            }
        } else {
            Result.Companion companion4 = Result.Companion;
            function1.invoke(Result.m510boximpl(Result.m511constructorimpl(ResultKt.createFailure(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)))));
        }
    }

    public final void onJsPrompt(WebChromeClientProxyApi.WebChromeClientImpl webChromeClientImpl, WebView webView, String str, String str2, String str3, Function1<? super Result<String>, Unit> function1) {
        Intrinsics.checkNotNullParameter(webChromeClientImpl, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(webView, "webViewArg");
        Intrinsics.checkNotNullParameter(str, "urlArg");
        Intrinsics.checkNotNullParameter(str2, "messageArg");
        Intrinsics.checkNotNullParameter(str3, "defaultValueArg");
        Intrinsics.checkNotNullParameter(function1, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            Result.Companion companion = Result.Companion;
            function1.invoke(Result.m510boximpl(Result.m511constructorimpl(ResultKt.createFailure(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
            return;
        }
        new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsPrompt", getPigeonRegistrar().getCodec()).send(CollectionsKt.listOf(webChromeClientImpl, webView, str, str2, str3), new PigeonApiWebChromeClient$$ExternalSyntheticLambda2(function1, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsPrompt"));
    }

    /* access modifiers changed from: private */
    public static final void onJsPrompt$lambda$10(Function1 function1, String str, Object obj) {
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
            function1.invoke(Result.m510boximpl(Result.m511constructorimpl((String) list.get(0))));
            return;
        }
        Result.Companion companion3 = Result.Companion;
        function1.invoke(Result.m510boximpl(Result.m511constructorimpl(ResultKt.createFailure(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)))));
    }
}
