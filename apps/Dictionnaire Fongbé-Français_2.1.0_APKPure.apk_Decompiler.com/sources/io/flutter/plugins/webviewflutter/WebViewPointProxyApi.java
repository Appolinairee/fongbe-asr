package io.flutter.plugins.webviewflutter;

public class WebViewPointProxyApi extends PigeonApiWebViewPoint {
    public WebViewPointProxyApi(ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    public long x(WebViewPoint webViewPoint) {
        return webViewPoint.getX();
    }

    public long y(WebViewPoint webViewPoint) {
        return webViewPoint.getY();
    }
}
