package io.flutter.plugins.webviewflutter;

import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.os.Build;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.webkit.ClientCertRequest;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.HttpAuthHandler;
import android.webkit.PermissionRequest;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.webkit.WebResourceErrorCompat;
import androidx.webkit.WebSettingsCompat;
import androidx.webkit.WebViewFeature;
import io.flutter.plugins.webviewflutter.WebChromeClientProxyApi;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0014J\u001a\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;", "Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonCodec;", "registrar", "Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;", "(Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;)V", "getRegistrar", "()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;", "readValueOfType", "", "type", "", "buffer", "Ljava/nio/ByteBuffer;", "writeValue", "", "stream", "Ljava/io/ByteArrayOutputStream;", "value", "webview_flutter_android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: AndroidWebkitLibrary.g.kt */
final class AndroidWebkitLibraryPigeonProxyApiBaseCodec extends AndroidWebkitLibraryPigeonCodec {
    private final AndroidWebkitLibraryPigeonProxyApiRegistrar registrar;

    public final AndroidWebkitLibraryPigeonProxyApiRegistrar getRegistrar() {
        return this.registrar;
    }

    public AndroidWebkitLibraryPigeonProxyApiBaseCodec(AndroidWebkitLibraryPigeonProxyApiRegistrar androidWebkitLibraryPigeonProxyApiRegistrar) {
        Intrinsics.checkNotNullParameter(androidWebkitLibraryPigeonProxyApiRegistrar, "registrar");
        this.registrar = androidWebkitLibraryPigeonProxyApiRegistrar;
    }

