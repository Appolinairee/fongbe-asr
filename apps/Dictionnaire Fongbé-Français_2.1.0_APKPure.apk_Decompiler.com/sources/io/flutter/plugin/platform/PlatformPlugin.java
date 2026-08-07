package io.flutter.plugin.platform;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.webkit.internal.AssetHelper;
import io.flutter.embedding.engine.systemchannels.PlatformChannel;
import java.util.List;
import kotlin.io.path.FileVisitorImpl$$ExternalSyntheticApiModelOutline0;

public class PlatformPlugin {
    public static final int DEFAULT_SYSTEM_UI = 1280;
    private static final String TAG = "PlatformPlugin";
    private final Activity activity;
    private PlatformChannel.SystemChromeStyle currentTheme;
    private int mEnabledOverlays;
    final PlatformChannel.PlatformMessageHandler mPlatformMessageHandler;
    /* access modifiers changed from: private */
    public final PlatformChannel platformChannel;
    private final PlatformPluginDelegate platformPluginDelegate;

    public interface PlatformPluginDelegate {

        /* renamed from: io.flutter.plugin.platform.PlatformPlugin$PlatformPluginDelegate$-CC  reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$setFrameworkHandlesBack(PlatformPluginDelegate _this, boolean z) {
            }
        }

        boolean popSystemNavigator();

        void setFrameworkHandlesBack(boolean z);
    }

    public PlatformPlugin(Activity activity2, PlatformChannel platformChannel2) {
        this(activity2, platformChannel2, (PlatformPluginDelegate) null);
    }

    public PlatformPlugin(Activity activity2, PlatformChannel platformChannel2, PlatformPluginDelegate platformPluginDelegate2) {
        AnonymousClass1 r0 = new PlatformChannel.PlatformMessageHandler() {
            public void playSystemSound(PlatformChannel.SoundType soundType) {
                PlatformPlugin.this.playSystemSound(soundType);
            }

            public void vibrateHapticFeedback(PlatformChannel.HapticFeedbackType hapticFeedbackType) {
                PlatformPlugin.this.vibrateHapticFeedback(hapticFeedbackType);
            }

            public void setPreferredOrientations(int i) {
                PlatformPlugin.this.setSystemChromePreferredOrientations(i);
            }

            public void setApplicationSwitcherDescription(PlatformChannel.AppSwitcherDescription appSwitcherDescription) {
                PlatformPlugin.this.setSystemChromeApplicationSwitcherDescription(appSwitcherDescription);
            }

            public void showSystemOverlays(List<PlatformChannel.SystemUiOverlay> list) {
                PlatformPlugin.this.setSystemChromeEnabledSystemUIOverlays(list);
            }

            public void showSystemUiMode(PlatformChannel.SystemUiMode systemUiMode) {
                PlatformPlugin.this.setSystemChromeEnabledSystemUIMode(systemUiMode);
            }

            public void setSystemUiChangeListener() {
                PlatformPlugin.this.setSystemChromeChangeListener();
            }

            public void restoreSystemUiOverlays() {
                PlatformPlugin.this.restoreSystemChromeSystemUIOverlays();
            }

            public void setSystemUiOverlayStyle(PlatformChannel.SystemChromeStyle systemChromeStyle) {
                PlatformPlugin.this.setSystemChromeSystemUIOverlayStyle(systemChromeStyle);
            }

            public void setFrameworkHandlesBack(boolean z) {
                PlatformPlugin.this.setFrameworkHandlesBack(z);
            }

            public void popSystemNavigator() {
                PlatformPlugin.this.popSystemNavigator();
            }

            public CharSequence getClipboardData(PlatformChannel.ClipboardContentFormat clipboardContentFormat) {
                return PlatformPlugin.this.getClipboardData(clipboardContentFormat);
            }

            public void setClipboardData(String str) {
                PlatformPlugin.this.setClipboardData(str);
            }

            public boolean clipboardHasStrings() {
                return PlatformPlugin.this.clipboardHasStrings();
            }

            public void share(String str) {
                PlatformPlugin.this.share(str);
            }
        };
        this.mPlatformMessageHandler = r0;
        this.activity = activity2;
        this.platformChannel = platformChannel2;
        platformChannel2.setPlatformMessageHandler(r0);
        this.platformPluginDelegate = platformPluginDelegate2;
        this.mEnabledOverlays = DEFAULT_SYSTEM_UI;
    }

    public void destroy() {
        this.platformChannel.setPlatformMessageHandler((PlatformChannel.PlatformMessageHandler) null);
    }

    /* access modifiers changed from: private */
    public void playSystemSound(PlatformChannel.SoundType soundType) {
        if (soundType == PlatformChannel.SoundType.CLICK) {
            this.activity.getWindow().getDecorView().playSoundEffect(0);
        }
    }

