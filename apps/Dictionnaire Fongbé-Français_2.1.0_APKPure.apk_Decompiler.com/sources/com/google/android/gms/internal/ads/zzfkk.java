package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzo;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzfkk extends zzbwv {
    final /* synthetic */ zzgdb zza;
    final /* synthetic */ zzbwp zzb;
    final /* synthetic */ zzfkl zzc;

    zzfkk(zzfkl zzfkl, zzgdb zzgdb, zzbwp zzbwp) {
        this.zza = zzgdb;
        this.zzb = zzbwp;
        this.zzc = zzfkl;
    }

    public final void zze(int i) {
    }

    public final void zzf(zze zze) {
        String adError = zze.zzb().toString();
        String str = this.zzc.zze.zza;
        zzo.zzj("Failed to load rewarded ad with error: " + adError + ", adUnitId: " + str);
        this.zzc.zzA(zze);
    }

    public final void zzg() {
        zzfjd.zza(this.zzb, this.zza);
    }
}
