package io.flutter.plugins.webviewflutter;

import android.webkit.WebSettings;
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

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\b&\u0018\u0000 -2\u00020\u0001:\u0001-B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J+\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0010\u0012\u0004\u0012\u00020\f0\u000fø\u0001\u0000J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H&J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H&J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H&J\u0018\u0010\u0016\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H&J\u0018\u0010\u0017\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0013H&J\u0018\u0010\u0019\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H&J\u0018\u0010\u001a\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0013H&J\u0018\u0010\u001b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0013H&J\u0018\u0010\u001c\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u0013H&J\u0018\u0010\u001e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u0013H&J\u0018\u0010 \u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010!\u001a\u00020\"H&J\u0018\u0010#\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u0013H&J\u0018\u0010%\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u0013H&J\u0018\u0010&\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010'\u001a\u00020(H&J\u0018\u0010)\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010*\u001a\u00020\u0013H&J\u001a\u0010+\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\b\u0010,\u001a\u0004\u0018\u00010\bH&R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006."}, d2 = {"Lio/flutter/plugins/webviewflutter/PigeonApiWebSettings;", "", "pigeonRegistrar", "Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;", "(Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;)V", "getPigeonRegistrar", "()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;", "getUserAgentString", "", "pigeon_instance", "Landroid/webkit/WebSettings;", "pigeon_newInstance", "", "pigeon_instanceArg", "callback", "Lkotlin/Function1;", "Lkotlin/Result;", "setAllowContentAccess", "enabled", "", "setAllowFileAccess", "setBuiltInZoomControls", "setDisplayZoomControls", "setDomStorageEnabled", "flag", "setGeolocationEnabled", "setJavaScriptCanOpenWindowsAutomatically", "setJavaScriptEnabled", "setLoadWithOverviewMode", "overview", "setMediaPlaybackRequiresUserGesture", "require", "setMixedContentMode", "mode", "Lio/flutter/plugins/webviewflutter/MixedContentMode;", "setSupportMultipleWindows", "support", "setSupportZoom", "setTextZoom", "textZoom", "", "setUseWideViewPort", "use", "setUserAgentString", "userAgentString", "Companion", "webview_flutter_android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: AndroidWebkitLibrary.g.kt */
public abstract class PigeonApiWebSettings {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar;

    public abstract String getUserAgentString(WebSettings webSettings);

    public abstract void setAllowContentAccess(WebSettings webSettings, boolean z);

    public abstract void setAllowFileAccess(WebSettings webSettings, boolean z);

    public abstract void setBuiltInZoomControls(WebSettings webSettings, boolean z);

    public abstract void setDisplayZoomControls(WebSettings webSettings, boolean z);

    public abstract void setDomStorageEnabled(WebSettings webSettings, boolean z);

    public abstract void setGeolocationEnabled(WebSettings webSettings, boolean z);

    public abstract void setJavaScriptCanOpenWindowsAutomatically(WebSettings webSettings, boolean z);

    public abstract void setJavaScriptEnabled(WebSettings webSettings, boolean z);

    public abstract void setLoadWithOverviewMode(WebSettings webSettings, boolean z);

    public abstract void setMediaPlaybackRequiresUserGesture(WebSettings webSettings, boolean z);

    public abstract void setMixedContentMode(WebSettings webSettings, MixedContentMode mixedContentMode);

    public abstract void setSupportMultipleWindows(WebSettings webSettings, boolean z);

    public abstract void setSupportZoom(WebSettings webSettings, boolean z);

    public abstract void setTextZoom(WebSettings webSettings, long j);

    public abstract void setUseWideViewPort(WebSettings webSettings, boolean z);

    public abstract void setUserAgentString(WebSettings webSettings, String str);

    public PigeonApiWebSettings(AndroidWebkitLibraryPigeonProxyApiRegistrar androidWebkitLibraryPigeonProxyApiRegistrar) {
        Intrinsics.checkNotNullParameter(androidWebkitLibraryPigeonProxyApiRegistrar, "pigeonRegistrar");
        this.pigeonRegistrar = androidWebkitLibraryPigeonProxyApiRegistrar;
    }

    public AndroidWebkitLibraryPigeonProxyApiRegistrar getPigeonRegistrar() {
        return this.pigeonRegistrar;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\t"}, d2 = {"Lio/flutter/plugins/webviewflutter/PigeonApiWebSettings$Companion;", "", "()V", "setUpMessageHandlers", "", "binaryMessenger", "Lio/flutter/plugin/common/BinaryMessenger;", "api", "Lio/flutter/plugins/webviewflutter/PigeonApiWebSettings;", "webview_flutter_android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: AndroidWebkitLibrary.g.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void setUpMessageHandlers(BinaryMessenger binaryMessenger, PigeonApiWebSettings pigeonApiWebSettings) {
            MessageCodec<Object> messageCodec;
            AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar;
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            if (pigeonApiWebSettings == null || (pigeonRegistrar = pigeonApiWebSettings.getPigeonRegistrar()) == null || (messageCodec = pigeonRegistrar.getCodec()) == null) {
                messageCodec = new AndroidWebkitLibraryPigeonCodec();
            }
            Companion companion = this;
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setDomStorageEnabled", messageCodec);
            if (pigeonApiWebSettings != null) {
                basicMessageChannel.setMessageHandler(new PigeonApiWebSettings$Companion$$ExternalSyntheticLambda0(pigeonApiWebSettings));
            } else {
                basicMessageChannel.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setJavaScriptCanOpenWindowsAutomatically", messageCodec);
            if (pigeonApiWebSettings != null) {
                basicMessageChannel2.setMessageHandler(new PigeonApiWebSettings$Companion$$ExternalSyntheticLambda15(pigeonApiWebSettings));
            } else {
                basicMessageChannel2.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setSupportMultipleWindows", messageCodec);
            if (pigeonApiWebSettings != null) {
                basicMessageChannel3.setMessageHandler(new PigeonApiWebSettings$Companion$$ExternalSyntheticLambda16(pigeonApiWebSettings));
            } else {
                basicMessageChannel3.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setJavaScriptEnabled", messageCodec);
            if (pigeonApiWebSettings != null) {
                basicMessageChannel4.setMessageHandler(new PigeonApiWebSettings$Companion$$ExternalSyntheticLambda1(pigeonApiWebSettings));
            } else {
                basicMessageChannel4.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setUserAgentString", messageCodec);
            if (pigeonApiWebSettings != null) {
                basicMessageChannel5.setMessageHandler(new PigeonApiWebSettings$Companion$$ExternalSyntheticLambda2(pigeonApiWebSettings));
            } else {
                basicMessageChannel5.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setMediaPlaybackRequiresUserGesture", messageCodec);
            if (pigeonApiWebSettings != null) {
                basicMessageChannel6.setMessageHandler(new PigeonApiWebSettings$Companion$$ExternalSyntheticLambda3(pigeonApiWebSettings));
            } else {
                basicMessageChannel6.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setSupportZoom", messageCodec);
            if (pigeonApiWebSettings != null) {
                basicMessageChannel7.setMessageHandler(new PigeonApiWebSettings$Companion$$ExternalSyntheticLambda4(pigeonApiWebSettings));
            } else {
                basicMessageChannel7.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setLoadWithOverviewMode", messageCodec);
            if (pigeonApiWebSettings != null) {
                basicMessageChannel8.setMessageHandler(new PigeonApiWebSettings$Companion$$ExternalSyntheticLambda5(pigeonApiWebSettings));
            } else {
                basicMessageChannel8.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel9 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setUseWideViewPort", messageCodec);
            if (pigeonApiWebSettings != null) {
                basicMessageChannel9.setMessageHandler(new PigeonApiWebSettings$Companion$$ExternalSyntheticLambda6(pigeonApiWebSettings));
            } else {
                basicMessageChannel9.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel10 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setDisplayZoomControls", messageCodec);
            if (pigeonApiWebSettings != null) {
                basicMessageChannel10.setMessageHandler(new PigeonApiWebSettings$Companion$$ExternalSyntheticLambda7(pigeonApiWebSettings));
            } else {
                basicMessageChannel10.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel11 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setBuiltInZoomControls", messageCodec);
            if (pigeonApiWebSettings != null) {
                basicMessageChannel11.setMessageHandler(new PigeonApiWebSettings$Companion$$ExternalSyntheticLambda8(pigeonApiWebSettings));
            } else {
                basicMessageChannel11.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel12 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setAllowFileAccess", messageCodec);
            if (pigeonApiWebSettings != null) {
                basicMessageChannel12.setMessageHandler(new PigeonApiWebSettings$Companion$$ExternalSyntheticLambda9(pigeonApiWebSettings));
            } else {
                basicMessageChannel12.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel13 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setAllowContentAccess", messageCodec);
            if (pigeonApiWebSettings != null) {
                basicMessageChannel13.setMessageHandler(new PigeonApiWebSettings$Companion$$ExternalSyntheticLambda10(pigeonApiWebSettings));
            } else {
                basicMessageChannel13.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel14 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setGeolocationEnabled", messageCodec);
            if (pigeonApiWebSettings != null) {
                basicMessageChannel14.setMessageHandler(new PigeonApiWebSettings$Companion$$ExternalSyntheticLambda11(pigeonApiWebSettings));
            } else {
                basicMessageChannel14.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel15 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setTextZoom", messageCodec);
            if (pigeonApiWebSettings != null) {
                basicMessageChannel15.setMessageHandler(new PigeonApiWebSettings$Companion$$ExternalSyntheticLambda12(pigeonApiWebSettings));
            } else {
                basicMessageChannel15.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel16 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.getUserAgentString", messageCodec);
            if (pigeonApiWebSettings != null) {
                basicMessageChannel16.setMessageHandler(new PigeonApiWebSettings$Companion$$ExternalSyntheticLambda13(pigeonApiWebSettings));
            } else {
                basicMessageChannel16.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel17 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setMixedContentMode", messageCodec);
            if (pigeonApiWebSettings != null) {
                basicMessageChannel17.setMessageHandler(new PigeonApiWebSettings$Companion$$ExternalSyntheticLambda14(pigeonApiWebSettings));
            } else {
                basicMessageChannel17.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
        }

        /* access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$1$lambda$0(PigeonApiWebSettings pigeonApiWebSettings, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list2 = (List) obj;
            Object obj2 = list2.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            WebSettings webSettings = (WebSettings) obj2;
            Object obj3 = list2.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebSettings.setDomStorageEnabled(webSettings, ((Boolean) obj3).booleanValue());
                list = CollectionsKt.listOf(null);
            } catch (Throwable th) {
                list = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(list);
        }

        /* access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$3$lambda$2(PigeonApiWebSettings pigeonApiWebSettings, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list2 = (List) obj;
            Object obj2 = list2.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            WebSettings webSettings = (WebSettings) obj2;
            Object obj3 = list2.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebSettings.setJavaScriptCanOpenWindowsAutomatically(webSettings, ((Boolean) obj3).booleanValue());
                list = CollectionsKt.listOf(null);
            } catch (Throwable th) {
                list = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(list);
        }

        /* access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$5$lambda$4(PigeonApiWebSettings pigeonApiWebSettings, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list2 = (List) obj;
            Object obj2 = list2.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            WebSettings webSettings = (WebSettings) obj2;
            Object obj3 = list2.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebSettings.setSupportMultipleWindows(webSettings, ((Boolean) obj3).booleanValue());
                list = CollectionsKt.listOf(null);
            } catch (Throwable th) {
                list = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(list);
        }

        /* access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$7$lambda$6(PigeonApiWebSettings pigeonApiWebSettings, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list2 = (List) obj;
            Object obj2 = list2.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            WebSettings webSettings = (WebSettings) obj2;
            Object obj3 = list2.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebSettings.setJavaScriptEnabled(webSettings, ((Boolean) obj3).booleanValue());
                list = CollectionsKt.listOf(null);
            } catch (Throwable th) {
                list = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(list);
        }

        /* access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$9$lambda$8(PigeonApiWebSettings pigeonApiWebSettings, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list2 = (List) obj;
            Object obj2 = list2.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            try {
                pigeonApiWebSettings.setUserAgentString((WebSettings) obj2, (String) list2.get(1));
                list = CollectionsKt.listOf(null);
            } catch (Throwable th) {
                list = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(list);
        }

        /* access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$11$lambda$10(PigeonApiWebSettings pigeonApiWebSettings, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list2 = (List) obj;
            Object obj2 = list2.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            WebSettings webSettings = (WebSettings) obj2;
            Object obj3 = list2.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebSettings.setMediaPlaybackRequiresUserGesture(webSettings, ((Boolean) obj3).booleanValue());
                list = CollectionsKt.listOf(null);
            } catch (Throwable th) {
                list = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(list);
        }

        /* access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$13$lambda$12(PigeonApiWebSettings pigeonApiWebSettings, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list2 = (List) obj;
            Object obj2 = list2.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            WebSettings webSettings = (WebSettings) obj2;
            Object obj3 = list2.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebSettings.setSupportZoom(webSettings, ((Boolean) obj3).booleanValue());
                list = CollectionsKt.listOf(null);
            } catch (Throwable th) {
                list = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(list);
        }

        /* access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$15$lambda$14(PigeonApiWebSettings pigeonApiWebSettings, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list2 = (List) obj;
            Object obj2 = list2.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            WebSettings webSettings = (WebSettings) obj2;
            Object obj3 = list2.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebSettings.setLoadWithOverviewMode(webSettings, ((Boolean) obj3).booleanValue());
                list = CollectionsKt.listOf(null);
            } catch (Throwable th) {
                list = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(list);
        }

        /* access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$17$lambda$16(PigeonApiWebSettings pigeonApiWebSettings, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list2 = (List) obj;
            Object obj2 = list2.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            WebSettings webSettings = (WebSettings) obj2;
            Object obj3 = list2.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebSettings.setUseWideViewPort(webSettings, ((Boolean) obj3).booleanValue());
                list = CollectionsKt.listOf(null);
            } catch (Throwable th) {
                list = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(list);
        }

        /* access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$19$lambda$18(PigeonApiWebSettings pigeonApiWebSettings, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list2 = (List) obj;
            Object obj2 = list2.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            WebSettings webSettings = (WebSettings) obj2;
            Object obj3 = list2.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebSettings.setDisplayZoomControls(webSettings, ((Boolean) obj3).booleanValue());
                list = CollectionsKt.listOf(null);
            } catch (Throwable th) {
                list = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(list);
        }

        /* access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$21$lambda$20(PigeonApiWebSettings pigeonApiWebSettings, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list2 = (List) obj;
            Object obj2 = list2.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            WebSettings webSettings = (WebSettings) obj2;
            Object obj3 = list2.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebSettings.setBuiltInZoomControls(webSettings, ((Boolean) obj3).booleanValue());
                list = CollectionsKt.listOf(null);
            } catch (Throwable th) {
                list = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(list);
        }

        /* access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$23$lambda$22(PigeonApiWebSettings pigeonApiWebSettings, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list2 = (List) obj;
            Object obj2 = list2.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            WebSettings webSettings = (WebSettings) obj2;
            Object obj3 = list2.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebSettings.setAllowFileAccess(webSettings, ((Boolean) obj3).booleanValue());
                list = CollectionsKt.listOf(null);
            } catch (Throwable th) {
                list = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(list);
        }

        /* access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$25$lambda$24(PigeonApiWebSettings pigeonApiWebSettings, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list2 = (List) obj;
            Object obj2 = list2.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            WebSettings webSettings = (WebSettings) obj2;
            Object obj3 = list2.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebSettings.setAllowContentAccess(webSettings, ((Boolean) obj3).booleanValue());
                list = CollectionsKt.listOf(null);
            } catch (Throwable th) {
                list = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(list);
        }

        /* access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$27$lambda$26(PigeonApiWebSettings pigeonApiWebSettings, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list2 = (List) obj;
            Object obj2 = list2.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            WebSettings webSettings = (WebSettings) obj2;
            Object obj3 = list2.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebSettings.setGeolocationEnabled(webSettings, ((Boolean) obj3).booleanValue());
                list = CollectionsKt.listOf(null);
            } catch (Throwable th) {
                list = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(list);
        }

        /* access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$29$lambda$28(PigeonApiWebSettings pigeonApiWebSettings, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list2 = (List) obj;
            Object obj2 = list2.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            WebSettings webSettings = (WebSettings) obj2;
            Object obj3 = list2.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Long");
            try {
                pigeonApiWebSettings.setTextZoom(webSettings, ((Long) obj3).longValue());
                list = CollectionsKt.listOf(null);
            } catch (Throwable th) {
                list = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(list);
        }

        /* access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$31$lambda$30(PigeonApiWebSettings pigeonApiWebSettings, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            try {
                list = CollectionsKt.listOf(pigeonApiWebSettings.getUserAgentString((WebSettings) obj2));
            } catch (Throwable th) {
                list = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(list);
        }

        /* access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$33$lambda$32(PigeonApiWebSettings pigeonApiWebSettings, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list2 = (List) obj;
            Object obj2 = list2.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
            WebSettings webSettings = (WebSettings) obj2;
            Object obj3 = list2.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
            try {
                pigeonApiWebSettings.setMixedContentMode(webSettings, (MixedContentMode) obj3);
                list = CollectionsKt.listOf(null);
            } catch (Throwable th) {
                list = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(list);
        }
    }

    public final void pigeon_newInstance(WebSettings webSettings, Function1<? super Result<Unit>, Unit> function1) {
        Intrinsics.checkNotNullParameter(webSettings, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(function1, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            Result.Companion companion = Result.Companion;
            function1.invoke(Result.m510boximpl(Result.m511constructorimpl(ResultKt.createFailure(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (getPigeonRegistrar().getInstanceManager().containsInstance(webSettings)) {
            Result.Companion companion2 = Result.Companion;
            function1.invoke(Result.m510boximpl(Result.m511constructorimpl(Unit.INSTANCE)));
        } else {
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebSettings.pigeon_newInstance", getPigeonRegistrar().getCodec()).send(CollectionsKt.listOf(Long.valueOf(getPigeonRegistrar().getInstanceManager().addHostCreatedInstance(webSettings))), new PigeonApiWebSettings$$ExternalSyntheticLambda0(function1, "dev.flutter.pigeon.webview_flutter_android.WebSettings.pigeon_newInstance"));
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
