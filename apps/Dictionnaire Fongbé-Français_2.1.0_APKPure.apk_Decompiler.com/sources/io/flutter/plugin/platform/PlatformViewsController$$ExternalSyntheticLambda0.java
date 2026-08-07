package io.flutter.plugin.platform;

import android.view.View;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class PlatformViewsController$$ExternalSyntheticLambda0 implements View.OnFocusChangeListener {
    public final /* synthetic */ PlatformViewsController f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ PlatformViewsController$$ExternalSyntheticLambda0(PlatformViewsController platformViewsController, int i) {
        this.f$0 = platformViewsController;
        this.f$1 = i;
    }

    public final void onFocusChange(View view, boolean z) {
        this.f$0.m404lambda$initializePlatformViewIfNeeded$2$ioflutterpluginplatformPlatformViewsController(this.f$1, view, z);
    }
}
