package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzft;
import com.google.android.gms.ads.internal.util.client.zzo;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzfje extends zzbaf {
    final /* synthetic */ zzgdb zza;
    final /* synthetic */ zzft zzb;
    final /* synthetic */ zzfjf zzc;

    zzfje(zzfjf zzfjf, zzgdb zzgdb, zzft zzft) {
        this.zza = zzgdb;
        this.zzb = zzft;
        this.zzc = zzfjf;
    }

    public final void zzb(int i) {
    }

    public final void zzc(zze zze) {
        String adError = zze.zzb().toString();
        String str = this.zzb.zza;
        zzo.zzj("Failed to load app open ad with error parcel: " + adError + " for ad unit: " + str);
        this.zzc.zzA(zze);
    }

    public final void zzd(zzbad zzbad) {
        zzfjd.zza(zzbad, this.zza);
    }
}
