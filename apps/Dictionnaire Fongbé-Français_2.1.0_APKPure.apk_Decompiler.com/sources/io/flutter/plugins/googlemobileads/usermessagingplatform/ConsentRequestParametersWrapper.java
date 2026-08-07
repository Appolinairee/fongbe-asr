package io.flutter.plugins.googlemobileads.usermessagingplatform;

import android.content.Context;
import com.google.android.ump.ConsentRequestParameters;
import java.util.Objects;

class ConsentRequestParametersWrapper {
    private final ConsentDebugSettingsWrapper debugSettings;
    private final Boolean tfuac;

    ConsentRequestParametersWrapper(Boolean bool, ConsentDebugSettingsWrapper consentDebugSettingsWrapper) {
        this.tfuac = bool;
        this.debugSettings = consentDebugSettingsWrapper;
    }

    /* access modifiers changed from: package-private */
    public Boolean getTfuac() {
        return this.tfuac;
    }

    /* access modifiers changed from: package-private */
    public ConsentDebugSettingsWrapper getDebugSettings() {
        return this.debugSettings;
    }

    /* access modifiers changed from: package-private */
    public ConsentRequestParameters getAsConsentRequestParameters(Context context) {
        ConsentRequestParameters.Builder builder = new ConsentRequestParameters.Builder();
        Boolean bool = this.tfuac;
        if (bool != null) {
            builder.setTagForUnderAgeOfConsent(bool.booleanValue());
        }
        ConsentDebugSettingsWrapper consentDebugSettingsWrapper = this.debugSettings;
        if (consentDebugSettingsWrapper != null) {
            builder.setConsentDebugSettings(consentDebugSettingsWrapper.getAsConsentDebugSettings(context));
        }
        return builder.build();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConsentRequestParametersWrapper)) {
            return false;
        }
        ConsentRequestParametersWrapper consentRequestParametersWrapper = (ConsentRequestParametersWrapper) obj;
        if (!Objects.equals(this.tfuac, consentRequestParametersWrapper.getTfuac()) || !Objects.equals(this.debugSettings, consentRequestParametersWrapper.getDebugSettings())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.tfuac, this.debugSettings});
    }
}
