package io.flutter.plugins.webviewflutter;

import android.net.http.SslError;
import android.os.Message;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.webkit.WebResourceErrorCompat;
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

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\n\b&\u0018\u0000 D2\u00020\u0001:\u0001DB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004JC\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0018\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0013\u0012\u0004\u0012\u00020\b0\u0012ø\u0001\u0000JC\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0018\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0013\u0012\u0004\u0012\u00020\b0\u0012ø\u0001\u0000J;\u0010\u0019\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0018\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0013\u0012\u0004\u0012\u00020\b0\u0012ø\u0001\u0000J;\u0010\u001a\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0018\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0013\u0012\u0004\u0012\u00020\b0\u0012ø\u0001\u0000J;\u0010\u001b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0018\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0013\u0012\u0004\u0012\u00020\b0\u0012ø\u0001\u0000J;\u0010\u001c\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0018\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0013\u0012\u0004\u0012\u00020\b0\u0012ø\u0001\u0000J;\u0010\u001d\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001f2\u0018\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0013\u0012\u0004\u0012\u00020\b0\u0012ø\u0001\u0000JK\u0010 \u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u000e2\u0018\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0013\u0012\u0004\u0012\u00020\b0\u0012ø\u0001\u0000JK\u0010%\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u000e2\u0018\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0013\u0012\u0004\u0012\u00020\b0\u0012ø\u0001\u0000JC\u0010*\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0018\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0013\u0012\u0004\u0012\u00020\b0\u0012ø\u0001\u0000JM\u0010.\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010)\u001a\u00020\u000e2\b\u0010/\u001a\u0004\u0018\u00010\u000e2\u0006\u00100\u001a\u00020\u000e2\u0018\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0013\u0012\u0004\u0012\u00020\b0\u0012ø\u0001\u0000JE\u00101\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020+2\u0006\u00102\u001a\u0002032\u0018\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0013\u0012\u0004\u0012\u00020\b0\u0012H\u0007ø\u0001\u0000JC\u00104\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020+2\u0006\u00102\u001a\u0002052\u0018\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0013\u0012\u0004\u0012\u00020\b0\u0012ø\u0001\u0000JC\u00106\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010&\u001a\u0002072\u0006\u00102\u001a\u0002082\u0018\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0013\u0012\u0004\u0012\u00020\b0\u0012ø\u0001\u0000JC\u00109\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020;2\u0018\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0013\u0012\u0004\u0012\u00020\b0\u0012ø\u0001\u0000J\b\u0010=\u001a\u00020\nH&J+\u0010>\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0018\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0013\u0012\u0004\u0012\u00020\b0\u0012ø\u0001\u0000J;\u0010?\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020+2\u0018\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0013\u0012\u0004\u0012\u00020\b0\u0012ø\u0001\u0000J\u0018\u0010@\u001a\u00020\b2\u0006\u0010A\u001a\u00020\n2\u0006\u0010B\u001a\u00020\u0010H&J;\u0010C\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0018\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0013\u0012\u0004\u0012\u00020\b0\u0012ø\u0001\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006E"}, d2 = {"Lio/flutter/plugins/webviewflutter/PigeonApiWebViewClient;", "", "pigeonRegistrar", "Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;", "(Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;)V", "getPigeonRegistrar", "()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;", "doUpdateVisitedHistory", "", "pigeon_instanceArg", "Landroid/webkit/WebViewClient;", "webViewArg", "Landroid/webkit/WebView;", "urlArg", "", "isReloadArg", "", "callback", "Lkotlin/Function1;", "Lkotlin/Result;", "onFormResubmission", "viewArg", "dontResendArg", "Landroid/os/Message;", "resendArg", "onLoadResource", "onPageCommitVisible", "onPageFinished", "onPageStarted", "onReceivedClientCertRequest", "requestArg", "Landroid/webkit/ClientCertRequest;", "onReceivedError", "errorCodeArg", "", "descriptionArg", "failingUrlArg", "onReceivedHttpAuthRequest", "handlerArg", "Landroid/webkit/HttpAuthHandler;", "hostArg", "realmArg", "onReceivedHttpError", "Landroid/webkit/WebResourceRequest;", "responseArg", "Landroid/webkit/WebResourceResponse;", "onReceivedLoginRequest", "accountArg", "argsArg", "onReceivedRequestError", "errorArg", "Landroid/webkit/WebResourceError;", "onReceivedRequestErrorCompat", "Landroidx/webkit/WebResourceErrorCompat;", "onReceivedSslError", "Landroid/webkit/SslErrorHandler;", "Landroid/net/http/SslError;", "onScaleChanged", "oldScaleArg", "", "newScaleArg", "pigeon_defaultConstructor", "pigeon_newInstance", "requestLoading", "setSynchronousReturnValueForShouldOverrideUrlLoading", "pigeon_instance", "value", "urlLoading", "Companion", "webview_flutter_android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: AndroidWebkitLibrary.g.kt */
public abstract class PigeonApiWebViewClient {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar;

