package io.flutter.plugins.webviewflutter;

public class JavaScriptChannelProxyApi extends PigeonApiJavaScriptChannel {
    public JavaScriptChannelProxyApi(ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    public JavaScriptChannel pigeon_defaultConstructor(String str) {
        return new JavaScriptChannel(str, this);
    }

    public ProxyApiRegistrar getPigeonRegistrar() {
        return (ProxyApiRegistrar) super.getPigeonRegistrar();
    }
}
