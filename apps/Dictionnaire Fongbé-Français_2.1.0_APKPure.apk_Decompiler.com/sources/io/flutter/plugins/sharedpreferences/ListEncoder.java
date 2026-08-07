package io.flutter.plugins.sharedpreferences;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0016\u0010\u0007\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¨\u0006\t"}, d2 = {"Lio/flutter/plugins/sharedpreferences/ListEncoder;", "Lio/flutter/plugins/sharedpreferences/SharedPreferencesListEncoder;", "()V", "decode", "", "", "listString", "encode", "list", "shared_preferences_android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: SharedPreferencesPlugin.kt */
public final class ListEncoder implements SharedPreferencesListEncoder {
    public String encode(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(list);
        objectOutputStream.flush();
        String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(byteStream.toByteArray(), 0)");
        return encodeToString;
    }

    public List<String> decode(String str) {
        Intrinsics.checkNotNullParameter(str, "listString");
        Object readObject = new StringListObjectInputStream(new ByteArrayInputStream(Base64.decode(str, 0))).readObject();
        Intrinsics.checkNotNull(readObject, "null cannot be cast to non-null type kotlin.collections.List<*>");
        Collection arrayList = new ArrayList();
        for (Object next : (List) readObject) {
            if (next instanceof String) {
                arrayList.add(next);
            }
        }
        return (List) arrayList;
    }
}
