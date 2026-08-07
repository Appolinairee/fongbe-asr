package io.flutter.plugins.sharedpreferences;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u0000 !2\u00020\u0001:\u0001!J \u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\bH&J,\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\n2\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\u001f\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&¢\u0006\u0002\u0010\u000eJ\u001f\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&¢\u0006\u0002\u0010\u0011J\u001f\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&¢\u0006\u0002\u0010\u0014J&\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\bH&J \u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J \u0010\u001a\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH&J&\u0010\u001c\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00062\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH&J \u0010\u001d\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\bH&J \u0010\u001e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J \u0010\u001f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\bH&J \u0010 \u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\""}, d2 = {"Lio/flutter/plugins/sharedpreferences/SharedPreferencesAsyncApi;", "", "clear", "", "allowList", "", "", "options", "Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;", "getAll", "", "getBool", "", "key", "(Ljava/lang/String;Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;)Ljava/lang/Boolean;", "getDouble", "", "(Ljava/lang/String;Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;)Ljava/lang/Double;", "getInt", "", "(Ljava/lang/String;Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;)Ljava/lang/Long;", "getKeys", "getPlatformEncodedStringList", "getString", "getStringList", "Lio/flutter/plugins/sharedpreferences/StringListResult;", "setBool", "value", "setDeprecatedStringList", "setDouble", "setEncodedStringList", "setInt", "setString", "Companion", "shared_preferences_android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: MessagesAsync.g.kt */
public interface SharedPreferencesAsyncApi {
    public static final Companion Companion = Companion.$$INSTANCE;

    void clear(List<String> list, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    Map<String, Object> getAll(List<String> list, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    Boolean getBool(String str, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    Double getDouble(String str, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    Long getInt(String str, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    List<String> getKeys(List<String> list, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    List<String> getPlatformEncodedStringList(String str, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    String getString(String str, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    StringListResult getStringList(String str, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    void setBool(String str, boolean z, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    void setDeprecatedStringList(String str, List<String> list, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    void setDouble(String str, double d, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    void setEncodedStringList(String str, String str2, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    void setInt(String str, long j, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    void setString(String str, String str2, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007R#\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lio/flutter/plugins/sharedpreferences/SharedPreferencesAsyncApi$Companion;", "", "()V", "codec", "Lio/flutter/plugin/common/MessageCodec;", "getCodec", "()Lio/flutter/plugin/common/MessageCodec;", "codec$delegate", "Lkotlin/Lazy;", "setUp", "", "binaryMessenger", "Lio/flutter/plugin/common/BinaryMessenger;", "api", "Lio/flutter/plugins/sharedpreferences/SharedPreferencesAsyncApi;", "messageChannelSuffix", "", "shared_preferences_android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: MessagesAsync.g.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Lazy<MessagesAsyncPigeonCodec> codec$delegate = LazyKt.lazy(SharedPreferencesAsyncApi$Companion$codec$2.INSTANCE);

        public final void setUp(BinaryMessenger binaryMessenger, SharedPreferencesAsyncApi sharedPreferencesAsyncApi) {
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            setUp$default(this, binaryMessenger, sharedPreferencesAsyncApi, (String) null, 4, (Object) null);
        }

        private Companion() {
        }

        public final MessageCodec<Object> getCodec() {
            return codec$delegate.getValue();
        }

        public static /* synthetic */ void setUp$default(Companion companion, BinaryMessenger binaryMessenger, SharedPreferencesAsyncApi sharedPreferencesAsyncApi, String str, int i, Object obj) {
            if ((i & 4) != 0) {
                str = "";
            }
            companion.setUp(binaryMessenger, sharedPreferencesAsyncApi, str);
        }

        public final void setUp(BinaryMessenger binaryMessenger, SharedPreferencesAsyncApi sharedPreferencesAsyncApi, String str) {
            String str2;
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            Intrinsics.checkNotNullParameter(str, "messageChannelSuffix");
            if (str.length() > 0) {
                str2 = "." + str;
            } else {
                str2 = "";
            }
            BinaryMessenger.TaskQueue makeBackgroundTaskQueue = binaryMessenger.makeBackgroundTaskQueue();
            Companion companion = this;
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setBool" + str2, getCodec(), makeBackgroundTaskQueue);
            if (sharedPreferencesAsyncApi != null) {
                basicMessageChannel.setMessageHandler(new SharedPreferencesAsyncApi$Companion$$ExternalSyntheticLambda0(sharedPreferencesAsyncApi));
            } else {
                basicMessageChannel.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setString" + str2, getCodec(), makeBackgroundTaskQueue);
            if (sharedPreferencesAsyncApi != null) {
                basicMessageChannel2.setMessageHandler(new SharedPreferencesAsyncApi$Companion$$ExternalSyntheticLambda11(sharedPreferencesAsyncApi));
            } else {
                basicMessageChannel2.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setInt" + str2, getCodec(), makeBackgroundTaskQueue);
            if (sharedPreferencesAsyncApi != null) {
                basicMessageChannel3.setMessageHandler(new SharedPreferencesAsyncApi$Companion$$ExternalSyntheticLambda12(sharedPreferencesAsyncApi));
            } else {
                basicMessageChannel3.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDouble" + str2, getCodec(), makeBackgroundTaskQueue);
            if (sharedPreferencesAsyncApi != null) {
                basicMessageChannel4.setMessageHandler(new SharedPreferencesAsyncApi$Companion$$ExternalSyntheticLambda13(sharedPreferencesAsyncApi));
            } else {
                basicMessageChannel4.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setEncodedStringList" + str2, getCodec(), makeBackgroundTaskQueue);
            if (sharedPreferencesAsyncApi != null) {
                basicMessageChannel5.setMessageHandler(new SharedPreferencesAsyncApi$Companion$$ExternalSyntheticLambda14(sharedPreferencesAsyncApi));
            } else {
                basicMessageChannel5.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDeprecatedStringList" + str2, getCodec(), makeBackgroundTaskQueue);
            if (sharedPreferencesAsyncApi != null) {
                basicMessageChannel6.setMessageHandler(new SharedPreferencesAsyncApi$Companion$$ExternalSyntheticLambda1(sharedPreferencesAsyncApi));
            } else {
                basicMessageChannel6.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getString" + str2, getCodec(), makeBackgroundTaskQueue);
            if (sharedPreferencesAsyncApi != null) {
                basicMessageChannel7.setMessageHandler(new SharedPreferencesAsyncApi$Companion$$ExternalSyntheticLambda2(sharedPreferencesAsyncApi));
            } else {
                basicMessageChannel7.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getBool" + str2, getCodec(), makeBackgroundTaskQueue);
            if (sharedPreferencesAsyncApi != null) {
                basicMessageChannel8.setMessageHandler(new SharedPreferencesAsyncApi$Companion$$ExternalSyntheticLambda3(sharedPreferencesAsyncApi));
            } else {
                basicMessageChannel8.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel9 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getDouble" + str2, getCodec(), makeBackgroundTaskQueue);
            if (sharedPreferencesAsyncApi != null) {
                basicMessageChannel9.setMessageHandler(new SharedPreferencesAsyncApi$Companion$$ExternalSyntheticLambda4(sharedPreferencesAsyncApi));
            } else {
                basicMessageChannel9.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel10 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getInt" + str2, getCodec(), makeBackgroundTaskQueue);
            if (sharedPreferencesAsyncApi != null) {
                basicMessageChannel10.setMessageHandler(new SharedPreferencesAsyncApi$Companion$$ExternalSyntheticLambda5(sharedPreferencesAsyncApi));
            } else {
                basicMessageChannel10.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel11 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getPlatformEncodedStringList" + str2, getCodec(), makeBackgroundTaskQueue);
            if (sharedPreferencesAsyncApi != null) {
                basicMessageChannel11.setMessageHandler(new SharedPreferencesAsyncApi$Companion$$ExternalSyntheticLambda6(sharedPreferencesAsyncApi));
            } else {
                basicMessageChannel11.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel12 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getStringList" + str2, getCodec(), makeBackgroundTaskQueue);
            if (sharedPreferencesAsyncApi != null) {
                basicMessageChannel12.setMessageHandler(new SharedPreferencesAsyncApi$Companion$$ExternalSyntheticLambda7(sharedPreferencesAsyncApi));
            } else {
                basicMessageChannel12.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel13 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.clear" + str2, getCodec(), makeBackgroundTaskQueue);
            if (sharedPreferencesAsyncApi != null) {
                basicMessageChannel13.setMessageHandler(new SharedPreferencesAsyncApi$Companion$$ExternalSyntheticLambda8(sharedPreferencesAsyncApi));
            } else {
                basicMessageChannel13.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel14 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getAll" + str2, getCodec(), makeBackgroundTaskQueue);
            if (sharedPreferencesAsyncApi != null) {
                basicMessageChannel14.setMessageHandler(new SharedPreferencesAsyncApi$Companion$$ExternalSyntheticLambda9(sharedPreferencesAsyncApi));
            } else {
                basicMessageChannel14.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel15 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getKeys" + str2, getCodec(), makeBackgroundTaskQueue);
            if (sharedPreferencesAsyncApi != null) {
                basicMessageChannel15.setMessageHandler(new SharedPreferencesAsyncApi$Companion$$ExternalSyntheticLambda10(sharedPreferencesAsyncApi));
            } else {
                basicMessageChannel15.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
        }

        /* access modifiers changed from: private */
        public static final void setUp$lambda$1$lambda$0(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list2 = (List) obj;
            Object obj2 = list2.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list2.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = ((Boolean) obj3).booleanValue();
            Object obj4 = list2.get(2);
            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                sharedPreferencesAsyncApi.setBool(str, booleanValue, (SharedPreferencesPigeonOptions) obj4);
                list = CollectionsKt.listOf(null);
            } catch (Throwable th) {
                list = MessagesAsync_gKt.wrapError(th);
            }
            reply.reply(list);
        }

        /* access modifiers changed from: private */
        public static final void setUp$lambda$3$lambda$2(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list2 = (List) obj;
            Object obj2 = list2.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list2.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) obj3;
            Object obj4 = list2.get(2);
            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                sharedPreferencesAsyncApi.setString(str, str2, (SharedPreferencesPigeonOptions) obj4);
                list = CollectionsKt.listOf(null);
            } catch (Throwable th) {
                list = MessagesAsync_gKt.wrapError(th);
            }
            reply.reply(list);
        }

        /* access modifiers changed from: private */
        public static final void setUp$lambda$5$lambda$4(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list2 = (List) obj;
            Object obj2 = list2.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list2.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Long");
            long longValue = ((Long) obj3).longValue();
            Object obj4 = list2.get(2);
            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                sharedPreferencesAsyncApi.setInt(str, longValue, (SharedPreferencesPigeonOptions) obj4);
                list = CollectionsKt.listOf(null);
            } catch (Throwable th) {
                list = MessagesAsync_gKt.wrapError(th);
            }
            reply.reply(list);
        }

        /* access modifiers changed from: private */
        public static final void setUp$lambda$7$lambda$6(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list2 = (List) obj;
            Object obj2 = list2.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list2.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Double");
            double doubleValue = ((Double) obj3).doubleValue();
            Object obj4 = list2.get(2);
            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                sharedPreferencesAsyncApi.setDouble(str, doubleValue, (SharedPreferencesPigeonOptions) obj4);
                list = CollectionsKt.listOf(null);
            } catch (Throwable th) {
                list = MessagesAsync_gKt.wrapError(th);
            }
            reply.reply(list);
        }

        /* access modifiers changed from: private */
        public static final void setUp$lambda$9$lambda$8(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list2 = (List) obj;
            Object obj2 = list2.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list2.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) obj3;
            Object obj4 = list2.get(2);
            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                sharedPreferencesAsyncApi.setEncodedStringList(str, str2, (SharedPreferencesPigeonOptions) obj4);
                list = CollectionsKt.listOf(null);
            } catch (Throwable th) {
                list = MessagesAsync_gKt.wrapError(th);
            }
            reply.reply(list);
        }

        /* access modifiers changed from: private */
        public static final void setUp$lambda$11$lambda$10(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list2 = (List) obj;
            Object obj2 = list2.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list2.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            List list3 = (List) obj3;
            Object obj4 = list2.get(2);
            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                sharedPreferencesAsyncApi.setDeprecatedStringList(str, list3, (SharedPreferencesPigeonOptions) obj4);
                list = CollectionsKt.listOf(null);
            } catch (Throwable th) {
                list = MessagesAsync_gKt.wrapError(th);
            }
            reply.reply(list);
        }

        /* access modifiers changed from: private */
        public static final void setUp$lambda$13$lambda$12(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list2 = (List) obj;
            Object obj2 = list2.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list2.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                list = CollectionsKt.listOf(sharedPreferencesAsyncApi.getString(str, (SharedPreferencesPigeonOptions) obj3));
            } catch (Throwable th) {
                list = MessagesAsync_gKt.wrapError(th);
            }
            reply.reply(list);
        }

        /* access modifiers changed from: private */
        public static final void setUp$lambda$15$lambda$14(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list2 = (List) obj;
            Object obj2 = list2.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list2.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                list = CollectionsKt.listOf(sharedPreferencesAsyncApi.getBool(str, (SharedPreferencesPigeonOptions) obj3));
            } catch (Throwable th) {
                list = MessagesAsync_gKt.wrapError(th);
            }
            reply.reply(list);
        }

        /* access modifiers changed from: private */
        public static final void setUp$lambda$17$lambda$16(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list2 = (List) obj;
            Object obj2 = list2.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list2.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                list = CollectionsKt.listOf(sharedPreferencesAsyncApi.getDouble(str, (SharedPreferencesPigeonOptions) obj3));
            } catch (Throwable th) {
                list = MessagesAsync_gKt.wrapError(th);
            }
            reply.reply(list);
        }

        /* access modifiers changed from: private */
        public static final void setUp$lambda$19$lambda$18(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list2 = (List) obj;
            Object obj2 = list2.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list2.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                list = CollectionsKt.listOf(sharedPreferencesAsyncApi.getInt(str, (SharedPreferencesPigeonOptions) obj3));
            } catch (Throwable th) {
                list = MessagesAsync_gKt.wrapError(th);
            }
            reply.reply(list);
        }

        /* access modifiers changed from: private */
        public static final void setUp$lambda$21$lambda$20(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List<T> list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list2 = (List) obj;
            Object obj2 = list2.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list2.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                list = CollectionsKt.listOf(sharedPreferencesAsyncApi.getPlatformEncodedStringList(str, (SharedPreferencesPigeonOptions) obj3));
            } catch (Throwable th) {
                list = MessagesAsync_gKt.wrapError(th);
            }
            reply.reply(list);
        }

        /* access modifiers changed from: private */
        public static final void setUp$lambda$23$lambda$22(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list2 = (List) obj;
            Object obj2 = list2.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list2.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                list = CollectionsKt.listOf(sharedPreferencesAsyncApi.getStringList(str, (SharedPreferencesPigeonOptions) obj3));
            } catch (Throwable th) {
                list = MessagesAsync_gKt.wrapError(th);
            }
            reply.reply(list);
        }

        /* access modifiers changed from: private */
        public static final void setUp$lambda$25$lambda$24(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list2 = (List) obj;
            List list3 = (List) list2.get(0);
            Object obj2 = list2.get(1);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                sharedPreferencesAsyncApi.clear(list3, (SharedPreferencesPigeonOptions) obj2);
                list = CollectionsKt.listOf(null);
            } catch (Throwable th) {
                list = MessagesAsync_gKt.wrapError(th);
            }
            reply.reply(list);
        }

        /* access modifiers changed from: private */
        public static final void setUp$lambda$27$lambda$26(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List<T> list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list2 = (List) obj;
            List list3 = (List) list2.get(0);
            Object obj2 = list2.get(1);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                list = CollectionsKt.listOf(sharedPreferencesAsyncApi.getAll(list3, (SharedPreferencesPigeonOptions) obj2));
            } catch (Throwable th) {
                list = MessagesAsync_gKt.wrapError(th);
            }
            reply.reply(list);
        }

        /* access modifiers changed from: private */
        public static final void setUp$lambda$29$lambda$28(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List<T> list;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list2 = (List) obj;
            List list3 = (List) list2.get(0);
            Object obj2 = list2.get(1);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                list = CollectionsKt.listOf(sharedPreferencesAsyncApi.getKeys(list3, (SharedPreferencesPigeonOptions) obj2));
            } catch (Throwable th) {
                list = MessagesAsync_gKt.wrapError(th);
            }
            reply.reply(list);
        }
    }
}
