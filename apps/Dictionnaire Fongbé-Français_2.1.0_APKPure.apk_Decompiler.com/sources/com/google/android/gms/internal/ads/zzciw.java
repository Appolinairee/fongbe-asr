package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzciw implements zzdsz {
    private final Long zza;
    private final String zzb;
    private final zzcih zzc;
    private final zzciy zzd;

    /* synthetic */ zzciw(zzcih zzcih, zzciy zzciy, Long l, String str, zzcjm zzcjm) {
        this.zzc = zzcih;
        this.zzd = zzciy;
        this.zza = l;
        this.zzb = str;
    }

    public final zzdtj zza() {
        zzciy zzciy = this.zzd;
        return zzdtk.zza(this.zza.longValue(), zzciy.zza, zzdtd.zzc(zzciy.zzb), this.zzc, this.zzb);
    }

    public final zzdtn zzb() {
        zzciy zzciy = this.zzd;
        return zzdto.zza(this.zza.longValue(), zzciy.zza, zzdtd.zzc(zzciy.zzb), this.zzc, this.zzb);
    }
}
