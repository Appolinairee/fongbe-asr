package io.flutter.plugins.sharedpreferences;

import android.content.Context;
import android.util.Log;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.datastore.preferences.core.PreferencesKt;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0005¢\u0006\u0002\u0010\u0006J \u0010\u000b\u001a\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J!\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH@ø\u0001\u0000¢\u0006\u0002\u0010\u0015J,\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00180\u00172\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001f\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016¢\u0006\u0002\u0010\u001bJ\u001f\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016¢\u0006\u0002\u0010\u001eJ\u001f\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016¢\u0006\u0002\u0010!J&\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J \u0010#\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J-\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00180\u00172\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH@ø\u0001\u0000¢\u0006\u0002\u0010%J\u001a\u0010&\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001a\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001f\u0010)\u001a\u0004\u0018\u00010\u00182\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030*H@ø\u0001\u0000¢\u0006\u0002\u0010+J\u0010\u0010,\u001a\u00020\f2\u0006\u0010-\u001a\u00020.H\u0016J\u0010\u0010/\u001a\u00020\f2\u0006\u0010-\u001a\u00020.H\u0016J\u001d\u00100\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030*\u0018\u000101H@ø\u0001\u0000¢\u0006\u0002\u00102J \u00103\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J&\u00104\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0017J \u00105\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J \u00106\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J \u00107\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020 2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J \u00108\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u00109\u001a\u00020\f2\u0006\u0010:\u001a\u00020;2\u0006\u0010\t\u001a\u00020\nH\u0002R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006<"}, d2 = {"Lio/flutter/plugins/sharedpreferences/SharedPreferencesPlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/plugins/sharedpreferences/SharedPreferencesAsyncApi;", "listEncoder", "Lio/flutter/plugins/sharedpreferences/SharedPreferencesListEncoder;", "(Lio/flutter/plugins/sharedpreferences/SharedPreferencesListEncoder;)V", "()V", "backend", "Lio/flutter/plugins/sharedpreferences/SharedPreferencesBackend;", "context", "Landroid/content/Context;", "clear", "", "allowList", "", "", "options", "Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;", "dataStoreSetString", "key", "value", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAll", "", "", "getBool", "", "(Ljava/lang/String;Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;)Ljava/lang/Boolean;", "getDouble", "", "(Ljava/lang/String;Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;)Ljava/lang/Double;", "getInt", "", "(Ljava/lang/String;Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;)Ljava/lang/Long;", "getKeys", "getPlatformEncodedStringList", "getPrefs", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getString", "getStringList", "Lio/flutter/plugins/sharedpreferences/StringListResult;", "getValueByKey", "Landroidx/datastore/preferences/core/Preferences$Key;", "(Landroidx/datastore/preferences/core/Preferences$Key;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onAttachedToEngine", "binding", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "onDetachedFromEngine", "readAllKeys", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setBool", "setDeprecatedStringList", "setDouble", "setEncodedStringList", "setInt", "setString", "setUp", "messenger", "Lio/flutter/plugin/common/BinaryMessenger;", "shared_preferences_android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: SharedPreferencesPlugin.kt */
public final class SharedPreferencesPlugin implements FlutterPlugin, SharedPreferencesAsyncApi {
    private SharedPreferencesBackend backend;
    /* access modifiers changed from: private */
    public Context context;
    /* access modifiers changed from: private */
    public SharedPreferencesListEncoder listEncoder;

