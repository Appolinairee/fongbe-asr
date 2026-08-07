package io.flutter.plugins.webviewflutter;

import android.webkit.SslErrorHandler;

class SslErrorHandlerProxyApi extends PigeonApiSslErrorHandler {
    SslErrorHandlerProxyApi(ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    public void cancel(SslErrorHandler sslErrorHandler) {
        sslErrorHandler.cancel();
    }

    public void proceed(SslErrorHandler sslErrorHandler) {
        sslErrorHandler.proceed();
    }
}
