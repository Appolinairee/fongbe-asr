package androidx.window.java.area;

import android.app.Activity;
import android.os.Binder;
import androidx.core.util.Consumer;
import androidx.window.area.WindowAreaController;
import androidx.window.area.WindowAreaInfo;
import androidx.window.area.WindowAreaPresentationSessionCallback;
import androidx.window.area.WindowAreaSessionCallback;
import androidx.window.java.core.CallbackToFlowAdapter;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\"\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0012J)\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0019H\u0001J\u001a\u0010\u001a\u001a\u00020\u000e2\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0012J)\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001dH\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, d2 = {"Landroidx/window/java/area/WindowAreaControllerCallbackAdapter;", "Landroidx/window/area/WindowAreaController;", "controller", "(Landroidx/window/area/WindowAreaController;)V", "callbackToFlowAdapter", "Landroidx/window/java/core/CallbackToFlowAdapter;", "(Landroidx/window/area/WindowAreaController;Landroidx/window/java/core/CallbackToFlowAdapter;)V", "windowAreaInfos", "Lkotlinx/coroutines/flow/Flow;", "", "Landroidx/window/area/WindowAreaInfo;", "getWindowAreaInfos", "()Lkotlinx/coroutines/flow/Flow;", "addWindowAreaInfoListListener", "", "executor", "Ljava/util/concurrent/Executor;", "listener", "Landroidx/core/util/Consumer;", "presentContentOnWindowArea", "token", "Landroid/os/Binder;", "activity", "Landroid/app/Activity;", "windowAreaPresentationSessionCallback", "Landroidx/window/area/WindowAreaPresentationSessionCallback;", "removeWindowAreaInfoListListener", "transferActivityToWindowArea", "windowAreaSessionCallback", "Landroidx/window/area/WindowAreaSessionCallback;", "window-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: WindowAreaControllerCallbackAdapter.kt */
public final class WindowAreaControllerCallbackAdapter implements WindowAreaController {
    private final CallbackToFlowAdapter callbackToFlowAdapter;
    private final WindowAreaController controller;

    public Flow<List<WindowAreaInfo>> getWindowAreaInfos() {
        return this.controller.getWindowAreaInfos();
    }

    public void presentContentOnWindowArea(Binder binder, Activity activity, Executor executor, WindowAreaPresentationSessionCallback windowAreaPresentationSessionCallback) {
        Intrinsics.checkNotNullParameter(binder, "token");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(windowAreaPresentationSessionCallback, "windowAreaPresentationSessionCallback");
        this.controller.presentContentOnWindowArea(binder, activity, executor, windowAreaPresentationSessionCallback);
    }

    public void transferActivityToWindowArea(Binder binder, Activity activity, Executor executor, WindowAreaSessionCallback windowAreaSessionCallback) {
        Intrinsics.checkNotNullParameter(binder, "token");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(windowAreaSessionCallback, "windowAreaSessionCallback");
        this.controller.transferActivityToWindowArea(binder, activity, executor, windowAreaSessionCallback);
    }

    private WindowAreaControllerCallbackAdapter(WindowAreaController windowAreaController, CallbackToFlowAdapter callbackToFlowAdapter2) {
        this.controller = windowAreaController;
        this.callbackToFlowAdapter = callbackToFlowAdapter2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WindowAreaControllerCallbackAdapter(WindowAreaController windowAreaController) {
        this(windowAreaController, new CallbackToFlowAdapter());
        Intrinsics.checkNotNullParameter(windowAreaController, "controller");
    }

    public final void addWindowAreaInfoListListener(Executor executor, Consumer<List<WindowAreaInfo>> consumer) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(consumer, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.callbackToFlowAdapter.connect(executor, consumer, this.controller.getWindowAreaInfos());
    }

    public final void removeWindowAreaInfoListListener(Consumer<List<WindowAreaInfo>> consumer) {
        Intrinsics.checkNotNullParameter(consumer, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.callbackToFlowAdapter.disconnect(consumer);
    }
}