    public SharedPreferencesPlugin() {
        this.listEncoder = new ListEncoder();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SharedPreferencesPlugin(SharedPreferencesListEncoder sharedPreferencesListEncoder) {
        this();
        Intrinsics.checkNotNullParameter(sharedPreferencesListEncoder, "listEncoder");
        this.listEncoder = sharedPreferencesListEncoder;
    }

    private final void setUp(BinaryMessenger binaryMessenger, Context context2) {
        this.context = context2;
        try {
            SharedPreferencesAsyncApi.Companion.setUp(binaryMessenger, this, "data_store");
            this.backend = new SharedPreferencesBackend(binaryMessenger, context2, this.listEncoder);
        } catch (Exception e) {
            Log.e(SharedPreferencesPluginKt.TAG, "Received exception while setting up SharedPreferencesPlugin", e);
        }
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        Intrinsics.checkNotNullParameter(flutterPluginBinding, "binding");
        BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        Intrinsics.checkNotNullExpressionValue(binaryMessenger, "binding.binaryMessenger");
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "binding.applicationContext");
        setUp(binaryMessenger, applicationContext);
        new LegacySharedPreferencesPlugin().onAttachedToEngine(flutterPluginBinding);
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        Intrinsics.checkNotNullParameter(flutterPluginBinding, "binding");
        SharedPreferencesAsyncApi.Companion companion = SharedPreferencesAsyncApi.Companion;
        BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        Intrinsics.checkNotNullExpressionValue(binaryMessenger, "binding.binaryMessenger");
        companion.setUp(binaryMessenger, (SharedPreferencesAsyncApi) null, "data_store");
        SharedPreferencesBackend sharedPreferencesBackend = this.backend;
        if (sharedPreferencesBackend != null) {
            sharedPreferencesBackend.tearDown();
        }
        this.backend = null;
    }

    public void setBool(String str, boolean z, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(sharedPreferencesPigeonOptions, "options");
        Object unused = BuildersKt__BuildersKt.runBlocking$default((CoroutineContext) null, new SharedPreferencesPlugin$setBool$1(str, this, z, (Continuation<? super SharedPreferencesPlugin$setBool$1>) null), 1, (Object) null);
    }

