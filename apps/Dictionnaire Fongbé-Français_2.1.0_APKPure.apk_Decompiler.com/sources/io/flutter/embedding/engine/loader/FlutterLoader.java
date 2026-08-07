package io.flutter.embedding.engine.loader;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import io.flutter.FlutterInjector;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.util.HandlerCompat;
import io.flutter.util.PathUtils;
import io.flutter.util.TraceSection;
import io.flutter.view.VsyncWaiter;
import java.io.File;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class FlutterLoader {
    static final String AOT_SHARED_LIBRARY_NAME = "aot-shared-library-name";
    static final String AOT_VMSERVICE_SHARED_LIBRARY_NAME = "aot-vmservice-shared-library-name";
    static final String AUTOMATICALLY_REGISTER_PLUGINS_KEY = "automatically-register-plugins";
    private static final String DEFAULT_KERNEL_BLOB = "kernel_blob.bin";
    private static final String DEFAULT_LIBRARY = "libflutter.so";
    private static final String DISABLE_MERGED_PLATFORM_UI_THREAD_KEY = "io.flutter.embedding.android.DisableMergedPlatformUIThread";
    private static final String ENABLE_IMPELLER_META_DATA_KEY = "io.flutter.embedding.android.EnableImpeller";
    private static final String ENABLE_SURFACE_CONTROL = "io.flutter.embedding.android.EnableSurfaceControl";
    private static final String ENABLE_VULKAN_VALIDATION_META_DATA_KEY = "io.flutter.embedding.android.EnableVulkanValidation";
    static final String FLUTTER_ASSETS_DIR_KEY = "flutter-assets-dir";
    private static final String IMPELLER_BACKEND_META_DATA_KEY = "io.flutter.embedding.android.ImpellerBackend";
    private static final String IMPELLER_OPENGL_GPU_TRACING_DATA_KEY = "io.flutter.embedding.android.EnableOpenGLGPUTracing";
    private static final String IMPELLER_VULKAN_GPU_TRACING_DATA_KEY = "io.flutter.embedding.android.EnableVulkanGPUTracing";
    static final String ISOLATE_SNAPSHOT_DATA_KEY = "isolate-snapshot-data";
    private static final String LEAK_VM_META_DATA_KEY = "io.flutter.embedding.android.LeakVM";
    private static final String OLD_GEN_HEAP_SIZE_META_DATA_KEY = "io.flutter.embedding.android.OldGenHeapSize";
    static final String SNAPSHOT_ASSET_PATH_KEY = "snapshot-asset-path";
    private static final String TAG = "FlutterLoader";
    private static final String VMSERVICE_SNAPSHOT_LIBRARY = "libvmservice_snapshot.so";
    static final String VM_SNAPSHOT_DATA_KEY = "vm-snapshot-data";
    private static FlutterLoader instance;
    /* access modifiers changed from: private */
    public ExecutorService executorService;
    /* access modifiers changed from: private */
    public FlutterApplicationInfo flutterApplicationInfo;
    /* access modifiers changed from: private */
    public FlutterJNI flutterJNI;
    Future<InitResult> initResultFuture;
    private long initStartTimestampMillis;
    private boolean initialized;
    private Settings settings;

    /* access modifiers changed from: private */
    public ResourceExtractor initResources(Context context) {
        return null;
    }

    public FlutterLoader() {
        this(FlutterInjector.instance().getFlutterJNIFactory().provideFlutterJNI());
    }

    public FlutterLoader(FlutterJNI flutterJNI2) {
        this(flutterJNI2, FlutterInjector.instance().executorService());
    }

    public FlutterLoader(FlutterJNI flutterJNI2, ExecutorService executorService2) {
        this.initialized = false;
        this.flutterJNI = flutterJNI2;
        this.executorService = executorService2;
    }

    private static class InitResult {
        final String appStoragePath;
        final String dataDirPath;
        final String engineCachesPath;

        private InitResult(String str, String str2, String str3) {
            this.appStoragePath = str;
            this.engineCachesPath = str2;
            this.dataDirPath = str3;
        }
    }

    public void startInitialization(Context context) {
        startInitialization(context, new Settings());
    }

    public void startInitialization(Context context, Settings settings2) {
        if (this.settings == null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                TraceSection scoped = TraceSection.scoped("FlutterLoader#startInitialization");
                try {
                    final Context applicationContext = context.getApplicationContext();
                    this.settings = settings2;
                    this.initStartTimestampMillis = SystemClock.uptimeMillis();
                    this.flutterApplicationInfo = ApplicationInfoLoader.load(applicationContext);
                    VsyncWaiter.getInstance((DisplayManager) applicationContext.getSystemService("display"), this.flutterJNI).init();
                    this.initResultFuture = this.executorService.submit(new Callable<InitResult>() {
                        public InitResult call() {
                            String str;
                            TraceSection scoped = TraceSection.scoped("FlutterLoader initTask");
                            try {
                                ResourceExtractor access$000 = FlutterLoader.this.initResources(applicationContext);
                                FlutterLoader.this.flutterJNI.loadLibrary(applicationContext);
                                FlutterLoader.this.flutterJNI.updateRefreshRate();
                                FlutterLoader.this.executorService.execute(new FlutterLoader$1$$ExternalSyntheticLambda0(this));
                                if (access$000 != null) {
                                    access$000.waitForCompletion();
                                }
                                InitResult initResult = new InitResult(PathUtils.getFilesDir(applicationContext), PathUtils.getCacheDirectory(applicationContext), PathUtils.getDataDirectory(applicationContext));
                                if (scoped != null) {
                                    scoped.close();
                                }
                                return initResult;
                            } catch (UnsatisfiedLinkError e) {
                                if (!e.toString().contains("couldn't find \"libflutter.so\"")) {
                                    if (!e.toString().contains("dlopen failed: library \"libflutter.so\" not found")) {
                                        throw e;
                                    }
                                }
                                String property = System.getProperty("os.arch");
                                File file = new File(FlutterLoader.this.flutterApplicationInfo.nativeLibraryDir);
                                String[] list = file.list();
                                StringBuilder sb = new StringBuilder("Could not load libflutter.so this is possibly because the application is running on an architecture that Flutter Android does not support (e.g. x86) see https://docs.flutter.dev/deployment/android#what-are-the-supported-target-architectures for more detail.\nApp is using cpu architecture: ");
                                sb.append(property);
                                sb.append(", and the native libraries directory (with path ");
                                sb.append(file.getAbsolutePath());
                                sb.append(") ");
                                if (file.exists()) {
                                    str = "contains the following files: " + Arrays.toString(list);
                                } else {
                                    str = "does not exist.";
                                }
                                sb.append(str);
                                throw new UnsupportedOperationException(sb.toString(), e);
                            } catch (Throwable th) {
                                if (scoped != null) {
                                    try {
                                        scoped.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                }
                                throw th;
                            }
                        }

                        /* access modifiers changed from: package-private */
                        /* renamed from: lambda$call$0$io-flutter-embedding-engine-loader-FlutterLoader$1  reason: not valid java name */
                        public /* synthetic */ void m396lambda$call$0$ioflutterembeddingengineloaderFlutterLoader$1() {
                            FlutterLoader.this.flutterJNI.prefetchDefaultFontManager();
                        }
                    });
                    if (scoped != null) {
                        scoped.close();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } else {
                throw new IllegalStateException("startInitialization must be called on the main thread");
            }
        } else {
            return;
        }
        throw th;
    }

    /* JADX WARNING: Removed duplicated region for block: B:71:0x0213 A[SYNTHETIC, Splitter:B:71:0x0213] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void ensureInitializationComplete(android.content.Context r26, java.lang.String[] r27) {
        /*
            r25 = this;
            r1 = r25
            r0 = r27
            java.lang.String r2 = "io.flutter.embedding.android.DisableMergedPlatformUIThread"
            java.lang.String r3 = "io.flutter.embedding.android.EnableImpeller"
            java.lang.String r4 = "--impeller-backend="
            java.lang.String r5 = "--leak-vm="
            java.lang.String r6 = "--resource-cache-max-bytes-threshold="
            java.lang.String r7 = "--old-gen-heap-size="
            java.lang.String r8 = "--log-tag="
            java.lang.String r9 = "--domain-network-policy="
            java.lang.String r10 = "--cache-dir-path="
            java.lang.String r11 = "--aot-shared-library-name="
            java.lang.String r12 = "--icu-native-lib-path="
            boolean r13 = r1.initialized
            if (r13 == 0) goto L_0x001f
            return
        L_0x001f:
            android.os.Looper r13 = android.os.Looper.myLooper()
            android.os.Looper r14 = android.os.Looper.getMainLooper()
            if (r13 != r14) goto L_0x0233
            io.flutter.embedding.engine.loader.FlutterLoader$Settings r13 = r1.settings
            if (r13 == 0) goto L_0x022b
            java.lang.String r13 = "FlutterLoader#ensureInitializationComplete"
            io.flutter.util.TraceSection r13 = io.flutter.util.TraceSection.scoped(r13)     // Catch:{ Exception -> 0x021d }
            java.util.concurrent.Future<io.flutter.embedding.engine.loader.FlutterLoader$InitResult> r14 = r1.initResultFuture     // Catch:{ all -> 0x020d }
            java.lang.Object r14 = r14.get()     // Catch:{ all -> 0x020d }
            io.flutter.embedding.engine.loader.FlutterLoader$InitResult r14 = (io.flutter.embedding.engine.loader.FlutterLoader.InitResult) r14     // Catch:{ all -> 0x020d }
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x020d }
            r15.<init>()     // Catch:{ all -> 0x020d }
            r16 = r13
            java.lang.String r13 = "--icu-symbol-prefix=_binary_icudtl_dat"
            r15.add(r13)     // Catch:{ all -> 0x020b }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x020b }
            r13.<init>(r12)     // Catch:{ all -> 0x020b }
            io.flutter.embedding.engine.loader.FlutterApplicationInfo r12 = r1.flutterApplicationInfo     // Catch:{ all -> 0x020b }
            java.lang.String r12 = r12.nativeLibraryDir     // Catch:{ all -> 0x020b }
            r13.append(r12)     // Catch:{ all -> 0x020b }
            java.lang.String r12 = java.io.File.separator     // Catch:{ all -> 0x020b }
            r13.append(r12)     // Catch:{ all -> 0x020b }
            java.lang.String r12 = "libflutter.so"
            r13.append(r12)     // Catch:{ all -> 0x020b }
            java.lang.String r12 = r13.toString()     // Catch:{ all -> 0x020b }
            r15.add(r12)     // Catch:{ all -> 0x020b }
            if (r0 == 0) goto L_0x0069
            java.util.Collections.addAll(r15, r0)     // Catch:{ all -> 0x020b }
        L_0x0069:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x020b }
            r0.<init>(r11)     // Catch:{ all -> 0x020b }
            io.flutter.embedding.engine.loader.FlutterApplicationInfo r12 = r1.flutterApplicationInfo     // Catch:{ all -> 0x020b }
            java.lang.String r12 = r12.aotSharedLibraryName     // Catch:{ all -> 0x020b }
            r0.append(r12)     // Catch:{ all -> 0x020b }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x020b }
            r15.add(r0)     // Catch:{ all -> 0x020b }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x020b }
            r0.<init>(r11)     // Catch:{ all -> 0x020b }
            io.flutter.embedding.engine.loader.FlutterApplicationInfo r11 = r1.flutterApplicationInfo     // Catch:{ all -> 0x020b }
            java.lang.String r11 = r11.nativeLibraryDir     // Catch:{ all -> 0x020b }
            r0.append(r11)     // Catch:{ all -> 0x020b }
            java.lang.String r11 = java.io.File.separator     // Catch:{ all -> 0x020b }
            r0.append(r11)     // Catch:{ all -> 0x020b }
            io.flutter.embedding.engine.loader.FlutterApplicationInfo r11 = r1.flutterApplicationInfo     // Catch:{ all -> 0x020b }
            java.lang.String r11 = r11.aotSharedLibraryName     // Catch:{ all -> 0x020b }
            r0.append(r11)     // Catch:{ all -> 0x020b }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x020b }
            r15.add(r0)     // Catch:{ all -> 0x020b }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x020b }
            r0.<init>(r10)     // Catch:{ all -> 0x020b }
            java.lang.String r10 = r14.engineCachesPath     // Catch:{ all -> 0x020b }
            r0.append(r10)     // Catch:{ all -> 0x020b }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x020b }
            r15.add(r0)     // Catch:{ all -> 0x020b }
            io.flutter.embedding.engine.loader.FlutterApplicationInfo r0 = r1.flutterApplicationInfo     // Catch:{ all -> 0x020b }
            java.lang.String r0 = r0.domainNetworkPolicy     // Catch:{ all -> 0x020b }
            if (r0 == 0) goto L_0x00c5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x020b }
            r0.<init>(r9)     // Catch:{ all -> 0x020b }
            io.flutter.embedding.engine.loader.FlutterApplicationInfo r9 = r1.flutterApplicationInfo     // Catch:{ all -> 0x020b }
            java.lang.String r9 = r9.domainNetworkPolicy     // Catch:{ all -> 0x020b }
            r0.append(r9)     // Catch:{ all -> 0x020b }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x020b }
            r15.add(r0)     // Catch:{ all -> 0x020b }
        L_0x00c5:
            io.flutter.embedding.engine.loader.FlutterLoader$Settings r0 = r1.settings     // Catch:{ all -> 0x020b }
            java.lang.String r0 = r0.getLogTag()     // Catch:{ all -> 0x020b }
            if (r0 == 0) goto L_0x00e2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x020b }
            r0.<init>(r8)     // Catch:{ all -> 0x020b }
            io.flutter.embedding.engine.loader.FlutterLoader$Settings r8 = r1.settings     // Catch:{ all -> 0x020b }
            java.lang.String r8 = r8.getLogTag()     // Catch:{ all -> 0x020b }
            r0.append(r8)     // Catch:{ all -> 0x020b }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x020b }
            r15.add(r0)     // Catch:{ all -> 0x020b }
        L_0x00e2:
            android.content.pm.PackageManager r0 = r26.getPackageManager()     // Catch:{ all -> 0x020b }
            java.lang.String r8 = r26.getPackageName()     // Catch:{ all -> 0x020b }
            r9 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r8, r9)     // Catch:{ all -> 0x020b }
            android.os.Bundle r0 = r0.metaData     // Catch:{ all -> 0x020b }
            r8 = 0
            if (r0 == 0) goto L_0x00fc
            java.lang.String r9 = "io.flutter.embedding.android.OldGenHeapSize"
            int r9 = r0.getInt(r9)     // Catch:{ all -> 0x020b }
            goto L_0x00fd
        L_0x00fc:
            r9 = 0
        L_0x00fd:
            if (r9 != 0) goto L_0x0121
            java.lang.String r9 = "activity"
            r10 = r26
            java.lang.Object r9 = r10.getSystemService(r9)     // Catch:{ all -> 0x020b }
            android.app.ActivityManager r9 = (android.app.ActivityManager) r9     // Catch:{ all -> 0x020b }
            android.app.ActivityManager$MemoryInfo r11 = new android.app.ActivityManager$MemoryInfo     // Catch:{ all -> 0x020b }
            r11.<init>()     // Catch:{ all -> 0x020b }
            r9.getMemoryInfo(r11)     // Catch:{ all -> 0x020b }
            long r11 = r11.totalMem     // Catch:{ all -> 0x020b }
            double r11 = (double) r11     // Catch:{ all -> 0x020b }
            r17 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r11 = r11 / r17
            r17 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r11 = r11 / r17
            int r9 = (int) r11     // Catch:{ all -> 0x020b }
            goto L_0x0123
        L_0x0121:
            r10 = r26
        L_0x0123:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x020b }
            r11.<init>(r7)     // Catch:{ all -> 0x020b }
            r11.append(r9)     // Catch:{ all -> 0x020b }
            java.lang.String r7 = r11.toString()     // Catch:{ all -> 0x020b }
            r15.add(r7)     // Catch:{ all -> 0x020b }
            android.content.res.Resources r7 = r26.getResources()     // Catch:{ all -> 0x020b }
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()     // Catch:{ all -> 0x020b }
            int r9 = r7.widthPixels     // Catch:{ all -> 0x020b }
            int r7 = r7.heightPixels     // Catch:{ all -> 0x020b }
            int r9 = r9 * r7
            int r9 = r9 * 48
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x020b }
            r7.<init>(r6)     // Catch:{ all -> 0x020b }
            r7.append(r9)     // Catch:{ all -> 0x020b }
            java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x020b }
            r15.add(r6)     // Catch:{ all -> 0x020b }
            java.lang.String r6 = "--prefetched-default-font-manager"
            r15.add(r6)     // Catch:{ all -> 0x020b }
            if (r0 == 0) goto L_0x01cb
            boolean r6 = r0.containsKey(r3)     // Catch:{ all -> 0x020b }
            if (r6 == 0) goto L_0x016f
            boolean r3 = r0.getBoolean(r3)     // Catch:{ all -> 0x020b }
            if (r3 == 0) goto L_0x016a
            java.lang.String r3 = "--enable-impeller=true"
            r15.add(r3)     // Catch:{ all -> 0x020b }
            goto L_0x016f
        L_0x016a:
            java.lang.String r3 = "--enable-impeller=false"
            r15.add(r3)     // Catch:{ all -> 0x020b }
        L_0x016f:
            java.lang.String r3 = "io.flutter.embedding.android.EnableVulkanValidation"
            boolean r3 = r0.getBoolean(r3, r8)     // Catch:{ all -> 0x020b }
            if (r3 == 0) goto L_0x017c
            java.lang.String r3 = "--enable-vulkan-validation"
            r15.add(r3)     // Catch:{ all -> 0x020b }
        L_0x017c:
            java.lang.String r3 = "io.flutter.embedding.android.EnableOpenGLGPUTracing"
            boolean r3 = r0.getBoolean(r3, r8)     // Catch:{ all -> 0x020b }
            if (r3 == 0) goto L_0x0189
            java.lang.String r3 = "--enable-opengl-gpu-tracing"
            r15.add(r3)     // Catch:{ all -> 0x020b }
        L_0x0189:
            java.lang.String r3 = "io.flutter.embedding.android.EnableVulkanGPUTracing"
            boolean r3 = r0.getBoolean(r3, r8)     // Catch:{ all -> 0x020b }
            if (r3 == 0) goto L_0x0196
            java.lang.String r3 = "--enable-vulkan-gpu-tracing"
            r15.add(r3)     // Catch:{ all -> 0x020b }
        L_0x0196:
            boolean r3 = r0.containsKey(r2)     // Catch:{ all -> 0x020b }
            if (r3 == 0) goto L_0x01a7
            boolean r2 = r0.getBoolean(r2)     // Catch:{ all -> 0x020b }
            if (r2 == 0) goto L_0x01a7
            java.lang.String r2 = "--no-enable-merged-platform-ui-thread"
            r15.add(r2)     // Catch:{ all -> 0x020b }
        L_0x01a7:
            java.lang.String r2 = "io.flutter.embedding.android.EnableSurfaceControl"
            boolean r2 = r0.getBoolean(r2, r8)     // Catch:{ all -> 0x020b }
            if (r2 == 0) goto L_0x01b4
            java.lang.String r2 = "--enable-surface-control"
            r15.add(r2)     // Catch:{ all -> 0x020b }
        L_0x01b4:
            java.lang.String r2 = "io.flutter.embedding.android.ImpellerBackend"
            java.lang.String r2 = r0.getString(r2)     // Catch:{ all -> 0x020b }
            if (r2 == 0) goto L_0x01cb
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x020b }
            r3.<init>(r4)     // Catch:{ all -> 0x020b }
            r3.append(r2)     // Catch:{ all -> 0x020b }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x020b }
            r15.add(r2)     // Catch:{ all -> 0x020b }
        L_0x01cb:
            boolean r0 = isLeakVM(r0)     // Catch:{ all -> 0x020b }
            if (r0 == 0) goto L_0x01d4
            java.lang.String r0 = "true"
            goto L_0x01d6
        L_0x01d4:
            java.lang.String r0 = "false"
        L_0x01d6:
            java.lang.String r0 = r5.concat(r0)     // Catch:{ all -> 0x020b }
            r15.add(r0)     // Catch:{ all -> 0x020b }
            long r2 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x020b }
            long r4 = r1.initStartTimestampMillis     // Catch:{ all -> 0x020b }
            long r23 = r2 - r4
            io.flutter.embedding.engine.FlutterJNI r0 = r1.flutterJNI     // Catch:{ all -> 0x020b }
            java.lang.String[] r2 = new java.lang.String[r8]     // Catch:{ all -> 0x020b }
            java.lang.Object[] r2 = r15.toArray(r2)     // Catch:{ all -> 0x020b }
            r19 = r2
            java.lang.String[] r19 = (java.lang.String[]) r19     // Catch:{ all -> 0x020b }
            java.lang.String r2 = r14.appStoragePath     // Catch:{ all -> 0x020b }
            java.lang.String r3 = r14.engineCachesPath     // Catch:{ all -> 0x020b }
            r20 = 0
            r17 = r0
            r18 = r26
            r21 = r2
            r22 = r3
            r17.init(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x020b }
            r0 = 1
            r1.initialized = r0     // Catch:{ all -> 0x020b }
            if (r16 == 0) goto L_0x020a
            r16.close()     // Catch:{ Exception -> 0x021d }
        L_0x020a:
            return
        L_0x020b:
            r0 = move-exception
            goto L_0x0210
        L_0x020d:
            r0 = move-exception
            r16 = r13
        L_0x0210:
            r2 = r0
            if (r16 == 0) goto L_0x021c
            r16.close()     // Catch:{ all -> 0x0217 }
            goto L_0x021c
        L_0x0217:
            r0 = move-exception
            r3 = r0
            r2.addSuppressed(r3)     // Catch:{ Exception -> 0x021d }
        L_0x021c:
            throw r2     // Catch:{ Exception -> 0x021d }
        L_0x021d:
            r0 = move-exception
            java.lang.String r2 = "FlutterLoader"
            java.lang.String r3 = "Flutter initialization failed."
            io.flutter.Log.e(r2, r3, r0)
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r0)
            throw r2
        L_0x022b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "ensureInitializationComplete must be called after startInitialization"
            r0.<init>(r2)
            throw r0
        L_0x0233:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "ensureInitializationComplete must be called on the main thread"
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.loader.FlutterLoader.ensureInitializationComplete(android.content.Context, java.lang.String[]):void");
    }

    private static boolean isLeakVM(Bundle bundle) {
        if (bundle == null) {
            return true;
        }
        return bundle.getBoolean(LEAK_VM_META_DATA_KEY, true);
    }

    public void ensureInitializationCompleteAsync(Context context, String[] strArr, Handler handler, Runnable runnable) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
        } else if (this.settings == null) {
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        } else if (this.initialized) {
            handler.post(runnable);
        } else {
            this.executorService.execute(new FlutterLoader$$ExternalSyntheticLambda0(this, context, strArr, handler, runnable));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$ensureInitializationCompleteAsync$1$io-flutter-embedding-engine-loader-FlutterLoader  reason: not valid java name */
    public /* synthetic */ void m395lambda$ensureInitializationCompleteAsync$1$ioflutterembeddingengineloaderFlutterLoader(Context context, String[] strArr, Handler handler, Runnable runnable) {
        try {
            InitResult initResult = this.initResultFuture.get();
            HandlerCompat.createAsyncHandler(Looper.getMainLooper()).post(new FlutterLoader$$ExternalSyntheticLambda1(this, context, strArr, handler, runnable));
        } catch (Exception e) {
            Log.e(TAG, "Flutter initialization failed.", e);
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$ensureInitializationCompleteAsync$0$io-flutter-embedding-engine-loader-FlutterLoader  reason: not valid java name */
    public /* synthetic */ void m394lambda$ensureInitializationCompleteAsync$0$ioflutterembeddingengineloaderFlutterLoader(Context context, String[] strArr, Handler handler, Runnable runnable) {
        ensureInitializationComplete(context.getApplicationContext(), strArr);
        handler.post(runnable);
    }

    public boolean initialized() {
        return this.initialized;
    }

    public String findAppBundlePath() {
        return this.flutterApplicationInfo.flutterAssetsDir;
    }

    public String getLookupKeyForAsset(String str) {
        return fullAssetPathFrom(str);
    }

    public String getLookupKeyForAsset(String str, String str2) {
        return getLookupKeyForAsset("packages" + File.separator + str2 + File.separator + str);
    }

    public boolean automaticallyRegisterPlugins() {
        return this.flutterApplicationInfo.automaticallyRegisterPlugins;
    }

    private String fullAssetPathFrom(String str) {
        return this.flutterApplicationInfo.flutterAssetsDir + File.separator + str;
    }

    public static class Settings {
        private String logTag;

        public String getLogTag() {
            return this.logTag;
        }

        public void setLogTag(String str) {
            this.logTag = str;
        }
    }
}
