package io.flutter.plugins.googlemobileads.usermessagingplatform;

import android.content.Context;
import com.google.android.ump.ConsentDebugSettings;
import java.util.List;
import java.util.Objects;

class ConsentDebugSettingsWrapper {
    private final Integer debugGeography;
    private final List<String> testIdentifiers;

    ConsentDebugSettingsWrapper(Integer num, List<String> list) {
        this.debugGeography = num;
        this.testIdentifiers = list;
    }

    /* access modifiers changed from: package-private */
    public Integer getDebugGeography() {
        return this.debugGeography;
    }

    /* access modifiers changed from: package-private */
    public List<String> getTestIdentifiers() {
        return this.testIdentifiers;
    }

    /* access modifiers changed from: package-private */
    public ConsentDebugSettings getAsConsentDebugSettings(Context context) {
        ConsentDebugSettings.Builder builder = new ConsentDebugSettings.Builder(context);
        Integer num = this.debugGeography;
        if (num != null) {
            builder.setDebugGeography(num.intValue());
        }
        List<String> list = this.testIdentifiers;
        if (list != null) {
            for (String addTestDeviceHashedId : list) {
                builder.addTestDeviceHashedId(addTestDeviceHashedId);
            }
        }
        return builder.build();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConsentDebugSettingsWrapper)) {
            return false;
        }
        ConsentDebugSettingsWrapper consentDebugSettingsWrapper = (ConsentDebugSettingsWrapper) obj;
        if (!Objects.equals(this.debugGeography, consentDebugSettingsWrapper.getDebugGeography()) || !Objects.equals(this.testIdentifiers, consentDebugSettingsWrapper.getTestIdentifiers())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.debugGeography, this.testIdentifiers});
    }
}
