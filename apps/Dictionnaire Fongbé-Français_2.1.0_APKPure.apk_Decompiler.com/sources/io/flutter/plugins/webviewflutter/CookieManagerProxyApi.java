package io.flutter.plugins.webviewflutter;

import android.webkit.CookieManager;
import android.webkit.WebView;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public class CookieManagerProxyApi extends PigeonApiCookieManager {
    public CookieManagerProxyApi(ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    public ProxyApiRegistrar getPigeonRegistrar() {
        return (ProxyApiRegistrar) super.getPigeonRegistrar();
    }

    public CookieManager instance() {
        return CookieManager.getInstance();
    }

    public void setCookie(CookieManager cookieManager, String str, String str2) {
        cookieManager.setCookie(str, str2);
    }

    public void removeAllCookies(CookieManager cookieManager, Function1<? super Result<Boolean>, Unit> function1) {
        cookieManager.removeAllCookies(new CookieManagerProxyApi$$ExternalSyntheticLambda0(function1));
    }

    public void setAcceptThirdPartyCookies(CookieManager cookieManager, WebView webView, boolean z) {
        cookieManager.setAcceptThirdPartyCookies(webView, z);
    }
}
