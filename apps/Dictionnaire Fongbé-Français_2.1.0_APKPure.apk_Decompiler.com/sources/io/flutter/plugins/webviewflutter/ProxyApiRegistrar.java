package io.flutter.plugins.webviewflutter;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import io.flutter.plugin.common.BinaryMessenger;

public class ProxyApiRegistrar extends AndroidWebkitLibraryPigeonProxyApiRegistrar {
    private Context context;
    private final FlutterAssetManager flutterAssetManager;

    public ProxyApiRegistrar(BinaryMessenger binaryMessenger, Context context2, FlutterAssetManager flutterAssetManager2) {
        super(binaryMessenger);
        this.context = context2;
        this.flutterAssetManager = flutterAssetManager2;
    }

    /* access modifiers changed from: package-private */
    public boolean sdkIsAtLeast(int i) {
        return Build.VERSION.SDK_INT >= i;
    }

    /* access modifiers changed from: package-private */
    public void runOnMainThread(Runnable runnable) {
        Context context2 = this.context;
        if (context2 instanceof Activity) {
            ((Activity) context2).runOnUiThread(runnable);
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    /* access modifiers changed from: package-private */
    public void logError(String str, Throwable th) {
        Log.e(str, th.getClass().getSimpleName() + ", Message: " + th.getMessage() + ", Stacktrace: " + Log.getStackTraceString(th));
    }

    /* access modifiers changed from: package-private */
    public IllegalArgumentException createUnknownEnumException(Object obj) {
        return new IllegalArgumentException(obj + " doesn't represent a native value.");
    }

    /* access modifiers changed from: package-private */
    public String createUnsupportedVersionMessage(String str, String str2) {
        return str + " requires " + str2 + ".";
    }

    public PigeonApiWebResourceRequest getPigeonApiWebResourceRequest() {
        return new WebResourceRequestProxyApi(this);
    }

    public PigeonApiWebResourceError getPigeonApiWebResourceError() {
        return new WebResourceErrorProxyApi(this);
    }

    public PigeonApiWebResourceErrorCompat getPigeonApiWebResourceErrorCompat() {
        return new WebResourceErrorCompatProxyApi(this);
    }

    public PigeonApiWebViewPoint getPigeonApiWebViewPoint() {
        return new WebViewPointProxyApi(this);
    }

    public PigeonApiConsoleMessage getPigeonApiConsoleMessage() {
        return new ConsoleMessageProxyApi(this);
    }

    public PigeonApiCookieManager getPigeonApiCookieManager() {
        return new CookieManagerProxyApi(this);
    }

    public PigeonApiWebResourceResponse getPigeonApiWebResourceResponse() {
        return new WebResourceResponseProxyApi(this);
    }

    public PigeonApiWebView getPigeonApiWebView() {
        return new WebViewProxyApi(this);
    }

    public PigeonApiWebSettings getPigeonApiWebSettings() {
        return new WebSettingsProxyApi(this);
    }

    public PigeonApiJavaScriptChannel getPigeonApiJavaScriptChannel() {
        return new JavaScriptChannelProxyApi(this);
    }

    public PigeonApiWebViewClient getPigeonApiWebViewClient() {
        return new WebViewClientProxyApi(this);
    }

    public PigeonApiDownloadListener getPigeonApiDownloadListener() {
        return new DownloadListenerProxyApi(this);
    }

    public PigeonApiWebChromeClient getPigeonApiWebChromeClient() {
        return new WebChromeClientProxyApi(this);
    }

    public PigeonApiFlutterAssetManager getPigeonApiFlutterAssetManager() {
        return new FlutterAssetManagerProxyApi(this);
    }

    public PigeonApiWebStorage getPigeonApiWebStorage() {
        return new WebStorageProxyApi(this);
    }

    public PigeonApiFileChooserParams getPigeonApiFileChooserParams() {
        return new FileChooserParamsProxyApi(this);
    }

    public PigeonApiPermissionRequest getPigeonApiPermissionRequest() {
        return new PermissionRequestProxyApi(this);
    }

    public PigeonApiCustomViewCallback getPigeonApiCustomViewCallback() {
        return new CustomViewCallbackProxyApi(this);
    }

    public PigeonApiView getPigeonApiView() {
        return new ViewProxyApi(this);
    }

    public PigeonApiGeolocationPermissionsCallback getPigeonApiGeolocationPermissionsCallback() {
        return new GeolocationPermissionsCallbackProxyApi(this);
    }

    public PigeonApiHttpAuthHandler getPigeonApiHttpAuthHandler() {
        return new HttpAuthHandlerProxyApi(this);
    }

    public PigeonApiClientCertRequest getPigeonApiClientCertRequest() {
        return new ClientCertRequestProxyApi(this);
    }

    public PigeonApiSslErrorHandler getPigeonApiSslErrorHandler() {
        return new SslErrorHandlerProxyApi(this);
    }

    public PigeonApiSslError getPigeonApiSslError() {
        return new SslErrorProxyApi(this);
    }

    public PigeonApiSslCertificateDName getPigeonApiSslCertificateDName() {
        return new SslCertificateDNameProxyApi(this);
    }

    public PigeonApiSslCertificate getPigeonApiSslCertificate() {
        return new SslCertificateProxyApi(this);
    }

    public PigeonApiAndroidMessage getPigeonApiAndroidMessage() {
        return new MessageProxyApi(this);
    }

    public PigeonApiCertificate getPigeonApiCertificate() {
        return new CertificateProxyApi(this);
    }

    public Context getContext() {
        return this.context;
    }

    public void setContext(Context context2) {
        this.context = context2;
    }

    public FlutterAssetManager getFlutterAssetManager() {
        return this.flutterAssetManager;
    }

    public PigeonApiWebViewFeature getPigeonApiWebViewFeature() {
        return new WebViewFeatureProxyApi(this);
    }

    public PigeonApiWebSettingsCompat getPigeonApiWebSettingsCompat() {
        return new WebSettingsCompatProxyApi(this);
    }
}
