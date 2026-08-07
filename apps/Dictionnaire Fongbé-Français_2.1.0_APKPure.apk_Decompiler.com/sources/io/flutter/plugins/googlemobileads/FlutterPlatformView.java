package io.flutter.plugins.googlemobileads;

import android.view.View;
import io.flutter.plugin.platform.PlatformView;

class FlutterPlatformView implements PlatformView {
    private View view;

    public /* synthetic */ void onFlutterViewAttached(View view2) {
        PlatformView.CC.$default$onFlutterViewAttached(this, view2);
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

    FlutterPlatformView(View view2) {
        this.view = view2;
    }

    public View getView() {
        return this.view;
    }

    public void dispose() {
        this.view = null;
    }
}
