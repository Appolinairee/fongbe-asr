package io.flutter.plugins.webviewflutter;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.webkit.WebResourceErrorCompat;
import androidx.webkit.WebViewClientCompat;
import kotlin.Result;
import kotlin.Unit;

public class WebViewClientProxyApi extends PigeonApiWebViewClient {

    public static class WebViewClientImpl extends WebViewClient {
        private final WebViewClientProxyApi api;
        private boolean returnValueForShouldOverrideUrlLoading = false;

        static /* synthetic */ Unit lambda$doUpdateVisitedHistory$14(Result result) {
            return null;
        }

        static /* synthetic */ Unit lambda$onFormResubmission$18(Result result) {
            return null;
        }

        static /* synthetic */ Unit lambda$onLoadResource$20(Result result) {
            return null;
        }

        static /* synthetic */ Unit lambda$onPageCommitVisible$22(Result result) {
            return null;
        }

        static /* synthetic */ Unit lambda$onPageFinished$2(Result result) {
            return null;
        }

        static /* synthetic */ Unit lambda$onPageStarted$0(Result result) {
            return null;
        }

        static /* synthetic */ Unit lambda$onReceivedClientCertRequest$24(Result result) {
            return null;
        }

        static /* synthetic */ Unit lambda$onReceivedError$6(Result result) {
            return null;
        }

        static /* synthetic */ Unit lambda$onReceivedError$8(Result result) {
            return null;
        }

        static /* synthetic */ Unit lambda$onReceivedHttpAuthRequest$16(Result result) {
            return null;
        }

        static /* synthetic */ Unit lambda$onReceivedHttpError$4(Result result) {
            return null;
        }

        static /* synthetic */ Unit lambda$onReceivedLoginRequest$26(Result result) {
            return null;
        }

        static /* synthetic */ Unit lambda$onReceivedSslError$28(Result result) {
            return null;
        }

        static /* synthetic */ Unit lambda$onScaleChanged$30(Result result) {
            return null;
        }

        static /* synthetic */ Unit lambda$shouldOverrideUrlLoading$10(Result result) {
            return null;
        }

        static /* synthetic */ Unit lambda$shouldOverrideUrlLoading$12(Result result) {
            return null;
        }

        public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        }

