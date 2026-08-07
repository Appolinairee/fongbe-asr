package androidx.window.reflection;

import android.util.Log;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\b\u001a\u00020\u00042\u0010\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\nH\u0000¢\u0006\u0002\b\fJ%\u0010\r\u001a\u00020\u00042\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000b2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0000¢\u0006\u0002\b\u0010J'\u0010\u0011\u001a\u00020\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0001¢\u0006\u0002\b\u0015J\u001d\u0010\u0016\u001a\u00020\u0004*\u00020\u00052\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0000¢\u0006\u0002\b\u0018J\u001d\u0010\u0016\u001a\u00020\u0004*\u00020\u00052\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0019H\u0000¢\u0006\u0002\b\u0018R\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\u00058@X\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, d2 = {"Landroidx/window/reflection/ReflectionUtils;", "", "()V", "isPublic", "", "Ljava/lang/reflect/Method;", "isPublic$window_release", "(Ljava/lang/reflect/Method;)Z", "checkIsPresent", "classLoader", "Lkotlin/Function0;", "Ljava/lang/Class;", "checkIsPresent$window_release", "validateImplementation", "implementation", "requirements", "validateImplementation$window_release", "validateReflection", "errorMessage", "", "block", "validateReflection$window_release", "doesReturn", "clazz", "doesReturn$window_release", "Lkotlin/reflect/KClass;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: ReflectionUtils.kt */
public final class ReflectionUtils {
    public static final ReflectionUtils INSTANCE = new ReflectionUtils();

    private ReflectionUtils() {
    }

    public final boolean checkIsPresent$window_release(Function0<? extends Class<?>> function0) {
        Intrinsics.checkNotNullParameter(function0, "classLoader");
        try {
            function0.invoke();
            return true;
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
            return false;
        }
    }

    public static /* synthetic */ boolean validateReflection$window_release$default(String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return validateReflection$window_release(str, function0);
    }

    @JvmStatic
    public static final boolean validateReflection$window_release(String str, Function0<Boolean> function0) {
        Intrinsics.checkNotNullParameter(function0, "block");
        try {
            boolean booleanValue = function0.invoke().booleanValue();
            if (!booleanValue && str != null) {
                Log.e("ReflectionGuard", str);
            }
            return booleanValue;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb = new StringBuilder("ClassNotFound: ");
            if (str == null) {
                str = "";
            }
            sb.append(str);
            Log.e("ReflectionGuard", sb.toString());
            return false;
        } catch (NoSuchMethodException unused2) {
            StringBuilder sb2 = new StringBuilder("NoSuchMethod: ");
            if (str == null) {
                str = "";
            }
            sb2.append(str);
            Log.e("ReflectionGuard", sb2.toString());
            return false;
        }
    }

    public final boolean isPublic$window_release(Method method) {
        Intrinsics.checkNotNullParameter(method, "<this>");
        return Modifier.isPublic(method.getModifiers());
    }

    public final boolean doesReturn$window_release(Method method, KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(method, "<this>");
        Intrinsics.checkNotNullParameter(kClass, "clazz");
        return doesReturn$window_release(method, JvmClassMappingKt.getJavaClass(kClass));
    }

    public final boolean doesReturn$window_release(Method method, Class<?> cls) {
        Intrinsics.checkNotNullParameter(method, "<this>");
        Intrinsics.checkNotNullParameter(cls, "clazz");
        return method.getReturnType().equals(cls);
    }

    public final boolean validateImplementation$window_release(Class<?> cls, Class<?> cls2) {
        Intrinsics.checkNotNullParameter(cls, "implementation");
        Intrinsics.checkNotNullParameter(cls2, "requirements");
        Method[] methods = cls2.getMethods();
        Intrinsics.checkNotNullExpressionValue(methods, "requirements.methods");
        for (Object obj : (Object[]) methods) {
            Method method = (Method) obj;
            if (!validateReflection$window_release(cls.getName() + '#' + method.getName() + " is not valid", new ReflectionUtils$validateImplementation$1$1(cls, method))) {
                return false;
            }
        }
        return true;
    }
}
