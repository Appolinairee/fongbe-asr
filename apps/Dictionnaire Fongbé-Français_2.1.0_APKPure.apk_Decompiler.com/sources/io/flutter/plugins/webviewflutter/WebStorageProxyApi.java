package io.flutter.plugins.webviewflutter;

import android.webkit.WebStorage;

public class WebStorageProxyApi extends PigeonApiWebStorage {
    public WebStorageProxyApi(ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    public WebStorage instance() {
        return WebStorage.getInstance();
    }

    public void deleteAllData(WebStorage webStorage) {
        webStorage.deleteAllData();
    }
}
