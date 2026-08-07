package io.flutter.plugins.sharedpreferences;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014¨\u0006\t"}, d2 = {"Lio/flutter/plugins/sharedpreferences/StringListObjectInputStream;", "Ljava/io/ObjectInputStream;", "input", "Ljava/io/InputStream;", "(Ljava/io/InputStream;)V", "resolveClass", "Ljava/lang/Class;", "desc", "Ljava/io/ObjectStreamClass;", "shared_preferences_android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: StringListObjectInputStream.kt */
public final class StringListObjectInputStream extends ObjectInputStream {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StringListObjectInputStream(InputStream inputStream) {
        super(inputStream);
        Intrinsics.checkNotNullParameter(inputStream, "input");
    }

    /* access modifiers changed from: protected */
    public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws ClassNotFoundException, IOException {
        Set of = SetsKt.setOf("java.util.Arrays$ArrayList", "java.util.ArrayList", "java.lang.String", "[Ljava.lang.String;");
        String name = objectStreamClass != null ? objectStreamClass.getName() : null;
        if (name == null || of.contains(name)) {
            return super.resolveClass(objectStreamClass);
        }
        throw new ClassNotFoundException(objectStreamClass.getName());
    }
}
