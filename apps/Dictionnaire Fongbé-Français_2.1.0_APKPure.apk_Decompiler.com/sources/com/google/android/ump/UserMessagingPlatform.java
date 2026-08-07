package com.google.android.ump;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.consent_sdk.zza;
import com.google.android.gms.internal.consent_sdk.zzbi;
import com.google.android.gms.internal.consent_sdk.zzbj;
import com.google.android.gms.internal.consent_sdk.zzbk;
import com.google.android.gms.internal.consent_sdk.zzco;
import com.google.android.ump.ConsentForm;
import java.util.Objects;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
public final class UserMessagingPlatform {

    /* compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
    public interface OnConsentFormLoadFailureListener {
        void onConsentFormLoadFailure(FormError formError);
    }

    /* compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
    public interface OnConsentFormLoadSuccessListener {
        void onConsentFormLoadSuccess(ConsentForm consentForm);
    }

    private UserMessagingPlatform() {
    }

    public static ConsentInformation getConsentInformation(Context context) {
        return zza.zza(context).zzb();
    }

    public static void loadAndShowConsentFormIfRequired(Activity activity, ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener) {
        if (zza.zza(activity).zzb().canRequestAds()) {
            onConsentFormDismissedListener.onConsentFormDismissed((FormError) null);
            return;
        }
        zzbk zzc = zza.zza(activity).zzc();
        zzco.zza();
        zzbi zzbi = new zzbi(activity, onConsentFormDismissedListener);
        Objects.requireNonNull(onConsentFormDismissedListener);
        zzc.zzb(zzbi, new zzbj(onConsentFormDismissedListener));
    }

    public static void loadConsentForm(Context context, OnConsentFormLoadSuccessListener onConsentFormLoadSuccessListener, OnConsentFormLoadFailureListener onConsentFormLoadFailureListener) {
        zza.zza(context).zzc().zzb(onConsentFormLoadSuccessListener, onConsentFormLoadFailureListener);
    }

    public static void showPrivacyOptionsForm(Activity activity, ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener) {
        zza.zza(activity).zzc().zze(activity, onConsentFormDismissedListener);
    }
}
