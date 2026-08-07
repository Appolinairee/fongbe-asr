package io.flutter.plugin.platform;

import android.view.View;
import io.flutter.embedding.engine.systemchannels.PlatformViewsChannel;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class PlatformViewsController$$ExternalSyntheticLambda1 implements View.OnFocusChangeListener {
    public final /* synthetic */ PlatformViewsController f$0;
    public final /* synthetic */ PlatformViewsChannel.PlatformViewCreationRequest f$1;

    public /* synthetic */ PlatformViewsController$$ExternalSyntheticLambda1(PlatformViewsController platformViewsController, PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest) {
        this.f$0 = platformViewsController;
        this.f$1 = platformViewCreationRequest;
    }

    public final void onFocusChange(View view, boolean z) {
        this.f$0.m402lambda$configureForTextureLayerComposition$1$ioflutterpluginplatformPlatformViewsController(this.f$1, view, z);
    }
}
