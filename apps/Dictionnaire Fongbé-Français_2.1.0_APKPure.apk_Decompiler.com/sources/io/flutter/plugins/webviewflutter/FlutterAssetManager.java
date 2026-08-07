package io.flutter.plugins.webviewflutter;

import android.content.res.AssetManager;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import java.io.IOException;

public abstract class FlutterAssetManager {
    final AssetManager assetManager;

    /* access modifiers changed from: package-private */
    public abstract String getAssetFilePathByName(String str);

    public FlutterAssetManager(AssetManager assetManager2) {
        this.assetManager = assetManager2;
    }

    public String[] list(String str) throws IOException {
        return this.assetManager.list(str);
    }

    static class PluginBindingFlutterAssetManager extends FlutterAssetManager {
        final FlutterPlugin.FlutterAssets flutterAssets;

        PluginBindingFlutterAssetManager(AssetManager assetManager, FlutterPlugin.FlutterAssets flutterAssets2) {
            super(assetManager);
            this.flutterAssets = flutterAssets2;
        }

        public String getAssetFilePathByName(String str) {
            return this.flutterAssets.getAssetFilePathByName(str);
        }
    }
}
