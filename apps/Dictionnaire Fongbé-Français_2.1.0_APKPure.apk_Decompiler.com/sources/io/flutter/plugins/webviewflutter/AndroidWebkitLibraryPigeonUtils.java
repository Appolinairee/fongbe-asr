package io.flutter.plugins.webviewflutter;

import android.util.Log;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b2\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001¨\u0006\r"}, d2 = {"Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonUtils;", "", "()V", "createConnectionError", "Lio/flutter/plugins/webviewflutter/AndroidWebKitError;", "channelName", "", "wrapError", "", "exception", "", "wrapResult", "result", "webview_flutter_android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: AndroidWebkitLibrary.g.kt */
final class AndroidWebkitLibraryPigeonUtils {
    public static final AndroidWebkitLibraryPigeonUtils INSTANCE = new AndroidWebkitLibraryPigeonUtils();

    private AndroidWebkitLibraryPigeonUtils() {
    }

    public final AndroidWebKitError createConnectionError(String str) {
        Intrinsics.checkNotNullParameter(str, "channelName");
        return new AndroidWebKitError("channel-error", "Unable to establish connection on channel: '" + str + "'.", "");
    }

    public final List<Object> wrapResult(Object obj) {
        return CollectionsKt.listOf(obj);
    }

    public final List<Object> wrapError(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "exception");
        if (th instanceof AndroidWebKitError) {
            AndroidWebKitError androidWebKitError = (AndroidWebKitError) th;
            return CollectionsKt.listOf(androidWebKitError.getCode(), th.getMessage(), androidWebKitError.getDetails());
        }
        String simpleName = th.getClass().getSimpleName();
        String th2 = th.toString();
        Throwable cause = th.getCause();
        String stackTraceString = Log.getStackTraceString(th);
        return CollectionsKt.listOf(simpleName, th2, "Cause: " + cause + ", Stacktrace: " + stackTraceString);
    }
}
