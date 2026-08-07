package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzbrj implements MediationAdLoadCallback {
    final /* synthetic */ zzbqr zza;
    final /* synthetic */ zzbpk zzb;

    zzbrj(zzbrq zzbrq, zzbqr zzbqr, zzbpk zzbpk) {
        this.zza = zzbqr;
        this.zzb = zzbpk;
    }

    public final void onFailure(AdError adError) {
        try {
            this.zza.zzf(adError.zza());
        } catch (RemoteException e) {
            zzo.zzh("", e);
        }
    }

    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        MediationInterscrollerAd mediationInterscrollerAd = (MediationInterscrollerAd) obj;
        if (mediationInterscrollerAd == null) {
            zzo.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
            try {
                this.zza.zze("Adapter returned null.");
                return null;
            } catch (RemoteException e) {
                zzo.zzh("", e);
                return null;
            }
        } else {
            try {
                this.zza.zzh(new zzbqg(mediationInterscrollerAd));
            } catch (RemoteException e2) {
                zzo.zzh("", e2);
            }
            return new zzbrr(this.zzb);
        }
    }

    public final void onFailure(String str) {
        onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }
}
