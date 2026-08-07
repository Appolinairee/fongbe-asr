package androidx.window.layout.adapter.extensions;

import android.content.Context;
import androidx.core.util.Consumer;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.WindowBackend;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0017J&\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\u0016\u0010\u0016\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\"\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Landroidx/window/layout/adapter/extensions/ExtensionWindowBackendApi2;", "Landroidx/window/layout/adapter/WindowBackend;", "component", "Landroidx/window/extensions/layout/WindowLayoutComponent;", "(Landroidx/window/extensions/layout/WindowLayoutComponent;)V", "contextToListeners", "", "Landroid/content/Context;", "Landroidx/window/layout/adapter/extensions/MulticastConsumer;", "extensionWindowBackendLock", "Ljava/util/concurrent/locks/ReentrantLock;", "listenerToContext", "Landroidx/core/util/Consumer;", "Landroidx/window/layout/WindowLayoutInfo;", "hasRegisteredListeners", "", "registerLayoutChangeCallback", "", "context", "executor", "Ljava/util/concurrent/Executor;", "callback", "unregisterLayoutChangeCallback", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: ExtensionWindowBackendApi2.kt */
public final class ExtensionWindowBackendApi2 implements WindowBackend {
    private final WindowLayoutComponent component;
    private final Map<Context, MulticastConsumer> contextToListeners = new LinkedHashMap();
    private final ReentrantLock extensionWindowBackendLock = new ReentrantLock();
    private final Map<Consumer<WindowLayoutInfo>, Context> listenerToContext = new LinkedHashMap();

    public ExtensionWindowBackendApi2(WindowLayoutComponent windowLayoutComponent) {
        Intrinsics.checkNotNullParameter(windowLayoutComponent, "component");
        this.component = windowLayoutComponent;
    }

    public void registerLayoutChangeCallback(Context context, Executor executor, Consumer<WindowLayoutInfo> consumer) {
        Unit unit;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(consumer, "callback");
        Lock lock = this.extensionWindowBackendLock;
        lock.lock();
        try {
            MulticastConsumer multicastConsumer = this.contextToListeners.get(context);
            if (multicastConsumer != null) {
                multicastConsumer.addListener(consumer);
                this.listenerToContext.put(consumer, context);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                ExtensionWindowBackendApi2 extensionWindowBackendApi2 = this;
                MulticastConsumer multicastConsumer2 = new MulticastConsumer(context);
                this.contextToListeners.put(context, multicastConsumer2);
                this.listenerToContext.put(consumer, context);
                multicastConsumer2.addListener(consumer);
                this.component.addWindowLayoutInfoListener(context, multicastConsumer2);
            }
            Unit unit2 = Unit.INSTANCE;
        } finally {
            lock.unlock();
        }
    }

    public void unregisterLayoutChangeCallback(Consumer<WindowLayoutInfo> consumer) {
        Intrinsics.checkNotNullParameter(consumer, "callback");
        Lock lock = this.extensionWindowBackendLock;
        lock.lock();
        try {
            Context context = this.listenerToContext.get(consumer);
            if (context != null) {
                MulticastConsumer multicastConsumer = this.contextToListeners.get(context);
                if (multicastConsumer == null) {
                    lock.unlock();
                    return;
                }
                multicastConsumer.removeListener(consumer);
                this.listenerToContext.remove(consumer);
                if (multicastConsumer.isEmpty()) {
                    this.contextToListeners.remove(context);
                    this.component.removeWindowLayoutInfoListener(multicastConsumer);
                }
                Unit unit = Unit.INSTANCE;
                lock.unlock();
            }
        } finally {
            lock.unlock();
        }
    }

    public boolean hasRegisteredListeners() {
        return !this.contextToListeners.isEmpty() || !this.listenerToContext.isEmpty();
    }
}