    /* access modifiers changed from: package-private */
    public void vibrateHapticFeedback(PlatformChannel.HapticFeedbackType hapticFeedbackType) {
        View decorView = this.activity.getWindow().getDecorView();
        int i = AnonymousClass3.$SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$HapticFeedbackType[hapticFeedbackType.ordinal()];
        if (i == 1) {
            decorView.performHapticFeedback(0);
        } else if (i == 2) {
            decorView.performHapticFeedback(1);
        } else if (i == 3) {
            decorView.performHapticFeedback(3);
        } else if (i != 4) {
            if (i == 5) {
                decorView.performHapticFeedback(4);
            }
        } else if (Build.VERSION.SDK_INT >= 23) {
            decorView.performHapticFeedback(6);
        }
    }

    /* access modifiers changed from: private */
    public void setSystemChromePreferredOrientations(int i) {
        this.activity.setRequestedOrientation(i);
    }

    /* access modifiers changed from: private */
    public void setSystemChromeApplicationSwitcherDescription(PlatformChannel.AppSwitcherDescription appSwitcherDescription) {
        if (Build.VERSION.SDK_INT < 28) {
            this.activity.setTaskDescription(new ActivityManager.TaskDescription(appSwitcherDescription.label, (Bitmap) null, appSwitcherDescription.color));
            return;
        }
        FileVisitorImpl$$ExternalSyntheticApiModelOutline0.m$3();
        this.activity.setTaskDescription(FileVisitorImpl$$ExternalSyntheticApiModelOutline0.m(appSwitcherDescription.label, 0, appSwitcherDescription.color));
    }

