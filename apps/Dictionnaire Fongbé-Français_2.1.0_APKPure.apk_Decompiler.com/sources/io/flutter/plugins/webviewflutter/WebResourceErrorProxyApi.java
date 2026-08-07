package io.flutter.plugins.webviewflutter;

import android.webkit.WebResourceError;

public class WebResourceErrorProxyApi extends PigeonApiWebResourceError {
    public WebResourceErrorProxyApi(ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    public long errorCode(WebResourceError webResourceError) {
        return (long) SslCertificateProxyApi$$ExternalSyntheticApiModelOutline0.m(webResourceError);
    }

    public String description(WebResourceError webResourceError) {
        return SslCertificateProxyApi$$ExternalSyntheticApiModelOutline0.m(webResourceError).toString();
    }
}
