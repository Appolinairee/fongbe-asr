package io.flutter.view;

import android.graphics.SurfaceTexture;
import android.media.Image;
import android.view.Surface;

public interface TextureRegistry {

    /* renamed from: io.flutter.view.TextureRegistry$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$onTrimMemory(TextureRegistry _this, int i) {
        }
    }

    public interface GLTextureConsumer {
        SurfaceTexture getSurfaceTexture();
    }

    public interface ImageConsumer {
        Image acquireLatestImage();
    }

    public interface ImageTextureEntry extends TextureEntry {
        void pushImage(Image image);
    }

    public interface OnFrameConsumedListener {
        void onFrameConsumed();
    }

    public interface OnTrimMemoryListener {
        void onTrimMemory(int i);
    }

    public interface SurfaceTextureEntry extends TextureEntry {

        /* renamed from: io.flutter.view.TextureRegistry$SurfaceTextureEntry$-CC  reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$setOnFrameConsumedListener(SurfaceTextureEntry _this, OnFrameConsumedListener onFrameConsumedListener) {
            }

            public static void $default$setOnTrimMemoryListener(SurfaceTextureEntry _this, OnTrimMemoryListener onTrimMemoryListener) {
            }
        }

        void setOnFrameConsumedListener(OnFrameConsumedListener onFrameConsumedListener);

        void setOnTrimMemoryListener(OnTrimMemoryListener onTrimMemoryListener);

        SurfaceTexture surfaceTexture();
    }

    public interface TextureEntry {
        long id();

        void release();
    }

    ImageTextureEntry createImageTexture();

    SurfaceProducer createSurfaceProducer();

    SurfaceTextureEntry createSurfaceTexture();

    void onTrimMemory(int i);

    SurfaceTextureEntry registerSurfaceTexture(SurfaceTexture surfaceTexture);

    public interface SurfaceProducer extends TextureEntry {
        int getHeight();

        Surface getSurface();

        int getWidth();

        boolean handlesCropAndRotation();

        void scheduleFrame();

        void setCallback(Callback callback);

        void setSize(int i, int i2);

        public interface Callback {
            void onSurfaceAvailable();

            void onSurfaceCleanup();

            @Deprecated(forRemoval = true, since = "Flutter 3.27")
            void onSurfaceCreated();

            @Deprecated(forRemoval = true, since = "Flutter 3.28")
            void onSurfaceDestroyed();

            /* renamed from: io.flutter.view.TextureRegistry$SurfaceProducer$Callback$-CC  reason: invalid class name */
            public final /* synthetic */ class CC {
                @Deprecated(forRemoval = true, since = "Flutter 3.27")
                public static void $default$onSurfaceCreated(Callback _this) {
                }

                @Deprecated(forRemoval = true, since = "Flutter 3.28")
                public static void $default$onSurfaceDestroyed(Callback _this) {
                }

                public static void $default$onSurfaceAvailable(Callback _this) {
                    _this.onSurfaceCreated();
                }

                public static void $default$onSurfaceCleanup(Callback _this) {
                    _this.onSurfaceDestroyed();
                }
            }
        }
    }
}