    /* access modifiers changed from: private */
    public void setSystemChromeChangeListener() {
        final View decorView = this.activity.getWindow().getDecorView();
        decorView.setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() {
            public void onSystemUiVisibilityChange(int i) {
                decorView.post(new PlatformPlugin$2$$ExternalSyntheticLambda0(this, i));
            }

            /* access modifiers changed from: package-private */
            /* renamed from: lambda$onSystemUiVisibilityChange$0$io-flutter-plugin-platform-PlatformPlugin$2  reason: not valid java name */
            public /* synthetic */ void m401lambda$onSystemUiVisibilityChange$0$ioflutterpluginplatformPlatformPlugin$2(int i) {
                if ((i & 4) == 0) {
                    PlatformPlugin.this.platformChannel.systemChromeChanged(true);
                } else {
                    PlatformPlugin.this.platformChannel.systemChromeChanged(false);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void setSystemChromeEnabledSystemUIMode(PlatformChannel.SystemUiMode systemUiMode) {
        int i;
        if (systemUiMode == PlatformChannel.SystemUiMode.LEAN_BACK) {
            i = 1798;
        } else if (systemUiMode == PlatformChannel.SystemUiMode.IMMERSIVE) {
            i = 3846;
        } else if (systemUiMode == PlatformChannel.SystemUiMode.IMMERSIVE_STICKY) {
            i = 5894;
        } else if (systemUiMode == PlatformChannel.SystemUiMode.EDGE_TO_EDGE && Build.VERSION.SDK_INT >= 29) {
            i = 1792;
        } else {
            return;
        }
        this.mEnabledOverlays = i;
        updateSystemUiOverlays();
    }

    /* access modifiers changed from: private */
    public void setSystemChromeEnabledSystemUIOverlays(List<PlatformChannel.SystemUiOverlay> list) {
        int i = list.size() == 0 ? 5894 : 1798;
        for (int i2 = 0; i2 < list.size(); i2++) {
            int i3 = AnonymousClass3.$SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$SystemUiOverlay[list.get(i2).ordinal()];
            if (i3 == 1) {
                i &= -5;
            } else if (i3 == 2) {
                i &= -515;
            }
        }
        this.mEnabledOverlays = i;
        updateSystemUiOverlays();
    }

    public void updateSystemUiOverlays() {
        this.activity.getWindow().getDecorView().setSystemUiVisibility(this.mEnabledOverlays);
        PlatformChannel.SystemChromeStyle systemChromeStyle = this.currentTheme;
        if (systemChromeStyle != null) {
            setSystemChromeSystemUIOverlayStyle(systemChromeStyle);
        }
    }

    /* access modifiers changed from: private */
    public void restoreSystemChromeSystemUIOverlays() {
        updateSystemUiOverlays();
    }

    /* access modifiers changed from: private */
    public void setSystemChromeSystemUIOverlayStyle(PlatformChannel.SystemChromeStyle systemChromeStyle) {
        Window window = this.activity.getWindow();
        WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window, window.getDecorView());
        if (Build.VERSION.SDK_INT < 30) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(201326592);
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (systemChromeStyle.statusBarIconBrightness != null) {
                int i = AnonymousClass3.$SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$Brightness[systemChromeStyle.statusBarIconBrightness.ordinal()];
                if (i == 1) {
                    windowInsetsControllerCompat.setAppearanceLightStatusBars(true);
                } else if (i == 2) {
                    windowInsetsControllerCompat.setAppearanceLightStatusBars(false);
                }
            }
            if (systemChromeStyle.statusBarColor != null) {
                window.setStatusBarColor(systemChromeStyle.statusBarColor.intValue());
            }
        }
        if (systemChromeStyle.systemStatusBarContrastEnforced != null && Build.VERSION.SDK_INT >= 29) {
            window.setStatusBarContrastEnforced(systemChromeStyle.systemStatusBarContrastEnforced.booleanValue());
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (systemChromeStyle.systemNavigationBarIconBrightness != null) {
                int i2 = AnonymousClass3.$SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$Brightness[systemChromeStyle.systemNavigationBarIconBrightness.ordinal()];
                if (i2 == 1) {
                    windowInsetsControllerCompat.setAppearanceLightNavigationBars(true);
                } else if (i2 == 2) {
                    windowInsetsControllerCompat.setAppearanceLightNavigationBars(false);
                }
            }
            if (systemChromeStyle.systemNavigationBarColor != null) {
                window.setNavigationBarColor(systemChromeStyle.systemNavigationBarColor.intValue());
            }
        }
        if (systemChromeStyle.systemNavigationBarDividerColor != null && Build.VERSION.SDK_INT >= 28) {
            window.setNavigationBarDividerColor(systemChromeStyle.systemNavigationBarDividerColor.intValue());
        }
        if (systemChromeStyle.systemNavigationBarContrastEnforced != null && Build.VERSION.SDK_INT >= 29) {
            window.setNavigationBarContrastEnforced(systemChromeStyle.systemNavigationBarContrastEnforced.booleanValue());
        }
        this.currentTheme = systemChromeStyle;
    }

    /* renamed from: io.flutter.plugin.platform.PlatformPlugin$3  reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$Brightness;
        static final /* synthetic */ int[] $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$HapticFeedbackType;
        static final /* synthetic */ int[] $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$SystemUiOverlay;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|(2:1|2)|3|(2:5|6)|7|9|10|(2:11|12)|13|15|16|17|18|19|20|21|22|(3:23|24|26)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0053 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x005e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0069 */
        static {
            /*
                io.flutter.embedding.engine.systemchannels.PlatformChannel$Brightness[] r0 = io.flutter.embedding.engine.systemchannels.PlatformChannel.Brightness.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$Brightness = r0
                r1 = 1
                io.flutter.embedding.engine.systemchannels.PlatformChannel$Brightness r2 = io.flutter.embedding.engine.systemchannels.PlatformChannel.Brightness.DARK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$Brightness     // Catch:{ NoSuchFieldError -> 0x001d }
                io.flutter.embedding.engine.systemchannels.PlatformChannel$Brightness r3 = io.flutter.embedding.engine.systemchannels.PlatformChannel.Brightness.LIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                io.flutter.embedding.engine.systemchannels.PlatformChannel$SystemUiOverlay[] r2 = io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiOverlay.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$SystemUiOverlay = r2
                io.flutter.embedding.engine.systemchannels.PlatformChannel$SystemUiOverlay r3 = io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiOverlay.TOP_OVERLAYS     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$SystemUiOverlay     // Catch:{ NoSuchFieldError -> 0x0038 }
                io.flutter.embedding.engine.systemchannels.PlatformChannel$SystemUiOverlay r3 = io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiOverlay.BOTTOM_OVERLAYS     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                io.flutter.embedding.engine.systemchannels.PlatformChannel$HapticFeedbackType[] r2 = io.flutter.embedding.engine.systemchannels.PlatformChannel.HapticFeedbackType.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$HapticFeedbackType = r2
                io.flutter.embedding.engine.systemchannels.PlatformChannel$HapticFeedbackType r3 = io.flutter.embedding.engine.systemchannels.PlatformChannel.HapticFeedbackType.STANDARD     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r1 = $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$HapticFeedbackType     // Catch:{ NoSuchFieldError -> 0x0053 }
                io.flutter.embedding.engine.systemchannels.PlatformChannel$HapticFeedbackType r2 = io.flutter.embedding.engine.systemchannels.PlatformChannel.HapticFeedbackType.LIGHT_IMPACT     // Catch:{ NoSuchFieldError -> 0x0053 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0053 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0053 }
            L_0x0053:
                int[] r0 = $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$HapticFeedbackType     // Catch:{ NoSuchFieldError -> 0x005e }
                io.flutter.embedding.engine.systemchannels.PlatformChannel$HapticFeedbackType r1 = io.flutter.embedding.engine.systemchannels.PlatformChannel.HapticFeedbackType.MEDIUM_IMPACT     // Catch:{ NoSuchFieldError -> 0x005e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005e }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005e }
            L_0x005e:
                int[] r0 = $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$HapticFeedbackType     // Catch:{ NoSuchFieldError -> 0x0069 }
                io.flutter.embedding.engine.systemchannels.PlatformChannel$HapticFeedbackType r1 = io.flutter.embedding.engine.systemchannels.PlatformChannel.HapticFeedbackType.HEAVY_IMPACT     // Catch:{ NoSuchFieldError -> 0x0069 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0069 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0069 }
            L_0x0069:
                int[] r0 = $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$HapticFeedbackType     // Catch:{ NoSuchFieldError -> 0x0074 }
                io.flutter.embedding.engine.systemchannels.PlatformChannel$HapticFeedbackType r1 = io.flutter.embedding.engine.systemchannels.PlatformChannel.HapticFeedbackType.SELECTION_CLICK     // Catch:{ NoSuchFieldError -> 0x0074 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0074 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0074 }
            L_0x0074:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.platform.PlatformPlugin.AnonymousClass3.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public void setFrameworkHandlesBack(boolean z) {
        PlatformPluginDelegate platformPluginDelegate2 = this.platformPluginDelegate;
        if (platformPluginDelegate2 != null) {
            platformPluginDelegate2.setFrameworkHandlesBack(z);
        }
    }

    /* access modifiers changed from: private */
    public void popSystemNavigator() {
        PlatformPluginDelegate platformPluginDelegate2 = this.platformPluginDelegate;
        if (platformPluginDelegate2 == null || !platformPluginDelegate2.popSystemNavigator()) {
            Activity activity2 = this.activity;
            if (activity2 instanceof OnBackPressedDispatcherOwner) {
                ((OnBackPressedDispatcherOwner) activity2).getOnBackPressedDispatcher().onBackPressed();
            } else {
                activity2.finish();
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0079, code lost:
        r8 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0080, code lost:
        io.flutter.Log.w(TAG, "Clipboard text was unable to be received from content URI.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0085, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0086, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0087, code lost:
        io.flutter.Log.w(TAG, "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008c, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[ExcHandler: FileNotFoundException (unused java.io.FileNotFoundException), SYNTHETIC, Splitter:B:3:0x0016] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0086 A[ExcHandler: SecurityException (r8v1 'e' java.lang.SecurityException A[CUSTOM_DECLARE]), Splitter:B:3:0x0016] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.CharSequence getClipboardData(io.flutter.embedding.engine.systemchannels.PlatformChannel.ClipboardContentFormat r8) {
        /*
            r7 = this;
            java.lang.String r0 = "PlatformPlugin"
            java.lang.String r1 = "Clipboard item contains a Uri with scheme '"
            android.app.Activity r2 = r7.activity
            java.lang.String r3 = "clipboard"
            java.lang.Object r2 = r2.getSystemService(r3)
            android.content.ClipboardManager r2 = (android.content.ClipboardManager) r2
            boolean r3 = r2.hasPrimaryClip()
            r4 = 0
            if (r3 != 0) goto L_0x0016
            return r4
        L_0x0016:
            android.content.ClipData r2 = r2.getPrimaryClip()     // Catch:{ SecurityException -> 0x0086, FileNotFoundException -> 0x0080, IOException -> 0x0079 }
            if (r2 != 0) goto L_0x001d
            return r4
        L_0x001d:
            if (r8 == 0) goto L_0x0025
            io.flutter.embedding.engine.systemchannels.PlatformChannel$ClipboardContentFormat r3 = io.flutter.embedding.engine.systemchannels.PlatformChannel.ClipboardContentFormat.PLAIN_TEXT     // Catch:{ SecurityException -> 0x0086, FileNotFoundException -> 0x0080, IOException -> 0x0079 }
            if (r8 != r3) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            return r4
        L_0x0025:
            r8 = 0
            android.content.ClipData$Item r8 = r2.getItemAt(r8)     // Catch:{ SecurityException -> 0x0086, FileNotFoundException -> 0x0080, IOException -> 0x0079 }
            java.lang.CharSequence r2 = r8.getText()     // Catch:{ SecurityException -> 0x0086, FileNotFoundException -> 0x0080, IOException -> 0x0079 }
            if (r2 != 0) goto L_0x0078
            android.net.Uri r3 = r8.getUri()     // Catch:{ SecurityException -> 0x0086, FileNotFoundException -> 0x0080, IOException -> 0x0075 }
            if (r3 != 0) goto L_0x003c
            java.lang.String r8 = "Clipboard item contained no textual content nor a URI to retrieve it from."
            io.flutter.Log.w(r0, r8)     // Catch:{ SecurityException -> 0x0086, FileNotFoundException -> 0x0080, IOException -> 0x0075 }
            return r4
        L_0x003c:
            java.lang.String r5 = r3.getScheme()     // Catch:{ SecurityException -> 0x0086, FileNotFoundException -> 0x0080, IOException -> 0x0075 }
            java.lang.String r6 = "content"
            boolean r6 = r5.equals(r6)     // Catch:{ SecurityException -> 0x0086, FileNotFoundException -> 0x0080, IOException -> 0x0075 }
            if (r6 != 0) goto L_0x005d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ SecurityException -> 0x0086, FileNotFoundException -> 0x0080, IOException -> 0x0075 }
            r8.<init>(r1)     // Catch:{ SecurityException -> 0x0086, FileNotFoundException -> 0x0080, IOException -> 0x0075 }
            r8.append(r5)     // Catch:{ SecurityException -> 0x0086, FileNotFoundException -> 0x0080, IOException -> 0x0075 }
            java.lang.String r1 = "'that is unhandled."
            r8.append(r1)     // Catch:{ SecurityException -> 0x0086, FileNotFoundException -> 0x0080, IOException -> 0x0075 }
            java.lang.String r8 = r8.toString()     // Catch:{ SecurityException -> 0x0086, FileNotFoundException -> 0x0080, IOException -> 0x0075 }
            io.flutter.Log.w(r0, r8)     // Catch:{ SecurityException -> 0x0086, FileNotFoundException -> 0x0080, IOException -> 0x0075 }
            return r4
        L_0x005d:
            android.app.Activity r1 = r7.activity     // Catch:{ SecurityException -> 0x0086, FileNotFoundException -> 0x0080, IOException -> 0x0075 }
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ SecurityException -> 0x0086, FileNotFoundException -> 0x0080, IOException -> 0x0075 }
            java.lang.String r5 = "text/*"
            android.content.res.AssetFileDescriptor r1 = r1.openTypedAssetFileDescriptor(r3, r5, r4)     // Catch:{ SecurityException -> 0x0086, FileNotFoundException -> 0x0080, IOException -> 0x0075 }
            android.app.Activity r3 = r7.activity     // Catch:{ SecurityException -> 0x0086, FileNotFoundException -> 0x0080, IOException -> 0x0075 }
            java.lang.CharSequence r2 = r8.coerceToText(r3)     // Catch:{ SecurityException -> 0x0086, FileNotFoundException -> 0x0080, IOException -> 0x0075 }
            if (r1 == 0) goto L_0x0078
            r1.close()     // Catch:{ SecurityException -> 0x0086, FileNotFoundException -> 0x0080, IOException -> 0x0075 }
            goto L_0x0078
        L_0x0075:
            r8 = move-exception
            r4 = r2
            goto L_0x007a
        L_0x0078:
            return r2
        L_0x0079:
            r8 = move-exception
        L_0x007a:
            java.lang.String r1 = "Failed to close AssetFileDescriptor while trying to read text from URI."
            io.flutter.Log.w(r0, r1, r8)
            return r4
        L_0x0080:
            java.lang.String r8 = "Clipboard text was unable to be received from content URI."
            io.flutter.Log.w(r0, r8)
            return r4
        L_0x0086:
            r8 = move-exception
            java.lang.String r1 = "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview"
            io.flutter.Log.w(r0, r1, r8)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.platform.PlatformPlugin.getClipboardData(io.flutter.embedding.engine.systemchannels.PlatformChannel$ClipboardContentFormat):java.lang.CharSequence");
    }

    /* access modifiers changed from: private */
    public void setClipboardData(String str) {
        ((ClipboardManager) this.activity.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", str));
    }

    /* access modifiers changed from: private */
    public boolean clipboardHasStrings() {
        ClipDescription primaryClipDescription;
        ClipboardManager clipboardManager = (ClipboardManager) this.activity.getSystemService("clipboard");
        if (clipboardManager.hasPrimaryClip() && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    /* access modifiers changed from: private */
    public void share(String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
        intent.putExtra("android.intent.extra.TEXT", str);
        this.activity.startActivity(Intent.createChooser(intent, (CharSequence) null));
    }
}
