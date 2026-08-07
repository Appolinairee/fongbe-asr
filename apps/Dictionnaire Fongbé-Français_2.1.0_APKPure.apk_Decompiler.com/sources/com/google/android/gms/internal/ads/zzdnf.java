package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzdnf implements zzgcd {
    final /* synthetic */ zzfbo zza;
    final /* synthetic */ zzfbr zzb;
    final /* synthetic */ zzcmk zzc;
    final /* synthetic */ zzdnl zzd;

    zzdnf(zzdnl zzdnl, zzfbo zzfbo, zzfbr zzfbr, zzcmk zzcmk) {
        this.zza = zzfbo;
        this.zzb = zzfbr;
        this.zzc = zzcmk;
        this.zzd = zzdnl;
    }

    public final void zza(Throwable th) {
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcex zzcex = (zzcex) obj;
        zzcex.zzW(this.zza, this.zzb);
        zzcgp zzN = zzcex.zzN();
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzjX)).booleanValue() && zzN != null) {
            zzcmk zzcmk = this.zzc;
            zzdnl zzdnl = this.zzd;
            zzN.zzK(zzcmk, zzdnl.zzi, zzdnl.zzj);
            zzcmk zzcmk2 = this.zzc;
            zzdnl zzdnl2 = this.zzd;
            zzN.zzM(zzcmk2, zzdnl2.zzi, zzdnl2.zzd);
        }
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzmQ)).booleanValue() && zzN != null) {
            zzN.zzN(this.zza);
        }
    }
}
