package io.flutter.plugins.webviewflutter;

import android.net.Uri;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.List;
import java.util.Objects;
import kotlin.Result;
import kotlin.Unit;

public class WebChromeClientProxyApi extends PigeonApiWebChromeClient {

    public static class WebChromeClientImpl extends SecureWebChromeClient {
        private static final String TAG = "WebChromeClientImpl";
        private final WebChromeClientProxyApi api;
        private boolean returnValueForOnConsoleMessage = false;
        private boolean returnValueForOnJsAlert = false;
        private boolean returnValueForOnJsConfirm = false;
        private boolean returnValueForOnJsPrompt = false;
        private boolean returnValueForOnShowFileChooser = false;

        static /* synthetic */ Unit lambda$onConsoleMessage$7(Result result) {
            return null;
        }

        static /* synthetic */ Unit lambda$onGeolocationPermissionsHidePrompt$4(Result result) {
            return null;
        }

        static /* synthetic */ Unit lambda$onGeolocationPermissionsShowPrompt$3(Result result) {
            return null;
        }

        static /* synthetic */ Unit lambda$onHideCustomView$2(Result result) {
            return null;
        }

        static /* synthetic */ Unit lambda$onPermissionRequest$6(Result result) {
            return null;
        }

        static /* synthetic */ Unit lambda$onProgressChanged$0(Result result) {
            return null;
        }

        static /* synthetic */ Unit lambda$onShowCustomView$1(Result result) {
            return null;
        }

        public WebChromeClientImpl(WebChromeClientProxyApi webChromeClientProxyApi) {
            this.api = webChromeClientProxyApi;
        }

        public void onProgressChanged(WebView webView, int i) {
            this.api.onProgressChanged(this, webView, (long) i, new WebChromeClientProxyApi$WebChromeClientImpl$$ExternalSyntheticLambda7());
        }

        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            this.api.onShowCustomView(this, view, customViewCallback, new WebChromeClientProxyApi$WebChromeClientImpl$$ExternalSyntheticLambda4());
        }

        public void onHideCustomView() {
            this.api.onHideCustomView(this, new WebChromeClientProxyApi$WebChromeClientImpl$$ExternalSyntheticLambda10());
        }

