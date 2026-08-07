package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzfiz implements zzgcd {
    final /* synthetic */ zzfgw zza;
    final /* synthetic */ zzfhh zzb;
    final /* synthetic */ zzfja zzc;

    zzfiz(zzfja zzfja, zzfgw zzfgw, zzfhh zzfhh) {
        this.zza = zzfgw;
        this.zzb = zzfhh;
        this.zzc = zzfja;
    }

    public final void zza(Throwable th) {
        this.zza.zzg(false);
        zzfhh zzfhh = this.zzb;
        if (zzfhh == null) {
            this.zzc.zzf.zzb(this.zza.zzm());
            return;
        }
        zzfhh.zza(this.zza);
        zzfhh.zzh();
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zza.zzg(((zzt) obj) == zzt.SUCCESS);
        zzfhh zzfhh = this.zzb;
        if (zzfhh == null) {
            this.zzc.zzf.zzb(this.zza.zzm());
            return;
        }
        zzfhh.zza(this.zza);
        zzfhh.zzh();
    }
}
