package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzbrk implements MediationAdLoadCallback {
    final /* synthetic */ zzbqu zza;
    final /* synthetic */ zzbpk zzb;
    final /* synthetic */ zzbrq zzc;

    zzbrk(zzbrq zzbrq, zzbqu zzbqu, zzbpk zzbpk) {
        this.zza = zzbqu;
        this.zzb = zzbpk;
        this.zzc = zzbrq;
    }

    public final void onFailure(AdError adError) {
        try {
            this.zza.zzf(adError.zza());
        } catch (RemoteException e) {
            zzo.zzh("", e);
        }
    }

    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        MediationInterstitialAd mediationInterstitialAd = (MediationInterstitialAd) obj;
        if (mediationInterstitialAd == null) {
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
                this.zzc.zzb = mediationInterstitialAd;
                this.zza.zzg();
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
