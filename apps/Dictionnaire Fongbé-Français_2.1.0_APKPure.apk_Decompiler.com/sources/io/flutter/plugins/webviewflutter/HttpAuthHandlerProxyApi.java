package io.flutter.plugins.webviewflutter;

import android.webkit.HttpAuthHandler;

public class HttpAuthHandlerProxyApi extends PigeonApiHttpAuthHandler {
    public HttpAuthHandlerProxyApi(ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    public boolean useHttpAuthUsernamePassword(HttpAuthHandler httpAuthHandler) {
        return httpAuthHandler.useHttpAuthUsernamePassword();
    }

    public void cancel(HttpAuthHandler httpAuthHandler) {
        httpAuthHandler.cancel();
    }

    public void proceed(HttpAuthHandler httpAuthHandler, String str, String str2) {
        httpAuthHandler.proceed(str, str2);
    }
}
