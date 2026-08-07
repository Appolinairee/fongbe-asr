package io.flutter.plugins.googlemobileads.usermessagingplatform;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentRequestParameters;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.StandardMethodCodec;

public class UserMessagingPlatformManager implements MethodChannel.MethodCallHandler {
    private static final String INTERNAL_ERROR_CODE = "0";
    private static final String METHOD_CHANNEL_NAME = "plugins.flutter.io/google_mobile_ads/ump";
    private Activity activity;
    private ConsentInformation consentInformation;
    private final Context context;
    private final MethodChannel methodChannel;
    /* access modifiers changed from: private */
    public final UserMessagingCodec userMessagingCodec;

    public UserMessagingPlatformManager(BinaryMessenger binaryMessenger, Context context2) {
        UserMessagingCodec userMessagingCodec2 = new UserMessagingCodec();
        this.userMessagingCodec = userMessagingCodec2;
        MethodChannel methodChannel2 = new MethodChannel(binaryMessenger, METHOD_CHANNEL_NAME, new StandardMethodCodec(userMessagingCodec2));
        this.methodChannel = methodChannel2;
        methodChannel2.setMethodCallHandler(this);
        this.context = context2;
    }

    UserMessagingPlatformManager(BinaryMessenger binaryMessenger, Context context2, UserMessagingCodec userMessagingCodec2) {
        this.userMessagingCodec = userMessagingCodec2;
        MethodChannel methodChannel2 = new MethodChannel(binaryMessenger, METHOD_CHANNEL_NAME, new StandardMethodCodec(userMessagingCodec2));
        this.methodChannel = methodChannel2;
        methodChannel2.setMethodCallHandler(this);
        this.context = context2;
    }

    public void setActivity(Activity activity2) {
        this.activity = activity2;
    }

    private ConsentInformation getConsentInformation() {
        ConsentInformation consentInformation2 = this.consentInformation;
        if (consentInformation2 != null) {
            return consentInformation2;
        }
        ConsentInformation consentInformation3 = UserMessagingPlatform.getConsentInformation(this.context);
        this.consentInformation = consentInformation3;
        return consentInformation3;
    }

