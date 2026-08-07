package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014J\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0014¨\u0006\u000e"}, d2 = {"Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonCodec;", "Lio/flutter/plugin/common/StandardMessageCodec;", "()V", "readValueOfType", "", "type", "", "buffer", "Ljava/nio/ByteBuffer;", "writeValue", "", "stream", "Ljava/io/ByteArrayOutputStream;", "value", "webview_flutter_android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: AndroidWebkitLibrary.g.kt */
class AndroidWebkitLibraryPigeonCodec extends StandardMessageCodec {
    /* access modifiers changed from: protected */
    public Object readValueOfType(byte b, ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "buffer");
        if (b == -127) {
            Long l = (Long) readValue(byteBuffer);
            if (l == null) {
                return null;
            }
            return FileChooserMode.Companion.ofRaw((int) l.longValue());
        } else if (b == -126) {
            Long l2 = (Long) readValue(byteBuffer);
            if (l2 == null) {
                return null;
            }
            return ConsoleMessageLevel.Companion.ofRaw((int) l2.longValue());
        } else if (b == -125) {
            Long l3 = (Long) readValue(byteBuffer);
            if (l3 == null) {
                return null;
            }
            return OverScrollMode.Companion.ofRaw((int) l3.longValue());
        } else if (b == -124) {
            Long l4 = (Long) readValue(byteBuffer);
            if (l4 == null) {
                return null;
            }
            return SslErrorType.Companion.ofRaw((int) l4.longValue());
        } else if (b != -123) {
            return super.readValueOfType(b, byteBuffer);
        } else {
            Long l5 = (Long) readValue(byteBuffer);
            if (l5 == null) {
                return null;
            }
            return MixedContentMode.Companion.ofRaw((int) l5.longValue());
        }
    }

    /* access modifiers changed from: protected */
    public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        Intrinsics.checkNotNullParameter(byteArrayOutputStream, "stream");
        if (obj instanceof FileChooserMode) {
            byteArrayOutputStream.write(129);
            writeValue(byteArrayOutputStream, Integer.valueOf(((FileChooserMode) obj).getRaw()));
        } else if (obj instanceof ConsoleMessageLevel) {
            byteArrayOutputStream.write(130);
            writeValue(byteArrayOutputStream, Integer.valueOf(((ConsoleMessageLevel) obj).getRaw()));
        } else if (obj instanceof OverScrollMode) {
            byteArrayOutputStream.write(131);
            writeValue(byteArrayOutputStream, Integer.valueOf(((OverScrollMode) obj).getRaw()));
        } else if (obj instanceof SslErrorType) {
            byteArrayOutputStream.write(132);
            writeValue(byteArrayOutputStream, Integer.valueOf(((SslErrorType) obj).getRaw()));
        } else if (obj instanceof MixedContentMode) {
            byteArrayOutputStream.write(133);
            writeValue(byteArrayOutputStream, Integer.valueOf(((MixedContentMode) obj).getRaw()));
        } else {
            super.writeValue(byteArrayOutputStream, obj);
        }
    }
}
