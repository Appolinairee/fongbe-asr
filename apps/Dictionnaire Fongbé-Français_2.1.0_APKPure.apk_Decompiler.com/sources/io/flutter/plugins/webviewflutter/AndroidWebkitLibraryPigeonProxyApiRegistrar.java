package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonInstanceManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000ò\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0016\u001a\u00020\u0017H&J\b\u0010\u0018\u001a\u00020\u0019H&J\b\u0010\u001a\u001a\u00020\u001bH&J\b\u0010\u001c\u001a\u00020\u001dH&J\b\u0010\u001e\u001a\u00020\u001fH&J\b\u0010 \u001a\u00020!H&J\b\u0010\"\u001a\u00020#H&J\b\u0010$\u001a\u00020%H&J\b\u0010&\u001a\u00020'H&J\b\u0010(\u001a\u00020)H&J\b\u0010*\u001a\u00020+H&J\b\u0010,\u001a\u00020-H&J\b\u0010.\u001a\u00020/H&J\b\u00100\u001a\u000201H\u0016J\b\u00102\u001a\u000203H&J\b\u00104\u001a\u000205H&J\b\u00106\u001a\u000207H&J\b\u00108\u001a\u000209H&J\b\u0010:\u001a\u00020;H&J\b\u0010<\u001a\u00020=H&J\b\u0010>\u001a\u00020?H&J\b\u0010@\u001a\u00020AH&J\b\u0010B\u001a\u00020CH&J\b\u0010D\u001a\u00020EH&J\b\u0010F\u001a\u00020GH&J\b\u0010H\u001a\u00020IH&J\b\u0010J\u001a\u00020KH&J\b\u0010L\u001a\u00020MH&J\b\u0010N\u001a\u00020OH&J\b\u0010P\u001a\u00020QH&J\b\u0010R\u001a\u00020SH&J\b\u0010T\u001a\u00020UH\u0016J\u0006\u0010V\u001a\u00020WJ\u0006\u0010X\u001a\u00020WR\u0018\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006Y"}, d2 = {"Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;", "", "binaryMessenger", "Lio/flutter/plugin/common/BinaryMessenger;", "(Lio/flutter/plugin/common/BinaryMessenger;)V", "_codec", "Lio/flutter/plugin/common/MessageCodec;", "getBinaryMessenger", "()Lio/flutter/plugin/common/BinaryMessenger;", "codec", "getCodec", "()Lio/flutter/plugin/common/MessageCodec;", "ignoreCallsToDart", "", "getIgnoreCallsToDart", "()Z", "setIgnoreCallsToDart", "(Z)V", "instanceManager", "Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonInstanceManager;", "getInstanceManager", "()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonInstanceManager;", "getPigeonApiAndroidMessage", "Lio/flutter/plugins/webviewflutter/PigeonApiAndroidMessage;", "getPigeonApiCertificate", "Lio/flutter/plugins/webviewflutter/PigeonApiCertificate;", "getPigeonApiClientCertRequest", "Lio/flutter/plugins/webviewflutter/PigeonApiClientCertRequest;", "getPigeonApiConsoleMessage", "Lio/flutter/plugins/webviewflutter/PigeonApiConsoleMessage;", "getPigeonApiCookieManager", "Lio/flutter/plugins/webviewflutter/PigeonApiCookieManager;", "getPigeonApiCustomViewCallback", "Lio/flutter/plugins/webviewflutter/PigeonApiCustomViewCallback;", "getPigeonApiDownloadListener", "Lio/flutter/plugins/webviewflutter/PigeonApiDownloadListener;", "getPigeonApiFileChooserParams", "Lio/flutter/plugins/webviewflutter/PigeonApiFileChooserParams;", "getPigeonApiFlutterAssetManager", "Lio/flutter/plugins/webviewflutter/PigeonApiFlutterAssetManager;", "getPigeonApiGeolocationPermissionsCallback", "Lio/flutter/plugins/webviewflutter/PigeonApiGeolocationPermissionsCallback;", "getPigeonApiHttpAuthHandler", "Lio/flutter/plugins/webviewflutter/PigeonApiHttpAuthHandler;", "getPigeonApiJavaScriptChannel", "Lio/flutter/plugins/webviewflutter/PigeonApiJavaScriptChannel;", "getPigeonApiPermissionRequest", "Lio/flutter/plugins/webviewflutter/PigeonApiPermissionRequest;", "getPigeonApiPrivateKey", "Lio/flutter/plugins/webviewflutter/PigeonApiPrivateKey;", "getPigeonApiSslCertificate", "Lio/flutter/plugins/webviewflutter/PigeonApiSslCertificate;", "getPigeonApiSslCertificateDName", "Lio/flutter/plugins/webviewflutter/PigeonApiSslCertificateDName;", "getPigeonApiSslError", "Lio/flutter/plugins/webviewflutter/PigeonApiSslError;", "getPigeonApiSslErrorHandler", "Lio/flutter/plugins/webviewflutter/PigeonApiSslErrorHandler;", "getPigeonApiView", "Lio/flutter/plugins/webviewflutter/PigeonApiView;", "getPigeonApiWebChromeClient", "Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient;", "getPigeonApiWebResourceError", "Lio/flutter/plugins/webviewflutter/PigeonApiWebResourceError;", "getPigeonApiWebResourceErrorCompat", "Lio/flutter/plugins/webviewflutter/PigeonApiWebResourceErrorCompat;", "getPigeonApiWebResourceRequest", "Lio/flutter/plugins/webviewflutter/PigeonApiWebResourceRequest;", "getPigeonApiWebResourceResponse", "Lio/flutter/plugins/webviewflutter/PigeonApiWebResourceResponse;", "getPigeonApiWebSettings", "Lio/flutter/plugins/webviewflutter/PigeonApiWebSettings;", "getPigeonApiWebSettingsCompat", "Lio/flutter/plugins/webviewflutter/PigeonApiWebSettingsCompat;", "getPigeonApiWebStorage", "Lio/flutter/plugins/webviewflutter/PigeonApiWebStorage;", "getPigeonApiWebView", "Lio/flutter/plugins/webviewflutter/PigeonApiWebView;", "getPigeonApiWebViewClient", "Lio/flutter/plugins/webviewflutter/PigeonApiWebViewClient;", "getPigeonApiWebViewFeature", "Lio/flutter/plugins/webviewflutter/PigeonApiWebViewFeature;", "getPigeonApiWebViewPoint", "Lio/flutter/plugins/webviewflutter/PigeonApiWebViewPoint;", "getPigeonApiX509Certificate", "Lio/flutter/plugins/webviewflutter/PigeonApiX509Certificate;", "setUp", "", "tearDown", "webview_flutter_android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: AndroidWebkitLibrary.g.kt */
public abstract class AndroidWebkitLibraryPigeonProxyApiRegistrar {
    private MessageCodec<Object> _codec;
    private final BinaryMessenger binaryMessenger;
    private boolean ignoreCallsToDart;
    private final AndroidWebkitLibraryPigeonInstanceManager instanceManager;

    public abstract PigeonApiAndroidMessage getPigeonApiAndroidMessage();

    public abstract PigeonApiCertificate getPigeonApiCertificate();

    public abstract PigeonApiClientCertRequest getPigeonApiClientCertRequest();

    public abstract PigeonApiConsoleMessage getPigeonApiConsoleMessage();

    public abstract PigeonApiCookieManager getPigeonApiCookieManager();

    public abstract PigeonApiCustomViewCallback getPigeonApiCustomViewCallback();

    public abstract PigeonApiDownloadListener getPigeonApiDownloadListener();

    public abstract PigeonApiFileChooserParams getPigeonApiFileChooserParams();

    public abstract PigeonApiFlutterAssetManager getPigeonApiFlutterAssetManager();

    public abstract PigeonApiGeolocationPermissionsCallback getPigeonApiGeolocationPermissionsCallback();

    public abstract PigeonApiHttpAuthHandler getPigeonApiHttpAuthHandler();

    public abstract PigeonApiJavaScriptChannel getPigeonApiJavaScriptChannel();

    public abstract PigeonApiPermissionRequest getPigeonApiPermissionRequest();

    public abstract PigeonApiSslCertificate getPigeonApiSslCertificate();

    public abstract PigeonApiSslCertificateDName getPigeonApiSslCertificateDName();

    public abstract PigeonApiSslError getPigeonApiSslError();

    public abstract PigeonApiSslErrorHandler getPigeonApiSslErrorHandler();

    public abstract PigeonApiView getPigeonApiView();

    public abstract PigeonApiWebChromeClient getPigeonApiWebChromeClient();

    public abstract PigeonApiWebResourceError getPigeonApiWebResourceError();

    public abstract PigeonApiWebResourceErrorCompat getPigeonApiWebResourceErrorCompat();

    public abstract PigeonApiWebResourceRequest getPigeonApiWebResourceRequest();

    public abstract PigeonApiWebResourceResponse getPigeonApiWebResourceResponse();

    public abstract PigeonApiWebSettings getPigeonApiWebSettings();

    public abstract PigeonApiWebSettingsCompat getPigeonApiWebSettingsCompat();

    public abstract PigeonApiWebStorage getPigeonApiWebStorage();

    public abstract PigeonApiWebView getPigeonApiWebView();

    public abstract PigeonApiWebViewClient getPigeonApiWebViewClient();

    public abstract PigeonApiWebViewFeature getPigeonApiWebViewFeature();

    public abstract PigeonApiWebViewPoint getPigeonApiWebViewPoint();

    public AndroidWebkitLibraryPigeonProxyApiRegistrar(BinaryMessenger binaryMessenger2) {
        Intrinsics.checkNotNullParameter(binaryMessenger2, "binaryMessenger");
        this.binaryMessenger = binaryMessenger2;
        final AndroidWebkitLibraryPigeonInstanceManagerApi androidWebkitLibraryPigeonInstanceManagerApi = new AndroidWebkitLibraryPigeonInstanceManagerApi(binaryMessenger2);
        this.instanceManager = AndroidWebkitLibraryPigeonInstanceManager.Companion.create(new AndroidWebkitLibraryPigeonInstanceManager.PigeonFinalizationListener() {
            public void onFinalize(long j) {
                androidWebkitLibraryPigeonInstanceManagerApi.removeStrongReference(j, new AndroidWebkitLibraryPigeonProxyApiRegistrar$1$onFinalize$1(j));
            }
        });
    }

    public final BinaryMessenger getBinaryMessenger() {
        return this.binaryMessenger;
    }

    public final boolean getIgnoreCallsToDart() {
        return this.ignoreCallsToDart;
    }

    public final void setIgnoreCallsToDart(boolean z) {
        this.ignoreCallsToDart = z;
    }

    public final AndroidWebkitLibraryPigeonInstanceManager getInstanceManager() {
        return this.instanceManager;
    }

    public final MessageCodec<Object> getCodec() {
        if (this._codec == null) {
            this._codec = new AndroidWebkitLibraryPigeonProxyApiBaseCodec(this);
        }
        MessageCodec<Object> messageCodec = this._codec;
        Intrinsics.checkNotNull(messageCodec);
        return messageCodec;
    }

    public PigeonApiPrivateKey getPigeonApiPrivateKey() {
        return new PigeonApiPrivateKey(this);
    }

    public PigeonApiX509Certificate getPigeonApiX509Certificate() {
        return new PigeonApiX509Certificate(this);
    }

    public final void setUp() {
        AndroidWebkitLibraryPigeonInstanceManagerApi.Companion.setUpMessageHandlers(this.binaryMessenger, this.instanceManager);
        PigeonApiCookieManager.Companion.setUpMessageHandlers(this.binaryMessenger, getPigeonApiCookieManager());
        PigeonApiWebView.Companion.setUpMessageHandlers(this.binaryMessenger, getPigeonApiWebView());
        PigeonApiWebSettings.Companion.setUpMessageHandlers(this.binaryMessenger, getPigeonApiWebSettings());
        PigeonApiJavaScriptChannel.Companion.setUpMessageHandlers(this.binaryMessenger, getPigeonApiJavaScriptChannel());
        PigeonApiWebViewClient.Companion.setUpMessageHandlers(this.binaryMessenger, getPigeonApiWebViewClient());
        PigeonApiDownloadListener.Companion.setUpMessageHandlers(this.binaryMessenger, getPigeonApiDownloadListener());
        PigeonApiWebChromeClient.Companion.setUpMessageHandlers(this.binaryMessenger, getPigeonApiWebChromeClient());
        PigeonApiFlutterAssetManager.Companion.setUpMessageHandlers(this.binaryMessenger, getPigeonApiFlutterAssetManager());
        PigeonApiWebStorage.Companion.setUpMessageHandlers(this.binaryMessenger, getPigeonApiWebStorage());
        PigeonApiPermissionRequest.Companion.setUpMessageHandlers(this.binaryMessenger, getPigeonApiPermissionRequest());
        PigeonApiCustomViewCallback.Companion.setUpMessageHandlers(this.binaryMessenger, getPigeonApiCustomViewCallback());
        PigeonApiView.Companion.setUpMessageHandlers(this.binaryMessenger, getPigeonApiView());
        PigeonApiGeolocationPermissionsCallback.Companion.setUpMessageHandlers(this.binaryMessenger, getPigeonApiGeolocationPermissionsCallback());
        PigeonApiHttpAuthHandler.Companion.setUpMessageHandlers(this.binaryMessenger, getPigeonApiHttpAuthHandler());
        PigeonApiAndroidMessage.Companion.setUpMessageHandlers(this.binaryMessenger, getPigeonApiAndroidMessage());
        PigeonApiClientCertRequest.Companion.setUpMessageHandlers(this.binaryMessenger, getPigeonApiClientCertRequest());
        PigeonApiSslErrorHandler.Companion.setUpMessageHandlers(this.binaryMessenger, getPigeonApiSslErrorHandler());
        PigeonApiSslError.Companion.setUpMessageHandlers(this.binaryMessenger, getPigeonApiSslError());
        PigeonApiSslCertificateDName.Companion.setUpMessageHandlers(this.binaryMessenger, getPigeonApiSslCertificateDName());
        PigeonApiSslCertificate.Companion.setUpMessageHandlers(this.binaryMessenger, getPigeonApiSslCertificate());
        PigeonApiCertificate.Companion.setUpMessageHandlers(this.binaryMessenger, getPigeonApiCertificate());
        PigeonApiWebSettingsCompat.Companion.setUpMessageHandlers(this.binaryMessenger, getPigeonApiWebSettingsCompat());
        PigeonApiWebViewFeature.Companion.setUpMessageHandlers(this.binaryMessenger, getPigeonApiWebViewFeature());
    }

    public final void tearDown() {
        AndroidWebkitLibraryPigeonInstanceManagerApi.Companion.setUpMessageHandlers(this.binaryMessenger, (AndroidWebkitLibraryPigeonInstanceManager) null);
        PigeonApiCookieManager.Companion.setUpMessageHandlers(this.binaryMessenger, (PigeonApiCookieManager) null);
        PigeonApiWebView.Companion.setUpMessageHandlers(this.binaryMessenger, (PigeonApiWebView) null);
        PigeonApiWebSettings.Companion.setUpMessageHandlers(this.binaryMessenger, (PigeonApiWebSettings) null);
        PigeonApiJavaScriptChannel.Companion.setUpMessageHandlers(this.binaryMessenger, (PigeonApiJavaScriptChannel) null);
        PigeonApiWebViewClient.Companion.setUpMessageHandlers(this.binaryMessenger, (PigeonApiWebViewClient) null);
        PigeonApiDownloadListener.Companion.setUpMessageHandlers(this.binaryMessenger, (PigeonApiDownloadListener) null);
        PigeonApiWebChromeClient.Companion.setUpMessageHandlers(this.binaryMessenger, (PigeonApiWebChromeClient) null);
        PigeonApiFlutterAssetManager.Companion.setUpMessageHandlers(this.binaryMessenger, (PigeonApiFlutterAssetManager) null);
        PigeonApiWebStorage.Companion.setUpMessageHandlers(this.binaryMessenger, (PigeonApiWebStorage) null);
        PigeonApiPermissionRequest.Companion.setUpMessageHandlers(this.binaryMessenger, (PigeonApiPermissionRequest) null);
        PigeonApiCustomViewCallback.Companion.setUpMessageHandlers(this.binaryMessenger, (PigeonApiCustomViewCallback) null);
        PigeonApiView.Companion.setUpMessageHandlers(this.binaryMessenger, (PigeonApiView) null);
        PigeonApiGeolocationPermissionsCallback.Companion.setUpMessageHandlers(this.binaryMessenger, (PigeonApiGeolocationPermissionsCallback) null);
        PigeonApiHttpAuthHandler.Companion.setUpMessageHandlers(this.binaryMessenger, (PigeonApiHttpAuthHandler) null);
        PigeonApiAndroidMessage.Companion.setUpMessageHandlers(this.binaryMessenger, (PigeonApiAndroidMessage) null);
        PigeonApiClientCertRequest.Companion.setUpMessageHandlers(this.binaryMessenger, (PigeonApiClientCertRequest) null);
        PigeonApiSslErrorHandler.Companion.setUpMessageHandlers(this.binaryMessenger, (PigeonApiSslErrorHandler) null);
        PigeonApiSslError.Companion.setUpMessageHandlers(this.binaryMessenger, (PigeonApiSslError) null);
        PigeonApiSslCertificateDName.Companion.setUpMessageHandlers(this.binaryMessenger, (PigeonApiSslCertificateDName) null);
        PigeonApiSslCertificate.Companion.setUpMessageHandlers(this.binaryMessenger, (PigeonApiSslCertificate) null);
        PigeonApiCertificate.Companion.setUpMessageHandlers(this.binaryMessenger, (PigeonApiCertificate) null);
        PigeonApiWebSettingsCompat.Companion.setUpMessageHandlers(this.binaryMessenger, (PigeonApiWebSettingsCompat) null);
        PigeonApiWebViewFeature.Companion.setUpMessageHandlers(this.binaryMessenger, (PigeonApiWebViewFeature) null);
    }
}