    public void onMethodCall(MethodCall methodCall, final MethodChannel.Result result) {
        ConsentRequestParameters consentRequestParameters;
        String str = methodCall.method;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2068759970:
                if (str.equals("ConsentInformation#reset")) {
                    c = 0;
                    break;
                }
                break;
            case -1987766237:
                if (str.equals("UserMessagingPlatform#loadAndShowConsentFormIfRequired")) {
                    c = 1;
                    break;
                }
                break;
            case -1310145901:
                if (str.equals("ConsentInformation#requestConsentInfoUpdate")) {
                    c = 2;
                    break;
                }
                break;
            case -971145086:
                if (str.equals("ConsentForm#show")) {
                    c = 3;
                    break;
                }
                break;
            case -878979462:
                if (str.equals("ConsentForm#dispose")) {
                    c = 4;
                    break;
                }
                break;
            case -689237714:
                if (str.equals("UserMessagingPlatform#showPrivacyOptionsForm")) {
                    c = 5;
                    break;
                }
                break;
            case -585732218:
                if (str.equals("ConsentInformation#isConsentFormAvailable")) {
                    c = 6;
                    break;
                }
                break;
            case -497439839:
                if (str.equals("UserMessagingPlatform#loadConsentForm")) {
                    c = 7;
                    break;
                }
                break;
            case -309829158:
                if (str.equals("ConsentInformation#getPrivacyOptionsRequirementStatus")) {
                    c = 8;
                    break;
                }
                break;
            case 504907168:
                if (str.equals("ConsentInformation#canRequestAds")) {
                    c = 9;
                    break;
                }
                break;
            case 665104519:
                if (str.equals("ConsentInformation#getConsentStatus")) {
                    c = 10;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                getConsentInformation().reset();
                result.success((Object) null);
                return;
            case 1:
                Activity activity2 = this.activity;
                if (activity2 == null) {
                    result.error(INTERNAL_ERROR_CODE, "UserMessagingPlatform#loadAndShowConsentFormIfRequired called before plugin has been registered to an activity.", (Object) null);
                    return;
                } else {
                    UserMessagingPlatform.loadAndShowConsentFormIfRequired(activity2, new UserMessagingPlatformManager$$ExternalSyntheticLambda0(result));
                    return;
                }
            case 2:
                if (this.activity == null) {
                    result.error(INTERNAL_ERROR_CODE, "ConsentInformation#requestConsentInfoUpdate called before plugin has been registered to an activity.", (Object) null);
                    return;
                }
                ConsentRequestParametersWrapper consentRequestParametersWrapper = (ConsentRequestParametersWrapper) methodCall.argument("params");
                if (consentRequestParametersWrapper == null) {
                    consentRequestParameters = new ConsentRequestParameters.Builder().build();
                } else {
                    consentRequestParameters = consentRequestParametersWrapper.getAsConsentRequestParameters(this.activity);
                }
                getConsentInformation().requestConsentInfoUpdate(this.activity, consentRequestParameters, new ConsentInformation.OnConsentInfoUpdateSuccessListener() {
                    public void onConsentInfoUpdateSuccess() {
                        result.success((Object) null);
                    }
                }, new ConsentInformation.OnConsentInfoUpdateFailureListener() {
                    public void onConsentInfoUpdateFailure(FormError formError) {
                        result.error(Integer.toString(formError.getErrorCode()), formError.getMessage(), (Object) null);
                    }
                });
                return;
            case 3:
                ConsentForm consentForm = (ConsentForm) methodCall.argument("consentForm");
                if (consentForm == null) {
                    result.error(INTERNAL_ERROR_CODE, "ConsentForm#show", (Object) null);
                    return;
                } else {
                    consentForm.show(this.activity, new ConsentForm.OnConsentFormDismissedListener() {
                        public void onConsentFormDismissed(FormError formError) {
                            if (formError != null) {
                                result.error(Integer.toString(formError.getErrorCode()), formError.getMessage(), (Object) null);
                            } else {
                                result.success((Object) null);
                            }
                        }
                    });
                    return;
                }
            case 4:
                ConsentForm consentForm2 = (ConsentForm) methodCall.argument("consentForm");
                if (consentForm2 == null) {
                    Log.w(INTERNAL_ERROR_CODE, "Called dispose on ad that has been freed");
                } else {
                    this.userMessagingCodec.disposeConsentForm(consentForm2);
                }
                result.success((Object) null);
                return;
            case 5:
                Activity activity3 = this.activity;
                if (activity3 == null) {
                    result.error(INTERNAL_ERROR_CODE, "UserMessagingPlatform#showPrivacyOptionsForm called before plugin has been registered to an activity.", (Object) null);
                    return;
                } else {
                    UserMessagingPlatform.showPrivacyOptionsForm(activity3, new UserMessagingPlatformManager$$ExternalSyntheticLambda1(result));
                    return;
                }
            case 6:
                result.success(Boolean.valueOf(getConsentInformation().isConsentFormAvailable()));
                return;
            case 7:
                UserMessagingPlatform.loadConsentForm(this.context, new UserMessagingPlatform.OnConsentFormLoadSuccessListener() {
                    public void onConsentFormLoadSuccess(ConsentForm consentForm) {
                        UserMessagingPlatformManager.this.userMessagingCodec.trackConsentForm(consentForm);
                        result.success(consentForm);
                    }
                }, new UserMessagingPlatform.OnConsentFormLoadFailureListener() {
                    public void onConsentFormLoadFailure(FormError formError) {
                        result.error(Integer.toString(formError.getErrorCode()), formError.getMessage(), (Object) null);
                    }
                });
                return;
            case 8:
                int i = AnonymousClass6.$SwitchMap$com$google$android$ump$ConsentInformation$PrivacyOptionsRequirementStatus[getConsentInformation().getPrivacyOptionsRequirementStatus().ordinal()];
                if (i == 1) {
                    result.success(0);
                    return;
                } else if (i != 2) {
                    result.success(2);
                    return;
                } else {
                    result.success(1);
                    return;
                }
            case 9:
                result.success(Boolean.valueOf(getConsentInformation().canRequestAds()));
                return;
            case 10:
                result.success(Integer.valueOf(getConsentInformation().getConsentStatus()));
                return;
            default:
                result.notImplemented();
                return;
        }
    }

    /* renamed from: io.flutter.plugins.googlemobileads.usermessagingplatform.UserMessagingPlatformManager$6  reason: invalid class name */
    static /* synthetic */ class AnonymousClass6 {
        static final /* synthetic */ int[] $SwitchMap$com$google$android$ump$ConsentInformation$PrivacyOptionsRequirementStatus;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.google.android.ump.ConsentInformation$PrivacyOptionsRequirementStatus[] r0 = com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$google$android$ump$ConsentInformation$PrivacyOptionsRequirementStatus = r0
                com.google.android.ump.ConsentInformation$PrivacyOptionsRequirementStatus r1 = com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$google$android$ump$ConsentInformation$PrivacyOptionsRequirementStatus     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.android.ump.ConsentInformation$PrivacyOptionsRequirementStatus r1 = com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus.REQUIRED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.googlemobileads.usermessagingplatform.UserMessagingPlatformManager.AnonymousClass6.<clinit>():void");
        }
    }
}