    /* access modifiers changed from: protected */
    public Object readValueOfType(byte b, ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "buffer");
        if (b != Byte.MIN_VALUE) {
            return super.readValueOfType(b, byteBuffer);
        }
        Object readValue = readValue(byteBuffer);
        Intrinsics.checkNotNull(readValue, "null cannot be cast to non-null type kotlin.Long");
        long longValue = ((Long) readValue).longValue();
        Object instance = this.registrar.getInstanceManager().getInstance(longValue);
        if (instance == null) {
            Log.e("PigeonProxyApiBaseCodec", "Failed to find instance with identifier: " + longValue);
        }
        return instance;
    }

    /* access modifiers changed from: protected */
    public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        Intrinsics.checkNotNullParameter(byteArrayOutputStream, "stream");
        if ((obj instanceof Boolean) || (obj instanceof byte[]) || (obj instanceof Double) || (obj instanceof double[]) || (obj instanceof float[]) || (obj instanceof Integer) || (obj instanceof int[]) || (obj instanceof List) || (obj instanceof Long) || (obj instanceof long[]) || (obj instanceof Map) || (obj instanceof String) || (obj instanceof FileChooserMode) || (obj instanceof ConsoleMessageLevel) || (obj instanceof OverScrollMode) || (obj instanceof SslErrorType) || (obj instanceof MixedContentMode) || obj == null) {
            super.writeValue(byteArrayOutputStream, obj);
            return;
        }
        if (obj instanceof WebResourceRequest) {
            this.registrar.getPigeonApiWebResourceRequest().pigeon_newInstance((WebResourceRequest) obj, AndroidWebkitLibraryPigeonProxyApiBaseCodec$writeValue$1.INSTANCE);
        } else if (obj instanceof WebResourceResponse) {
            this.registrar.getPigeonApiWebResourceResponse().pigeon_newInstance((WebResourceResponse) obj, AndroidWebkitLibraryPigeonProxyApiBaseCodec$writeValue$2.INSTANCE);
        } else if (Build.VERSION.SDK_INT >= 23 && SslCertificateProxyApi$$ExternalSyntheticApiModelOutline0.m(obj)) {
            this.registrar.getPigeonApiWebResourceError().pigeon_newInstance(SslCertificateProxyApi$$ExternalSyntheticApiModelOutline0.m(obj), AndroidWebkitLibraryPigeonProxyApiBaseCodec$writeValue$3.INSTANCE);
        } else if (obj instanceof WebResourceErrorCompat) {
            this.registrar.getPigeonApiWebResourceErrorCompat().pigeon_newInstance((WebResourceErrorCompat) obj, AndroidWebkitLibraryPigeonProxyApiBaseCodec$writeValue$4.INSTANCE);
        } else if (obj instanceof WebViewPoint) {
            this.registrar.getPigeonApiWebViewPoint().pigeon_newInstance((WebViewPoint) obj, AndroidWebkitLibraryPigeonProxyApiBaseCodec$writeValue$5.INSTANCE);
        } else if (obj instanceof ConsoleMessage) {
            this.registrar.getPigeonApiConsoleMessage().pigeon_newInstance((ConsoleMessage) obj, AndroidWebkitLibraryPigeonProxyApiBaseCodec$writeValue$6.INSTANCE);
        } else if (obj instanceof CookieManager) {
            this.registrar.getPigeonApiCookieManager().pigeon_newInstance((CookieManager) obj, AndroidWebkitLibraryPigeonProxyApiBaseCodec$writeValue$7.INSTANCE);
        } else if (obj instanceof WebView) {
            this.registrar.getPigeonApiWebView().pigeon_newInstance((WebView) obj, AndroidWebkitLibraryPigeonProxyApiBaseCodec$writeValue$8.INSTANCE);
        } else if (obj instanceof WebSettings) {
            this.registrar.getPigeonApiWebSettings().pigeon_newInstance((WebSettings) obj, AndroidWebkitLibraryPigeonProxyApiBaseCodec$writeValue$9.INSTANCE);
        } else if (obj instanceof JavaScriptChannel) {
            this.registrar.getPigeonApiJavaScriptChannel().pigeon_newInstance((JavaScriptChannel) obj, AndroidWebkitLibraryPigeonProxyApiBaseCodec$writeValue$10.INSTANCE);
        } else if (obj instanceof WebViewClient) {
            this.registrar.getPigeonApiWebViewClient().pigeon_newInstance((WebViewClient) obj, AndroidWebkitLibraryPigeonProxyApiBaseCodec$writeValue$11.INSTANCE);
        } else if (obj instanceof DownloadListener) {
            this.registrar.getPigeonApiDownloadListener().pigeon_newInstance((DownloadListener) obj, AndroidWebkitLibraryPigeonProxyApiBaseCodec$writeValue$12.INSTANCE);
        } else if (obj instanceof WebChromeClientProxyApi.WebChromeClientImpl) {
            this.registrar.getPigeonApiWebChromeClient().pigeon_newInstance((WebChromeClientProxyApi.WebChromeClientImpl) obj, AndroidWebkitLibraryPigeonProxyApiBaseCodec$writeValue$13.INSTANCE);
        } else if (obj instanceof FlutterAssetManager) {
            this.registrar.getPigeonApiFlutterAssetManager().pigeon_newInstance((FlutterAssetManager) obj, AndroidWebkitLibraryPigeonProxyApiBaseCodec$writeValue$14.INSTANCE);
        } else if (obj instanceof WebStorage) {
            this.registrar.getPigeonApiWebStorage().pigeon_newInstance((WebStorage) obj, AndroidWebkitLibraryPigeonProxyApiBaseCodec$writeValue$15.INSTANCE);
        } else if (obj instanceof WebChromeClient.FileChooserParams) {
            this.registrar.getPigeonApiFileChooserParams().pigeon_newInstance((WebChromeClient.FileChooserParams) obj, AndroidWebkitLibraryPigeonProxyApiBaseCodec$writeValue$16.INSTANCE);
        } else if (obj instanceof PermissionRequest) {
            this.registrar.getPigeonApiPermissionRequest().pigeon_newInstance((PermissionRequest) obj, AndroidWebkitLibraryPigeonProxyApiBaseCodec$writeValue$17.INSTANCE);
        } else if (obj instanceof WebChromeClient.CustomViewCallback) {
            this.registrar.getPigeonApiCustomViewCallback().pigeon_newInstance((WebChromeClient.CustomViewCallback) obj, AndroidWebkitLibraryPigeonProxyApiBaseCodec$writeValue$18.INSTANCE);
        } else if (obj instanceof View) {
            this.registrar.getPigeonApiView().pigeon_newInstance((View) obj, AndroidWebkitLibraryPigeonProxyApiBaseCodec$writeValue$19.INSTANCE);
        } else if (obj instanceof GeolocationPermissions.Callback) {
            this.registrar.getPigeonApiGeolocationPermissionsCallback().pigeon_newInstance((GeolocationPermissions.Callback) obj, AndroidWebkitLibraryPigeonProxyApiBaseCodec$writeValue$20.INSTANCE);
        } else if (obj instanceof HttpAuthHandler) {
            this.registrar.getPigeonApiHttpAuthHandler().pigeon_newInstance((HttpAuthHandler) obj, AndroidWebkitLibraryPigeonProxyApiBaseCodec$writeValue$21.INSTANCE);
        } else if (obj instanceof Message) {
            this.registrar.getPigeonApiAndroidMessage().pigeon_newInstance((Message) obj, AndroidWebkitLibraryPigeonProxyApiBaseCodec$writeValue$22.INSTANCE);
        } else if (obj instanceof ClientCertRequest) {
            this.registrar.getPigeonApiClientCertRequest().pigeon_newInstance((ClientCertRequest) obj, AndroidWebkitLibraryPigeonProxyApiBaseCodec$writeValue$23.INSTANCE);
        } else if (obj instanceof PrivateKey) {
            this.registrar.getPigeonApiPrivateKey().pigeon_newInstance((PrivateKey) obj, AndroidWebkitLibraryPigeonProxyApiBaseCodec$writeValue$24.INSTANCE);
        } else if (obj instanceof X509Certificate) {
            this.registrar.getPigeonApiX509Certificate().pigeon_newInstance((X509Certificate) obj, AndroidWebkitLibraryPigeonProxyApiBaseCodec$writeValue$25.INSTANCE);
        } else if (obj instanceof SslErrorHandler) {
            this.registrar.getPigeonApiSslErrorHandler().pigeon_newInstance((SslErrorHandler) obj, AndroidWebkitLibraryPigeonProxyApiBaseCodec$writeValue$26.INSTANCE);
        } else if (obj instanceof SslError) {
            this.registrar.getPigeonApiSslError().pigeon_newInstance((SslError) obj, AndroidWebkitLibraryPigeonProxyApiBaseCodec$writeValue$27.INSTANCE);
        } else if (obj instanceof SslCertificate.DName) {
            this.registrar.getPigeonApiSslCertificateDName().pigeon_newInstance((SslCertificate.DName) obj, AndroidWebkitLibraryPigeonProxyApiBaseCodec$writeValue$28.INSTANCE);
        } else if (obj instanceof SslCertificate) {
            this.registrar.getPigeonApiSslCertificate().pigeon_newInstance((SslCertificate) obj, AndroidWebkitLibraryPigeonProxyApiBaseCodec$writeValue$29.INSTANCE);
        } else if (obj instanceof Certificate) {
            this.registrar.getPigeonApiCertificate().pigeon_newInstance((Certificate) obj, AndroidWebkitLibraryPigeonProxyApiBaseCodec$writeValue$30.INSTANCE);
        } else if (obj instanceof WebSettingsCompat) {
            this.registrar.getPigeonApiWebSettingsCompat().pigeon_newInstance((WebSettingsCompat) obj, AndroidWebkitLibraryPigeonProxyApiBaseCodec$writeValue$31.INSTANCE);
        } else if (obj instanceof WebViewFeature) {
            this.registrar.getPigeonApiWebViewFeature().pigeon_newInstance((WebViewFeature) obj, AndroidWebkitLibraryPigeonProxyApiBaseCodec$writeValue$32.INSTANCE);
        }
        if (this.registrar.getInstanceManager().containsInstance(obj)) {
            byteArrayOutputStream.write(128);
            writeValue(byteArrayOutputStream, this.registrar.getInstanceManager().getIdentifierForStrongReference(obj));
            return;
        }
        String name = obj.getClass().getName();
        throw new IllegalArgumentException("Unsupported value: '" + obj + "' of type '" + name + "'");
    }
}
