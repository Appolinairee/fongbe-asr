package androidx.window.layout.adapter.extensions;

import android.app.Activity;
import android.content.Context;
import androidx.core.util.Consumer;
import androidx.window.core.ConsumerAdapter;
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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0012\u001a\u00020\u0013H\u0017J&\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J\u0016\u0010\u001a\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\"\u0010\u000f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\f0\b8\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Landroidx/window/layout/adapter/extensions/ExtensionWindowBackendApi1;", "Landroidx/window/layout/adapter/WindowBackend;", "component", "Landroidx/window/extensions/layout/WindowLayoutComponent;", "consumerAdapter", "Landroidx/window/core/ConsumerAdapter;", "(Landroidx/window/extensions/layout/WindowLayoutComponent;Landroidx/window/core/ConsumerAdapter;)V", "consumerToToken", "", "Landroidx/window/layout/adapter/extensions/MulticastConsumer;", "Landroidx/window/core/ConsumerAdapter$Subscription;", "contextToListeners", "Landroid/content/Context;", "extensionWindowBackendLock", "Ljava/util/concurrent/locks/ReentrantLock;", "listenerToContext", "Landroidx/core/util/Consumer;", "Landroidx/window/layout/WindowLayoutInfo;", "hasRegisteredListeners", "", "registerLayoutChangeCallback", "", "context", "executor", "Ljava/util/concurrent/Executor;", "callback", "unregisterLayoutChangeCallback", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: ExtensionWindowBackendApi1.kt */
public final class ExtensionWindowBackendApi1 implements WindowBackend {
    private final WindowLayoutComponent component;
    private final ConsumerAdapter consumerAdapter;
    private final Map<MulticastConsumer, ConsumerAdapter.Subscription> consumerToToken = new LinkedHashMap();
    private final Map<Context, MulticastConsumer> contextToListeners = new LinkedHashMap();
    private final ReentrantLock extensionWindowBackendLock = new ReentrantLock();
    private final Map<Consumer<WindowLayoutInfo>, Context> listenerToContext = new LinkedHashMap();

    public ExtensionWindowBackendApi1(WindowLayoutComponent windowLayoutComponent, ConsumerAdapter consumerAdapter2) {
        Intrinsics.checkNotNullParameter(windowLayoutComponent, "component");
        Intrinsics.checkNotNullParameter(consumerAdapter2, "consumerAdapter");
        this.component = windowLayoutComponent;
        this.consumerAdapter = consumerAdapter2;
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
                ExtensionWindowBackendApi1 extensionWindowBackendApi1 = this;
                MulticastConsumer multicastConsumer2 = new MulticastConsumer(context);
                this.contextToListeners.put(context, multicastConsumer2);
                this.listenerToContext.put(consumer, context);
                multicastConsumer2.addListener(consumer);
                if (context instanceof Activity) {
                    this.consumerToToken.put(multicastConsumer2, this.consumerAdapter.createSubscription((Object) this.component, Reflection.getOrCreateKotlinClass(androidx.window.extensions.layout.WindowLayoutInfo.class), "addWindowLayoutInfoListener", "removeWindowLayoutInfoListener", (Activity) context, new ExtensionWindowBackendApi1$registerLayoutChangeCallback$1$2$disposableToken$1(multicastConsumer2)));
                } else {
                    multicastConsumer2.accept(new androidx.window.extensions.layout.WindowLayoutInfo(CollectionsKt.emptyList()));
                    lock.unlock();
                    return;
                }
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
                    ConsumerAdapter.Subscription remove = this.consumerToToken.remove(multicastConsumer);
                    if (remove != null) {
                        remove.dispose();
                    }
                }
                Unit unit = Unit.INSTANCE;
                lock.unlock();
            }
        } finally {
            lock.unlock();
        }
    }

    public boolean hasRegisteredListeners() {
        return !this.contextToListeners.isEmpty() || !this.listenerToContext.isEmpty() || !this.consumerToToken.isEmpty();
    }
}
