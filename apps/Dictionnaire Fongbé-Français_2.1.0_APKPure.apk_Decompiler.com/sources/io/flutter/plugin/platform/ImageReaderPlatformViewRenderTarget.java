package io.flutter.plugin.platform;

import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import io.flutter.Log;
import io.flutter.plugin.platform.PlatformViewRenderTarget;
import io.flutter.view.TextureRegistry;
import kotlin.io.path.FileVisitorImpl$$ExternalSyntheticApiModelOutline0;

public class ImageReaderPlatformViewRenderTarget implements PlatformViewRenderTarget {
    private static final int MAX_IMAGES = 4;
    private static final String TAG = "ImageReaderPlatformViewRenderTarget";
    private int bufferHeight = 0;
    private int bufferWidth = 0;
    private final Handler onImageAvailableHandler = new Handler();
    private final ImageReader.OnImageAvailableListener onImageAvailableListener = new ImageReader.OnImageAvailableListener() {
        public void onImageAvailable(ImageReader imageReader) {
            Image image;
            try {
                image = imageReader.acquireLatestImage();
            } catch (IllegalStateException e) {
                Log.e(ImageReaderPlatformViewRenderTarget.TAG, "onImageAvailable acquireLatestImage failed: " + e.toString());
                image = null;
            }
            if (image != null) {
                ImageReaderPlatformViewRenderTarget.this.textureEntry.pushImage(image);
            }
        }
    };
    private ImageReader reader;
    /* access modifiers changed from: private */
    public TextureRegistry.ImageTextureEntry textureEntry;

    public /* synthetic */ void scheduleFrame() {
        PlatformViewRenderTarget.CC.$default$scheduleFrame(this);
    }

    private void closeReader() {
        if (this.reader != null) {
            this.textureEntry.pushImage((Image) null);
            this.reader.close();
            this.reader = null;
        }
    }

    /* access modifiers changed from: protected */
    public ImageReader createImageReader33() {
        FileVisitorImpl$$ExternalSyntheticApiModelOutline0.m();
        ImageReader.Builder m = FileVisitorImpl$$ExternalSyntheticApiModelOutline0.m(this.bufferWidth, this.bufferHeight);
        ImageReader.Builder unused = m.setMaxImages(4);
        ImageReader.Builder unused2 = m.setImageFormat(34);
        ImageReader.Builder unused3 = m.setUsage(256);
        ImageReader m2 = m.build();
        m2.setOnImageAvailableListener(this.onImageAvailableListener, this.onImageAvailableHandler);
        return m2;
    }

    /* access modifiers changed from: protected */
    public ImageReader createImageReader29() {
        ImageReader m = ImageReader.newInstance(this.bufferWidth, this.bufferHeight, 34, 4, 256);
        m.setOnImageAvailableListener(this.onImageAvailableListener, this.onImageAvailableHandler);
        return m;
    }

    /* access modifiers changed from: protected */
    public ImageReader createImageReader() {
        if (Build.VERSION.SDK_INT >= 33) {
            return createImageReader33();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return createImageReader29();
        }
        throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
    }

    public ImageReaderPlatformViewRenderTarget(TextureRegistry.ImageTextureEntry imageTextureEntry) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.textureEntry = imageTextureEntry;
            return;
        }
        throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
    }

    public void resize(int i, int i2) {
        if (this.reader == null || this.bufferWidth != i || this.bufferHeight != i2) {
            closeReader();
            this.bufferWidth = i;
            this.bufferHeight = i2;
            this.reader = createImageReader();
        }
    }

    public int getWidth() {
        return this.bufferWidth;
    }

    public int getHeight() {
        return this.bufferHeight;
    }

    public long getId() {
        return this.textureEntry.id();
    }

    public void release() {
        closeReader();
        this.textureEntry = null;
    }

    public boolean isReleased() {
        return this.textureEntry == null;
    }

    public Surface getSurface() {
        return this.reader.getSurface();
    }
}
