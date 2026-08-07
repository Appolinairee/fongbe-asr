package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.util.Log;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.UserMessagingPlatform;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
public final class zzbk {
    private final zzdp zza;
    private final Executor zzb;
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();

    zzbk(zzdp zzdp, Executor executor) {
        this.zza = zzdp;
        this.zzb = executor;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzay zzay) {
        AtomicReference atomicReference = this.zzd;
        Objects.requireNonNull(atomicReference);
        zzay.zzf(new zzbb(atomicReference), new zzbc());
    }

    public final void zzb(UserMessagingPlatform.OnConsentFormLoadSuccessListener onConsentFormLoadSuccessListener, UserMessagingPlatform.OnConsentFormLoadFailureListener onConsentFormLoadFailureListener) {
        zzco.zza();
        zzbm zzbm = (zzbm) this.zzc.get();
        if (zzbm == null) {
            onConsentFormLoadFailureListener.onConsentFormLoadFailure(new zzg(3, "No available form can be built.").zza());
        } else {
            ((zzas) this.zza.zza()).zza(zzbm).zzb().zza().zzf(onConsentFormLoadSuccessListener, onConsentFormLoadFailureListener);
        }
    }

    public final void zzc() {
        zzbm zzbm = (zzbm) this.zzc.get();
        if (zzbm == null) {
            Log.e("UserMessagingPlatform", "Failed to load and cache a form due to null consent form resources.");
            return;
        }
        zzay zza2 = ((zzas) this.zza.zza()).zza(zzbm).zzb().zza();
        zza2.zza = true;
        zzco.zza.post(new zzba(this, zza2));
    }

    public final void zzd(zzbm zzbm) {
        this.zzc.set(zzbm);
    }

    public final void zze(Activity activity, ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener) {
        zzco.zza();
        zzj zzb2 = zza.zza(activity).zzb();
        if (zzb2 == null) {
            zzco.zza.post(new zzbd(onConsentFormDismissedListener));
        } else if (!zzb2.isConsentFormAvailable() && zzb2.getPrivacyOptionsRequirementStatus() != ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED) {
            zzco.zza.post(new zzbe(onConsentFormDismissedListener));
            zzb2.zza(activity);
        } else if (zzb2.getPrivacyOptionsRequirementStatus() == ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED) {
            zzco.zza.post(new zzbf(onConsentFormDismissedListener));
        } else {
            ConsentForm consentForm = (ConsentForm) this.zzd.get();
            if (consentForm == null) {
                zzco.zza.post(new zzbg(onConsentFormDismissedListener));
                return;
            }
            consentForm.show(activity, onConsentFormDismissedListener);
            this.zzb.execute(new zzbh(this));
        }
    }

    public final boolean zzf() {
        return this.zzc.get() != null;
    }
}
