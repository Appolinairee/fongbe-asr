package androidx.window.area.reflectionguard;

import androidx.window.extensions.area.ExtensionWindowAreaPresentation;
import androidx.window.reflection.ReflectionUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J!\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\tJ!\u0010\n\u001a\u00020\u00042\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\fJ!\u0010\r\u001a\u00020\u00042\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Landroidx/window/area/reflectionguard/WindowAreaComponentValidator;", "", "()V", "isExtensionWindowAreaPresentationValid", "", "extensionWindowAreaPresentation", "Ljava/lang/Class;", "apiLevel", "", "isExtensionWindowAreaPresentationValid$window_release", "isExtensionWindowAreaStatusValid", "extensionWindowAreaStatus", "isExtensionWindowAreaStatusValid$window_release", "isWindowAreaComponentValid", "windowAreaComponent", "isWindowAreaComponentValid$window_release", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: WindowAreaComponentValidator.kt */
public final class WindowAreaComponentValidator {
    public static final WindowAreaComponentValidator INSTANCE = new WindowAreaComponentValidator();

    private WindowAreaComponentValidator() {
    }

    public final boolean isWindowAreaComponentValid$window_release(Class<?> cls, int i) {
        Intrinsics.checkNotNullParameter(cls, "windowAreaComponent");
        if (i <= 1) {
            return false;
        }
        if (i == 2) {
            return ReflectionUtils.INSTANCE.validateImplementation$window_release(cls, WindowAreaComponentApi2Requirements.class);
        }
        return ReflectionUtils.INSTANCE.validateImplementation$window_release(cls, WindowAreaComponentApi3Requirements.class);
    }

    public final boolean isExtensionWindowAreaStatusValid$window_release(Class<?> cls, int i) {
        Intrinsics.checkNotNullParameter(cls, "extensionWindowAreaStatus");
        if (i <= 1) {
            return false;
        }
        return ReflectionUtils.INSTANCE.validateImplementation$window_release(cls, ExtensionWindowAreaStatusRequirements.class);
    }

    public final boolean isExtensionWindowAreaPresentationValid$window_release(Class<?> cls, int i) {
        Intrinsics.checkNotNullParameter(cls, "extensionWindowAreaPresentation");
        if (i <= 2) {
            return false;
        }
        return ReflectionUtils.INSTANCE.validateImplementation$window_release(cls, ExtensionWindowAreaPresentation.class);
    }
}