    public abstract WebViewClient pigeon_defaultConstructor();

    public abstract void setSynchronousReturnValueForShouldOverrideUrlLoading(WebViewClient webViewClient, boolean z);

    public PigeonApiWebViewClient(AndroidWebkitLibraryPigeonProxyApiRegistrar androidWebkitLibraryPigeonProxyApiRegistrar) {
        Intrinsics.checkNotNullParameter(androidWebkitLibraryPigeonProxyApiRegistrar, "pigeonRegistrar");
        this.pigeonRegistrar = androidWebkitLibraryPigeonProxyApiRegistrar;
    }

    public AndroidWebkitLibraryPigeonProxyApiRegistrar getPigeonRegistrar() {
        return this.pigeonRegistrar;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\t"}, d2 = {"Lio/flutter/plugins/webviewflutter/PigeonApiWebViewClient$Companion;", "", "()V", "setUpMessageHandlers", "", "binaryMessenger", "Lio/flutter/plugin/common/BinaryMessenger;", "api", "Lio/flutter/plugins/webviewflutter/PigeonApiWebViewClient;", "webview_flutter_android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: AndroidWebkitLibrary.g.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void setUpMessageHandlers(BinaryMessenger binaryMessenger, PigeonApiWebViewClient pigeonApiWebViewClient) {
            MessageCodec<Object> messageCodec;
            AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar;
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            if (pigeonApiWebViewClient == null || (pigeonRegistrar = pigeonApiWebViewClient.getPigeonRegistrar()) == null || (messageCodec = pigeonRegistrar.getCodec()) == null) {
                messageCodec = new AndroidWebkitLibraryPigeonCodec();
            }
            Companion companion = this;
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_defaultConstructor", messageCodec);
            if (pigeonApiWebViewClient != null) {
                basicMessageChannel.setMessageHandler(new PigeonApiWebViewClient$Companion$$ExternalSyntheticLambda0(pigeonApiWebViewClient));
            } else {
                basicMessageChannel.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.setSynchronousReturnValueForShouldOverrideUrlLoading", messageCodec);
            if (pigeonApiWebViewClient != null) {
                basicMessageChannel2.setMessageHandler(new PigeonApiWebViewClient$Companion$$ExternalSyntheticLambda1(pigeonApiWebViewClient));
            } else {
                basicMessageChannel2.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
        }

        /* access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$1$lambda$0(PigeonApiWebViewClient pigeonApiWebViewClient, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
            try {
                pigeonApiWebViewClient.getPigeonRegistrar().getInstanceManager().addDartCreatedInstance(pigeonApiWebViewClient.pigeon_defaultConstructor(), ((Long) obj2).longValue());
                list = CollectionsKt.listOf(null);
            } catch (Throwable th) {
                list = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(list);
        }

        /* access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$3$lambda$2(PigeonApiWebViewClient pigeonApiWebViewClient, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list2 = (List) obj;
            Object obj2 = list2.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.WebViewClient");
            WebViewClient webViewClient = (WebViewClient) obj2;
            Object obj3 = list2.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebViewClient.setSynchronousReturnValueForShouldOverrideUrlLoading(webViewClient, ((Boolean) obj3).booleanValue());
                list = CollectionsKt.listOf(null);
            } catch (Throwable th) {
                list = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(list);
        }
    }

    public final void pigeon_newInstance(WebViewClient webViewClient, Function1<? super Result<Unit>, Unit> function1) {
        Intrinsics.checkNotNullParameter(webViewClient, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(function1, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            Result.Companion companion = Result.Companion;
            function1.invoke(Result.m510boximpl(Result.m511constructorimpl(ResultKt.createFailure(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (getPigeonRegistrar().getInstanceManager().containsInstance(webViewClient)) {
            Result.Companion companion2 = Result.Companion;
            function1.invoke(Result.m510boximpl(Result.m511constructorimpl(Unit.INSTANCE)));
        } else {
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_newInstance", getPigeonRegistrar().getCodec()).send(CollectionsKt.listOf(Long.valueOf(getPigeonRegistrar().getInstanceManager().addHostCreatedInstance(webViewClient))), new PigeonApiWebViewClient$$ExternalSyntheticLambda16(function1, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_newInstance"));
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

    public final void onPageStarted(WebViewClient webViewClient, WebView webView, String str, Function1<? super Result<Unit>, Unit> function1) {
        Intrinsics.checkNotNullParameter(webViewClient, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(webView, "webViewArg");
        Intrinsics.checkNotNullParameter(str, "urlArg");
        Intrinsics.checkNotNullParameter(function1, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            Result.Companion companion = Result.Companion;
            function1.invoke(Result.m510boximpl(Result.m511constructorimpl(ResultKt.createFailure(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
            return;
        }
        new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageStarted", getPigeonRegistrar().getCodec()).send(CollectionsKt.listOf(webViewClient, webView, str), new PigeonApiWebViewClient$$ExternalSyntheticLambda7(function1, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageStarted"));
    }

    /* access modifiers changed from: private */
    public static final void onPageStarted$lambda$1(Function1 function1, String str, Object obj) {
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

    public final void onPageFinished(WebViewClient webViewClient, WebView webView, String str, Function1<? super Result<Unit>, Unit> function1) {
        Intrinsics.checkNotNullParameter(webViewClient, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(webView, "webViewArg");
        Intrinsics.checkNotNullParameter(str, "urlArg");
        Intrinsics.checkNotNullParameter(function1, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            Result.Companion companion = Result.Companion;
            function1.invoke(Result.m510boximpl(Result.m511constructorimpl(ResultKt.createFailure(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
            return;
        }
        new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageFinished", getPigeonRegistrar().getCodec()).send(CollectionsKt.listOf(webViewClient, webView, str), new PigeonApiWebViewClient$$ExternalSyntheticLambda12(function1, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageFinished"));
    }

    /* access modifiers changed from: private */
    public static final void onPageFinished$lambda$2(Function1 function1, String str, Object obj) {
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

    public final void onReceivedHttpError(WebViewClient webViewClient, WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse, Function1<? super Result<Unit>, Unit> function1) {
        Intrinsics.checkNotNullParameter(webViewClient, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(webView, "webViewArg");
        Intrinsics.checkNotNullParameter(webResourceRequest, "requestArg");
        Intrinsics.checkNotNullParameter(webResourceResponse, "responseArg");
        Intrinsics.checkNotNullParameter(function1, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            Result.Companion companion = Result.Companion;
            function1.invoke(Result.m510boximpl(Result.m511constructorimpl(ResultKt.createFailure(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
            return;
        }
        new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpError", getPigeonRegistrar().getCodec()).send(CollectionsKt.listOf(webViewClient, webView, webResourceRequest, webResourceResponse), new PigeonApiWebViewClient$$ExternalSyntheticLambda4(function1, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpError"));
    }

    /* access modifiers changed from: private */
    public static final void onReceivedHttpError$lambda$3(Function1 function1, String str, Object obj) {
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

    public final void onReceivedRequestError(WebViewClient webViewClient, WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError, Function1<? super Result<Unit>, Unit> function1) {
        Intrinsics.checkNotNullParameter(webViewClient, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(webView, "webViewArg");
        Intrinsics.checkNotNullParameter(webResourceRequest, "requestArg");
        Intrinsics.checkNotNullParameter(webResourceError, "errorArg");
        Intrinsics.checkNotNullParameter(function1, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            Result.Companion companion = Result.Companion;
            function1.invoke(Result.m510boximpl(Result.m511constructorimpl(ResultKt.createFailure(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
            return;
        }
        new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedRequestError", getPigeonRegistrar().getCodec()).send(CollectionsKt.listOf(webViewClient, webView, webResourceRequest, webResourceError), new PigeonApiWebViewClient$$ExternalSyntheticLambda11(function1, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedRequestError"));
    }

    /* access modifiers changed from: private */
    public static final void onReceivedRequestError$lambda$4(Function1 function1, String str, Object obj) {
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

    public final void onReceivedRequestErrorCompat(WebViewClient webViewClient, WebView webView, WebResourceRequest webResourceRequest, WebResourceErrorCompat webResourceErrorCompat, Function1<? super Result<Unit>, Unit> function1) {
        Intrinsics.checkNotNullParameter(webViewClient, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(webView, "webViewArg");
        Intrinsics.checkNotNullParameter(webResourceRequest, "requestArg");
        Intrinsics.checkNotNullParameter(webResourceErrorCompat, "errorArg");
        Intrinsics.checkNotNullParameter(function1, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            Result.Companion companion = Result.Companion;
            function1.invoke(Result.m510boximpl(Result.m511constructorimpl(ResultKt.createFailure(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
            return;
        }
        new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedRequestErrorCompat", getPigeonRegistrar().getCodec()).send(CollectionsKt.listOf(webViewClient, webView, webResourceRequest, webResourceErrorCompat), new PigeonApiWebViewClient$$ExternalSyntheticLambda0(function1, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedRequestErrorCompat"));
    }

    /* access modifiers changed from: private */
    public static final void onReceivedRequestErrorCompat$lambda$5(Function1 function1, String str, Object obj) {
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

    public final void onReceivedError(WebViewClient webViewClient, WebView webView, long j, String str, String str2, Function1<? super Result<Unit>, Unit> function1) {
        Intrinsics.checkNotNullParameter(webViewClient, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(webView, "webViewArg");
        Intrinsics.checkNotNullParameter(str, "descriptionArg");
        Intrinsics.checkNotNullParameter(str2, "failingUrlArg");
        Intrinsics.checkNotNullParameter(function1, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            Result.Companion companion = Result.Companion;
            function1.invoke(Result.m510boximpl(Result.m511constructorimpl(ResultKt.createFailure(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
            return;
        }
        new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedError", getPigeonRegistrar().getCodec()).send(CollectionsKt.listOf(webViewClient, webView, Long.valueOf(j), str, str2), new PigeonApiWebViewClient$$ExternalSyntheticLambda13(function1, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedError"));
    }

    /* access modifiers changed from: private */
    public static final void onReceivedError$lambda$6(Function1 function1, String str, Object obj) {
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

    public final void requestLoading(WebViewClient webViewClient, WebView webView, WebResourceRequest webResourceRequest, Function1<? super Result<Unit>, Unit> function1) {
        Intrinsics.checkNotNullParameter(webViewClient, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(webView, "webViewArg");
        Intrinsics.checkNotNullParameter(webResourceRequest, "requestArg");
        Intrinsics.checkNotNullParameter(function1, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            Result.Companion companion = Result.Companion;
            function1.invoke(Result.m510boximpl(Result.m511constructorimpl(ResultKt.createFailure(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
            return;
        }
        new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.requestLoading", getPigeonRegistrar().getCodec()).send(CollectionsKt.listOf(webViewClient, webView, webResourceRequest), new PigeonApiWebViewClient$$ExternalSyntheticLambda9(function1, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.requestLoading"));
    }

    /* access modifiers changed from: private */
    public static final void requestLoading$lambda$7(Function1 function1, String str, Object obj) {
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

    public final void urlLoading(WebViewClient webViewClient, WebView webView, String str, Function1<? super Result<Unit>, Unit> function1) {
        Intrinsics.checkNotNullParameter(webViewClient, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(webView, "webViewArg");
        Intrinsics.checkNotNullParameter(str, "urlArg");
        Intrinsics.checkNotNullParameter(function1, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            Result.Companion companion = Result.Companion;
            function1.invoke(Result.m510boximpl(Result.m511constructorimpl(ResultKt.createFailure(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
            return;
        }
        new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.urlLoading", getPigeonRegistrar().getCodec()).send(CollectionsKt.listOf(webViewClient, webView, str), new PigeonApiWebViewClient$$ExternalSyntheticLambda2(function1, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.urlLoading"));
    }

    /* access modifiers changed from: private */
    public static final void urlLoading$lambda$8(Function1 function1, String str, Object obj) {
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

    public final void doUpdateVisitedHistory(WebViewClient webViewClient, WebView webView, String str, boolean z, Function1<? super Result<Unit>, Unit> function1) {
        Intrinsics.checkNotNullParameter(webViewClient, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(webView, "webViewArg");
        Intrinsics.checkNotNullParameter(str, "urlArg");
        Intrinsics.checkNotNullParameter(function1, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            Result.Companion companion = Result.Companion;
            function1.invoke(Result.m510boximpl(Result.m511constructorimpl(ResultKt.createFailure(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
            return;
        }
        new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.doUpdateVisitedHistory", getPigeonRegistrar().getCodec()).send(CollectionsKt.listOf(webViewClient, webView, str, Boolean.valueOf(z)), new PigeonApiWebViewClient$$ExternalSyntheticLambda3(function1, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.doUpdateVisitedHistory"));
    }

    /* access modifiers changed from: private */
    public static final void doUpdateVisitedHistory$lambda$9(Function1 function1, String str, Object obj) {
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

    public final void onReceivedHttpAuthRequest(WebViewClient webViewClient, WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2, Function1<? super Result<Unit>, Unit> function1) {
        Intrinsics.checkNotNullParameter(webViewClient, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(webView, "webViewArg");
        Intrinsics.checkNotNullParameter(httpAuthHandler, "handlerArg");
        Intrinsics.checkNotNullParameter(str, "hostArg");
        Intrinsics.checkNotNullParameter(str2, "realmArg");
        Intrinsics.checkNotNullParameter(function1, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            Result.Companion companion = Result.Companion;
            function1.invoke(Result.m510boximpl(Result.m511constructorimpl(ResultKt.createFailure(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
            return;
        }
        new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpAuthRequest", getPigeonRegistrar().getCodec()).send(CollectionsKt.listOf(webViewClient, webView, httpAuthHandler, str, str2), new PigeonApiWebViewClient$$ExternalSyntheticLambda14(function1, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpAuthRequest"));
    }

    /* access modifiers changed from: private */
    public static final void onReceivedHttpAuthRequest$lambda$10(Function1 function1, String str, Object obj) {
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

    public final void onFormResubmission(WebViewClient webViewClient, WebView webView, Message message, Message message2, Function1<? super Result<Unit>, Unit> function1) {
        Intrinsics.checkNotNullParameter(webViewClient, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(webView, "viewArg");
        Intrinsics.checkNotNullParameter(message, "dontResendArg");
        Intrinsics.checkNotNullParameter(message2, "resendArg");
        Intrinsics.checkNotNullParameter(function1, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            Result.Companion companion = Result.Companion;
            function1.invoke(Result.m510boximpl(Result.m511constructorimpl(ResultKt.createFailure(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
            return;
        }
        new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onFormResubmission", getPigeonRegistrar().getCodec()).send(CollectionsKt.listOf(webViewClient, webView, message, message2), new PigeonApiWebViewClient$$ExternalSyntheticLambda15(function1, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onFormResubmission"));
    }

    /* access modifiers changed from: private */
    public static final void onFormResubmission$lambda$11(Function1 function1, String str, Object obj) {
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

    public final void onLoadResource(WebViewClient webViewClient, WebView webView, String str, Function1<? super Result<Unit>, Unit> function1) {
        Intrinsics.checkNotNullParameter(webViewClient, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(webView, "viewArg");
        Intrinsics.checkNotNullParameter(str, "urlArg");
        Intrinsics.checkNotNullParameter(function1, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            Result.Companion companion = Result.Companion;
            function1.invoke(Result.m510boximpl(Result.m511constructorimpl(ResultKt.createFailure(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
            return;
        }
        new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onLoadResource", getPigeonRegistrar().getCodec()).send(CollectionsKt.listOf(webViewClient, webView, str), new PigeonApiWebViewClient$$ExternalSyntheticLambda5(function1, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onLoadResource"));
    }

    /* access modifiers changed from: private */
    public static final void onLoadResource$lambda$12(Function1 function1, String str, Object obj) {
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

    public final void onPageCommitVisible(WebViewClient webViewClient, WebView webView, String str, Function1<? super Result<Unit>, Unit> function1) {
        Intrinsics.checkNotNullParameter(webViewClient, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(webView, "viewArg");
        Intrinsics.checkNotNullParameter(str, "urlArg");
        Intrinsics.checkNotNullParameter(function1, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            Result.Companion companion = Result.Companion;
            function1.invoke(Result.m510boximpl(Result.m511constructorimpl(ResultKt.createFailure(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
            return;
        }
        new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageCommitVisible", getPigeonRegistrar().getCodec()).send(CollectionsKt.listOf(webViewClient, webView, str), new PigeonApiWebViewClient$$ExternalSyntheticLambda10(function1, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageCommitVisible"));
    }

    /* access modifiers changed from: private */
    public static final void onPageCommitVisible$lambda$13(Function1 function1, String str, Object obj) {
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

    public final void onReceivedClientCertRequest(WebViewClient webViewClient, WebView webView, ClientCertRequest clientCertRequest, Function1<? super Result<Unit>, Unit> function1) {
        Intrinsics.checkNotNullParameter(webViewClient, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(webView, "viewArg");
        Intrinsics.checkNotNullParameter(clientCertRequest, "requestArg");
        Intrinsics.checkNotNullParameter(function1, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            Result.Companion companion = Result.Companion;
            function1.invoke(Result.m510boximpl(Result.m511constructorimpl(ResultKt.createFailure(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
            return;
        }
        new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedClientCertRequest", getPigeonRegistrar().getCodec()).send(CollectionsKt.listOf(webViewClient, webView, clientCertRequest), new PigeonApiWebViewClient$$ExternalSyntheticLambda8(function1, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedClientCertRequest"));
    }

    /* access modifiers changed from: private */
    public static final void onReceivedClientCertRequest$lambda$14(Function1 function1, String str, Object obj) {
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

    public final void onReceivedLoginRequest(WebViewClient webViewClient, WebView webView, String str, String str2, String str3, Function1<? super Result<Unit>, Unit> function1) {
        Intrinsics.checkNotNullParameter(webViewClient, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(webView, "viewArg");
        Intrinsics.checkNotNullParameter(str, "realmArg");
        Intrinsics.checkNotNullParameter(str3, "argsArg");
        Intrinsics.checkNotNullParameter(function1, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            Result.Companion companion = Result.Companion;
            function1.invoke(Result.m510boximpl(Result.m511constructorimpl(ResultKt.createFailure(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
            return;
        }
        new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedLoginRequest", getPigeonRegistrar().getCodec()).send(CollectionsKt.listOf(webViewClient, webView, str, str2, str3), new PigeonApiWebViewClient$$ExternalSyntheticLambda6(function1, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedLoginRequest"));
    }

    /* access modifiers changed from: private */
    public static final void onReceivedLoginRequest$lambda$15(Function1 function1, String str, Object obj) {
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

    public final void onReceivedSslError(WebViewClient webViewClient, WebView webView, SslErrorHandler sslErrorHandler, SslError sslError, Function1<? super Result<Unit>, Unit> function1) {
        Intrinsics.checkNotNullParameter(webViewClient, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(webView, "viewArg");
        Intrinsics.checkNotNullParameter(sslErrorHandler, "handlerArg");
        Intrinsics.checkNotNullParameter(sslError, "errorArg");
        Intrinsics.checkNotNullParameter(function1, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            Result.Companion companion = Result.Companion;
            function1.invoke(Result.m510boximpl(Result.m511constructorimpl(ResultKt.createFailure(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
            return;
        }
        new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedSslError", getPigeonRegistrar().getCodec()).send(CollectionsKt.listOf(webViewClient, webView, sslErrorHandler, sslError), new PigeonApiWebViewClient$$ExternalSyntheticLambda17(function1, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedSslError"));
    }

    /* access modifiers changed from: private */
    public static final void onReceivedSslError$lambda$16(Function1 function1, String str, Object obj) {
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

    public final void onScaleChanged(WebViewClient webViewClient, WebView webView, double d, double d2, Function1<? super Result<Unit>, Unit> function1) {
        Intrinsics.checkNotNullParameter(webViewClient, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(webView, "viewArg");
        Intrinsics.checkNotNullParameter(function1, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            Result.Companion companion = Result.Companion;
            function1.invoke(Result.m510boximpl(Result.m511constructorimpl(ResultKt.createFailure(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
            return;
        }
        new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onScaleChanged", getPigeonRegistrar().getCodec()).send(CollectionsKt.listOf(webViewClient, webView, Double.valueOf(d), Double.valueOf(d2)), new PigeonApiWebViewClient$$ExternalSyntheticLambda1(function1, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onScaleChanged"));
    }

    /* access modifiers changed from: private */
    public static final void onScaleChanged$lambda$17(Function1 function1, String str, Object obj) {
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