        public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
            this.api.onGeolocationPermissionsShowPrompt(this, str, callback, new WebChromeClientProxyApi$WebChromeClientImpl$$ExternalSyntheticLambda5());
        }

        public void onGeolocationPermissionsHidePrompt() {
            this.api.onGeolocationPermissionsHidePrompt(this, new WebChromeClientProxyApi$WebChromeClientImpl$$ExternalSyntheticLambda1());
        }

        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            boolean z = this.returnValueForOnShowFileChooser;
            this.api.onShowFileChooser(this, webView, fileChooserParams, ResultCompat.asCompatCallback(new WebChromeClientProxyApi$WebChromeClientImpl$$ExternalSyntheticLambda9(this, z, valueCallback)));
            return z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$onShowFileChooser$5$io-flutter-plugins-webviewflutter-WebChromeClientProxyApi$WebChromeClientImpl  reason: not valid java name */
        public /* synthetic */ Unit m473lambda$onShowFileChooser$5$ioflutterpluginswebviewflutterWebChromeClientProxyApi$WebChromeClientImpl(boolean z, ValueCallback valueCallback, ResultCompat resultCompat) {
            if (resultCompat.isFailure()) {
                this.api.getPigeonRegistrar().logError(TAG, (Throwable) Objects.requireNonNull(resultCompat.exceptionOrNull()));
                return null;
            }
            List list = (List) Objects.requireNonNull((List) resultCompat.getOrNull());
            if (z) {
                Uri[] uriArr = new Uri[list.size()];
                for (int i = 0; i < list.size(); i++) {
                    uriArr[i] = Uri.parse((String) list.get(i));
                }
                valueCallback.onReceiveValue(uriArr);
            }
            return null;
        }

        public void onPermissionRequest(PermissionRequest permissionRequest) {
            this.api.onPermissionRequest(this, permissionRequest, new WebChromeClientProxyApi$WebChromeClientImpl$$ExternalSyntheticLambda8());
        }

        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            this.api.onConsoleMessage(this, consoleMessage, new WebChromeClientProxyApi$WebChromeClientImpl$$ExternalSyntheticLambda3());
            return this.returnValueForOnConsoleMessage;
        }

        public void setReturnValueForOnShowFileChooser(boolean z) {
            this.returnValueForOnShowFileChooser = z;
        }

        public void setReturnValueForOnConsoleMessage(boolean z) {
            this.returnValueForOnConsoleMessage = z;
        }

        public void setReturnValueForOnJsAlert(boolean z) {
            this.returnValueForOnJsAlert = z;
        }

        public void setReturnValueForOnJsConfirm(boolean z) {
            this.returnValueForOnJsConfirm = z;
        }

        public void setReturnValueForOnJsPrompt(boolean z) {
            this.returnValueForOnJsPrompt = z;
        }

        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            if (!this.returnValueForOnJsAlert) {
                return false;
            }
            this.api.onJsAlert(this, webView, str, str2, ResultCompat.asCompatCallback(new WebChromeClientProxyApi$WebChromeClientImpl$$ExternalSyntheticLambda6(this, jsResult)));
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$onJsAlert$8$io-flutter-plugins-webviewflutter-WebChromeClientProxyApi$WebChromeClientImpl  reason: not valid java name */
        public /* synthetic */ Unit m470lambda$onJsAlert$8$ioflutterpluginswebviewflutterWebChromeClientProxyApi$WebChromeClientImpl(JsResult jsResult, ResultCompat resultCompat) {
            if (resultCompat.isFailure()) {
                this.api.getPigeonRegistrar().logError(TAG, (Throwable) Objects.requireNonNull(resultCompat.exceptionOrNull()));
                return null;
            }
            jsResult.confirm();
            return null;
        }

        public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            if (!this.returnValueForOnJsConfirm) {
                return false;
            }
            this.api.onJsConfirm(this, webView, str, str2, ResultCompat.asCompatCallback(new WebChromeClientProxyApi$WebChromeClientImpl$$ExternalSyntheticLambda0(this, jsResult)));
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$onJsConfirm$9$io-flutter-plugins-webviewflutter-WebChromeClientProxyApi$WebChromeClientImpl  reason: not valid java name */
        public /* synthetic */ Unit m471lambda$onJsConfirm$9$ioflutterpluginswebviewflutterWebChromeClientProxyApi$WebChromeClientImpl(JsResult jsResult, ResultCompat resultCompat) {
            if (resultCompat.isFailure()) {
                this.api.getPigeonRegistrar().logError(TAG, (Throwable) Objects.requireNonNull(resultCompat.exceptionOrNull()));
                return null;
            }
            if (Boolean.TRUE.equals(resultCompat.getOrNull())) {
                jsResult.confirm();
            } else {
                jsResult.cancel();
            }
            return null;
        }

        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            if (!this.returnValueForOnJsPrompt) {
                return false;
            }
            this.api.onJsPrompt(this, webView, str, str2, str3, ResultCompat.asCompatCallback(new WebChromeClientProxyApi$WebChromeClientImpl$$ExternalSyntheticLambda2(this, jsPromptResult)));
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$onJsPrompt$10$io-flutter-plugins-webviewflutter-WebChromeClientProxyApi$WebChromeClientImpl  reason: not valid java name */
        public /* synthetic */ Unit m472lambda$onJsPrompt$10$ioflutterpluginswebviewflutterWebChromeClientProxyApi$WebChromeClientImpl(JsPromptResult jsPromptResult, ResultCompat resultCompat) {
            if (resultCompat.isFailure()) {
                this.api.getPigeonRegistrar().logError(TAG, (Throwable) Objects.requireNonNull(resultCompat.exceptionOrNull()));
                return null;
            }
            String str = (String) resultCompat.getOrNull();
            if (str != null) {
                jsPromptResult.confirm(str);
            } else {
                jsPromptResult.cancel();
            }
            return null;
        }
    }

    public static class SecureWebChromeClient extends WebChromeClient {
        WebViewClient webViewClient;

        public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            return onCreateWindow(webView, message, new WebView(webView.getContext()));
        }

        /* access modifiers changed from: package-private */
        public boolean onCreateWindow(final WebView webView, Message message, WebView webView2) {
            if (this.webViewClient == null) {
                return false;
            }
            AnonymousClass1 r0 = new WebViewClient() {
                public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                    if (SecureWebChromeClient.this.webViewClient.shouldOverrideUrlLoading(webView, webResourceRequest)) {
                        return true;
                    }
                    webView.loadUrl(webResourceRequest.getUrl().toString());
                    return true;
                }

                public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    if (SecureWebChromeClient.this.webViewClient.shouldOverrideUrlLoading(webView, str)) {
                        return true;
                    }
                    webView.loadUrl(str);
                    return true;
                }
            };
            if (webView2 == null) {
                webView2 = new WebView(webView.getContext());
            }
            webView2.setWebViewClient(r0);
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }

        public void setWebViewClient(WebViewClient webViewClient2) {
            this.webViewClient = webViewClient2;
        }
    }

    public WebChromeClientProxyApi(ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    public WebChromeClientImpl pigeon_defaultConstructor() {
        return new WebChromeClientImpl(this);
    }

    public void setSynchronousReturnValueForOnShowFileChooser(WebChromeClientImpl webChromeClientImpl, boolean z) {
        webChromeClientImpl.setReturnValueForOnShowFileChooser(z);
    }

    public void setSynchronousReturnValueForOnConsoleMessage(WebChromeClientImpl webChromeClientImpl, boolean z) {
        webChromeClientImpl.setReturnValueForOnConsoleMessage(z);
    }

    public void setSynchronousReturnValueForOnJsAlert(WebChromeClientImpl webChromeClientImpl, boolean z) {
        webChromeClientImpl.setReturnValueForOnJsAlert(z);
    }

    public void setSynchronousReturnValueForOnJsConfirm(WebChromeClientImpl webChromeClientImpl, boolean z) {
        webChromeClientImpl.setReturnValueForOnJsConfirm(z);
    }

    public void setSynchronousReturnValueForOnJsPrompt(WebChromeClientImpl webChromeClientImpl, boolean z) {
        webChromeClientImpl.setReturnValueForOnJsPrompt(z);
    }

    public ProxyApiRegistrar getPigeonRegistrar() {
        return (ProxyApiRegistrar) super.getPigeonRegistrar();
    }
}
