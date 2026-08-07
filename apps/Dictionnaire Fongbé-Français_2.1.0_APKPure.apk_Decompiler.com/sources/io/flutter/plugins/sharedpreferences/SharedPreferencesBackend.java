package io.flutter.plugins.sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.preference.PreferenceManager;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.flutter.plugin.common.BinaryMessenger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ \u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J,\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00140\u00132\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001f\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¢\u0006\u0002\u0010\u0018J\u001f\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¢\u0006\u0002\u0010\u001bJ\u001f\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¢\u0006\u0002\u0010\u001eJ&\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J \u0010 \u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001a\u0010!\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001a\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J \u0010$\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J&\u0010&\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\r2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0017J \u0010'\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J \u0010(\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010%\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J \u0010)\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J \u0010*\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010%\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0006\u0010+\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lio/flutter/plugins/sharedpreferences/SharedPreferencesBackend;", "Lio/flutter/plugins/sharedpreferences/SharedPreferencesAsyncApi;", "messenger", "Lio/flutter/plugin/common/BinaryMessenger;", "context", "Landroid/content/Context;", "listEncoder", "Lio/flutter/plugins/sharedpreferences/SharedPreferencesListEncoder;", "(Lio/flutter/plugin/common/BinaryMessenger;Landroid/content/Context;Lio/flutter/plugins/sharedpreferences/SharedPreferencesListEncoder;)V", "clear", "", "allowList", "", "", "options", "Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;", "createSharedPreferences", "Landroid/content/SharedPreferences;", "getAll", "", "", "getBool", "", "key", "(Ljava/lang/String;Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;)Ljava/lang/Boolean;", "getDouble", "", "(Ljava/lang/String;Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;)Ljava/lang/Double;", "getInt", "", "(Ljava/lang/String;Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;)Ljava/lang/Long;", "getKeys", "getPlatformEncodedStringList", "getString", "getStringList", "Lio/flutter/plugins/sharedpreferences/StringListResult;", "setBool", "value", "setDeprecatedStringList", "setDouble", "setEncodedStringList", "setInt", "setString", "tearDown", "shared_preferences_android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: SharedPreferencesPlugin.kt */
public final class SharedPreferencesBackend implements SharedPreferencesAsyncApi {
    private Context context;
    private SharedPreferencesListEncoder listEncoder;
    private BinaryMessenger messenger;

    public SharedPreferencesBackend(BinaryMessenger binaryMessenger, Context context2, SharedPreferencesListEncoder sharedPreferencesListEncoder) {
        Intrinsics.checkNotNullParameter(binaryMessenger, "messenger");
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(sharedPreferencesListEncoder, "listEncoder");
        this.messenger = binaryMessenger;
        this.context = context2;
        this.listEncoder = sharedPreferencesListEncoder;
        try {
            SharedPreferencesAsyncApi.Companion.setUp(this.messenger, this, "shared_preferences");
        } catch (Exception e) {
            Log.e(SharedPreferencesPluginKt.TAG, "Received exception while setting up SharedPreferencesBackend", e);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SharedPreferencesBackend(BinaryMessenger binaryMessenger, Context context2, SharedPreferencesListEncoder sharedPreferencesListEncoder, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(binaryMessenger, context2, (i & 4) != 0 ? new ListEncoder() : sharedPreferencesListEncoder);
    }

    public final void tearDown() {
        SharedPreferencesAsyncApi.Companion.setUp(this.messenger, (SharedPreferencesAsyncApi) null, "shared_preferences");
    }

    private final SharedPreferences createSharedPreferences(SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions) {
        if (sharedPreferencesPigeonOptions.getFileName() == null) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.context);
            Intrinsics.checkNotNullExpressionValue(defaultSharedPreferences, "{\n      PreferenceManage…references(context)\n    }");
            return defaultSharedPreferences;
        }
        SharedPreferences sharedPreferences = this.context.getSharedPreferences(sharedPreferencesPigeonOptions.getFileName(), 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "{\n      context.getShare…ntext.MODE_PRIVATE)\n    }");
        return sharedPreferences;
    }