    public void setString(String str, String str2, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        Intrinsics.checkNotNullParameter(sharedPreferencesPigeonOptions, "options");
        Object unused = BuildersKt__BuildersKt.runBlocking$default((CoroutineContext) null, new SharedPreferencesPlugin$setString$1(this, str, str2, (Continuation<? super SharedPreferencesPlugin$setString$1>) null), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    public final Object dataStoreSetString(String str, String str2, Continuation<? super Unit> continuation) {
        Preferences.Key<String> stringKey = PreferencesKeys.stringKey(str);
        Context context2 = this.context;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context2 = null;
        }
        Object edit = PreferencesKt.edit(SharedPreferencesPluginKt.getSharedPreferencesDataStore(context2), new SharedPreferencesPlugin$dataStoreSetString$2(stringKey, str2, (Continuation<? super SharedPreferencesPlugin$dataStoreSetString$2>) null), continuation);
        return edit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? edit : Unit.INSTANCE;
    }

    public void setInt(String str, long j, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(sharedPreferencesPigeonOptions, "options");
        Object unused = BuildersKt__BuildersKt.runBlocking$default((CoroutineContext) null, new SharedPreferencesPlugin$setInt$1(str, this, j, (Continuation<? super SharedPreferencesPlugin$setInt$1>) null), 1, (Object) null);
    }

    public void setDouble(String str, double d, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(sharedPreferencesPigeonOptions, "options");
        Object unused = BuildersKt__BuildersKt.runBlocking$default((CoroutineContext) null, new SharedPreferencesPlugin$setDouble$1(str, this, d, (Continuation<? super SharedPreferencesPlugin$setDouble$1>) null), 1, (Object) null);
    }

    public void setEncodedStringList(String str, String str2, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        Intrinsics.checkNotNullParameter(sharedPreferencesPigeonOptions, "options");
        Object unused = BuildersKt__BuildersKt.runBlocking$default((CoroutineContext) null, new SharedPreferencesPlugin$setEncodedStringList$1(this, str, str2, (Continuation<? super SharedPreferencesPlugin$setEncodedStringList$1>) null), 1, (Object) null);
    }

    @Deprecated(message = "This is just for testing, use `setEncodedStringList`")
    public void setDeprecatedStringList(String str, List<String> list, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(list, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        Intrinsics.checkNotNullParameter(sharedPreferencesPigeonOptions, "options");
        String encode = this.listEncoder.encode(list);
        Object unused = BuildersKt__BuildersKt.runBlocking$default((CoroutineContext) null, new SharedPreferencesPlugin$setDeprecatedStringList$1(this, str, SharedPreferencesPluginKt.LIST_PREFIX + encode, (Continuation<? super SharedPreferencesPlugin$setDeprecatedStringList$1>) null), 1, (Object) null);
    }

    public void clear(List<String> list, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions) {
        Intrinsics.checkNotNullParameter(sharedPreferencesPigeonOptions, "options");
        Object unused = BuildersKt__BuildersKt.runBlocking$default((CoroutineContext) null, new SharedPreferencesPlugin$clear$1(this, list, (Continuation<? super SharedPreferencesPlugin$clear$1>) null), 1, (Object) null);
    }

    public Map<String, Object> getAll(List<String> list, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions) {
        Intrinsics.checkNotNullParameter(sharedPreferencesPigeonOptions, "options");
        return (Map) BuildersKt__BuildersKt.runBlocking$default((CoroutineContext) null, new SharedPreferencesPlugin$getAll$1(this, list, (Continuation<? super SharedPreferencesPlugin$getAll$1>) null), 1, (Object) null);
    }

    public Long getInt(String str, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(sharedPreferencesPigeonOptions, "options");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Object unused = BuildersKt__BuildersKt.runBlocking$default((CoroutineContext) null, new SharedPreferencesPlugin$getInt$1(str, this, objectRef, (Continuation<? super SharedPreferencesPlugin$getInt$1>) null), 1, (Object) null);
        return (Long) objectRef.element;
    }

    public Boolean getBool(String str, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(sharedPreferencesPigeonOptions, "options");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Object unused = BuildersKt__BuildersKt.runBlocking$default((CoroutineContext) null, new SharedPreferencesPlugin$getBool$1(str, this, objectRef, (Continuation<? super SharedPreferencesPlugin$getBool$1>) null), 1, (Object) null);
        return (Boolean) objectRef.element;
    }

    public Double getDouble(String str, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(sharedPreferencesPigeonOptions, "options");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Object unused = BuildersKt__BuildersKt.runBlocking$default((CoroutineContext) null, new SharedPreferencesPlugin$getDouble$1(str, this, objectRef, (Continuation<? super SharedPreferencesPlugin$getDouble$1>) null), 1, (Object) null);
        return (Double) objectRef.element;
    }

    public String getString(String str, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(sharedPreferencesPigeonOptions, "options");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Object unused = BuildersKt__BuildersKt.runBlocking$default((CoroutineContext) null, new SharedPreferencesPlugin$getString$1(str, this, objectRef, (Continuation<? super SharedPreferencesPlugin$getString$1>) null), 1, (Object) null);
        return (String) objectRef.element;
    }

    public StringListResult getStringList(String str, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions) {
        StringListResult stringListResult;
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(sharedPreferencesPigeonOptions, "options");
        String string = getString(str, sharedPreferencesPigeonOptions);
        if (string == null) {
            return null;
        }
        if (StringsKt.startsWith$default(string, SharedPreferencesPluginKt.JSON_LIST_PREFIX, false, 2, (Object) null)) {
            return new StringListResult(string, StringListLookupResultType.JSON_ENCODED);
        }
        if (StringsKt.startsWith$default(string, SharedPreferencesPluginKt.LIST_PREFIX, false, 2, (Object) null)) {
            stringListResult = new StringListResult((String) null, StringListLookupResultType.PLATFORM_ENCODED);
        } else {
            stringListResult = new StringListResult((String) null, StringListLookupResultType.UNEXPECTED_STRING);
        }
        return stringListResult;
    }

    public List<String> getPlatformEncodedStringList(String str, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions) {
        List list;
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(sharedPreferencesPigeonOptions, "options");
        String string = getString(str, sharedPreferencesPigeonOptions);
        if (string == null || StringsKt.startsWith$default(string, SharedPreferencesPluginKt.JSON_LIST_PREFIX, false, 2, (Object) null) || !StringsKt.startsWith$default(string, SharedPreferencesPluginKt.LIST_PREFIX, false, 2, (Object) null) || (list = (List) SharedPreferencesPluginKt.transformPref(string, this.listEncoder)) == null) {
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
        return CollectionsKt.toList(((Map) BuildersKt__BuildersKt.runBlocking$default((CoroutineContext) null, new SharedPreferencesPlugin$getKeys$prefs$1(this, list, (Continuation<? super SharedPreferencesPlugin$getKeys$prefs$1>) null), 1, (Object) null)).keySet());
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object getPrefs(java.util.List<java.lang.String> r9, kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, ? extends java.lang.Object>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getPrefs$1
            if (r0 == 0) goto L_0x0014
            r0 = r10
            io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getPrefs$1 r0 = (io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getPrefs$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r10 = r0.label
            int r10 = r10 - r2
            r0.label = r10
            goto L_0x0019
        L_0x0014:
            io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getPrefs$1 r0 = new io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getPrefs$1
            r0.<init>(r8, r10)
        L_0x0019:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x005a
            if (r2 == r4) goto L_0x004a
            if (r2 != r3) goto L_0x0042
            java.lang.Object r9 = r0.L$4
            androidx.datastore.preferences.core.Preferences$Key r9 = (androidx.datastore.preferences.core.Preferences.Key) r9
            java.lang.Object r2 = r0.L$3
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r4 = r0.L$2
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r5 = r0.L$1
            java.util.Set r5 = (java.util.Set) r5
            java.lang.Object r6 = r0.L$0
            io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin r6 = (io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin) r6
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x00ac
        L_0x0042:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x004a:
            java.lang.Object r9 = r0.L$2
            java.util.Map r9 = (java.util.Map) r9
            java.lang.Object r2 = r0.L$1
            java.util.Set r2 = (java.util.Set) r2
            java.lang.Object r4 = r0.L$0
            io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin r4 = (io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin) r4
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x007f
        L_0x005a:
            kotlin.ResultKt.throwOnFailure(r10)
            if (r9 == 0) goto L_0x0066
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Set r9 = kotlin.collections.CollectionsKt.toSet(r9)
            goto L_0x0067
        L_0x0066:
            r9 = 0
        L_0x0067:
            r2 = r9
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            java.util.Map r9 = (java.util.Map) r9
            r0.L$0 = r8
            r0.L$1 = r2
            r0.L$2 = r9
            r0.label = r4
            java.lang.Object r10 = r8.readAllKeys(r0)
            if (r10 != r1) goto L_0x007e
            return r1
        L_0x007e:
            r4 = r8
        L_0x007f:
            java.util.Set r10 = (java.util.Set) r10
            if (r10 == 0) goto L_0x00c7
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
            r5 = r2
            r6 = r4
            r4 = r9
            r2 = r10
        L_0x008d:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L_0x00c6
            java.lang.Object r9 = r2.next()
            androidx.datastore.preferences.core.Preferences$Key r9 = (androidx.datastore.preferences.core.Preferences.Key) r9
            r0.L$0 = r6
            r0.L$1 = r5
            r0.L$2 = r4
            r0.L$3 = r2
            r0.L$4 = r9
            r0.label = r3
            java.lang.Object r10 = r6.getValueByKey(r9, r0)
            if (r10 != r1) goto L_0x00ac
            return r1
        L_0x00ac:
            java.lang.String r7 = r9.toString()
            boolean r7 = io.flutter.plugins.sharedpreferences.SharedPreferencesPluginKt.preferencesFilter(r7, r10, r5)
            if (r7 == 0) goto L_0x008d
            io.flutter.plugins.sharedpreferences.SharedPreferencesListEncoder r7 = r6.listEncoder
            java.lang.Object r10 = io.flutter.plugins.sharedpreferences.SharedPreferencesPluginKt.transformPref(r10, r7)
            if (r10 == 0) goto L_0x008d
            java.lang.String r9 = r9.toString()
            r4.put(r9, r10)
            goto L_0x008d
        L_0x00c6:
            r9 = r4
        L_0x00c7:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin.getPrefs(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final Object readAllKeys(Continuation<? super Set<? extends Preferences.Key<?>>> continuation) {
        Context context2 = this.context;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context2 = null;
        }
        return FlowKt.firstOrNull(new SharedPreferencesPlugin$readAllKeys$$inlined$map$1(SharedPreferencesPluginKt.getSharedPreferencesDataStore(context2).getData()), continuation);
    }

    /* access modifiers changed from: private */
    public final Object getValueByKey(Preferences.Key<?> key, Continuation<Object> continuation) {
        Context context2 = this.context;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context2 = null;
        }
        return FlowKt.firstOrNull(new SharedPreferencesPlugin$getValueByKey$$inlined$map$1(SharedPreferencesPluginKt.getSharedPreferencesDataStore(context2).getData(), key), continuation);
    }
}
