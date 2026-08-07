package io.flutter.plugins.webviewflutter;

import android.hardware.display.DisplayManager;
import android.view.View;
import android.view.ViewParent;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import io.flutter.embedding.android.FlutterView;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugins.webviewflutter.WebChromeClientProxyApi;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public class WebViewProxyApi extends PigeonApiWebView {

    public static class WebViewPlatformView extends WebView implements PlatformView {
        private final WebViewProxyApi api;
        private WebChromeClientProxyApi.SecureWebChromeClient currentWebChromeClient = new WebChromeClientProxyApi.SecureWebChromeClient();
        private WebViewClient currentWebViewClient = new WebViewClient();

        static /* synthetic */ Unit lambda$onScrollChanged$0(Result result) {
            return null;
        }

        public void dispose() {
        }

        public View getView() {
            return this;
        }

        public /* synthetic */ void onFlutterViewAttached(View view) {
            PlatformView.CC.$default$onFlutterViewAttached(this, view);
        }

        public /* synthetic */ void onFlutterViewDetached() {
            PlatformView.CC.$default$onFlutterViewDetached(this);
        }

        public /* synthetic */ void onInputConnectionLocked() {
            PlatformView.CC.$default$onInputConnectionLocked(this);
        }

        public /* synthetic */ void onInputConnectionUnlocked() {
            PlatformView.CC.$default$onInputConnectionUnlocked(this);
        }

        WebViewPlatformView(WebViewProxyApi webViewProxyApi) {
            super(webViewProxyApi.getPigeonRegistrar().getContext());
            this.api = webViewProxyApi;
            setWebViewClient(this.currentWebViewClient);
            setWebChromeClient(this.currentWebChromeClient);
        }

        /* access modifiers changed from: protected */
        public void onAttachedToWindow() {
            FlutterView tryFindFlutterView;
            super.onAttachedToWindow();
            if (this.api.getPigeonRegistrar().sdkIsAtLeast(26) && (tryFindFlutterView = tryFindFlutterView()) != null) {
                tryFindFlutterView.setImportantForAutofill(1);
            }
        }

        private FlutterView tryFindFlutterView() {
            ViewParent viewParent = this;
            while (viewParent.getParent() != null) {
                viewParent = viewParent.getParent();
                if (viewParent instanceof FlutterView) {
                    return (FlutterView) viewParent;
                }
            }
            return null;
        }

        public void setWebViewClient(WebViewClient webViewClient) {
            super.setWebViewClient(webViewClient);
            this.currentWebViewClient = webViewClient;
            this.currentWebChromeClient.setWebViewClient(webViewClient);
        }

        public void setWebChromeClient(WebChromeClient webChromeClient) {
            super.setWebChromeClient(webChromeClient);
            if (webChromeClient instanceof WebChromeClientProxyApi.SecureWebChromeClient) {
                WebChromeClientProxyApi.SecureWebChromeClient secureWebChromeClient = (WebChromeClientProxyApi.SecureWebChromeClient) webChromeClient;
                this.currentWebChromeClient = secureWebChromeClient;
                secureWebChromeClient.setWebViewClient(this.currentWebViewClient);
                return;
            }
            throw new AssertionError("Client must be a SecureWebChromeClient.");
        }

        public WebChromeClient getWebChromeClient() {
            return this.currentWebChromeClient;
        }

        /* access modifiers changed from: protected */
        public void onScrollChanged(int i, int i2, int i3, int i4) {
            super.onScrollChanged(i, i2, i3, i4);
            this.api.getPigeonRegistrar().runOnMainThread(new WebViewProxyApi$WebViewPlatformView$$ExternalSyntheticLambda1(this, i, i2, i3, i4));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$onScrollChanged$1$io-flutter-plugins-webviewflutter-WebViewProxyApi$WebViewPlatformView  reason: not valid java name */
        public /* synthetic */ void m506lambda$onScrollChanged$1$ioflutterpluginswebviewflutterWebViewProxyApi$WebViewPlatformView(int i, int i2, int i3, int i4) {
            this.api.onScrollChanged(this, (long) i, (long) i2, (long) i3, (long) i4, new WebViewProxyApi$WebViewPlatformView$$ExternalSyntheticLambda2());
        }
    }

    public WebViewProxyApi(ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    public WebView pigeon_defaultConstructor() {
        DisplayListenerProxy displayListenerProxy = new DisplayListenerProxy();
        DisplayManager displayManager = (DisplayManager) getPigeonRegistrar().getContext().getSystemService("display");
        displayListenerProxy.onPreWebViewInitialization(displayManager);
        WebViewPlatformView webViewPlatformView = new WebViewPlatformView(this);
        displayListenerProxy.onPostWebViewInitialization(displayManager);
        return webViewPlatformView;
    }

    public WebSettings settings(WebView webView) {
        return webView.getSettings();
    }

    public void loadData(WebView webView, String str, String str2, String str3) {
        webView.loadData(str, str2, str3);
    }

    public void loadDataWithBaseUrl(WebView webView, String str, String str2, String str3, String str4, String str5) {
        webView.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    public void loadUrl(WebView webView, String str, Map<String, String> map) {
        webView.loadUrl(str, map);
    }

    public void postUrl(WebView webView, String str, byte[] bArr) {
        webView.postUrl(str, bArr);
    }

    public String getUrl(WebView webView) {
        return webView.getUrl();
    }

    public boolean canGoBack(WebView webView) {
        return webView.canGoBack();
    }

    public boolean canGoForward(WebView webView) {
        return webView.canGoForward();
    }

    public void goBack(WebView webView) {
        webView.goBack();
    }

    public void goForward(WebView webView) {
        webView.goForward();
    }

    public void reload(WebView webView) {
        webView.reload();
    }

    public void clearCache(WebView webView, boolean z) {
        webView.clearCache(z);
    }

    public void evaluateJavascript(WebView webView, String str, Function1<? super Result<String>, Unit> function1) {
        webView.evaluateJavascript(str, new WebViewProxyApi$$ExternalSyntheticLambda0(function1));
    }

    public String getTitle(WebView webView) {
        return webView.getTitle();
    }

    public void setWebContentsDebuggingEnabled(boolean z) {
        WebView.setWebContentsDebuggingEnabled(z);
    }

    public void setWebViewClient(WebView webView, WebViewClient webViewClient) {
        webView.setWebViewClient(webViewClient);
    }

    public void addJavaScriptChannel(WebView webView, JavaScriptChannel javaScriptChannel) {
        webView.addJavascriptInterface(javaScriptChannel, javaScriptChannel.javaScriptChannelName);
    }

    public void removeJavaScriptChannel(WebView webView, String str) {
        webView.removeJavascriptInterface(str);
    }

    public void setDownloadListener(WebView webView, DownloadListener downloadListener) {
        webView.setDownloadListener(downloadListener);
    }

    public void setWebChromeClient(WebView webView, WebChromeClientProxyApi.WebChromeClientImpl webChromeClientImpl) {
        webView.setWebChromeClient(webChromeClientImpl);
    }

    public void setBackgroundColor(WebView webView, long j) {
        webView.setBackgroundColor((int) j);
    }

    public ProxyApiRegistrar getPigeonRegistrar() {
        return (ProxyApiRegistrar) super.getPigeonRegistrar();
    }

    public void destroy(WebView webView) {
        webView.destroy();
    }
}