    public void setBool(String str, boolean z, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(sharedPreferencesPigeonOptions, "options");
        createSharedPreferences(sharedPreferencesPigeonOptions).edit().putBoolean(str, z).apply();
    }

    public void setString(String str, String str2, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        Intrinsics.checkNotNullParameter(sharedPreferencesPigeonOptions, "options");
        createSharedPreferences(sharedPreferencesPigeonOptions).edit().putString(str, str2).apply();
    }

    public void setInt(String str, long j, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(sharedPreferencesPigeonOptions, "options");
        createSharedPreferences(sharedPreferencesPigeonOptions).edit().putLong(str, j).apply();
    }

    public void setDouble(String str, double d, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(sharedPreferencesPigeonOptions, "options");
        SharedPreferences.Editor edit = createSharedPreferences(sharedPreferencesPigeonOptions).edit();
        edit.putString(str, SharedPreferencesPluginKt.DOUBLE_PREFIX + d).apply();
    }

    public void setEncodedStringList(String str, String str2, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        Intrinsics.checkNotNullParameter(sharedPreferencesPigeonOptions, "options");
        createSharedPreferences(sharedPreferencesPigeonOptions).edit().putString(str, str2).apply();
    }

    @Deprecated(message = "This is just for testing, use `setEncodedStringList`")
    public void setDeprecatedStringList(String str, List<String> list, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(list, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        Intrinsics.checkNotNullParameter(sharedPreferencesPigeonOptions, "options");
        String encode = this.listEncoder.encode(list);
        createSharedPreferences(sharedPreferencesPigeonOptions).edit().putString(str, SharedPreferencesPluginKt.LIST_PREFIX + encode).apply();
    }

    public void clear(List<String> list, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions) {
        Intrinsics.checkNotNullParameter(sharedPreferencesPigeonOptions, "options");
        SharedPreferences createSharedPreferences = createSharedPreferences(sharedPreferencesPigeonOptions);
        SharedPreferences.Editor edit = createSharedPreferences.edit();
        Intrinsics.checkNotNullExpressionValue(edit, "preferences.edit()");
        Map<String, ?> all = createSharedPreferences.getAll();
        Intrinsics.checkNotNullExpressionValue(all, "preferences.all");
        ArrayList arrayList = new ArrayList();
        for (String next : all.keySet()) {
            if (SharedPreferencesPluginKt.preferencesFilter(next, all.get(next), list != null ? CollectionsKt.toSet(list) : null)) {
                arrayList.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            edit.remove((String) it.next());
        }
        edit.apply();
    }

    public Map<String, Object> getAll(List<String> list, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions) {
        Object value;
        Intrinsics.checkNotNullParameter(sharedPreferencesPigeonOptions, "options");
        Map<String, ?> all = createSharedPreferences(sharedPreferencesPigeonOptions).getAll();
        Intrinsics.checkNotNullExpressionValue(all, "preferences.all");
        HashMap hashMap = new HashMap();
        for (Map.Entry next : all.entrySet()) {
            if (SharedPreferencesPluginKt.preferencesFilter((String) next.getKey(), next.getValue(), list != null ? CollectionsKt.toSet(list) : null) && (value = next.getValue()) != null) {
                Object key = next.getKey();
                Object transformPref = SharedPreferencesPluginKt.transformPref(value, this.listEncoder);
                Intrinsics.checkNotNull(transformPref, "null cannot be cast to non-null type kotlin.Any");
                hashMap.put(key, transformPref);
            }
        }
        return hashMap;
    }

    public Long getInt(String str, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions) {
        long j;
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(sharedPreferencesPigeonOptions, "options");
        SharedPreferences createSharedPreferences = createSharedPreferences(sharedPreferencesPigeonOptions);
        if (!createSharedPreferences.contains(str)) {
            return null;
        }
        try {
            j = createSharedPreferences.getLong(str, 0);
        } catch (ClassCastException unused) {
            j = (long) createSharedPreferences.getInt(str, 0);
        }
        return Long.valueOf(j);
    }

    public Boolean getBool(String str, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(sharedPreferencesPigeonOptions, "options");
        SharedPreferences createSharedPreferences = createSharedPreferences(sharedPreferencesPigeonOptions);
        if (createSharedPreferences.contains(str)) {
            return Boolean.valueOf(createSharedPreferences.getBoolean(str, true));
        }
        return null;
    }

    public Double getDouble(String str, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(sharedPreferencesPigeonOptions, "options");
        SharedPreferences createSharedPreferences = createSharedPreferences(sharedPreferencesPigeonOptions);
        if (!createSharedPreferences.contains(str)) {
            return null;
        }
        Object transformPref = SharedPreferencesPluginKt.transformPref(createSharedPreferences.getString(str, ""), this.listEncoder);
        Intrinsics.checkNotNull(transformPref, "null cannot be cast to non-null type kotlin.Double");
        return (Double) transformPref;
    }

    public String getString(String str, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(sharedPreferencesPigeonOptions, "options");
        SharedPreferences createSharedPreferences = createSharedPreferences(sharedPreferencesPigeonOptions);
        if (createSharedPreferences.contains(str)) {
            return createSharedPreferences.getString(str, "");
        }
        return null;
    }

    public StringListResult getStringList(String str, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(sharedPreferencesPigeonOptions, "options");
        SharedPreferences createSharedPreferences = createSharedPreferences(sharedPreferencesPigeonOptions);
        if (!createSharedPreferences.contains(str)) {
            return null;
        }
        String string = createSharedPreferences.getString(str, "");
        Intrinsics.checkNotNull(string);
        if (StringsKt.startsWith$default(string, SharedPreferencesPluginKt.JSON_LIST_PREFIX, false, 2, (Object) null)) {
            return new StringListResult(string, StringListLookupResultType.JSON_ENCODED);
        }
        if (StringsKt.startsWith$default(string, SharedPreferencesPluginKt.LIST_PREFIX, false, 2, (Object) null)) {
            return new StringListResult((String) null, StringListLookupResultType.PLATFORM_ENCODED);
        }
        return new StringListResult((String) null, StringListLookupResultType.UNEXPECTED_STRING);
    }

    public List<String> getPlatformEncodedStringList(String str, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions) {
        List list;
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(sharedPreferencesPigeonOptions, "options");
        SharedPreferences createSharedPreferences = createSharedPreferences(sharedPreferencesPigeonOptions);
        if (!createSharedPreferences.contains(str)) {
            return null;
        }
        String string = createSharedPreferences.getString(str, "");
        Intrinsics.checkNotNull(string);
        if (!StringsKt.startsWith$default(string, SharedPreferencesPluginKt.LIST_PREFIX, false, 2, (Object) null) || StringsKt.startsWith$default(string, SharedPreferencesPluginKt.JSON_LIST_PREFIX, false, 2, (Object) null) || (list = (List) SharedPreferencesPluginKt.transformPref(createSharedPreferences.getString(str, ""), this.listEncoder)) == null) {
            return null;
        }
        Collection arrayList = new ArrayList();
        for (Object next : list) {
            if (next instanceof String) {
                arrayList.add(next);
            }
        }
        return (List) arrayList;
    }

    public List<String> getKeys(List<String> list, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions) {
        Intrinsics.checkNotNullParameter(sharedPreferencesPigeonOptions, "options");
        Map<String, ?> all = createSharedPreferences(sharedPreferencesPigeonOptions).getAll();
        Intrinsics.checkNotNullExpressionValue(all, "preferences.all");
        Map linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : all.entrySet()) {
            Object key = next.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "it.key");
            if (SharedPreferencesPluginKt.preferencesFilter((String) key, next.getValue(), list != null ? CollectionsKt.toSet(list) : null)) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        return CollectionsKt.toList(linkedHashMap.keySet());
    }
}
