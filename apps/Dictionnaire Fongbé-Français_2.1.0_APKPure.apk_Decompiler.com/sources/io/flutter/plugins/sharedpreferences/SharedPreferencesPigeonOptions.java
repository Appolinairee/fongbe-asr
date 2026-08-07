package io.flutter.plugins.sharedpreferences;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0019\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;", "", "fileName", "", "useDataStore", "", "(Ljava/lang/String;Z)V", "getFileName", "()Ljava/lang/String;", "getUseDataStore", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toList", "", "toString", "Companion", "shared_preferences_android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: MessagesAsync.g.kt */
public final class SharedPreferencesPigeonOptions {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final String fileName;
    private final boolean useDataStore;

    public static /* synthetic */ SharedPreferencesPigeonOptions copy$default(SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sharedPreferencesPigeonOptions.fileName;
        }
        if ((i & 2) != 0) {
            z = sharedPreferencesPigeonOptions.useDataStore;
        }
        return sharedPreferencesPigeonOptions.copy(str, z);
    }

    public final String component1() {
        return this.fileName;
    }

    public final boolean component2() {
        return this.useDataStore;
    }

    public final SharedPreferencesPigeonOptions copy(String str, boolean z) {
        return new SharedPreferencesPigeonOptions(str, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharedPreferencesPigeonOptions)) {
            return false;
        }
        SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions = (SharedPreferencesPigeonOptions) obj;
        return Intrinsics.areEqual((Object) this.fileName, (Object) sharedPreferencesPigeonOptions.fileName) && this.useDataStore == sharedPreferencesPigeonOptions.useDataStore;
    }

    public int hashCode() {
        String str = this.fileName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z = this.useDataStore;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        String str = this.fileName;
        boolean z = this.useDataStore;
        return "SharedPreferencesPigeonOptions(fileName=" + str + ", useDataStore=" + z + ")";
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions$Companion;", "", "()V", "fromList", "Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;", "pigeonVar_list", "", "shared_preferences_android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: MessagesAsync.g.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SharedPreferencesPigeonOptions fromList(List<? extends Object> list) {
            Intrinsics.checkNotNullParameter(list, "pigeonVar_list");
            Object obj = list.get(1);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
            return new SharedPreferencesPigeonOptions((String) list.get(0), ((Boolean) obj).booleanValue());
        }
    }

    public SharedPreferencesPigeonOptions(String str, boolean z) {
        this.fileName = str;
        this.useDataStore = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SharedPreferencesPigeonOptions(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, z);
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final boolean getUseDataStore() {
        return this.useDataStore;
    }

    public final List<Object> toList() {
        return CollectionsKt.listOf(this.fileName, Boolean.valueOf(this.useDataStore));
    }
}
