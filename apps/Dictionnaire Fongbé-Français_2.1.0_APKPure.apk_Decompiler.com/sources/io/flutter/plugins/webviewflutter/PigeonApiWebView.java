package io.flutter.plugins.webviewflutter;

import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugins.webviewflutter.WebChromeClientProxyApi;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 F2\u00020\u0001:\u0001FB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH&J\u0018\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u000eH&J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J7\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00152\u001a\u0010\u0016\u001a\u0016\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0018\u0012\u0004\u0012\u00020\b0\u0017H&ø\u0001\u0000J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u00152\u0006\u0010\t\u001a\u00020\nH&J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u00152\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u001b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u001c\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J,\u0010\u001d\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010\u00152\b\u0010 \u001a\u0004\u0018\u00010\u0015H&J@\u0010!\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001e\u001a\u00020\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010\u00152\b\u0010 \u001a\u0004\u0018\u00010\u00152\b\u0010#\u001a\u0004\u0018\u00010\u0015H&J,\u0010$\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u00152\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150'H&JK\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020\n2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+2\u0006\u0010.\u001a\u00020+2\u0018\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0018\u0012\u0004\u0012\u00020\b0\u0017ø\u0001\u0000J\b\u0010/\u001a\u00020\nH&J\u0006\u00100\u001a\u000201J+\u00102\u001a\u00020\b2\u0006\u0010)\u001a\u00020\n2\u0018\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0018\u0012\u0004\u0012\u00020\b0\u0017ø\u0001\u0000J \u00103\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u000204H&J\u0010\u00105\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u0018\u00106\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u00107\u001a\u00020\u0015H&J\u0018\u00108\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u00109\u001a\u00020+H&J\u001a\u0010:\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010;\u001a\u0004\u0018\u00010<H&J\u001a\u0010=\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010>\u001a\u0004\u0018\u00010?H&J\u0010\u0010@\u001a\u00020\b2\u0006\u0010A\u001a\u00020\u000eH&J\u001a\u0010B\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010>\u001a\u0004\u0018\u00010CH&J\u0010\u0010D\u001a\u00020E2\u0006\u0010\t\u001a\u00020\nH&R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006G"}, d2 = {"Lio/flutter/plugins/webviewflutter/PigeonApiWebView;", "", "pigeonRegistrar", "Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;", "(Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;)V", "getPigeonRegistrar", "()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;", "addJavaScriptChannel", "", "pigeon_instance", "Landroid/webkit/WebView;", "channel", "Lio/flutter/plugins/webviewflutter/JavaScriptChannel;", "canGoBack", "", "canGoForward", "clearCache", "includeDiskFiles", "destroy", "evaluateJavascript", "javascriptString", "", "callback", "Lkotlin/Function1;", "Lkotlin/Result;", "getTitle", "getUrl", "goBack", "goForward", "loadData", "data", "mimeType", "encoding", "loadDataWithBaseUrl", "baseUrl", "historyUrl", "loadUrl", "url", "headers", "", "onScrollChanged", "pigeon_instanceArg", "leftArg", "", "topArg", "oldLeftArg", "oldTopArg", "pigeon_defaultConstructor", "pigeon_getPigeonApiView", "Lio/flutter/plugins/webviewflutter/PigeonApiView;", "pigeon_newInstance", "postUrl", "", "reload", "removeJavaScriptChannel", "name", "setBackgroundColor", "color", "setDownloadListener", "listener", "Landroid/webkit/DownloadListener;", "setWebChromeClient", "client", "Lio/flutter/plugins/webviewflutter/WebChromeClientProxyApi$WebChromeClientImpl;", "setWebContentsDebuggingEnabled", "enabled", "setWebViewClient", "Landroid/webkit/WebViewClient;", "settings", "Landroid/webkit/WebSettings;", "Companion", "webview_flutter_android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: AndroidWebkitLibrary.g.kt */
public abstract class PigeonApiWebView {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar;

    public abstract void addJavaScriptChannel(WebView webView, JavaScriptChannel javaScriptChannel);

