package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzfhe implements zzgcd {
    final /* synthetic */ zzfhh zza;
    final /* synthetic */ zzfgw zzb;
    final /* synthetic */ boolean zzc;

    zzfhe(zzfhh zzfhh, zzfgw zzfgw, boolean z) {
        this.zza = zzfhh;
        this.zzb = zzfgw;
        this.zzc = z;
    }

    public final void zza(Throwable th) {
        zzfgw zzfgw = this.zzb;
        if (zzfgw.zzk()) {
            zzfhh zzfhh = this.zza;
            zzfgw.zzh(th);
            zzfgw.zzg(false);
            zzfhh.zza(zzfgw);
            if (this.zzc) {
                this.zza.zzh();
            }
        }
    }

    public final void zzb(Object obj) {
        zzfgw zzfgw = this.zzb;
        zzfgw.zzg(true);
        this.zza.zza(zzfgw);
        if (this.zzc) {
            this.zza.zzh();
        }
    }
}
