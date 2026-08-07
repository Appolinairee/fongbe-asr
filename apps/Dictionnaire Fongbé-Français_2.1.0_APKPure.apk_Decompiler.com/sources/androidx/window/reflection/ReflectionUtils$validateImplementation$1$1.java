package androidx.window.reflection;

import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: ReflectionUtils.kt */
final class ReflectionUtils$validateImplementation$1$1 extends Lambda implements Function0<Boolean> {
    final /* synthetic */ Class<?> $implementation;
    final /* synthetic */ Method $it;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ReflectionUtils$validateImplementation$1$1(Class<?> cls, Method method) {
        super(0);
        this.$implementation = cls;
        this.$it = method;
    }

    public final Boolean invoke() {
        boolean z;
        Class<?> cls = this.$implementation;
        String name = this.$it.getName();
        Class[] parameterTypes = this.$it.getParameterTypes();
        Method method = cls.getMethod(name, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(method, "implementedMethod");
        if (reflectionUtils.isPublic$window_release(method)) {
            ReflectionUtils reflectionUtils2 = ReflectionUtils.INSTANCE;
            Class<?> returnType = this.$it.getReturnType();
            Intrinsics.checkNotNullExpressionValue(returnType, "it.returnType");
            if (reflectionUtils2.doesReturn$window_release(method, returnType)) {
                z = true;
                return Boolean.valueOf(z);
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
