package io.flutter.plugins.webviewflutter;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lio/flutter/plugins/webviewflutter/SslErrorType;", "", "raw", "", "(Ljava/lang/String;II)V", "getRaw", "()I", "DATE_INVALID", "EXPIRED", "ID_MISMATCH", "INVALID", "NOT_YET_VALID", "UNTRUSTED", "UNKNOWN", "Companion", "webview_flutter_android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: AndroidWebkitLibrary.g.kt */
public enum SslErrorType {
    DATE_INVALID(0),
    EXPIRED(1),
    ID_MISMATCH(2),
    INVALID(3),
    NOT_YET_VALID(4),
    UNTRUSTED(5),
    UNKNOWN(6);
    
    public static final Companion Companion = null;
    private final int raw;

    private SslErrorType(int i) {
        this.raw = i;
    }

    public final int getRaw() {
        return this.raw;
    }

    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lio/flutter/plugins/webviewflutter/SslErrorType$Companion;", "", "()V", "ofRaw", "Lio/flutter/plugins/webviewflutter/SslErrorType;", "raw", "", "webview_flutter_android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: AndroidWebkitLibrary.g.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SslErrorType ofRaw(int i) {
            for (SslErrorType sslErrorType : SslErrorType.values()) {
                if (sslErrorType.getRaw() == i) {
                    return sslErrorType;
                }
            }
            return null;
        }
    }
}
