package io.flutter.plugins.webviewflutter;

import android.content.Context;
import android.view.View;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.PlatformViewFactory;

class FlutterViewFactory extends PlatformViewFactory {
    private final AndroidWebkitLibraryPigeonInstanceManager instanceManager;

    FlutterViewFactory(AndroidWebkitLibraryPigeonInstanceManager androidWebkitLibraryPigeonInstanceManager) {
        super(StandardMessageCodec.INSTANCE);
        this.instanceManager = androidWebkitLibraryPigeonInstanceManager;
    }

    public PlatformView create(Context context, int i, Object obj) {
        Integer num = (Integer) obj;
        if (num != null) {
            final Object instance = this.instanceManager.getInstance((long) num.intValue());
            if (instance instanceof PlatformView) {
                return (PlatformView) instance;
            }
            if (instance instanceof View) {
                return new PlatformView() {
                    public void dispose() {
                    }

                    public /* synthetic */ void onFlutterViewAttached(View view) {
                        PlatformView.CC.$default$onFlutterViewAttached(this, view);
                    }

                    public /* synthetic */ void onFlutterViewDetached() {
                        PlatformView.CC.$default$onFlutterViewDetached(this);
                    }

                    public /* synthetic */ void onInputConnectionLocked() {
                        PlatformView.CC.$default$onInputConnectionLocked(this);
                    }

                    public /* synthetic */ void onInputConnectionUnlocked() {
                        PlatformView.CC.$default$onInputConnectionUnlocked(this);
                    }

                    public View getView() {
                        return (View) instance;
                    }
                };
            }
            throw new IllegalStateException("Unable to find a PlatformView or View instance: " + obj + ", " + instance);
        }
        throw new IllegalStateException("An identifier is required to retrieve a View instance.");
    }
}
