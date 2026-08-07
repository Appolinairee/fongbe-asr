package androidx.window;

import androidx.window.reflection.ReflectionUtils;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: SafeWindowExtensionsProvider.kt */
final class SafeWindowExtensionsProvider$isWindowExtensionsValid$1 extends Lambda implements Function0<Boolean> {
    final /* synthetic */ SafeWindowExtensionsProvider this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SafeWindowExtensionsProvider$isWindowExtensionsValid$1(SafeWindowExtensionsProvider safeWindowExtensionsProvider) {
        super(0);
        this.this$0 = safeWindowExtensionsProvider;
    }

    public final Boolean invoke() {
        Method declaredMethod = this.this$0.getWindowExtensionsProviderClass().getDeclaredMethod("getWindowExtensions", (Class[]) null);
        Class<?> windowExtensionsClass$window_release = this.this$0.getWindowExtensionsClass$window_release();
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(declaredMethod, "getWindowExtensionsMethod");
        return Boolean.valueOf(reflectionUtils.doesReturn$window_release(declaredMethod, windowExtensionsClass$window_release) && ReflectionUtils.INSTANCE.isPublic$window_release(declaredMethod));
    }
}
