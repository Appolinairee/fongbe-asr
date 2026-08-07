package io.flutter.plugins.webviewflutter;

import android.webkit.WebSettings;
import androidx.webkit.WebSettingsCompat;

public class WebSettingsCompatProxyApi extends PigeonApiWebSettingsCompat {
    public WebSettingsCompatProxyApi(ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    public void setPaymentRequestEnabled(WebSettings webSettings, boolean z) {
        WebSettingsCompat.setPaymentRequestEnabled(webSettings, z);
    }
}
