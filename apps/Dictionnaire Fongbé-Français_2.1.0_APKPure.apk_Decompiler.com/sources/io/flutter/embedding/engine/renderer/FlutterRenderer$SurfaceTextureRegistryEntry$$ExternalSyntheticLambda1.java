package io.flutter.embedding.engine.renderer;

import android.graphics.SurfaceTexture;
import io.flutter.embedding.engine.renderer.FlutterRenderer;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class FlutterRenderer$SurfaceTextureRegistryEntry$$ExternalSyntheticLambda1 implements SurfaceTexture.OnFrameAvailableListener {
    public final /* synthetic */ FlutterRenderer.SurfaceTextureRegistryEntry f$0;

    public /* synthetic */ FlutterRenderer$SurfaceTextureRegistryEntry$$ExternalSyntheticLambda1(FlutterRenderer.SurfaceTextureRegistryEntry surfaceTextureRegistryEntry) {
        this.f$0 = surfaceTextureRegistryEntry;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f$0.m400lambda$new$1$ioflutterembeddingenginerendererFlutterRenderer$SurfaceTextureRegistryEntry(surfaceTexture);
    }
}
