package androidx.window;

import androidx.window.extensions.WindowExtensions;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.reflection.ReflectionUtils;
import androidx.window.reflection.WindowExtensionsConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\r\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0002\b\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u0006\u0012\u0002\b\u00030\n8@X\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\u0006\u0012\u0002\b\u00030\n8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f¨\u0006\u0013"}, d2 = {"Landroidx/window/SafeWindowExtensionsProvider;", "", "loader", "Ljava/lang/ClassLoader;", "(Ljava/lang/ClassLoader;)V", "windowExtensions", "Landroidx/window/extensions/WindowExtensions;", "getWindowExtensions", "()Landroidx/window/extensions/WindowExtensions;", "windowExtensionsClass", "Ljava/lang/Class;", "getWindowExtensionsClass$window_release", "()Ljava/lang/Class;", "windowExtensionsProviderClass", "getWindowExtensionsProviderClass", "isWindowExtensionsPresent", "", "isWindowExtensionsValid", "isWindowExtensionsValid$window_release", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: SafeWindowExtensionsProvider.kt */
public final class SafeWindowExtensionsProvider {
    /* access modifiers changed from: private */
    public final ClassLoader loader;

    public SafeWindowExtensionsProvider(ClassLoader classLoader) {
        Intrinsics.checkNotNullParameter(classLoader, "loader");
        this.loader = classLoader;
    }

    public final WindowExtensions getWindowExtensions() {
        try {
            if (!isWindowExtensionsPresent() || !isWindowExtensionsValid$window_release()) {
                return null;
            }
            return WindowExtensionsProvider.getWindowExtensions();
        } catch (Exception unused) {
            return null;
        }
    }

    public final Class<?> getWindowExtensionsClass$window_release() {
        Class<?> loadClass = this.loader.loadClass(WindowExtensionsConstants.WINDOW_EXTENSIONS_CLASS);
        Intrinsics.checkNotNullExpressionValue(loadClass, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
        return loadClass;
    }

    public final boolean isWindowExtensionsValid$window_release() {
        return isWindowExtensionsPresent() && ReflectionUtils.validateReflection$window_release("WindowExtensionsProvider#getWindowExtensions is not valid", new SafeWindowExtensionsProvider$isWindowExtensionsValid$1(this));
    }

    private final boolean isWindowExtensionsPresent() {
        return ReflectionUtils.INSTANCE.checkIsPresent$window_release(new SafeWindowExtensionsProvider$isWindowExtensionsPresent$1(this));
    }

    /* access modifiers changed from: private */
    public final Class<?> getWindowExtensionsProviderClass() {
        Class<?> loadClass = this.loader.loadClass(WindowExtensionsConstants.WINDOW_EXTENSIONS_PROVIDER_CLASS);
        Intrinsics.checkNotNullExpressionValue(loadClass, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
        return loadClass;
    }
}
