package io.flutter.embedding.engine.renderer;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.TextureRegistry;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.io.path.FileVisitorImpl$$ExternalSyntheticApiModelOutline0;

public class FlutterRenderer implements TextureRegistry {
    private static final String TAG = "FlutterRenderer";
    public static boolean debugDisableSurfaceClear = false;
    public static boolean debugForceSurfaceProducerGlTextures = false;
    /* access modifiers changed from: private */
    public final FlutterJNI flutterJNI;
    private final FlutterUiDisplayListener flutterUiDisplayListener;
    /* access modifiers changed from: private */
    public final Handler handler = new Handler();
    /* access modifiers changed from: private */
    public final List<ImageReaderSurfaceProducer> imageReaderProducers = new ArrayList();
    /* access modifiers changed from: private */
    public boolean isDisplayingFlutterUi = false;
    private final AtomicLong nextTextureId = new AtomicLong(0);
    private final Set<WeakReference<TextureRegistry.OnTrimMemoryListener>> onTrimMemoryListeners = new HashSet();
    private Surface surface;

    public FlutterRenderer(FlutterJNI flutterJNI2) {
        AnonymousClass1 r0 = new FlutterUiDisplayListener() {
            public void onFlutterUiDisplayed() {
                boolean unused = FlutterRenderer.this.isDisplayingFlutterUi = true;
            }

            public void onFlutterUiNoLongerDisplayed() {
                boolean unused = FlutterRenderer.this.isDisplayingFlutterUi = false;
            }
        };
        this.flutterUiDisplayListener = r0;
        this.flutterJNI = flutterJNI2;
        flutterJNI2.addIsDisplayingFlutterUiListener(r0);
        ProcessLifecycleOwner.get().getLifecycle().addObserver(new DefaultLifecycleObserver() {
            public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
                DefaultLifecycleObserver.CC.$default$onCreate(this, lifecycleOwner);
            }

            public /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
                DefaultLifecycleObserver.CC.$default$onDestroy(this, lifecycleOwner);
            }

            public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
                DefaultLifecycleObserver.CC.$default$onPause(this, lifecycleOwner);
            }