    public abstract boolean canGoBack(WebView webView);

    public abstract boolean canGoForward(WebView webView);

    public abstract void clearCache(WebView webView, boolean z);

    public abstract void destroy(WebView webView);

    public abstract void evaluateJavascript(WebView webView, String str, Function1<? super Result<String>, Unit> function1);

    public abstract String getTitle(WebView webView);

    public abstract String getUrl(WebView webView);

    public abstract void goBack(WebView webView);

    public abstract void goForward(WebView webView);

    public abstract void loadData(WebView webView, String str, String str2, String str3);

    public abstract void loadDataWithBaseUrl(WebView webView, String str, String str2, String str3, String str4, String str5);

    public abstract void loadUrl(WebView webView, String str, Map<String, String> map);

    public abstract WebView pigeon_defaultConstructor();

    public abstract void postUrl(WebView webView, String str, byte[] bArr);

    public abstract void reload(WebView webView);

    public abstract void removeJavaScriptChannel(WebView webView, String str);

    public abstract void setBackgroundColor(WebView webView, long j);

    public abstract void setDownloadListener(WebView webView, DownloadListener downloadListener);

    public abstract void setWebChromeClient(WebView webView, WebChromeClientProxyApi.WebChromeClientImpl webChromeClientImpl);

    public abstract void setWebContentsDebuggingEnabled(boolean z);

    public abstract void setWebViewClient(WebView webView, WebViewClient webViewClient);

    public abstract WebSettings settings(WebView webView);

    public PigeonApiWebView(AndroidWebkitLibraryPigeonProxyApiRegistrar androidWebkitLibraryPigeonProxyApiRegistrar) {
        Intrinsics.checkNotNullParameter(androidWebkitLibraryPigeonProxyApiRegistrar, "pigeonRegistrar");
        this.pigeonRegistrar = androidWebkitLibraryPigeonProxyApiRegistrar;
    }

