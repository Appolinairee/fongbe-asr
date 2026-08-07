package io.flutter.plugins.webviewflutter;

import androidx.webkit.WebResourceErrorCompat;

public class WebResourceErrorCompatProxyApi extends PigeonApiWebResourceErrorCompat {
    public WebResourceErrorCompatProxyApi(ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    public long errorCode(WebResourceErrorCompat webResourceErrorCompat) {
        return (long) webResourceErrorCompat.getErrorCode();
    }

    public String description(WebResourceErrorCompat webResourceErrorCompat) {
        return webResourceErrorCompat.getDescription().toString();
    }
}
