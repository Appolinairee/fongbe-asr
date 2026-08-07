package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbq;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdoi implements zzher {
    private final zzhfj zza;

    public zzdoi(zzhfj zzhfj) {
        this.zza = zzhfj;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbbq.zza.C0000zza zza2;
        zzfcj zza3 = ((zzcvk) this.zza).zza();
        zzfcj zzfcj = zza3;
        if (zza3.zzo.zza == 3) {
            zza2 = zzbbq.zza.C0000zza.REWARDED_INTERSTITIAL;
        } else {
            zza2 = zzbbq.zza.C0000zza.REWARD_BASED_VIDEO_AD;
        }
        zzhez.zzb(zza2);
        zzbbq.zza.C0000zza zza4 = zza2;
        return zza2;
    }
}
