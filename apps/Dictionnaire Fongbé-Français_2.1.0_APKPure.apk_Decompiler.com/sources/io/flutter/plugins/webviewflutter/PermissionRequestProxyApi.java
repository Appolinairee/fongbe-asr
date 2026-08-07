package io.flutter.plugins.webviewflutter;

import android.webkit.PermissionRequest;
import java.util.Arrays;
import java.util.List;

public class PermissionRequestProxyApi extends PigeonApiPermissionRequest {
    public PermissionRequestProxyApi(ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    public List<String> resources(PermissionRequest permissionRequest) {
        return Arrays.asList(permissionRequest.getResources());
    }

    public void grant(PermissionRequest permissionRequest, List<String> list) {
        permissionRequest.grant((String[]) list.toArray(new String[0]));
    }

    public void deny(PermissionRequest permissionRequest) {
        permissionRequest.deny();
    }
}
