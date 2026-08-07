package io.flutter.plugins.sharedpreferences;

import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014J\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0014¨\u0006\u000e"}, d2 = {"Lio/flutter/plugins/sharedpreferences/MessagesAsyncPigeonCodec;", "Lio/flutter/plugin/common/StandardMessageCodec;", "()V", "readValueOfType", "", "type", "", "buffer", "Ljava/nio/ByteBuffer;", "writeValue", "", "stream", "Ljava/io/ByteArrayOutputStream;", "value", "shared_preferences_android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: MessagesAsync.g.kt */
class MessagesAsyncPigeonCodec extends StandardMessageCodec {
    /* access modifiers changed from: protected */
    public Object readValueOfType(byte b, ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "buffer");
        if (b == -127) {
            Long l = (Long) readValue(byteBuffer);
            if (l == null) {
                return null;
            }
            return StringListLookupResultType.Companion.ofRaw((int) l.longValue());
        } else if (b == -126) {
            Object readValue = readValue(byteBuffer);
            List list = readValue instanceof List ? (List) readValue : null;
            if (list != null) {
                return SharedPreferencesPigeonOptions.Companion.fromList(list);
            }
            return null;
        } else if (b != -125) {
            return super.readValueOfType(b, byteBuffer);
        } else {
            Object readValue2 = readValue(byteBuffer);
            List list2 = readValue2 instanceof List ? (List) readValue2 : null;
            if (list2 != null) {
                return StringListResult.Companion.fromList(list2);
            }
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        Intrinsics.checkNotNullParameter(byteArrayOutputStream, "stream");
        if (obj instanceof StringListLookupResultType) {
            byteArrayOutputStream.write(129);
            writeValue(byteArrayOutputStream, Integer.valueOf(((StringListLookupResultType) obj).getRaw()));
        } else if (obj instanceof SharedPreferencesPigeonOptions) {
            byteArrayOutputStream.write(130);
            writeValue(byteArrayOutputStream, ((SharedPreferencesPigeonOptions) obj).toList());
        } else if (obj instanceof StringListResult) {
            byteArrayOutputStream.write(131);
            writeValue(byteArrayOutputStream, ((StringListResult) obj).toList());
        } else {
            super.writeValue(byteArrayOutputStream, obj);
        }
    }
}
