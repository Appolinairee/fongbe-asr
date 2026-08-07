package androidx.window.area;

import androidx.window.reflection.ReflectionUtils;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: SafeWindowAreaComponentProvider.kt */
final class SafeWindowAreaComponentProvider$isWindowAreaProviderValid$1 extends Lambda implements Function0<Boolean> {
    final /* synthetic */ Object $windowExtensions;
    final /* synthetic */ SafeWindowAreaComponentProvider this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SafeWindowAreaComponentProvider$isWindowAreaProviderValid$1(Object obj, SafeWindowAreaComponentProvider safeWindowAreaComponentProvider) {
        super(0);
        this.$windowExtensions = obj;
        this.this$0 = safeWindowAreaComponentProvider;
    }

    public final Boolean invoke() {
        Method method = this.$windowExtensions.getClass().getMethod("getWindowAreaComponent", (Class[]) null);
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(method, "getWindowAreaComponentMethod");
        return Boolean.valueOf(reflectionUtils.isPublic$window_release(method) && ReflectionUtils.INSTANCE.doesReturn$window_release(method, (Class<?>) this.this$0.getWindowAreaComponentClass()));
    }
}
