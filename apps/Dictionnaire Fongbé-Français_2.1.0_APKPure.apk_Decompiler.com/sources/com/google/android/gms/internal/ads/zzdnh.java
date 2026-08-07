package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdnh {
    private final zzcvr zza;
    private final zzcxa zzb;
    private final zzcxn zzc;
    private final zzcxz zzd;
    private final zzdap zze;
    private final zzfbo zzf;
    private final zzfbr zzg;
    private final zzcmk zzh;

    public zzdnh(zzcvr zzcvr, zzcxa zzcxa, zzcxn zzcxn, zzcxz zzcxz, zzdap zzdap, zzfbo zzfbo, zzfbr zzfbr, zzcmk zzcmk) {
        this.zza = zzcvr;
        this.zzb = zzcxa;
        this.zzc = zzcxn;
        this.zzd = zzcxz;
        this.zze = zzdap;
        this.zzf = zzfbo;
        this.zzg = zzfbr;
        this.zzh = zzcmk;
    }

    public final void zza(zzdnl zzdnl) {
        zzcxa zzcxa = this.zzb;
        zzdmy zzb2 = zzdnl.zza;
        Objects.requireNonNull(zzcxa);
        zzb2.zzh(this.zza, this.zzc, this.zzd, this.zze, new zzdng(zzcxa));
        zzdnl.zzh(this.zzf, this.zzg, this.zzh);
    }
}
