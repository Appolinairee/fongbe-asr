package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbn;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzo;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzfjh extends zzbn {
    final /* synthetic */ zzgdb zza;
    final /* synthetic */ zzby zzb;
    final /* synthetic */ zzfji zzc;

    zzfjh(zzfji zzfji, zzgdb zzgdb, zzby zzby) {
        this.zza = zzgdb;
        this.zzb = zzby;
        this.zzc = zzfji;
    }

    public final void zzb(zze zze) {
        String adError = zze.zzb().toString();
        String str = this.zzc.zze.zza;
        zzo.zzj("Failed to load interstitial ad with error: " + adError + " for ad unit: " + str);
        this.zzc.zzA(zze);
    }

    public final void zzc() {
        zzfjd.zza(this.zzb, this.zza);
    }
}