    public AndroidWebkitLibraryPigeonProxyApiRegistrar getPigeonRegistrar() {
        return this.pigeonRegistrar;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\t"}, d2 = {"Lio/flutter/plugins/webviewflutter/PigeonApiWebView$Companion;", "", "()V", "setUpMessageHandlers", "", "binaryMessenger", "Lio/flutter/plugin/common/BinaryMessenger;", "api", "Lio/flutter/plugins/webviewflutter/PigeonApiWebView;", "webview_flutter_android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: AndroidWebkitLibrary.g.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void setUpMessageHandlers(BinaryMessenger binaryMessenger, PigeonApiWebView pigeonApiWebView) {
            MessageCodec<Object> messageCodec;
            AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar;
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            if (pigeonApiWebView == null || (pigeonRegistrar = pigeonApiWebView.getPigeonRegistrar()) == null || (messageCodec = pigeonRegistrar.getCodec()) == null) {
                messageCodec = new AndroidWebkitLibraryPigeonCodec();
            }
            Companion companion = this;
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.pigeon_defaultConstructor", messageCodec);
            if (pigeonApiWebView != null) {
                basicMessageChannel.setMessageHandler(new PigeonApiWebView$Companion$$ExternalSyntheticLambda0(pigeonApiWebView));
            } else {
                basicMessageChannel.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.settings", messageCodec);
            if (pigeonApiWebView != null) {
                basicMessageChannel2.setMessageHandler(new PigeonApiWebView$Companion$$ExternalSyntheticLambda2(pigeonApiWebView));
            } else {
                basicMessageChannel2.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.loadData", messageCodec);
            if (pigeonApiWebView != null) {
                basicMessageChannel3.setMessageHandler(new PigeonApiWebView$Companion$$ExternalSyntheticLambda6(pigeonApiWebView));
            } else {
                basicMessageChannel3.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.loadDataWithBaseUrl", messageCodec);
            if (pigeonApiWebView != null) {
                basicMessageChannel4.setMessageHandler(new PigeonApiWebView$Companion$$ExternalSyntheticLambda7(pigeonApiWebView));
            } else {
                basicMessageChannel4.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.loadUrl", messageCodec);
            if (pigeonApiWebView != null) {
                basicMessageChannel5.setMessageHandler(new PigeonApiWebView$Companion$$ExternalSyntheticLambda8(pigeonApiWebView));
            } else {
                basicMessageChannel5.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.postUrl", messageCodec);
            if (pigeonApiWebView != null) {
                basicMessageChannel6.setMessageHandler(new PigeonApiWebView$Companion$$ExternalSyntheticLambda9(pigeonApiWebView));
            } else {
                basicMessageChannel6.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.getUrl", messageCodec);
            if (pigeonApiWebView != null) {
                basicMessageChannel7.setMessageHandler(new PigeonApiWebView$Companion$$ExternalSyntheticLambda10(pigeonApiWebView));
            } else {
                basicMessageChannel7.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.canGoBack", messageCodec);
            if (pigeonApiWebView != null) {
                basicMessageChannel8.setMessageHandler(new PigeonApiWebView$Companion$$ExternalSyntheticLambda12(pigeonApiWebView));
            } else {
                basicMessageChannel8.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel9 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.canGoForward", messageCodec);
            if (pigeonApiWebView != null) {
                basicMessageChannel9.setMessageHandler(new PigeonApiWebView$Companion$$ExternalSyntheticLambda13(pigeonApiWebView));
            } else {
                basicMessageChannel9.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel10 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.goBack", messageCodec);
            if (pigeonApiWebView != null) {
                basicMessageChannel10.setMessageHandler(new PigeonApiWebView$Companion$$ExternalSyntheticLambda14(pigeonApiWebView));
            } else {
                basicMessageChannel10.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel11 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.goForward", messageCodec);
            if (pigeonApiWebView != null) {
                basicMessageChannel11.setMessageHandler(new PigeonApiWebView$Companion$$ExternalSyntheticLambda11(pigeonApiWebView));
            } else {
                basicMessageChannel11.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel12 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.reload", messageCodec);
            if (pigeonApiWebView != null) {
                basicMessageChannel12.setMessageHandler(new PigeonApiWebView$Companion$$ExternalSyntheticLambda15(pigeonApiWebView));
            } else {
                basicMessageChannel12.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel13 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.clearCache", messageCodec);
            if (pigeonApiWebView != null) {
                basicMessageChannel13.setMessageHandler(new PigeonApiWebView$Companion$$ExternalSyntheticLambda16(pigeonApiWebView));
            } else {
                basicMessageChannel13.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel14 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.evaluateJavascript", messageCodec);
            if (pigeonApiWebView != null) {
                basicMessageChannel14.setMessageHandler(new PigeonApiWebView$Companion$$ExternalSyntheticLambda17(pigeonApiWebView));
            } else {
                basicMessageChannel14.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel15 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.getTitle", messageCodec);
            if (pigeonApiWebView != null) {
                basicMessageChannel15.setMessageHandler(new PigeonApiWebView$Companion$$ExternalSyntheticLambda18(pigeonApiWebView));
            } else {
                basicMessageChannel15.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel16 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.setWebContentsDebuggingEnabled", messageCodec);
            if (pigeonApiWebView != null) {
                basicMessageChannel16.setMessageHandler(new PigeonApiWebView$Companion$$ExternalSyntheticLambda19(pigeonApiWebView));
            } else {
                basicMessageChannel16.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel17 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.setWebViewClient", messageCodec);
            if (pigeonApiWebView != null) {
                basicMessageChannel17.setMessageHandler(new PigeonApiWebView$Companion$$ExternalSyntheticLambda20(pigeonApiWebView));
            } else {
                basicMessageChannel17.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel18 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.addJavaScriptChannel", messageCodec);
            if (pigeonApiWebView != null) {
                basicMessageChannel18.setMessageHandler(new PigeonApiWebView$Companion$$ExternalSyntheticLambda21(pigeonApiWebView));
            } else {
                basicMessageChannel18.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel19 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.removeJavaScriptChannel", messageCodec);
            if (pigeonApiWebView != null) {
                basicMessageChannel19.setMessageHandler(new PigeonApiWebView$Companion$$ExternalSyntheticLambda22(pigeonApiWebView));
            } else {
                basicMessageChannel19.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel20 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.setDownloadListener", messageCodec);
            if (pigeonApiWebView != null) {
                basicMessageChannel20.setMessageHandler(new PigeonApiWebView$Companion$$ExternalSyntheticLambda1(pigeonApiWebView));
            } else {
                basicMessageChannel20.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel21 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.setWebChromeClient", messageCodec);
            if (pigeonApiWebView != null) {
                basicMessageChannel21.setMessageHandler(new PigeonApiWebView$Companion$$ExternalSyntheticLambda3(pigeonApiWebView));
            } else {
                basicMessageChannel21.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel22 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.setBackgroundColor", messageCodec);
            if (pigeonApiWebView != null) {
                basicMessageChannel22.setMessageHandler(new PigeonApiWebView$Companion$$ExternalSyntheticLambda4(pigeonApiWebView));
            } else {
                basicMessageChannel22.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel23 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.destroy", messageCodec);
            if (pigeonApiWebView != null) {
                basicMessageChannel23.setMessageHandler(new PigeonApiWebView$Companion$$ExternalSyntheticLambda5(pigeonApiWebView));
            } else {
                basicMessageChannel23.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
        }

        /* access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$1$lambda$0(PigeonApiWebView pigeonApiWebView, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
            try {
                pigeonApiWebView.getPigeonRegistrar().getInstanceManager().addDartCreatedInstance(pigeonApiWebView.pigeon_defaultConstructor(), ((Long) obj2).longValue());
                list = CollectionsKt.listOf(null);
            } catch (Throwable th) {
                list = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(list);
        }

        /* access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$3$lambda$2(PigeonApiWebView pigeonApiWebView, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list2 = (List) obj;
            Object obj2 = list2.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            WebView webView = (WebView) obj2;
            Object obj3 = list2.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Long");
            try {
                pigeonApiWebView.getPigeonRegistrar().getInstanceManager().addDartCreatedInstance(pigeonApiWebView.settings(webView), ((Long) obj3).longValue());
                list = CollectionsKt.listOf(null);
            } catch (Throwable th) {
                list = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(list);
        }

        /* access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$5$lambda$4(PigeonApiWebView pigeonApiWebView, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list2 = (List) obj;
            Object obj2 = list2.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            WebView webView = (WebView) obj2;
            Object obj3 = list2.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
            try {
                pigeonApiWebView.loadData(webView, (String) obj3, (String) list2.get(2), (String) list2.get(3));
                list = CollectionsKt.listOf(null);
            } catch (Throwable th) {
                list = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(list);
        }

        /* access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$7$lambda$6(PigeonApiWebView pigeonApiWebView, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list2 = (List) obj;
            Object obj2 = list2.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            WebView webView = (WebView) obj2;
            String str = (String) list2.get(1);
            Object obj3 = list2.get(2);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
            try {
                pigeonApiWebView.loadDataWithBaseUrl(webView, str, (String) obj3, (String) list2.get(3), (String) list2.get(4), (String) list2.get(5));
                list = CollectionsKt.listOf(null);
            } catch (Throwable th) {
                list = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(list);
        }

        /* access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$9$lambda$8(PigeonApiWebView pigeonApiWebView, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list2 = (List) obj;
            Object obj2 = list2.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            WebView webView = (WebView) obj2;
            Object obj3 = list2.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj3;
            Object obj4 = list2.get(2);
            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
            try {
                pigeonApiWebView.loadUrl(webView, str, (Map) obj4);
                list = CollectionsKt.listOf(null);
            } catch (Throwable th) {
                list = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(list);
        }

        /* access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$11$lambda$10(PigeonApiWebView pigeonApiWebView, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list2 = (List) obj;
            Object obj2 = list2.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            WebView webView = (WebView) obj2;
            Object obj3 = list2.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj3;
            Object obj4 = list2.get(2);
            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.ByteArray");
            try {
                pigeonApiWebView.postUrl(webView, str, (byte[]) obj4);
                list = CollectionsKt.listOf(null);
            } catch (Throwable th) {
                list = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(list);
        }

        /* access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$13$lambda$12(PigeonApiWebView pigeonApiWebView, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            try {
                list = CollectionsKt.listOf(pigeonApiWebView.getUrl((WebView) obj2));
            } catch (Throwable th) {
                list = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(list);
        }

        /* access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$15$lambda$14(PigeonApiWebView pigeonApiWebView, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            try {
                list = CollectionsKt.listOf(Boolean.valueOf(pigeonApiWebView.canGoBack((WebView) obj2)));
            } catch (Throwable th) {
                list = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(list);
        }

        /* access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$17$lambda$16(PigeonApiWebView pigeonApiWebView, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            try {
                list = CollectionsKt.listOf(Boolean.valueOf(pigeonApiWebView.canGoForward((WebView) obj2)));
            } catch (Throwable th) {
                list = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(list);
        }

        /* access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$19$lambda$18(PigeonApiWebView pigeonApiWebView, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            try {
                pigeonApiWebView.goBack((WebView) obj2);
                list = CollectionsKt.listOf(null);
            } catch (Throwable th) {
                list = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(list);
        }

        /* access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$21$lambda$20(PigeonApiWebView pigeonApiWebView, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            try {
                pigeonApiWebView.goForward((WebView) obj2);
                list = CollectionsKt.listOf(null);
            } catch (Throwable th) {
                list = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(list);
        }

        /* access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$23$lambda$22(PigeonApiWebView pigeonApiWebView, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            try {
                pigeonApiWebView.reload((WebView) obj2);
                list = CollectionsKt.listOf(null);
            } catch (Throwable th) {
                list = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(list);
        }

        /* access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$25$lambda$24(PigeonApiWebView pigeonApiWebView, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list2 = (List) obj;
            Object obj2 = list2.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            WebView webView = (WebView) obj2;
            Object obj3 = list2.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebView.clearCache(webView, ((Boolean) obj3).booleanValue());
                list = CollectionsKt.listOf(null);
            } catch (Throwable th) {
                list = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(list);
        }

        /* access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$27$lambda$26(PigeonApiWebView pigeonApiWebView, Object obj, BasicMessageChannel.Reply reply) {
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            Object obj3 = list.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
            pigeonApiWebView.evaluateJavascript((WebView) obj2, (String) obj3, new PigeonApiWebView$Companion$setUpMessageHandlers$14$1$1(reply));
        }

        /* access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$29$lambda$28(PigeonApiWebView pigeonApiWebView, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            try {
                list = CollectionsKt.listOf(pigeonApiWebView.getTitle((WebView) obj2));
            } catch (Throwable th) {
                list = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(list);
        }

        /* access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$31$lambda$30(PigeonApiWebView pigeonApiWebView, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebView.setWebContentsDebuggingEnabled(((Boolean) obj2).booleanValue());
                list = CollectionsKt.listOf(null);
            } catch (Throwable th) {
                list = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(list);
        }

        /* access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$33$lambda$32(PigeonApiWebView pigeonApiWebView, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list2 = (List) obj;
            Object obj2 = list2.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            try {
                pigeonApiWebView.setWebViewClient((WebView) obj2, (WebViewClient) list2.get(1));
                list = CollectionsKt.listOf(null);
            } catch (Throwable th) {
                list = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(list);
        }

        /* access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$35$lambda$34(PigeonApiWebView pigeonApiWebView, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list2 = (List) obj;
            Object obj2 = list2.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            WebView webView = (WebView) obj2;
            Object obj3 = list2.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
            try {
                pigeonApiWebView.addJavaScriptChannel(webView, (JavaScriptChannel) obj3);
                list = CollectionsKt.listOf(null);
            } catch (Throwable th) {
                list = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(list);
        }

        /* access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$37$lambda$36(PigeonApiWebView pigeonApiWebView, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list2 = (List) obj;
            Object obj2 = list2.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            WebView webView = (WebView) obj2;
            Object obj3 = list2.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
            try {
                pigeonApiWebView.removeJavaScriptChannel(webView, (String) obj3);
                list = CollectionsKt.listOf(null);
            } catch (Throwable th) {
                list = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(list);
        }

        /* access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$39$lambda$38(PigeonApiWebView pigeonApiWebView, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list2 = (List) obj;
            Object obj2 = list2.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            try {
                pigeonApiWebView.setDownloadListener((WebView) obj2, (DownloadListener) list2.get(1));
                list = CollectionsKt.listOf(null);
            } catch (Throwable th) {
                list = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(list);
        }

        /* access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$41$lambda$40(PigeonApiWebView pigeonApiWebView, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list2 = (List) obj;
            Object obj2 = list2.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            try {
                pigeonApiWebView.setWebChromeClient((WebView) obj2, (WebChromeClientProxyApi.WebChromeClientImpl) list2.get(1));
                list = CollectionsKt.listOf(null);
            } catch (Throwable th) {
                list = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(list);
        }

        /* access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$43$lambda$42(PigeonApiWebView pigeonApiWebView, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list2 = (List) obj;
            Object obj2 = list2.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            WebView webView = (WebView) obj2;
            Object obj3 = list2.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Long");
            try {
                pigeonApiWebView.setBackgroundColor(webView, ((Long) obj3).longValue());
                list = CollectionsKt.listOf(null);
            } catch (Throwable th) {
                list = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(list);
        }

        /* access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$45$lambda$44(PigeonApiWebView pigeonApiWebView, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            try {
                pigeonApiWebView.destroy((WebView) obj2);
                list = CollectionsKt.listOf(null);
            } catch (Throwable th) {
                list = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(list);
        }
    }

    public final void pigeon_newInstance(WebView webView, Function1<? super Result<Unit>, Unit> function1) {
        Intrinsics.checkNotNullParameter(webView, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(function1, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            Result.Companion companion = Result.Companion;
            function1.invoke(Result.m510boximpl(Result.m511constructorimpl(ResultKt.createFailure(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (getPigeonRegistrar().getInstanceManager().containsInstance(webView)) {
            Result.Companion companion2 = Result.Companion;
            function1.invoke(Result.m510boximpl(Result.m511constructorimpl(Unit.INSTANCE)));
        } else {
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebView.pigeon_newInstance", getPigeonRegistrar().getCodec()).send(CollectionsKt.listOf(Long.valueOf(getPigeonRegistrar().getInstanceManager().addHostCreatedInstance(webView))), new PigeonApiWebView$$ExternalSyntheticLambda1(function1, "dev.flutter.pigeon.webview_flutter_android.WebView.pigeon_newInstance"));
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

    public final void onScrollChanged(WebView webView, long j, long j2, long j3, long j4, Function1<? super Result<Unit>, Unit> function1) {
        Intrinsics.checkNotNullParameter(webView, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(function1, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            Result.Companion companion = Result.Companion;
            function1.invoke(Result.m510boximpl(Result.m511constructorimpl(ResultKt.createFailure(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
            return;
        }
        new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebView.onScrollChanged", getPigeonRegistrar().getCodec()).send(CollectionsKt.listOf(webView, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4)), new PigeonApiWebView$$ExternalSyntheticLambda0(function1, "dev.flutter.pigeon.webview_flutter_android.WebView.onScrollChanged"));
    }

    /* access modifiers changed from: private */
    public static final void onScrollChanged$lambda$1(Function1 function1, String str, Object obj) {
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

    public final PigeonApiView pigeon_getPigeonApiView() {
        return getPigeonRegistrar().getPigeonApiView();
    }
}
