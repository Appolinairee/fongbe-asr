package io.flutter.plugins.sharedpreferences;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0019\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0014J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lio/flutter/plugins/sharedpreferences/StringListResult;", "", "jsonEncodedValue", "", "type", "Lio/flutter/plugins/sharedpreferences/StringListLookupResultType;", "(Ljava/lang/String;Lio/flutter/plugins/sharedpreferences/StringListLookupResultType;)V", "getJsonEncodedValue", "()Ljava/lang/String;", "getType", "()Lio/flutter/plugins/sharedpreferences/StringListLookupResultType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "shared_preferences_android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: MessagesAsync.g.kt */
public final class StringListResult {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final String jsonEncodedValue;
    private final StringListLookupResultType type;

    public static /* synthetic */ StringListResult copy$default(StringListResult stringListResult, String str, StringListLookupResultType stringListLookupResultType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stringListResult.jsonEncodedValue;
        }
        if ((i & 2) != 0) {
            stringListLookupResultType = stringListResult.type;
        }
        return stringListResult.copy(str, stringListLookupResultType);
    }

    public final String component1() {
        return this.jsonEncodedValue;
    }

    public final StringListLookupResultType component2() {
        return this.type;
    }

    public final StringListResult copy(String str, StringListLookupResultType stringListLookupResultType) {
        Intrinsics.checkNotNullParameter(stringListLookupResultType, "type");
        return new StringListResult(str, stringListLookupResultType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StringListResult)) {
            return false;
        }
        StringListResult stringListResult = (StringListResult) obj;
        return Intrinsics.areEqual((Object) this.jsonEncodedValue, (Object) stringListResult.jsonEncodedValue) && this.type == stringListResult.type;
    }

    public int hashCode() {
        String str = this.jsonEncodedValue;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.type.hashCode();
    }

    public String toString() {
        String str = this.jsonEncodedValue;
        StringListLookupResultType stringListLookupResultType = this.type;
        return "StringListResult(jsonEncodedValue=" + str + ", type=" + stringListLookupResultType + ")";
    }

    public StringListResult(String str, StringListLookupResultType stringListLookupResultType) {
        Intrinsics.checkNotNullParameter(stringListLookupResultType, "type");
        this.jsonEncodedValue = str;
        this.type = stringListLookupResultType;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StringListResult(String str, StringListLookupResultType stringListLookupResultType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, stringListLookupResultType);
    }

    public final String getJsonEncodedValue() {
        return this.jsonEncodedValue;
    }

    public final StringListLookupResultType getType() {
        return this.type;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lio/flutter/plugins/sharedpreferences/StringListResult$Companion;", "", "()V", "fromList", "Lio/flutter/plugins/sharedpreferences/StringListResult;", "pigeonVar_list", "", "shared_preferences_android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: MessagesAsync.g.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final StringListResult fromList(List<? extends Object> list) {
            Intrinsics.checkNotNullParameter(list, "pigeonVar_list");
            Object obj = list.get(1);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.StringListLookupResultType");
            return new StringListResult((String) list.get(0), (StringListLookupResultType) obj);
        }
    }

    public final List<Object> toList() {
        return CollectionsKt.listOf(this.jsonEncodedValue, this.type);
    }
}
