package io.flutter.embedding.engine.renderer;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.view.TextureRegistry;

final class SurfaceTextureSurfaceProducer implements TextureRegistry.SurfaceProducer, TextureRegistry.GLTextureConsumer {
    private final FlutterJNI flutterJNI;
    private final Handler handler;
    private final long id;
    private boolean released;
    private int requestBufferWidth;
    private int requestedBufferHeight;
    private Surface surface;
    private final TextureRegistry.SurfaceTextureEntry texture;

    public boolean handlesCropAndRotation() {
        return true;
    }

    public void setCallback(TextureRegistry.SurfaceProducer.Callback callback) {
    }

    SurfaceTextureSurfaceProducer(long j, Handler handler2, FlutterJNI flutterJNI2, TextureRegistry.SurfaceTextureEntry surfaceTextureEntry) {
        this.id = j;
        this.handler = handler2;
        this.flutterJNI = flutterJNI2;
        this.texture = surfaceTextureEntry;
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        try {
            if (!this.released) {
                release();
                this.handler.post(new FlutterRenderer.TextureFinalizerRunnable(this.id, this.flutterJNI));
                super.finalize();
            }
        } finally {
            super.finalize();
        }
    }

    public long id() {
        return this.id;
    }

    public void release() {
        this.texture.release();
        this.released = true;
    }

    public SurfaceTexture getSurfaceTexture() {
        return this.texture.surfaceTexture();
    }

    public void setSize(int i, int i2) {
        this.requestBufferWidth = i;
        this.requestedBufferHeight = i2;
        getSurfaceTexture().setDefaultBufferSize(i, i2);
    }

    public int getWidth() {
        return this.requestBufferWidth;
    }

    public int getHeight() {
        return this.requestedBufferHeight;
    }

    public Surface getSurface() {
        if (this.surface == null) {
            this.surface = new Surface(this.texture.surfaceTexture());
        }
        return this.surface;
    }

    public void scheduleFrame() {
        this.flutterJNI.markTextureFrameAvailable(this.id);
    }
}
