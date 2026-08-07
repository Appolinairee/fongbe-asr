package io.flutter.plugins.webviewflutter;

import androidx.webkit.WebViewFeature;

public class WebViewFeatureProxyApi extends PigeonApiWebViewFeature {
    public WebViewFeatureProxyApi(ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    public boolean isFeatureSupported(String str) {
        return WebViewFeature.isFeatureSupported(str);
    }
}
