package androidx.window.area;

import android.app.Activity;
import android.os.Binder;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.window.area.WindowAreaCapability;
import androidx.window.area.WindowAreaInfo;
import androidx.window.area.utils.DeviceUtils;
import androidx.window.core.BuildConfig;
import androidx.window.core.VerificationMode;
import androidx.window.extensions.area.ExtensionWindowAreaPresentation;
import androidx.window.extensions.area.ExtensionWindowAreaStatus;
import androidx.window.extensions.area.WindowAreaComponent;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.layout.WindowMetrics;
import androidx.window.layout.WindowMetricsCalculator;
import androidx.work.Constraints$Builder$$ExternalSyntheticApiModelOutline0;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 22\u00020\u0001:\u0003234B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J(\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\rH\u0002J \u0010#\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020%H\u0002J \u0010&\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J(\u0010'\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010(\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u0005H\u0002J\u0010\u0010*\u001a\u00020\u00172\u0006\u0010+\u001a\u00020,H\u0002J \u0010-\u001a\u00020\u00172\u0006\u0010.\u001a\u00020/2\u0006\u0010)\u001a\u00020\b2\u0006\u00100\u001a\u000201H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R*\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bj\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r`\u000eX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00130\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u00065"}, d2 = {"Landroidx/window/area/WindowAreaControllerImpl;", "Landroidx/window/area/WindowAreaController;", "windowAreaComponent", "Landroidx/window/extensions/area/WindowAreaComponent;", "vendorApiLevel", "", "(Landroidx/window/extensions/area/WindowAreaComponent;I)V", "currentRearDisplayModeStatus", "Landroidx/window/area/WindowAreaCapability$Status;", "currentRearDisplayPresentationStatus", "currentWindowAreaInfoMap", "Ljava/util/HashMap;", "", "Landroidx/window/area/WindowAreaInfo;", "Lkotlin/collections/HashMap;", "rearDisplaySessionConsumer", "Landroidx/window/extensions/core/util/function/Consumer;", "windowAreaInfos", "Lkotlinx/coroutines/flow/Flow;", "", "getWindowAreaInfos", "()Lkotlinx/coroutines/flow/Flow;", "presentContentOnWindowArea", "", "token", "Landroid/os/Binder;", "activity", "Landroid/app/Activity;", "executor", "Ljava/util/concurrent/Executor;", "windowAreaPresentationSessionCallback", "Landroidx/window/area/WindowAreaPresentationSessionCallback;", "shouldRemoveWindowAreaInfo", "", "windowAreaInfo", "startRearDisplayMode", "windowAreaSessionCallback", "Landroidx/window/area/WindowAreaSessionCallback;", "startRearDisplayPresentationMode", "transferActivityToWindowArea", "updateRearDisplayAvailability", "status", "updateRearDisplayPresentationAvailability", "extensionWindowAreaStatus", "Landroidx/window/extensions/area/ExtensionWindowAreaStatus;", "updateRearDisplayWindowArea", "operation", "Landroidx/window/area/WindowAreaCapability$Operation;", "metrics", "Landroidx/window/layout/WindowMetrics;", "Companion", "RearDisplayPresentationSessionConsumer", "RearDisplaySessionConsumer", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: WindowAreaControllerImpl.kt */
public final class WindowAreaControllerImpl implements WindowAreaController {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String REAR_DISPLAY_BINDER_DESCRIPTOR = "WINDOW_AREA_REAR_DISPLAY";
    /* access modifiers changed from: private */
    public static final String TAG = Reflection.getOrCreateKotlinClass(WindowAreaControllerImpl.class).getSimpleName();
    private WindowAreaCapability.Status currentRearDisplayModeStatus = WindowAreaCapability.Status.Companion.getWINDOW_AREA_STATUS_UNKNOWN$window_release();
    private WindowAreaCapability.Status currentRearDisplayPresentationStatus = WindowAreaCapability.Status.Companion.getWINDOW_AREA_STATUS_UNKNOWN$window_release();
    /* access modifiers changed from: private */
    public final HashMap<String, WindowAreaInfo> currentWindowAreaInfoMap = new HashMap<>();
    private Consumer<Integer> rearDisplaySessionConsumer;
    /* access modifiers changed from: private */
    public final int vendorApiLevel;
    /* access modifiers changed from: private */
    public final WindowAreaComponent windowAreaComponent;

    public WindowAreaControllerImpl(WindowAreaComponent windowAreaComponent2, int i) {
        Intrinsics.checkNotNullParameter(windowAreaComponent2, "windowAreaComponent");
        this.windowAreaComponent = windowAreaComponent2;
        this.vendorApiLevel = i;
    }

    public Flow<List<WindowAreaInfo>> getWindowAreaInfos() {
        return FlowKt.callbackFlow(new WindowAreaControllerImpl$windowAreaInfos$1(this, (Continuation<? super WindowAreaControllerImpl$windowAreaInfos$1>) null));
    }

    /* access modifiers changed from: private */
    public final void updateRearDisplayAvailability(int i) {
        WindowMetrics windowMetrics;
        if (this.vendorApiLevel >= 3) {
            WindowMetricsCalculator.Companion companion = WindowMetricsCalculator.Companion;
            DisplayMetrics rearDisplayMetrics = this.windowAreaComponent.getRearDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(rearDisplayMetrics, "windowAreaComponent.rearDisplayMetrics");
            windowMetrics = companion.fromDisplayMetrics$window_release(rearDisplayMetrics);
        } else {
            DeviceUtils deviceUtils = DeviceUtils.INSTANCE;
            String str = Build.MANUFACTURER;
            Intrinsics.checkNotNullExpressionValue(str, "MANUFACTURER");
            String str2 = Build.MODEL;
            Intrinsics.checkNotNullExpressionValue(str2, "MODEL");
            DisplayMetrics rearDisplayMetrics$window_release = deviceUtils.getRearDisplayMetrics$window_release(str, str2);
            if (rearDisplayMetrics$window_release != null) {
                windowMetrics = WindowMetricsCalculator.Companion.fromDisplayMetrics$window_release(rearDisplayMetrics$window_release);
            } else {
                throw new IllegalArgumentException("DeviceUtils rear display metrics entry should not be null");
            }
        }
        this.currentRearDisplayModeStatus = WindowAreaAdapter.INSTANCE.translate$window_release(i);
        updateRearDisplayWindowArea(WindowAreaCapability.Operation.OPERATION_TRANSFER_ACTIVITY_TO_AREA, this.currentRearDisplayModeStatus, windowMetrics);
    }

    /* access modifiers changed from: private */
    public final void updateRearDisplayPresentationAvailability(ExtensionWindowAreaStatus extensionWindowAreaStatus) {
        this.currentRearDisplayPresentationStatus = WindowAreaAdapter.INSTANCE.translate$window_release(extensionWindowAreaStatus.getWindowAreaStatus());
        WindowMetricsCalculator.Companion companion = WindowMetricsCalculator.Companion;
        DisplayMetrics windowAreaDisplayMetrics = extensionWindowAreaStatus.getWindowAreaDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(windowAreaDisplayMetrics, "extensionWindowAreaStatus.windowAreaDisplayMetrics");
        updateRearDisplayWindowArea(WindowAreaCapability.Operation.OPERATION_PRESENT_ON_AREA, this.currentRearDisplayPresentationStatus, companion.fromDisplayMetrics$window_release(windowAreaDisplayMetrics));
    }

    private final void updateRearDisplayWindowArea(WindowAreaCapability.Operation operation, WindowAreaCapability.Status status, WindowMetrics windowMetrics) {
        WindowAreaInfo windowAreaInfo = this.currentWindowAreaInfoMap.get(REAR_DISPLAY_BINDER_DESCRIPTOR);
        if (!Intrinsics.areEqual((Object) status, (Object) WindowAreaCapability.Status.WINDOW_AREA_STATUS_UNSUPPORTED)) {
            if (windowAreaInfo == null) {
                windowAreaInfo = new WindowAreaInfo(windowMetrics, WindowAreaInfo.Type.TYPE_REAR_FACING, Constraints$Builder$$ExternalSyntheticApiModelOutline0.m(REAR_DISPLAY_BINDER_DESCRIPTOR), this.windowAreaComponent);
            }
            windowAreaInfo.getCapabilityMap$window_release().put(operation, new WindowAreaCapability(operation, status));
            windowAreaInfo.setMetrics(windowMetrics);
            this.currentWindowAreaInfoMap.put(REAR_DISPLAY_BINDER_DESCRIPTOR, windowAreaInfo);
        } else if (windowAreaInfo == null) {
        } else {
            if (shouldRemoveWindowAreaInfo(windowAreaInfo)) {
                this.currentWindowAreaInfoMap.remove(REAR_DISPLAY_BINDER_DESCRIPTOR);
                return;
            }
            windowAreaInfo.getCapabilityMap$window_release().put(operation, new WindowAreaCapability(operation, status));
        }
    }

    private final boolean shouldRemoveWindowAreaInfo(WindowAreaInfo windowAreaInfo) {
        for (WindowAreaCapability next : windowAreaInfo.getCapabilityMap$window_release().values()) {
            Intrinsics.checkNotNullExpressionValue(next, "windowAreaInfo.capabilityMap.values");
            if (!Intrinsics.areEqual((Object) next.getStatus(), (Object) WindowAreaCapability.Status.WINDOW_AREA_STATUS_UNSUPPORTED)) {
                return false;
            }
        }
        return true;
    }

    public void transferActivityToWindowArea(Binder binder, Activity activity, Executor executor, WindowAreaSessionCallback windowAreaSessionCallback) {
        Intrinsics.checkNotNullParameter(binder, "token");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(windowAreaSessionCallback, "windowAreaSessionCallback");
        if (!Intrinsics.areEqual((Object) binder.getInterfaceDescriptor(), (Object) REAR_DISPLAY_BINDER_DESCRIPTOR)) {
            executor.execute(new WindowAreaControllerImpl$$ExternalSyntheticLambda2(windowAreaSessionCallback));
        } else if (Intrinsics.areEqual((Object) this.currentRearDisplayModeStatus, (Object) WindowAreaCapability.Status.Companion.getWINDOW_AREA_STATUS_UNKNOWN$window_release())) {
            Log.d(TAG, "Force updating currentRearDisplayModeStatus");
            Job unused = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(ExecutorsKt.from(executor)), (CoroutineContext) null, (CoroutineStart) null, new WindowAreaControllerImpl$transferActivityToWindowArea$2(this, activity, executor, windowAreaSessionCallback, (Continuation<? super WindowAreaControllerImpl$transferActivityToWindowArea$2>) null), 3, (Object) null);
        } else {
            startRearDisplayMode(activity, executor, windowAreaSessionCallback);
        }
    }

    /* access modifiers changed from: private */
    public static final void transferActivityToWindowArea$lambda$1(WindowAreaSessionCallback windowAreaSessionCallback) {
        Intrinsics.checkNotNullParameter(windowAreaSessionCallback, "$windowAreaSessionCallback");
        windowAreaSessionCallback.onSessionEnded(new IllegalArgumentException("Invalid WindowAreaInfo token"));
    }

    public void presentContentOnWindowArea(Binder binder, Activity activity, Executor executor, WindowAreaPresentationSessionCallback windowAreaPresentationSessionCallback) {
        Intrinsics.checkNotNullParameter(binder, "token");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(windowAreaPresentationSessionCallback, "windowAreaPresentationSessionCallback");
        if (!Intrinsics.areEqual((Object) binder.getInterfaceDescriptor(), (Object) REAR_DISPLAY_BINDER_DESCRIPTOR)) {
            executor.execute(new WindowAreaControllerImpl$$ExternalSyntheticLambda1(windowAreaPresentationSessionCallback));
        } else if (Intrinsics.areEqual((Object) this.currentRearDisplayPresentationStatus, (Object) WindowAreaCapability.Status.Companion.getWINDOW_AREA_STATUS_UNKNOWN$window_release())) {
            Log.d(TAG, "Force updating currentRearDisplayPresentationStatus");
            Job unused = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(ExecutorsKt.from(executor)), (CoroutineContext) null, (CoroutineStart) null, new WindowAreaControllerImpl$presentContentOnWindowArea$2(this, activity, executor, windowAreaPresentationSessionCallback, (Continuation<? super WindowAreaControllerImpl$presentContentOnWindowArea$2>) null), 3, (Object) null);
        } else {
            startRearDisplayPresentationMode(activity, executor, windowAreaPresentationSessionCallback);
        }
    }

    /* access modifiers changed from: private */
    public static final void presentContentOnWindowArea$lambda$2(WindowAreaPresentationSessionCallback windowAreaPresentationSessionCallback) {
        Intrinsics.checkNotNullParameter(windowAreaPresentationSessionCallback, "$windowAreaPresentationSessionCallback");
        windowAreaPresentationSessionCallback.onSessionEnded(new IllegalArgumentException("Invalid WindowAreaInfo token"));
    }

    /* access modifiers changed from: private */
    public final void startRearDisplayMode(Activity activity, Executor executor, WindowAreaSessionCallback windowAreaSessionCallback) {
        if (Intrinsics.areEqual((Object) this.currentRearDisplayModeStatus, (Object) WindowAreaCapability.Status.WINDOW_AREA_STATUS_ACTIVE)) {
            windowAreaSessionCallback.onSessionEnded(new IllegalStateException("The WindowArea feature is currently active, WindowAreaInfo#getActiveSessioncan be used to get an instance of the current active session"));
        } else if (!Intrinsics.areEqual((Object) this.currentRearDisplayModeStatus, (Object) WindowAreaCapability.Status.WINDOW_AREA_STATUS_AVAILABLE)) {
            windowAreaSessionCallback.onSessionEnded(new IllegalStateException("The WindowArea feature is currently not available to be entered"));
        } else {
            Consumer<Integer> rearDisplaySessionConsumer2 = new RearDisplaySessionConsumer(executor, windowAreaSessionCallback, this.windowAreaComponent);
            this.rearDisplaySessionConsumer = rearDisplaySessionConsumer2;
            this.windowAreaComponent.startRearDisplaySession(activity, rearDisplaySessionConsumer2);
        }
    }

    /* access modifiers changed from: private */
    public final void startRearDisplayPresentationMode(Activity activity, Executor executor, WindowAreaPresentationSessionCallback windowAreaPresentationSessionCallback) {
        if (!Intrinsics.areEqual((Object) this.currentRearDisplayPresentationStatus, (Object) WindowAreaCapability.Status.WINDOW_AREA_STATUS_AVAILABLE)) {
            windowAreaPresentationSessionCallback.onSessionEnded(new IllegalStateException("The WindowArea feature is currently not available to be entered"));
            return;
        }
        WindowAreaComponent windowAreaComponent2 = this.windowAreaComponent;
        windowAreaComponent2.startRearDisplayPresentationSession(activity, new RearDisplayPresentationSessionConsumer(executor, windowAreaPresentationSessionCallback, windowAreaComponent2));
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\b\u0010\u000f\u001a\u00020\rH\u0002J\b\u0010\u0010\u001a\u00020\rH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Landroidx/window/area/WindowAreaControllerImpl$RearDisplaySessionConsumer;", "Landroidx/window/extensions/core/util/function/Consumer;", "", "executor", "Ljava/util/concurrent/Executor;", "appCallback", "Landroidx/window/area/WindowAreaSessionCallback;", "extensionsComponent", "Landroidx/window/extensions/area/WindowAreaComponent;", "(Ljava/util/concurrent/Executor;Landroidx/window/area/WindowAreaSessionCallback;Landroidx/window/extensions/area/WindowAreaComponent;)V", "session", "Landroidx/window/area/WindowAreaSession;", "accept", "", "t", "onSessionFinished", "onSessionStarted", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: WindowAreaControllerImpl.kt */
    public static final class RearDisplaySessionConsumer implements Consumer<Integer> {
        private final WindowAreaSessionCallback appCallback;
        private final Executor executor;
        private final WindowAreaComponent extensionsComponent;
        private WindowAreaSession session;

        public RearDisplaySessionConsumer(Executor executor2, WindowAreaSessionCallback windowAreaSessionCallback, WindowAreaComponent windowAreaComponent) {
            Intrinsics.checkNotNullParameter(executor2, "executor");
            Intrinsics.checkNotNullParameter(windowAreaSessionCallback, "appCallback");
            Intrinsics.checkNotNullParameter(windowAreaComponent, "extensionsComponent");
            this.executor = executor2;
            this.appCallback = windowAreaSessionCallback;
            this.extensionsComponent = windowAreaComponent;
        }

        public /* bridge */ /* synthetic */ void accept(Object obj) {
            accept(((Number) obj).intValue());
        }

        public void accept(int i) {
            if (i == 0) {
                onSessionFinished();
            } else if (i != 1) {
                if (BuildConfig.INSTANCE.getVerificationMode() == VerificationMode.STRICT) {
                    String access$getTAG$cp = WindowAreaControllerImpl.TAG;
                    Log.d(access$getTAG$cp, "Received an unknown session status value: " + i);
                }
                onSessionFinished();
            } else {
                onSessionStarted();
            }
        }

        private final void onSessionStarted() {
            WindowAreaSession rearDisplaySessionImpl = new RearDisplaySessionImpl(this.extensionsComponent);
            this.session = rearDisplaySessionImpl;
            this.executor.execute(new WindowAreaControllerImpl$RearDisplaySessionConsumer$$ExternalSyntheticLambda0(this, rearDisplaySessionImpl));
        }

        /* access modifiers changed from: private */
        public static final void onSessionStarted$lambda$1$lambda$0(RearDisplaySessionConsumer rearDisplaySessionConsumer, WindowAreaSession windowAreaSession) {
            Intrinsics.checkNotNullParameter(rearDisplaySessionConsumer, "this$0");
            Intrinsics.checkNotNullParameter(windowAreaSession, "$it");
            rearDisplaySessionConsumer.appCallback.onSessionStarted(windowAreaSession);
        }

        private final void onSessionFinished() {
            this.session = null;
            this.executor.execute(new WindowAreaControllerImpl$RearDisplaySessionConsumer$$ExternalSyntheticLambda1(this));
        }

        /* access modifiers changed from: private */
        public static final void onSessionFinished$lambda$2(RearDisplaySessionConsumer rearDisplaySessionConsumer) {
            Intrinsics.checkNotNullParameter(rearDisplaySessionConsumer, "this$0");
            rearDisplaySessionConsumer.appCallback.onSessionEnded((Throwable) null);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0002X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Landroidx/window/area/WindowAreaControllerImpl$RearDisplayPresentationSessionConsumer;", "Landroidx/window/extensions/core/util/function/Consumer;", "", "executor", "Ljava/util/concurrent/Executor;", "windowAreaPresentationSessionCallback", "Landroidx/window/area/WindowAreaPresentationSessionCallback;", "windowAreaComponent", "Landroidx/window/extensions/area/WindowAreaComponent;", "(Ljava/util/concurrent/Executor;Landroidx/window/area/WindowAreaPresentationSessionCallback;Landroidx/window/extensions/area/WindowAreaComponent;)V", "lastReportedSessionStatus", "accept", "", "t", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: WindowAreaControllerImpl.kt */
    public static final class RearDisplayPresentationSessionConsumer implements Consumer<Integer> {
        private final Executor executor;
        private int lastReportedSessionStatus;
        private final WindowAreaComponent windowAreaComponent;
        private final WindowAreaPresentationSessionCallback windowAreaPresentationSessionCallback;

        public RearDisplayPresentationSessionConsumer(Executor executor2, WindowAreaPresentationSessionCallback windowAreaPresentationSessionCallback2, WindowAreaComponent windowAreaComponent2) {
            Intrinsics.checkNotNullParameter(executor2, "executor");
            Intrinsics.checkNotNullParameter(windowAreaPresentationSessionCallback2, "windowAreaPresentationSessionCallback");
            Intrinsics.checkNotNullParameter(windowAreaComponent2, "windowAreaComponent");
            this.executor = executor2;
            this.windowAreaPresentationSessionCallback = windowAreaPresentationSessionCallback2;
            this.windowAreaComponent = windowAreaComponent2;
        }

        public /* bridge */ /* synthetic */ void accept(Object obj) {
            accept(((Number) obj).intValue());
        }

        public void accept(int i) {
            int i2 = this.lastReportedSessionStatus;
            this.lastReportedSessionStatus = i;
            this.executor.execute(new WindowAreaControllerImpl$RearDisplayPresentationSessionConsumer$$ExternalSyntheticLambda0(i, i2, this));
        }

        /* access modifiers changed from: private */
        public static final void accept$lambda$0(int i, int i2, RearDisplayPresentationSessionConsumer rearDisplayPresentationSessionConsumer) {
            Intrinsics.checkNotNullParameter(rearDisplayPresentationSessionConsumer, "this$0");
            if (i == 0) {
                rearDisplayPresentationSessionConsumer.windowAreaPresentationSessionCallback.onSessionEnded((Throwable) null);
            } else if (i != 1) {
                if (i != 2) {
                    String access$getTAG$cp = WindowAreaControllerImpl.TAG;
                    Log.e(access$getTAG$cp, "Invalid session state value received: " + i);
                    return;
                }
                rearDisplayPresentationSessionConsumer.windowAreaPresentationSessionCallback.onContainerVisibilityChanged(true);
            } else if (i2 == 2) {
                rearDisplayPresentationSessionConsumer.windowAreaPresentationSessionCallback.onContainerVisibilityChanged(false);
            } else {
                WindowAreaPresentationSessionCallback windowAreaPresentationSessionCallback2 = rearDisplayPresentationSessionConsumer.windowAreaPresentationSessionCallback;
                WindowAreaComponent windowAreaComponent2 = rearDisplayPresentationSessionConsumer.windowAreaComponent;
                ExtensionWindowAreaPresentation rearDisplayPresentation = windowAreaComponent2.getRearDisplayPresentation();
                Intrinsics.checkNotNull(rearDisplayPresentation);
                windowAreaPresentationSessionCallback2.onSessionStarted(new RearDisplayPresentationSessionPresenterImpl(windowAreaComponent2, rearDisplayPresentation));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Landroidx/window/area/WindowAreaControllerImpl$Companion;", "", "()V", "REAR_DISPLAY_BINDER_DESCRIPTOR", "", "TAG", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: WindowAreaControllerImpl.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
