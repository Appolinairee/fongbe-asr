package io.flutter.plugin.localization;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import androidx.activity.ComponentDialog$$ExternalSyntheticApiModelOutline0;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.graphics.ColorKt$$ExternalSyntheticApiModelOutline0;
import io.flutter.embedding.engine.systemchannels.LocalizationChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.io.path.FileVisitorImpl$$ExternalSyntheticApiModelOutline0;

public class LocalizationPlugin {
    /* access modifiers changed from: private */
    public final Context context;
    private final LocalizationChannel localizationChannel;
    final LocalizationChannel.LocalizationMessageHandler localizationMessageHandler;

    public LocalizationPlugin(Context context2, LocalizationChannel localizationChannel2) {
        AnonymousClass1 r0 = new LocalizationChannel.LocalizationMessageHandler() {
            public String getStringResource(String str, String str2) {
                Context access$000 = LocalizationPlugin.this.context;
                if (str2 != null) {
                    Locale localeFromString = LocalizationPlugin.localeFromString(str2);
                    Configuration configuration = new Configuration(LocalizationPlugin.this.context.getResources().getConfiguration());
                    configuration.setLocale(localeFromString);
                    access$000 = LocalizationPlugin.this.context.createConfigurationContext(configuration);
                }
                int identifier = access$000.getResources().getIdentifier(str, TypedValues.Custom.S_STRING, LocalizationPlugin.this.context.getPackageName());
                if (identifier != 0) {
                    return access$000.getResources().getString(identifier);
                }
                return null;
            }
        };
        this.localizationMessageHandler = r0;
        this.context = context2;
        this.localizationChannel = localizationChannel2;
        localizationChannel2.setLocalizationMessageHandler(r0);
    }

    public Locale resolveNativeLocale(List<Locale> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            ArrayList arrayList = new ArrayList();
            LocaleList m = ComponentDialog$$ExternalSyntheticApiModelOutline0.m(this.context.getResources().getConfiguration());
            int m2 = ColorKt$$ExternalSyntheticApiModelOutline0.m(m);
            for (int i = 0; i < m2; i++) {
                Locale m3 = m.get(i);
                String language = m3.getLanguage();
                if (!m3.getScript().isEmpty()) {
                    language = language + "-" + m3.getScript();
                }
                if (!m3.getCountry().isEmpty()) {
                    language = language + "-" + m3.getCountry();
                }
                arrayList.add(FileVisitorImpl$$ExternalSyntheticApiModelOutline0.m(language));
                FileVisitorImpl$$ExternalSyntheticApiModelOutline0.m$2();
                arrayList.add(FileVisitorImpl$$ExternalSyntheticApiModelOutline0.m(m3.getLanguage()));
                FileVisitorImpl$$ExternalSyntheticApiModelOutline0.m$2();
                arrayList.add(FileVisitorImpl$$ExternalSyntheticApiModelOutline0.m(m3.getLanguage() + "-*"));
            }
            Locale m4 = Locale.lookup(arrayList, list);
            if (m4 != null) {
                return m4;
            }
            return list.get(0);
        } else if (Build.VERSION.SDK_INT >= 24) {
            LocaleList m5 = ComponentDialog$$ExternalSyntheticApiModelOutline0.m(this.context.getResources().getConfiguration());
            for (int i2 = 0; i2 < ColorKt$$ExternalSyntheticApiModelOutline0.m(m5); i2++) {
                Locale m6 = m5.get(i2);
                for (Locale next : list) {
                    if (m6.equals(next)) {
                        return next;
                    }
                }
                for (Locale next2 : list) {
                    if (m6.getLanguage().equals(next2.toLanguageTag())) {
                        return next2;
                    }
                }
                for (Locale next3 : list) {
                    if (m6.getLanguage().equals(next3.getLanguage())) {
                        return next3;
                    }
                }
            }
            return list.get(0);
        } else {
            Locale locale = this.context.getResources().getConfiguration().locale;
            if (locale != null) {
                for (Locale next4 : list) {
                    if (locale.equals(next4)) {
                        return next4;
                    }
                }
                for (Locale next5 : list) {
                    if (locale.getLanguage().equals(next5.toString())) {
                        return next5;
                    }
                }
            }
            return list.get(0);
        }
    }

    public void sendLocalesToFlutter(Configuration configuration) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 24) {
            LocaleList m = ComponentDialog$$ExternalSyntheticApiModelOutline0.m(configuration);
            int m2 = ColorKt$$ExternalSyntheticApiModelOutline0.m(m);
            for (int i = 0; i < m2; i++) {
                arrayList.add(m.get(i));
            }
        } else {
            arrayList.add(configuration.locale);
        }
        this.localizationChannel.sendLocales(arrayList);
    }

    public static Locale localeFromString(String str) {
        String str2;
        String[] split = str.replace('_', '-').split("-", -1);
        String str3 = split[0];
        String str4 = "";
        int i = 1;
        if (split.length <= 1 || split[1].length() != 4) {
            str2 = str4;
        } else {
            str2 = split[1];
            i = 2;
        }
        if (split.length > i && split[i].length() >= 2 && split[i].length() <= 3) {
            str4 = split[i];
        }
        return new Locale(str3, str4, str2);
    }
}
