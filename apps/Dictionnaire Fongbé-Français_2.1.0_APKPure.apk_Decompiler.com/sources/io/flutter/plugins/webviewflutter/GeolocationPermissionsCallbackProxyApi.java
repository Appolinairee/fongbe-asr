package io.flutter.plugins.webviewflutter;

import android.webkit.GeolocationPermissions;

public class GeolocationPermissionsCallbackProxyApi extends PigeonApiGeolocationPermissionsCallback {
    public GeolocationPermissionsCallbackProxyApi(ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    public void invoke(GeolocationPermissions.Callback callback, String str, boolean z, boolean z2) {
        callback.invoke(str, z, z2);
    }
}
