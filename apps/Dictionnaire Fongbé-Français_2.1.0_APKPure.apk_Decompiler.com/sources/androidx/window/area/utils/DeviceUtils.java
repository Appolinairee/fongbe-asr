package androidx.window.area.utils;

import android.util.DisplayMetrics;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0002\b\u000bJ\u001d\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0002\b\u000eR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Landroidx/window/area/utils/DeviceUtils;", "", "()V", "deviceList", "", "Landroidx/window/area/utils/DeviceMetrics;", "getRearDisplayMetrics", "Landroid/util/DisplayMetrics;", "manufacturer", "", "model", "getRearDisplayMetrics$window_release", "hasDeviceMetrics", "", "hasDeviceMetrics$window_release", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: DeviceUtils.kt */
public final class DeviceUtils {
    public static final DeviceUtils INSTANCE = new DeviceUtils();
    private static final List<DeviceMetrics> deviceList;

    private DeviceUtils() {
    }

    static {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayMetrics.widthPixels = 1080;
        displayMetrics.heightPixels = 2092;
        displayMetrics.density = 2.625f;
        displayMetrics.densityDpi = TypedValues.CycleType.TYPE_EASING;
        Unit unit = Unit.INSTANCE;
        deviceList = CollectionsKt.listOf(new DeviceMetrics("google", "pixel fold", displayMetrics));
    }

    public final boolean hasDeviceMetrics$window_release(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "manufacturer");
        Intrinsics.checkNotNullParameter(str2, "model");
        Iterable<DeviceMetrics> iterable = deviceList;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (DeviceMetrics deviceMetrics : iterable) {
            String manufacturer = deviceMetrics.getManufacturer();
            Locale locale = Locale.US;
            Intrinsics.checkNotNullExpressionValue(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (Intrinsics.areEqual((Object) manufacturer, (Object) lowerCase)) {
                String model = deviceMetrics.getModel();
                Locale locale2 = Locale.US;
                Intrinsics.checkNotNullExpressionValue(locale2, "US");
                String lowerCase2 = str2.toLowerCase(locale2);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                if (Intrinsics.areEqual((Object) model, (Object) lowerCase2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final DisplayMetrics getRearDisplayMetrics$window_release(String str, String str2) {
        Object obj;
        Intrinsics.checkNotNullParameter(str, "manufacturer");
        Intrinsics.checkNotNullParameter(str2, "model");
        Iterator it = deviceList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            DeviceMetrics deviceMetrics = (DeviceMetrics) obj;
            String manufacturer = deviceMetrics.getManufacturer();
            Locale locale = Locale.US;
            Intrinsics.checkNotNullExpressionValue(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (Intrinsics.areEqual((Object) manufacturer, (Object) lowerCase)) {
                String model = deviceMetrics.getModel();
                Locale locale2 = Locale.US;
                Intrinsics.checkNotNullExpressionValue(locale2, "US");
                String lowerCase2 = str2.toLowerCase(locale2);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                if (Intrinsics.areEqual((Object) model, (Object) lowerCase2)) {
                    break;
                }
            }
        }
        DeviceMetrics deviceMetrics2 = (DeviceMetrics) obj;
        if (deviceMetrics2 != null) {
            return deviceMetrics2.getRearDisplayMetrics();
        }
        return null;
    }
}
