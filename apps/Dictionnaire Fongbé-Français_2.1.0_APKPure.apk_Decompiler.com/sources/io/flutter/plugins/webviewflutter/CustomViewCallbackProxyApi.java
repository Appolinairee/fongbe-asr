package io.flutter.plugins.webviewflutter;

import android.webkit.WebChromeClient;

public class CustomViewCallbackProxyApi extends PigeonApiCustomViewCallback {
    public CustomViewCallbackProxyApi(ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    public void onCustomViewHidden(WebChromeClient.CustomViewCallback customViewCallback) {
        customViewCallback.onCustomViewHidden();
    }
}