            public /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
                DefaultLifecycleObserver.CC.$default$onStart(this, lifecycleOwner);
            }

            public /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
                DefaultLifecycleObserver.CC.$default$onStop(this, lifecycleOwner);
            }

            public void onResume(LifecycleOwner lifecycleOwner) {
                Log.v(FlutterRenderer.TAG, "onResume called; notifying SurfaceProducers");
                for (ImageReaderSurfaceProducer imageReaderSurfaceProducer : FlutterRenderer.this.imageReaderProducers) {
                    if (imageReaderSurfaceProducer.callback != null && imageReaderSurfaceProducer.notifiedDestroy) {
                        boolean unused = imageReaderSurfaceProducer.notifiedDestroy = false;
                        imageReaderSurfaceProducer.callback.onSurfaceAvailable();
                    }
                }
            }
        });
    }

    public boolean isDisplayingFlutterUi() {
        return this.isDisplayingFlutterUi;
    }

    public void addIsDisplayingFlutterUiListener(FlutterUiDisplayListener flutterUiDisplayListener2) {
        this.flutterJNI.addIsDisplayingFlutterUiListener(flutterUiDisplayListener2);
        if (this.isDisplayingFlutterUi) {
            flutterUiDisplayListener2.onFlutterUiDisplayed();
        }
    }

    public void removeIsDisplayingFlutterUiListener(FlutterUiDisplayListener flutterUiDisplayListener2) {
        this.flutterJNI.removeIsDisplayingFlutterUiListener(flutterUiDisplayListener2);
    }

    private void clearDeadListeners() {
        Iterator<WeakReference<TextureRegistry.OnTrimMemoryListener>> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            if (((TextureRegistry.OnTrimMemoryListener) it.next().get()) == null) {
                it.remove();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void addOnTrimMemoryListener(TextureRegistry.OnTrimMemoryListener onTrimMemoryListener) {
        clearDeadListeners();
        this.onTrimMemoryListeners.add(new WeakReference(onTrimMemoryListener));
    }

    /* access modifiers changed from: package-private */
    public void removeOnTrimMemoryListener(TextureRegistry.OnTrimMemoryListener onTrimMemoryListener) {
        for (WeakReference next : this.onTrimMemoryListeners) {
            if (next.get() == onTrimMemoryListener) {
                this.onTrimMemoryListeners.remove(next);
                return;
            }
        }
    }

    public TextureRegistry.SurfaceProducer createSurfaceProducer() {
        if (debugForceSurfaceProducerGlTextures || Build.VERSION.SDK_INT < 29 || this.flutterJNI.ShouldDisableAHB()) {
            TextureRegistry.SurfaceTextureEntry createSurfaceTexture = createSurfaceTexture();
            SurfaceTextureSurfaceProducer surfaceTextureSurfaceProducer = new SurfaceTextureSurfaceProducer(createSurfaceTexture.id(), this.handler, this.flutterJNI, createSurfaceTexture);
            Log.v(TAG, "New SurfaceTextureSurfaceProducer ID: " + createSurfaceTexture.id());
            return surfaceTextureSurfaceProducer;
        }
        long andIncrement = this.nextTextureId.getAndIncrement();
        ImageReaderSurfaceProducer imageReaderSurfaceProducer = new ImageReaderSurfaceProducer(andIncrement);
        registerImageTexture(andIncrement, imageReaderSurfaceProducer);
        addOnTrimMemoryListener(imageReaderSurfaceProducer);
        this.imageReaderProducers.add(imageReaderSurfaceProducer);
        Log.v(TAG, "New ImageReaderSurfaceProducer ID: " + andIncrement);
        return imageReaderSurfaceProducer;
    }

    public TextureRegistry.SurfaceTextureEntry createSurfaceTexture() {
        Log.v(TAG, "Creating a SurfaceTexture.");
        return registerSurfaceTexture(new SurfaceTexture(0));
    }

    public TextureRegistry.SurfaceTextureEntry registerSurfaceTexture(SurfaceTexture surfaceTexture) {
        return registerSurfaceTexture(this.nextTextureId.getAndIncrement(), surfaceTexture);
    }

    private TextureRegistry.SurfaceTextureEntry registerSurfaceTexture(long j, SurfaceTexture surfaceTexture) {
        surfaceTexture.detachFromGLContext();
        SurfaceTextureRegistryEntry surfaceTextureRegistryEntry = new SurfaceTextureRegistryEntry(j, surfaceTexture);
        Log.v(TAG, "New SurfaceTexture ID: " + surfaceTextureRegistryEntry.id());
        registerTexture(surfaceTextureRegistryEntry.id(), surfaceTextureRegistryEntry.textureWrapper());
        addOnTrimMemoryListener(surfaceTextureRegistryEntry);
        return surfaceTextureRegistryEntry;
    }

    public TextureRegistry.ImageTextureEntry createImageTexture() {
        ImageTextureRegistryEntry imageTextureRegistryEntry = new ImageTextureRegistryEntry(this.nextTextureId.getAndIncrement());
        Log.v(TAG, "New ImageTextureEntry ID: " + imageTextureRegistryEntry.id());
        registerImageTexture(imageTextureRegistryEntry.id(), imageTextureRegistryEntry);
        return imageTextureRegistryEntry;
    }

    public void onTrimMemory(int i) {
        Iterator<WeakReference<TextureRegistry.OnTrimMemoryListener>> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            TextureRegistry.OnTrimMemoryListener onTrimMemoryListener = (TextureRegistry.OnTrimMemoryListener) it.next().get();
            if (onTrimMemoryListener != null) {
                onTrimMemoryListener.onTrimMemory(i);
            } else {
                it.remove();
            }
        }
    }

    final class SurfaceTextureRegistryEntry implements TextureRegistry.SurfaceTextureEntry, TextureRegistry.OnTrimMemoryListener {
        private TextureRegistry.OnFrameConsumedListener frameConsumedListener;
        private final long id;
        private boolean released;
        private final SurfaceTextureWrapper textureWrapper;
        private TextureRegistry.OnTrimMemoryListener trimMemoryListener;

        SurfaceTextureRegistryEntry(long j, SurfaceTexture surfaceTexture) {
            this.id = j;
            this.textureWrapper = new SurfaceTextureWrapper(surfaceTexture, new FlutterRenderer$SurfaceTextureRegistryEntry$$ExternalSyntheticLambda0(this));
            surfaceTexture().setOnFrameAvailableListener(new FlutterRenderer$SurfaceTextureRegistryEntry$$ExternalSyntheticLambda1(this), new Handler());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$new$0$io-flutter-embedding-engine-renderer-FlutterRenderer$SurfaceTextureRegistryEntry  reason: not valid java name */
        public /* synthetic */ void m399lambda$new$0$ioflutterembeddingenginerendererFlutterRenderer$SurfaceTextureRegistryEntry() {
            TextureRegistry.OnFrameConsumedListener onFrameConsumedListener = this.frameConsumedListener;
            if (onFrameConsumedListener != null) {
                onFrameConsumedListener.onFrameConsumed();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$new$1$io-flutter-embedding-engine-renderer-FlutterRenderer$SurfaceTextureRegistryEntry  reason: not valid java name */
        public /* synthetic */ void m400lambda$new$1$ioflutterembeddingenginerendererFlutterRenderer$SurfaceTextureRegistryEntry(SurfaceTexture surfaceTexture) {
            if (!this.released && FlutterRenderer.this.flutterJNI.isAttached()) {
                this.textureWrapper.markDirty();
                FlutterRenderer.this.scheduleEngineFrame();
            }
        }

        public void onTrimMemory(int i) {
            TextureRegistry.OnTrimMemoryListener onTrimMemoryListener = this.trimMemoryListener;
            if (onTrimMemoryListener != null) {
                onTrimMemoryListener.onTrimMemory(i);
            }
        }

        private void removeListener() {
            FlutterRenderer.this.removeOnTrimMemoryListener(this);
        }

        public SurfaceTextureWrapper textureWrapper() {
            return this.textureWrapper;
        }

        public SurfaceTexture surfaceTexture() {
            return this.textureWrapper.surfaceTexture();
        }

        public long id() {
            return this.id;
        }

        public void release() {
            if (!this.released) {
                Log.v(FlutterRenderer.TAG, "Releasing a SurfaceTexture (" + this.id + ").");
                this.textureWrapper.release();
                FlutterRenderer.this.unregisterTexture(this.id);
                removeListener();
                this.released = true;
            }
        }

        /* access modifiers changed from: protected */
        public void finalize() throws Throwable {
            try {
                if (!this.released) {
                    FlutterRenderer.this.handler.post(new TextureFinalizerRunnable(this.id, FlutterRenderer.this.flutterJNI));
                    super.finalize();
                }
            } finally {
                super.finalize();
            }
        }

        public void setOnFrameConsumedListener(TextureRegistry.OnFrameConsumedListener onFrameConsumedListener) {
            this.frameConsumedListener = onFrameConsumedListener;
        }

        public void setOnTrimMemoryListener(TextureRegistry.OnTrimMemoryListener onTrimMemoryListener) {
            this.trimMemoryListener = onTrimMemoryListener;
        }
    }

    static final class TextureFinalizerRunnable implements Runnable {
        private final FlutterJNI flutterJNI;
        private final long id;

        TextureFinalizerRunnable(long j, FlutterJNI flutterJNI2) {
            this.id = j;
            this.flutterJNI = flutterJNI2;
        }

        public void run() {
            if (this.flutterJNI.isAttached()) {
                Log.v(FlutterRenderer.TAG, "Releasing a Texture (" + this.id + ").");
                this.flutterJNI.unregisterTexture(this.id);
            }
        }
    }

    final class ImageReaderSurfaceProducer implements TextureRegistry.SurfaceProducer, TextureRegistry.ImageConsumer, TextureRegistry.OnTrimMemoryListener {
        private static final boolean CLEANUP_ON_MEMORY_PRESSURE = true;
        private static final int MAX_IMAGES = 5;
        private static final String TAG = "ImageReaderSurfaceProducer";
        private static final boolean VERBOSE_LOGS = false;
        private static final boolean trimOnMemoryPressure = true;
        /* access modifiers changed from: private */
        public TextureRegistry.SurfaceProducer.Callback callback = null;
        private boolean createNewReader = true;
        private final long id;
        private boolean ignoringFence = false;
        private final ArrayDeque<PerImageReader> imageReaderQueue = new ArrayDeque<>();
        private long lastDequeueTime = 0;
        private PerImage lastDequeuedImage = null;
        private long lastQueueTime = 0;
        /* access modifiers changed from: private */
        public PerImageReader lastReaderDequeuedFrom = null;
        private long lastScheduleTime = 0;
        private final Object lock = new Object();
        /* access modifiers changed from: private */
        public boolean notifiedDestroy = false;
        private int numTrims = 0;
        private final HashMap<ImageReader, PerImageReader> perImageReaders = new HashMap<>();
        /* access modifiers changed from: private */
        public boolean released;
        private int requestedHeight = 1;
        private int requestedWidth = 1;

        /* access modifiers changed from: package-private */
        public double deltaMillis(long j) {
            return ((double) j) / 1000000.0d;
        }

        public boolean handlesCropAndRotation() {
            return false;
        }

        private class PerImage {
            public final Image image;
            public final long queuedTime;

            public PerImage(Image image2, long j) {
                this.image = image2;
                this.queuedTime = j;
            }
        }

        private class PerImageReader {
            private boolean closed = false;
            /* access modifiers changed from: private */
            public final ArrayDeque<PerImage> imageQueue = new ArrayDeque<>();
            public final ImageReader reader;

            public PerImageReader(ImageReader imageReader) {
                this.reader = imageReader;
                imageReader.setOnImageAvailableListener(new FlutterRenderer$ImageReaderSurfaceProducer$PerImageReader$$ExternalSyntheticLambda0(this), new Handler(Looper.getMainLooper()));
            }

            /* access modifiers changed from: package-private */
            /* renamed from: lambda$new$0$io-flutter-embedding-engine-renderer-FlutterRenderer$ImageReaderSurfaceProducer$PerImageReader  reason: not valid java name */
            public /* synthetic */ void m398lambda$new$0$ioflutterembeddingenginerendererFlutterRenderer$ImageReaderSurfaceProducer$PerImageReader(ImageReader imageReader) {
                Image image;
                try {
                    image = imageReader.acquireLatestImage();
                } catch (IllegalStateException e) {
                    Log.e(ImageReaderSurfaceProducer.TAG, "onImageAvailable acquireLatestImage failed: " + e);
                    image = null;
                }
                if (image != null) {
                    if (ImageReaderSurfaceProducer.this.released || this.closed) {
                        image.close();
                    } else {
                        ImageReaderSurfaceProducer.this.onImage(imageReader, image);
                    }
                }
            }

            /* access modifiers changed from: package-private */
            public PerImage queueImage(Image image) {
                if (this.closed) {
                    return null;
                }
                PerImage perImage = new PerImage(image, System.nanoTime());
                this.imageQueue.add(perImage);
                while (this.imageQueue.size() > 2) {
                    this.imageQueue.removeFirst().image.close();
                }
                return perImage;
            }

            /* access modifiers changed from: package-private */
            public PerImage dequeueImage() {
                if (this.imageQueue.isEmpty()) {
                    return null;
                }
                return this.imageQueue.removeFirst();
            }

            /* access modifiers changed from: package-private */
            public boolean canPrune() {
                return this.imageQueue.isEmpty() && ImageReaderSurfaceProducer.this.lastReaderDequeuedFrom != this;
            }

            /* access modifiers changed from: package-private */
            public boolean imageQueueIsEmpty() {
                return this.imageQueue.isEmpty();
            }

            /* access modifiers changed from: package-private */
            public void close() {
                this.closed = true;
                this.reader.close();
                this.imageQueue.clear();
            }
        }

        /* access modifiers changed from: package-private */
        public PerImageReader getOrCreatePerImageReader(ImageReader imageReader) {
            PerImageReader perImageReader = this.perImageReaders.get(imageReader);
            if (perImageReader != null) {
                return perImageReader;
            }
            PerImageReader perImageReader2 = new PerImageReader(imageReader);
            this.perImageReaders.put(imageReader, perImageReader2);
            this.imageReaderQueue.add(perImageReader2);
            return perImageReader2;
        }

        /* access modifiers changed from: package-private */
        public void pruneImageReaderQueue() {
            PerImageReader peekFirst;
            while (this.imageReaderQueue.size() > 1 && (peekFirst = this.imageReaderQueue.peekFirst()) != null && peekFirst.canPrune()) {
                this.imageReaderQueue.removeFirst();
                this.perImageReaders.remove(peekFirst.reader);
                peekFirst.close();
            }
        }

        /* access modifiers changed from: package-private */
        public void onImage(ImageReader imageReader, Image image) {
            PerImage queueImage;
            synchronized (this.lock) {
                queueImage = getOrCreatePerImageReader(imageReader).queueImage(image);
            }
            if (queueImage != null) {
                FlutterRenderer.this.scheduleEngineFrame();
            }
        }

        /* access modifiers changed from: package-private */
        public PerImage dequeueImage() {
            PerImage perImage;
            boolean z;
            synchronized (this.lock) {
                Iterator<PerImageReader> it = this.imageReaderQueue.iterator();
                perImage = null;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    PerImageReader next = it.next();
                    PerImage dequeueImage = next.dequeueImage();
                    if (dequeueImage == null) {
                        perImage = dequeueImage;
                    } else {
                        PerImage perImage2 = this.lastDequeuedImage;
                        if (perImage2 != null) {
                            perImage2.image.close();
                        }
                        this.lastDequeuedImage = dequeueImage;
                        this.lastReaderDequeuedFrom = next;
                        perImage = dequeueImage;
                    }
                }
                pruneImageReaderQueue();
                Iterator<PerImageReader> it2 = this.imageReaderQueue.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!it2.next().imageQueueIsEmpty()) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
            }
            if (z) {
                FlutterRenderer.this.handler.post(new FlutterRenderer$ImageReaderSurfaceProducer$$ExternalSyntheticLambda8(this));
            }
            return perImage;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$dequeueImage$0$io-flutter-embedding-engine-renderer-FlutterRenderer$ImageReaderSurfaceProducer  reason: not valid java name */
        public /* synthetic */ void m397lambda$dequeueImage$0$ioflutterembeddingenginerendererFlutterRenderer$ImageReaderSurfaceProducer() {
            if (!this.released) {
                FlutterRenderer.this.scheduleEngineFrame();
            }
        }

        public void onTrimMemory(int i) {
            if (i >= 40) {
                synchronized (this.lock) {
                    this.numTrims++;
                }
                TextureRegistry.SurfaceProducer.Callback callback2 = this.callback;
                if (callback2 != null) {
                    this.notifiedDestroy = true;
                    callback2.onSurfaceCleanup();
                }
                cleanup();
                this.createNewReader = true;
            }
        }

        private void releaseInternal() {
            cleanup();
            this.released = true;
            FlutterRenderer.this.removeOnTrimMemoryListener(this);
            FlutterRenderer.this.imageReaderProducers.remove(this);
        }

        private void cleanup() {
            synchronized (this.lock) {
                for (PerImageReader next : this.perImageReaders.values()) {
                    if (this.lastReaderDequeuedFrom == next) {
                        this.lastReaderDequeuedFrom = null;
                    }
                    next.close();
                }
                this.perImageReaders.clear();
                PerImage perImage = this.lastDequeuedImage;
                if (perImage != null) {
                    perImage.image.close();
                    this.lastDequeuedImage = null;
                }
                PerImageReader perImageReader = this.lastReaderDequeuedFrom;
                if (perImageReader != null) {
                    perImageReader.close();
                    this.lastReaderDequeuedFrom = null;
                }
                this.imageReaderQueue.clear();
            }
        }

        private void waitOnFence(Image image) {
            try {
                boolean unused = FileVisitorImpl$$ExternalSyntheticApiModelOutline0.m(image).awaitForever();
            } catch (IOException unused2) {
            }
        }

        private void maybeWaitOnFence(Image image) {
            if (image == null || this.ignoringFence) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                waitOnFence(image);
                return;
            }
            this.ignoringFence = true;
            Log.d(TAG, "ImageTextureEntry can't wait on the fence on Android < 33");
        }

        ImageReaderSurfaceProducer(long j) {
            this.id = j;
        }

        public void setCallback(TextureRegistry.SurfaceProducer.Callback callback2) {
            this.callback = callback2;
        }

        public long id() {
            return this.id;
        }

        public void release() {
            if (!this.released) {
                releaseInternal();
                FlutterRenderer.this.unregisterTexture(this.id);
            }
        }

        public void setSize(int i, int i2) {
            int max = Math.max(1, i);
            int max2 = Math.max(1, i2);
            if (this.requestedWidth != max || this.requestedHeight != max2) {
                this.createNewReader = true;
                this.requestedHeight = max2;
                this.requestedWidth = max;
            }
        }

        public int getWidth() {
            return this.requestedWidth;
        }

        public int getHeight() {
            return this.requestedHeight;
        }

        public Surface getSurface() {
            return getActiveReader().reader.getSurface();
        }

        public void scheduleFrame() {
            FlutterRenderer.this.scheduleEngineFrame();
        }

        public Image acquireLatestImage() {
            PerImage dequeueImage = dequeueImage();
            if (dequeueImage == null) {
                return null;
            }
            maybeWaitOnFence(dequeueImage.image);
            return dequeueImage.image;
        }

        private PerImageReader getActiveReader() {
            synchronized (this.lock) {
                if (this.createNewReader) {
                    this.createNewReader = false;
                    PerImageReader orCreatePerImageReader = getOrCreatePerImageReader(createImageReader());
                    return orCreatePerImageReader;
                }
                PerImageReader peekLast = this.imageReaderQueue.peekLast();
                return peekLast;
            }
        }

        /* access modifiers changed from: protected */
        public void finalize() throws Throwable {
            try {
                if (!this.released) {
                    releaseInternal();
                    FlutterRenderer.this.handler.post(new TextureFinalizerRunnable(this.id, FlutterRenderer.this.flutterJNI));
                    super.finalize();
                }
            } finally {
                super.finalize();
            }
        }

        private ImageReader createImageReader33() {
            FileVisitorImpl$$ExternalSyntheticApiModelOutline0.m();
            ImageReader.Builder m = FileVisitorImpl$$ExternalSyntheticApiModelOutline0.m(this.requestedWidth, this.requestedHeight);
            ImageReader.Builder unused = m.setMaxImages(5);
            ImageReader.Builder unused2 = m.setImageFormat(34);
            ImageReader.Builder unused3 = m.setUsage(256);
            return m.build();
        }

        private ImageReader createImageReader29() {
            return ImageReader.newInstance(this.requestedWidth, this.requestedHeight, 34, 5, 256);
        }

        private ImageReader createImageReader() {
            if (Build.VERSION.SDK_INT >= 33) {
                return createImageReader33();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                return createImageReader29();
            }
            throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
        }

        public void disableFenceForTest() {
            this.ignoringFence = true;
        }

        public int numImageReaders() {
            int size;
            synchronized (this.lock) {
                size = this.imageReaderQueue.size();
            }
            return size;
        }

        public int numTrims() {
            int i;
            synchronized (this.lock) {
                i = this.numTrims;
            }
            return i;
        }

        public int numImages() {
            int i;
            synchronized (this.lock) {
                Iterator<PerImageReader> it = this.imageReaderQueue.iterator();
                i = 0;
                while (it.hasNext()) {
                    i += it.next().imageQueue.size();
                }
            }
            return i;
        }
    }

    final class ImageTextureRegistryEntry implements TextureRegistry.ImageTextureEntry, TextureRegistry.ImageConsumer {
        private static final String TAG = "ImageTextureRegistryEntry";
        private final long id;
        private boolean ignoringFence = false;
        private Image image;
        private boolean released;

        ImageTextureRegistryEntry(long j) {
            this.id = j;
        }

        public long id() {
            return this.id;
        }

        public void release() {
            if (!this.released) {
                this.released = true;
                Image image2 = this.image;
                if (image2 != null) {
                    image2.close();
                    this.image = null;
                }
                FlutterRenderer.this.unregisterTexture(this.id);
            }
        }

        public void pushImage(Image image2) {
            Image image3;
            if (!this.released) {
                synchronized (this) {
                    image3 = this.image;
                    this.image = image2;
                }
                if (image3 != null) {
                    Log.e(TAG, "Dropping PlatformView Frame");
                    image3.close();
                }
                if (image2 != null) {
                    FlutterRenderer.this.scheduleEngineFrame();
                }
            }
        }

        private void waitOnFence(Image image2) {
            try {
                boolean unused = FileVisitorImpl$$ExternalSyntheticApiModelOutline0.m(image2).awaitForever();
            } catch (IOException unused2) {
            }
        }

        private void maybeWaitOnFence(Image image2) {
            if (image2 == null || this.ignoringFence) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                waitOnFence(image2);
                return;
            }
            this.ignoringFence = true;
            Log.d(TAG, "ImageTextureEntry can't wait on the fence on Android < 33");
        }

        public Image acquireLatestImage() {
            Image image2;
            synchronized (this) {
                image2 = this.image;
                this.image = null;
            }
            maybeWaitOnFence(image2);
            return image2;
        }

        /* access modifiers changed from: protected */
        public void finalize() throws Throwable {
            try {
                if (!this.released) {
                    Image image2 = this.image;
                    if (image2 != null) {
                        image2.close();
                        this.image = null;
                    }
                    this.released = true;
                    FlutterRenderer.this.handler.post(new TextureFinalizerRunnable(this.id, FlutterRenderer.this.flutterJNI));
                    super.finalize();
                }
            } finally {
                super.finalize();
            }
        }
    }

    public void startRenderingToSurface(Surface surface2, boolean z) {
        if (!z) {
            stopRenderingToSurface();
        }
        this.surface = surface2;
        if (z) {
            this.flutterJNI.onSurfaceWindowChanged(surface2);
        } else {
            this.flutterJNI.onSurfaceCreated(surface2);
        }
    }

    public void swapSurface(Surface surface2) {
        this.surface = surface2;
        this.flutterJNI.onSurfaceWindowChanged(surface2);
    }

    public void surfaceChanged(int i, int i2) {
        this.flutterJNI.onSurfaceChanged(i, i2);
    }

    public void stopRenderingToSurface() {
        if (this.surface != null) {
            this.flutterJNI.onSurfaceDestroyed();
            if (this.isDisplayingFlutterUi) {
                this.flutterUiDisplayListener.onFlutterUiNoLongerDisplayed();
            }
            this.isDisplayingFlutterUi = false;
            this.surface = null;
        }
    }

    private void translateFeatureBounds(int[] iArr, int i, Rect rect) {
        iArr[i] = rect.left;
        iArr[i + 1] = rect.top;
        iArr[i + 2] = rect.right;
        iArr[i + 3] = rect.bottom;
    }

    public void setViewportMetrics(ViewportMetrics viewportMetrics) {
        ViewportMetrics viewportMetrics2 = viewportMetrics;
        if (viewportMetrics.validate()) {
            Log.v(TAG, "Setting viewport metrics\nSize: " + viewportMetrics2.width + " x " + viewportMetrics2.height + "\nPadding - L: " + viewportMetrics2.viewPaddingLeft + ", T: " + viewportMetrics2.viewPaddingTop + ", R: " + viewportMetrics2.viewPaddingRight + ", B: " + viewportMetrics2.viewPaddingBottom + "\nInsets - L: " + viewportMetrics2.viewInsetLeft + ", T: " + viewportMetrics2.viewInsetTop + ", R: " + viewportMetrics2.viewInsetRight + ", B: " + viewportMetrics2.viewInsetBottom + "\nSystem Gesture Insets - L: " + viewportMetrics2.systemGestureInsetLeft + ", T: " + viewportMetrics2.systemGestureInsetTop + ", R: " + viewportMetrics2.systemGestureInsetRight + ", B: " + viewportMetrics2.systemGestureInsetRight + "\nDisplay Features: " + viewportMetrics.displayFeatures.size() + "\nDisplay Cutouts: " + viewportMetrics.displayCutouts.size());
            int size = viewportMetrics.displayFeatures.size() + viewportMetrics.displayCutouts.size();
            int[] iArr = new int[(size * 4)];
            int[] iArr2 = new int[size];
            int[] iArr3 = new int[size];
            for (int i = 0; i < viewportMetrics.displayFeatures.size(); i++) {
                DisplayFeature displayFeature = (DisplayFeature) viewportMetrics.displayFeatures.get(i);
                translateFeatureBounds(iArr, i * 4, displayFeature.bounds);
                iArr2[i] = displayFeature.type.encodedValue;
                iArr3[i] = displayFeature.state.encodedValue;
            }
            int size2 = viewportMetrics.displayFeatures.size() * 4;
            for (int i2 = 0; i2 < viewportMetrics.displayCutouts.size(); i2++) {
                DisplayFeature displayFeature2 = (DisplayFeature) viewportMetrics.displayCutouts.get(i2);
                translateFeatureBounds(iArr, (i2 * 4) + size2, displayFeature2.bounds);
                iArr2[viewportMetrics.displayFeatures.size() + i2] = displayFeature2.type.encodedValue;
                iArr3[viewportMetrics.displayFeatures.size() + i2] = displayFeature2.state.encodedValue;
            }
            this.flutterJNI.setViewportMetrics(viewportMetrics2.devicePixelRatio, viewportMetrics2.width, viewportMetrics2.height, viewportMetrics2.viewPaddingTop, viewportMetrics2.viewPaddingRight, viewportMetrics2.viewPaddingBottom, viewportMetrics2.viewPaddingLeft, viewportMetrics2.viewInsetTop, viewportMetrics2.viewInsetRight, viewportMetrics2.viewInsetBottom, viewportMetrics2.viewInsetLeft, viewportMetrics2.systemGestureInsetTop, viewportMetrics2.systemGestureInsetRight, viewportMetrics2.systemGestureInsetBottom, viewportMetrics2.systemGestureInsetLeft, viewportMetrics2.physicalTouchSlop, iArr, iArr2, iArr3);
        }
    }

    public Bitmap getBitmap() {
        return this.flutterJNI.getBitmap();
    }

    public void dispatchPointerDataPacket(ByteBuffer byteBuffer, int i) {
        this.flutterJNI.dispatchPointerDataPacket(byteBuffer, i);
    }

    private void registerTexture(long j, SurfaceTextureWrapper surfaceTextureWrapper) {
        this.flutterJNI.registerTexture(j, surfaceTextureWrapper);
    }

    private void registerImageTexture(long j, TextureRegistry.ImageConsumer imageConsumer) {
        this.flutterJNI.registerImageTexture(j, imageConsumer);
    }

    /* access modifiers changed from: package-private */
    public void scheduleEngineFrame() {
        this.flutterJNI.scheduleFrame();
    }

    /* access modifiers changed from: private */
    public void unregisterTexture(long j) {
        this.flutterJNI.unregisterTexture(j);
    }

    public boolean isSoftwareRenderingEnabled() {
        return this.flutterJNI.getIsSoftwareRenderingEnabled();
    }

    public void setAccessibilityFeatures(int i) {
        this.flutterJNI.setAccessibilityFeatures(i);
    }

    public void setSemanticsEnabled(boolean z) {
        this.flutterJNI.setSemanticsEnabled(z);
    }

    public void dispatchSemanticsAction(int i, int i2, ByteBuffer byteBuffer, int i3) {
        this.flutterJNI.dispatchSemanticsAction(i, i2, byteBuffer, i3);
    }

    public static final class ViewportMetrics {
        public static final int unsetValue = -1;
        public float devicePixelRatio = 1.0f;
        /* access modifiers changed from: private */
        public final List<DisplayFeature> displayCutouts = new ArrayList();
        /* access modifiers changed from: private */
        public final List<DisplayFeature> displayFeatures = new ArrayList();
        public int height = 0;
        public int physicalTouchSlop = -1;
        public int systemGestureInsetBottom = 0;
        public int systemGestureInsetLeft = 0;
        public int systemGestureInsetRight = 0;
        public int systemGestureInsetTop = 0;
        public int viewInsetBottom = 0;
        public int viewInsetLeft = 0;
        public int viewInsetRight = 0;
        public int viewInsetTop = 0;
        public int viewPaddingBottom = 0;
        public int viewPaddingLeft = 0;
        public int viewPaddingRight = 0;
        public int viewPaddingTop = 0;
        public int width = 0;

        /* access modifiers changed from: package-private */
        public boolean validate() {
            return this.width > 0 && this.height > 0 && this.devicePixelRatio > 0.0f;
        }

        public List<DisplayFeature> getDisplayFeatures() {
            return this.displayFeatures;
        }

        public List<DisplayFeature> getDisplayCutouts() {
            return this.displayCutouts;
        }

        public void setDisplayFeatures(List<DisplayFeature> list) {
            this.displayFeatures.clear();
            this.displayFeatures.addAll(list);
        }

        public void setDisplayCutouts(List<DisplayFeature> list) {
            this.displayCutouts.clear();
            this.displayCutouts.addAll(list);
        }
    }

    public static final class DisplayFeature {
        public final Rect bounds;
        public final DisplayFeatureState state;
        public final DisplayFeatureType type;

        public DisplayFeature(Rect rect, DisplayFeatureType displayFeatureType, DisplayFeatureState displayFeatureState) {
            this.bounds = rect;
            this.type = displayFeatureType;
            this.state = displayFeatureState;
        }
    }

    public enum DisplayFeatureType {
        UNKNOWN(0),
        FOLD(1),
        HINGE(2),
        CUTOUT(3);
        
        public final int encodedValue;

        private DisplayFeatureType(int i) {
            this.encodedValue = i;
        }
    }

    public enum DisplayFeatureState {
        UNKNOWN(0),
        POSTURE_FLAT(1),
        POSTURE_HALF_OPENED(2);
        
        public final int encodedValue;

        private DisplayFeatureState(int i) {
            this.encodedValue = i;
        }
    }
}
