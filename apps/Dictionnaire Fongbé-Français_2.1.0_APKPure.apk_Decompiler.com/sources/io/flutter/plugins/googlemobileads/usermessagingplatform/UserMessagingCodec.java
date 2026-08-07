package io.flutter.plugins.googlemobileads.usermessagingplatform;

import com.google.android.ump.ConsentForm;
import com.google.android.ump.FormError;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMessagingCodec extends StandardMessageCodec {
    private static final byte VALUE_CONSENT_DEBUG_SETTINGS = -126;
    private static final byte VALUE_CONSENT_FORM = -125;
    private static final byte VALUE_CONSENT_REQUEST_PARAMETERS = -127;
    private static final byte VALUE_FORM_ERROR = -124;
    private final Map<Integer, ConsentForm> consentFormMap = new HashMap();

    UserMessagingCodec() {
    }

    /* access modifiers changed from: protected */
    public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        if (obj instanceof ConsentRequestParametersWrapper) {
            byteArrayOutputStream.write(-127);
            ConsentRequestParametersWrapper consentRequestParametersWrapper = (ConsentRequestParametersWrapper) obj;
            writeValue(byteArrayOutputStream, consentRequestParametersWrapper.getTfuac());
            writeValue(byteArrayOutputStream, consentRequestParametersWrapper.getDebugSettings());
        } else if (obj instanceof ConsentDebugSettingsWrapper) {
            byteArrayOutputStream.write(-126);
            ConsentDebugSettingsWrapper consentDebugSettingsWrapper = (ConsentDebugSettingsWrapper) obj;
            writeValue(byteArrayOutputStream, consentDebugSettingsWrapper.getDebugGeography());
            writeValue(byteArrayOutputStream, consentDebugSettingsWrapper.getTestIdentifiers());
        } else if (obj instanceof ConsentForm) {
            byteArrayOutputStream.write(-125);
            writeValue(byteArrayOutputStream, Integer.valueOf(obj.hashCode()));
        } else if (obj instanceof FormError) {
            byteArrayOutputStream.write(-124);
            FormError formError = (FormError) obj;
            writeValue(byteArrayOutputStream, Integer.valueOf(formError.getErrorCode()));
            writeValue(byteArrayOutputStream, formError.getMessage());
        } else {
            super.writeValue(byteArrayOutputStream, obj);
        }
    }

    private List<String> asList(Object obj) {
        if (obj == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (obj instanceof List) {
            for (Object next : (List) obj) {
                if (next instanceof String) {
                    arrayList.add((String) next);
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public Object readValueOfType(byte b, ByteBuffer byteBuffer) {
        switch (b) {
            case -127:
                return new ConsentRequestParametersWrapper((Boolean) readValueOfType(byteBuffer.get(), byteBuffer), (ConsentDebugSettingsWrapper) readValueOfType(byteBuffer.get(), byteBuffer));
            case -126:
                return new ConsentDebugSettingsWrapper((Integer) readValueOfType(byteBuffer.get(), byteBuffer), asList(readValueOfType(byteBuffer.get(), byteBuffer)));
            case -125:
                return this.consentFormMap.get((Integer) readValueOfType(byteBuffer.get(), byteBuffer));
            case -124:
                Integer num = (Integer) readValueOfType(byteBuffer.get(), byteBuffer);
                return new FormError(num.intValue(), (String) readValueOfType(byteBuffer.get(), byteBuffer));
            default:
                return super.readValueOfType(b, byteBuffer);
        }
    }

    /* access modifiers changed from: package-private */
    public void trackConsentForm(ConsentForm consentForm) {
        this.consentFormMap.put(Integer.valueOf(consentForm.hashCode()), consentForm);
    }

    /* access modifiers changed from: package-private */
    public void disposeConsentForm(ConsentForm consentForm) {
        this.consentFormMap.remove(Integer.valueOf(consentForm.hashCode()));
    }
}
