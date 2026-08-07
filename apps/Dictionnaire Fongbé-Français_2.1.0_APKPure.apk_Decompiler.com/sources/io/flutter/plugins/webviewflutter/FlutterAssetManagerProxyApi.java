package io.flutter.plugins.webviewflutter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlutterAssetManagerProxyApi extends PigeonApiFlutterAssetManager {
    public FlutterAssetManagerProxyApi(ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    public FlutterAssetManager instance() {
        return getPigeonRegistrar().getFlutterAssetManager();
    }

    public List<String> list(FlutterAssetManager flutterAssetManager, String str) {
        try {
            String[] list = flutterAssetManager.list(str);
            if (list == null) {
                return new ArrayList();
            }
            return Arrays.asList(list);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public String getAssetFilePathByName(FlutterAssetManager flutterAssetManager, String str) {
        return flutterAssetManager.getAssetFilePathByName(str);
    }

    public ProxyApiRegistrar getPigeonRegistrar() {
        return (ProxyApiRegistrar) super.getPigeonRegistrar();
    }
}
