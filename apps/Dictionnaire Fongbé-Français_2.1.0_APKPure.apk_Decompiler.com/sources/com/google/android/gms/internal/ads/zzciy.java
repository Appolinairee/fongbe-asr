package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzciy implements zzdth {
    /* access modifiers changed from: private */
    public final Context zza;
    private final zzbko zzb;
    private final zzcih zzc;
    private final zzciy zzd = this;
    private final zzhfa zze;
    private final zzhfa zzf;
    private final zzhfa zzg;
    private final zzhfa zzh;

    /* synthetic */ zzciy(zzcih zzcih, Context context, zzbko zzbko, zzcjm zzcjm) {
        this.zzc = zzcih;
        this.zza = context;
        this.zzb = zzbko;
        zzher zza2 = zzhes.zza(this);
        this.zze = zza2;
        zzher zza3 = zzhes.zza(zzbko);
        this.zzf = zza3;
        zzdtd zzdtd = new zzdtd(zza3);
        this.zzg = zzdtd;
        this.zzh = zzheq.zzc(new zzdtf(zza2, zzdtd));
    }

    public final zzdsy zzb() {
        return new zzciv(this.zzc, this.zzd, (zzcjm) null);
    }

    public final zzdte zzd() {
        return (zzdte) this.zzh.zzb();
    }
}
