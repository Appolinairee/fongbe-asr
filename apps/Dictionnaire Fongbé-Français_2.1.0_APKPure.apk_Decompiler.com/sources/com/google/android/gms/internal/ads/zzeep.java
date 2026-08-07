package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzeep implements zzgcd {
    final /* synthetic */ zzeeq zza;

    zzeep(zzeeq zzeeq) {
        this.zza = zzeeq;
    }

    public final void zza(Throwable th) {
        zze zza2 = this.zza.zza.zzd().zza(th);
        this.zza.zzd.zzdz(zza2);
        zzfdg.zzb(zza2.zza, th, "DelayedBannerAd.onFailure");
    }

    public final /* synthetic */ void zzb(Object obj) {
        ((zzcom) obj).zzk();
    }
}
