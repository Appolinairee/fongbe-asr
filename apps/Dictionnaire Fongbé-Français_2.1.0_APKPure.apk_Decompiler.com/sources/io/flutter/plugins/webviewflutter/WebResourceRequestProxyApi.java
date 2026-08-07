package io.flutter.plugins.webviewflutter;

import android.webkit.WebResourceRequest;
import java.util.Collections;
import java.util.Map;

public class WebResourceRequestProxyApi extends PigeonApiWebResourceRequest {
    public WebResourceRequestProxyApi(ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    public String url(WebResourceRequest webResourceRequest) {
        return webResourceRequest.getUrl().toString();
    }

    public boolean isForMainFrame(WebResourceRequest webResourceRequest) {
        return webResourceRequest.isForMainFrame();
    }

    public Boolean isRedirect(WebResourceRequest webResourceRequest) {
        if (getPigeonRegistrar().sdkIsAtLeast(24)) {
            return Boolean.valueOf(webResourceRequest.isRedirect());
        }
        return null;
    }

    public boolean hasGesture(WebResourceRequest webResourceRequest) {
        return webResourceRequest.hasGesture();
    }

    public String method(WebResourceRequest webResourceRequest) {
        return webResourceRequest.getMethod();
    }

    public Map<String, String> requestHeaders(WebResourceRequest webResourceRequest) {
        if (webResourceRequest.getRequestHeaders() == null) {
            return Collections.emptyMap();
        }
        return webResourceRequest.getRequestHeaders();
    }

    public ProxyApiRegistrar getPigeonRegistrar() {
        return (ProxyApiRegistrar) super.getPigeonRegistrar();
    }
}