        public WebViewClientImpl(WebViewClientProxyApi webViewClientProxyApi) {
            this.api = webViewClientProxyApi;
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            this.api.getPigeonRegistrar().runOnMainThread(new WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda11(this, webView, str));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$onPageStarted$1$io-flutter-plugins-webviewflutter-WebViewClientProxyApi$WebViewClientImpl  reason: not valid java name */
        public /* synthetic */ void m495lambda$onPageStarted$1$ioflutterpluginswebviewflutterWebViewClientProxyApi$WebViewClientImpl(WebView webView, String str) {
            this.api.onPageStarted(this, webView, str, new WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda9());
        }

        public void onPageFinished(WebView webView, String str) {
            this.api.getPigeonRegistrar().runOnMainThread(new WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda1(this, webView, str));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$onPageFinished$3$io-flutter-plugins-webviewflutter-WebViewClientProxyApi$WebViewClientImpl  reason: not valid java name */
        public /* synthetic */ void m494lambda$onPageFinished$3$ioflutterpluginswebviewflutterWebViewClientProxyApi$WebViewClientImpl(WebView webView, String str) {
            this.api.onPageFinished(this, webView, str, new WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda30());
        }

        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            this.api.getPigeonRegistrar().runOnMainThread(new WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda31(this, webView, webResourceRequest, webResourceResponse));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$onReceivedHttpError$5$io-flutter-plugins-webviewflutter-WebViewClientProxyApi$WebViewClientImpl  reason: not valid java name */
        public /* synthetic */ void m500lambda$onReceivedHttpError$5$ioflutterpluginswebviewflutterWebViewClientProxyApi$WebViewClientImpl(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            this.api.onReceivedHttpError(this, webView, webResourceRequest, webResourceResponse, new WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda27());
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            this.api.getPigeonRegistrar().runOnMainThread(new WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda26(this, webView, webResourceRequest, webResourceError));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$onReceivedError$7$io-flutter-plugins-webviewflutter-WebViewClientProxyApi$WebViewClientImpl  reason: not valid java name */
        public /* synthetic */ void m497lambda$onReceivedError$7$ioflutterpluginswebviewflutterWebViewClientProxyApi$WebViewClientImpl(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            this.api.onReceivedRequestError(this, webView, webResourceRequest, webResourceError, new WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda12());
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            this.api.getPigeonRegistrar().runOnMainThread(new WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda19(this, webView, i, str, str2));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$onReceivedError$9$io-flutter-plugins-webviewflutter-WebViewClientProxyApi$WebViewClientImpl  reason: not valid java name */
        public /* synthetic */ void m498lambda$onReceivedError$9$ioflutterpluginswebviewflutterWebViewClientProxyApi$WebViewClientImpl(WebView webView, int i, String str, String str2) {
            this.api.onReceivedError(this, webView, (long) i, str, str2, new WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda2());
        }

        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            this.api.getPigeonRegistrar().runOnMainThread(new WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda5(this, webView, webResourceRequest));
            return webResourceRequest.isForMainFrame() && this.returnValueForShouldOverrideUrlLoading;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$shouldOverrideUrlLoading$11$io-flutter-plugins-webviewflutter-WebViewClientProxyApi$WebViewClientImpl  reason: not valid java name */
        public /* synthetic */ void m504lambda$shouldOverrideUrlLoading$11$ioflutterpluginswebviewflutterWebViewClientProxyApi$WebViewClientImpl(WebView webView, WebResourceRequest webResourceRequest) {
            this.api.requestLoading(this, webView, webResourceRequest, new WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda20());
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            this.api.getPigeonRegistrar().runOnMainThread(new WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda14(this, webView, str));
            return this.returnValueForShouldOverrideUrlLoading;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$shouldOverrideUrlLoading$13$io-flutter-plugins-webviewflutter-WebViewClientProxyApi$WebViewClientImpl  reason: not valid java name */
        public /* synthetic */ void m505lambda$shouldOverrideUrlLoading$13$ioflutterpluginswebviewflutterWebViewClientProxyApi$WebViewClientImpl(WebView webView, String str) {
            this.api.urlLoading(this, webView, str, new WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda16());
        }

        public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
            this.api.getPigeonRegistrar().runOnMainThread(new WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda8(this, webView, str, z));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$doUpdateVisitedHistory$15$io-flutter-plugins-webviewflutter-WebViewClientProxyApi$WebViewClientImpl  reason: not valid java name */
        public /* synthetic */ void m490lambda$doUpdateVisitedHistory$15$ioflutterpluginswebviewflutterWebViewClientProxyApi$WebViewClientImpl(WebView webView, String str, boolean z) {
            this.api.doUpdateVisitedHistory(this, webView, str, z, new WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda7());
        }

        public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            this.api.getPigeonRegistrar().runOnMainThread(new WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda29(this, webView, httpAuthHandler, str, str2));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$onReceivedHttpAuthRequest$17$io-flutter-plugins-webviewflutter-WebViewClientProxyApi$WebViewClientImpl  reason: not valid java name */
        public /* synthetic */ void m499lambda$onReceivedHttpAuthRequest$17$ioflutterpluginswebviewflutterWebViewClientProxyApi$WebViewClientImpl(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            this.api.onReceivedHttpAuthRequest(this, webView, httpAuthHandler, str, str2, new WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda22());
        }

        public void onFormResubmission(WebView webView, Message message, Message message2) {
            this.api.getPigeonRegistrar().runOnMainThread(new WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda18(this, webView, message, message2));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$onFormResubmission$19$io-flutter-plugins-webviewflutter-WebViewClientProxyApi$WebViewClientImpl  reason: not valid java name */
        public /* synthetic */ void m491lambda$onFormResubmission$19$ioflutterpluginswebviewflutterWebViewClientProxyApi$WebViewClientImpl(WebView webView, Message message, Message message2) {
            this.api.onFormResubmission(this, webView, message, message2, new WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda4());
        }

        public void onLoadResource(WebView webView, String str) {
            this.api.getPigeonRegistrar().runOnMainThread(new WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda21(this, webView, str));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$onLoadResource$21$io-flutter-plugins-webviewflutter-WebViewClientProxyApi$WebViewClientImpl  reason: not valid java name */
        public /* synthetic */ void m492lambda$onLoadResource$21$ioflutterpluginswebviewflutterWebViewClientProxyApi$WebViewClientImpl(WebView webView, String str) {
            this.api.onLoadResource(this, webView, str, new WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda3());
        }

        public void onPageCommitVisible(WebView webView, String str) {
            this.api.getPigeonRegistrar().runOnMainThread(new WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda6(this, webView, str));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$onPageCommitVisible$23$io-flutter-plugins-webviewflutter-WebViewClientProxyApi$WebViewClientImpl  reason: not valid java name */
        public /* synthetic */ void m493lambda$onPageCommitVisible$23$ioflutterpluginswebviewflutterWebViewClientProxyApi$WebViewClientImpl(WebView webView, String str) {
            this.api.onPageCommitVisible(this, webView, str, new WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda0());
        }

        public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
            this.api.getPigeonRegistrar().runOnMainThread(new WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda15(this, webView, clientCertRequest));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$onReceivedClientCertRequest$25$io-flutter-plugins-webviewflutter-WebViewClientProxyApi$WebViewClientImpl  reason: not valid java name */
        public /* synthetic */ void m496lambda$onReceivedClientCertRequest$25$ioflutterpluginswebviewflutterWebViewClientProxyApi$WebViewClientImpl(WebView webView, ClientCertRequest clientCertRequest) {
            this.api.onReceivedClientCertRequest(this, webView, clientCertRequest, new WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda23());
        }

        public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
            this.api.getPigeonRegistrar().runOnMainThread(new WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda25(this, webView, str, str2, str3));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$onReceivedLoginRequest$27$io-flutter-plugins-webviewflutter-WebViewClientProxyApi$WebViewClientImpl  reason: not valid java name */
        public /* synthetic */ void m501lambda$onReceivedLoginRequest$27$ioflutterpluginswebviewflutterWebViewClientProxyApi$WebViewClientImpl(WebView webView, String str, String str2, String str3) {
            this.api.onReceivedLoginRequest(this, webView, str, str2, str3, new WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda17());
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            this.api.getPigeonRegistrar().runOnMainThread(new WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda24(this, webView, sslErrorHandler, sslError));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$onReceivedSslError$29$io-flutter-plugins-webviewflutter-WebViewClientProxyApi$WebViewClientImpl  reason: not valid java name */
        public /* synthetic */ void m502lambda$onReceivedSslError$29$ioflutterpluginswebviewflutterWebViewClientProxyApi$WebViewClientImpl(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            this.api.onReceivedSslError(this, webView, sslErrorHandler, sslError, new WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda13());
        }

        public void onScaleChanged(WebView webView, float f, float f2) {
            this.api.getPigeonRegistrar().runOnMainThread(new WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda10(this, webView, f, f2));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$onScaleChanged$31$io-flutter-plugins-webviewflutter-WebViewClientProxyApi$WebViewClientImpl  reason: not valid java name */
        public /* synthetic */ void m503lambda$onScaleChanged$31$ioflutterpluginswebviewflutterWebViewClientProxyApi$WebViewClientImpl(WebView webView, float f, float f2) {
            this.api.onScaleChanged(this, webView, (double) f, (double) f2, new WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda28());
        }

        public void setReturnValueForShouldOverrideUrlLoading(boolean z) {
            this.returnValueForShouldOverrideUrlLoading = z;
        }
    }

    public static class WebViewClientCompatImpl extends WebViewClientCompat {
        private final WebViewClientProxyApi api;
        private boolean returnValueForShouldOverrideUrlLoading = false;

        static /* synthetic */ Unit lambda$doUpdateVisitedHistory$14(Result result) {
            return null;
        }

        static /* synthetic */ Unit lambda$onFormResubmission$18(Result result) {
            return null;
        }

        static /* synthetic */ Unit lambda$onLoadResource$20(Result result) {
            return null;
        }

        static /* synthetic */ Unit lambda$onPageCommitVisible$22(Result result) {
            return null;
        }

        static /* synthetic */ Unit lambda$onPageFinished$2(Result result) {
            return null;
        }

        static /* synthetic */ Unit lambda$onPageStarted$0(Result result) {
            return null;
        }

        static /* synthetic */ Unit lambda$onReceivedClientCertRequest$24(Result result) {
            return null;
        }

        static /* synthetic */ Unit lambda$onReceivedError$6(Result result) {
            return null;
        }

        static /* synthetic */ Unit lambda$onReceivedError$8(Result result) {
            return null;
        }

        static /* synthetic */ Unit lambda$onReceivedHttpAuthRequest$16(Result result) {
            return null;
        }

        static /* synthetic */ Unit lambda$onReceivedHttpError$4(Result result) {
            return null;
        }

        static /* synthetic */ Unit lambda$onReceivedLoginRequest$26(Result result) {
            return null;
        }

        static /* synthetic */ Unit lambda$onReceivedSslError$28(Result result) {
            return null;
        }

        static /* synthetic */ Unit lambda$onScaleChanged$30(Result result) {
            return null;
        }

        static /* synthetic */ Unit lambda$shouldOverrideUrlLoading$10(Result result) {
            return null;
        }

        static /* synthetic */ Unit lambda$shouldOverrideUrlLoading$12(Result result) {
            return null;
        }

        public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        }

        public WebViewClientCompatImpl(WebViewClientProxyApi webViewClientProxyApi) {
            this.api = webViewClientProxyApi;
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            this.api.getPigeonRegistrar().runOnMainThread(new WebViewClientProxyApi$WebViewClientCompatImpl$$ExternalSyntheticLambda4(this, webView, str));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$onPageStarted$1$io-flutter-plugins-webviewflutter-WebViewClientProxyApi$WebViewClientCompatImpl  reason: not valid java name */
        public /* synthetic */ void m479lambda$onPageStarted$1$ioflutterpluginswebviewflutterWebViewClientProxyApi$WebViewClientCompatImpl(WebView webView, String str) {
            this.api.onPageStarted(this, webView, str, new WebViewClientProxyApi$WebViewClientCompatImpl$$ExternalSyntheticLambda17());
        }

        public void onPageFinished(WebView webView, String str) {
            this.api.getPigeonRegistrar().runOnMainThread(new WebViewClientProxyApi$WebViewClientCompatImpl$$ExternalSyntheticLambda31(this, webView, str));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$onPageFinished$3$io-flutter-plugins-webviewflutter-WebViewClientProxyApi$WebViewClientCompatImpl  reason: not valid java name */
        public /* synthetic */ void m478lambda$onPageFinished$3$ioflutterpluginswebviewflutterWebViewClientProxyApi$WebViewClientCompatImpl(WebView webView, String str) {
            this.api.onPageFinished(this, webView, str, new WebViewClientProxyApi$WebViewClientCompatImpl$$ExternalSyntheticLambda11());
        }

        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            this.api.getPigeonRegistrar().runOnMainThread(new WebViewClientProxyApi$WebViewClientCompatImpl$$ExternalSyntheticLambda14(this, webView, webResourceRequest, webResourceResponse));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$onReceivedHttpError$5$io-flutter-plugins-webviewflutter-WebViewClientProxyApi$WebViewClientCompatImpl  reason: not valid java name */
        public /* synthetic */ void m484lambda$onReceivedHttpError$5$ioflutterpluginswebviewflutterWebViewClientProxyApi$WebViewClientCompatImpl(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            this.api.onReceivedHttpError(this, webView, webResourceRequest, webResourceResponse, new WebViewClientProxyApi$WebViewClientCompatImpl$$ExternalSyntheticLambda15());
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceErrorCompat webResourceErrorCompat) {
            this.api.getPigeonRegistrar().runOnMainThread(new WebViewClientProxyApi$WebViewClientCompatImpl$$ExternalSyntheticLambda10(this, webView, webResourceRequest, webResourceErrorCompat));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$onReceivedError$7$io-flutter-plugins-webviewflutter-WebViewClientProxyApi$WebViewClientCompatImpl  reason: not valid java name */
        public /* synthetic */ void m481lambda$onReceivedError$7$ioflutterpluginswebviewflutterWebViewClientProxyApi$WebViewClientCompatImpl(WebView webView, WebResourceRequest webResourceRequest, WebResourceErrorCompat webResourceErrorCompat) {
            this.api.onReceivedRequestErrorCompat(this, webView, webResourceRequest, webResourceErrorCompat, new WebViewClientProxyApi$WebViewClientCompatImpl$$ExternalSyntheticLambda28());
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            this.api.getPigeonRegistrar().runOnMainThread(new WebViewClientProxyApi$WebViewClientCompatImpl$$ExternalSyntheticLambda0(this, webView, i, str, str2));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$onReceivedError$9$io-flutter-plugins-webviewflutter-WebViewClientProxyApi$WebViewClientCompatImpl  reason: not valid java name */
        public /* synthetic */ void m482lambda$onReceivedError$9$ioflutterpluginswebviewflutterWebViewClientProxyApi$WebViewClientCompatImpl(WebView webView, int i, String str, String str2) {
            this.api.onReceivedError(this, webView, (long) i, str, str2, new WebViewClientProxyApi$WebViewClientCompatImpl$$ExternalSyntheticLambda1());
        }

        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            this.api.getPigeonRegistrar().runOnMainThread(new WebViewClientProxyApi$WebViewClientCompatImpl$$ExternalSyntheticLambda27(this, webView, webResourceRequest));
            return webResourceRequest.isForMainFrame() && this.returnValueForShouldOverrideUrlLoading;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$shouldOverrideUrlLoading$11$io-flutter-plugins-webviewflutter-WebViewClientProxyApi$WebViewClientCompatImpl  reason: not valid java name */
        public /* synthetic */ void m488lambda$shouldOverrideUrlLoading$11$ioflutterpluginswebviewflutterWebViewClientProxyApi$WebViewClientCompatImpl(WebView webView, WebResourceRequest webResourceRequest) {
            this.api.requestLoading(this, webView, webResourceRequest, new WebViewClientProxyApi$WebViewClientCompatImpl$$ExternalSyntheticLambda7());
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            this.api.getPigeonRegistrar().runOnMainThread(new WebViewClientProxyApi$WebViewClientCompatImpl$$ExternalSyntheticLambda20(this, webView, str));
            return this.returnValueForShouldOverrideUrlLoading;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$shouldOverrideUrlLoading$13$io-flutter-plugins-webviewflutter-WebViewClientProxyApi$WebViewClientCompatImpl  reason: not valid java name */
        public /* synthetic */ void m489lambda$shouldOverrideUrlLoading$13$ioflutterpluginswebviewflutterWebViewClientProxyApi$WebViewClientCompatImpl(WebView webView, String str) {
            this.api.urlLoading(this, webView, str, new WebViewClientProxyApi$WebViewClientCompatImpl$$ExternalSyntheticLambda23());
        }

        public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
            this.api.getPigeonRegistrar().runOnMainThread(new WebViewClientProxyApi$WebViewClientCompatImpl$$ExternalSyntheticLambda30(this, webView, str, z));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$doUpdateVisitedHistory$15$io-flutter-plugins-webviewflutter-WebViewClientProxyApi$WebViewClientCompatImpl  reason: not valid java name */
        public /* synthetic */ void m474lambda$doUpdateVisitedHistory$15$ioflutterpluginswebviewflutterWebViewClientProxyApi$WebViewClientCompatImpl(WebView webView, String str, boolean z) {
            this.api.doUpdateVisitedHistory(this, webView, str, z, new WebViewClientProxyApi$WebViewClientCompatImpl$$ExternalSyntheticLambda19());
        }

        public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            this.api.getPigeonRegistrar().runOnMainThread(new WebViewClientProxyApi$WebViewClientCompatImpl$$ExternalSyntheticLambda8(this, webView, httpAuthHandler, str, str2));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$onReceivedHttpAuthRequest$17$io-flutter-plugins-webviewflutter-WebViewClientProxyApi$WebViewClientCompatImpl  reason: not valid java name */
        public /* synthetic */ void m483lambda$onReceivedHttpAuthRequest$17$ioflutterpluginswebviewflutterWebViewClientProxyApi$WebViewClientCompatImpl(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            this.api.onReceivedHttpAuthRequest(this, webView, httpAuthHandler, str, str2, new WebViewClientProxyApi$WebViewClientCompatImpl$$ExternalSyntheticLambda26());
        }

        public void onFormResubmission(WebView webView, Message message, Message message2) {
            this.api.getPigeonRegistrar().runOnMainThread(new WebViewClientProxyApi$WebViewClientCompatImpl$$ExternalSyntheticLambda2(this, webView, message, message2));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$onFormResubmission$19$io-flutter-plugins-webviewflutter-WebViewClientProxyApi$WebViewClientCompatImpl  reason: not valid java name */
        public /* synthetic */ void m475lambda$onFormResubmission$19$ioflutterpluginswebviewflutterWebViewClientProxyApi$WebViewClientCompatImpl(WebView webView, Message message, Message message2) {
            this.api.onFormResubmission(this, webView, message, message2, new WebViewClientProxyApi$WebViewClientCompatImpl$$ExternalSyntheticLambda25());
        }

        public void onLoadResource(WebView webView, String str) {
            this.api.getPigeonRegistrar().runOnMainThread(new WebViewClientProxyApi$WebViewClientCompatImpl$$ExternalSyntheticLambda29(this, webView, str));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$onLoadResource$21$io-flutter-plugins-webviewflutter-WebViewClientProxyApi$WebViewClientCompatImpl  reason: not valid java name */
        public /* synthetic */ void m476lambda$onLoadResource$21$ioflutterpluginswebviewflutterWebViewClientProxyApi$WebViewClientCompatImpl(WebView webView, String str) {
            this.api.onLoadResource(this, webView, str, new WebViewClientProxyApi$WebViewClientCompatImpl$$ExternalSyntheticLambda21());
        }

        public void onPageCommitVisible(WebView webView, String str) {
            this.api.getPigeonRegistrar().runOnMainThread(new WebViewClientProxyApi$WebViewClientCompatImpl$$ExternalSyntheticLambda24(this, webView, str));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$onPageCommitVisible$23$io-flutter-plugins-webviewflutter-WebViewClientProxyApi$WebViewClientCompatImpl  reason: not valid java name */
        public /* synthetic */ void m477lambda$onPageCommitVisible$23$ioflutterpluginswebviewflutterWebViewClientProxyApi$WebViewClientCompatImpl(WebView webView, String str) {
            this.api.onPageCommitVisible(this, webView, str, new WebViewClientProxyApi$WebViewClientCompatImpl$$ExternalSyntheticLambda22());
        }

        public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
            this.api.getPigeonRegistrar().runOnMainThread(new WebViewClientProxyApi$WebViewClientCompatImpl$$ExternalSyntheticLambda9(this, webView, clientCertRequest));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$onReceivedClientCertRequest$25$io-flutter-plugins-webviewflutter-WebViewClientProxyApi$WebViewClientCompatImpl  reason: not valid java name */
        public /* synthetic */ void m480lambda$onReceivedClientCertRequest$25$ioflutterpluginswebviewflutterWebViewClientProxyApi$WebViewClientCompatImpl(WebView webView, ClientCertRequest clientCertRequest) {
            this.api.onReceivedClientCertRequest(this, webView, clientCertRequest, new WebViewClientProxyApi$WebViewClientCompatImpl$$ExternalSyntheticLambda16());
        }

        public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
            this.api.getPigeonRegistrar().runOnMainThread(new WebViewClientProxyApi$WebViewClientCompatImpl$$ExternalSyntheticLambda13(this, webView, str, str2, str3));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$onReceivedLoginRequest$27$io-flutter-plugins-webviewflutter-WebViewClientProxyApi$WebViewClientCompatImpl  reason: not valid java name */
        public /* synthetic */ void m485lambda$onReceivedLoginRequest$27$ioflutterpluginswebviewflutterWebViewClientProxyApi$WebViewClientCompatImpl(WebView webView, String str, String str2, String str3) {
            this.api.onReceivedLoginRequest(this, webView, str, str2, str3, new WebViewClientProxyApi$WebViewClientCompatImpl$$ExternalSyntheticLambda18());
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            this.api.getPigeonRegistrar().runOnMainThread(new WebViewClientProxyApi$WebViewClientCompatImpl$$ExternalSyntheticLambda6(this, webView, sslErrorHandler, sslError));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$onReceivedSslError$29$io-flutter-plugins-webviewflutter-WebViewClientProxyApi$WebViewClientCompatImpl  reason: not valid java name */
        public /* synthetic */ void m486lambda$onReceivedSslError$29$ioflutterpluginswebviewflutterWebViewClientProxyApi$WebViewClientCompatImpl(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            this.api.onReceivedSslError(this, webView, sslErrorHandler, sslError, new WebViewClientProxyApi$WebViewClientCompatImpl$$ExternalSyntheticLambda12());
        }

        public void onScaleChanged(WebView webView, float f, float f2) {
            this.api.getPigeonRegistrar().runOnMainThread(new WebViewClientProxyApi$WebViewClientCompatImpl$$ExternalSyntheticLambda3(this, webView, f, f2));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$onScaleChanged$31$io-flutter-plugins-webviewflutter-WebViewClientProxyApi$WebViewClientCompatImpl  reason: not valid java name */
        public /* synthetic */ void m487lambda$onScaleChanged$31$ioflutterpluginswebviewflutterWebViewClientProxyApi$WebViewClientCompatImpl(WebView webView, float f, float f2) {
            this.api.onScaleChanged(this, webView, (double) f, (double) f2, new WebViewClientProxyApi$WebViewClientCompatImpl$$ExternalSyntheticLambda5());
        }

        public void setReturnValueForShouldOverrideUrlLoading(boolean z) {
            this.returnValueForShouldOverrideUrlLoading = z;
        }
    }

    public WebViewClientProxyApi(ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    public WebViewClient pigeon_defaultConstructor() {
        if (getPigeonRegistrar().sdkIsAtLeast(24)) {
            return new WebViewClientImpl(this);
        }
        return new WebViewClientCompatImpl(this);
    }

    public void setSynchronousReturnValueForShouldOverrideUrlLoading(WebViewClient webViewClient, boolean z) {
        if (webViewClient instanceof WebViewClientCompatImpl) {
            ((WebViewClientCompatImpl) webViewClient).setReturnValueForShouldOverrideUrlLoading(z);
        } else if (!getPigeonRegistrar().sdkIsAtLeast(24) || !(webViewClient instanceof WebViewClientImpl)) {
            throw new IllegalStateException("This WebViewClient doesn't support setting the returnValueForShouldOverrideUrlLoading.");
        } else {
            ((WebViewClientImpl) webViewClient).setReturnValueForShouldOverrideUrlLoading(z);
        }
    }

    public ProxyApiRegistrar getPigeonRegistrar() {
        return (ProxyApiRegistrar) super.getPigeonRegistrar();
    }
}
