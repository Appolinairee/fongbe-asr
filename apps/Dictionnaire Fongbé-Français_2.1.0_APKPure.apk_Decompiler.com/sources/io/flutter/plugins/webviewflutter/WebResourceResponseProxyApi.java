package io.flutter.plugins.webviewflutter;

import android.webkit.WebResourceResponse;

public class WebResourceResponseProxyApi extends PigeonApiWebResourceResponse {
    public WebResourceResponseProxyApi(ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    public long statusCode(WebResourceResponse webResourceResponse) {
        return (long) webResourceResponse.getStatusCode();
    }
}
