package io.flutter.plugin.platform;

import android.view.Surface;
import io.flutter.view.TextureRegistry;

public class SurfaceProducerPlatformViewRenderTarget implements PlatformViewRenderTarget {
    private static final String TAG = "SurfaceProducerRenderTarget";
    private TextureRegistry.SurfaceProducer producer;

    public SurfaceProducerPlatformViewRenderTarget(TextureRegistry.SurfaceProducer surfaceProducer) {
        this.producer = surfaceProducer;
    }

    public void resize(int i, int i2) {
        this.producer.setSize(i, i2);
    }

    public int getWidth() {
        return this.producer.getWidth();
    }

    public int getHeight() {
        return this.producer.getHeight();
    }

    public long getId() {
        return this.producer.id();
    }

    public void release() {
        this.producer.release();
        this.producer = null;
    }

    public boolean isReleased() {
        return this.producer == null;
    }

    public Surface getSurface() {
        return this.producer.getSurface();
    }

    public void scheduleFrame() {
        this.producer.scheduleFrame();
    }
}
