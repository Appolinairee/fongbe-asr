package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcqr {
    private final zzcyl zza;
    private final zzdar zzb;

    public zzcqr(zzcyl zzcyl, zzdar zzdar) {
        this.zza = zzcyl;
        this.zzb = zzdar;
    }

    public final zzcyl zza() {
        return this.zza;
    }

    /* access modifiers changed from: package-private */
    public final zzdar zzb() {
        return this.zzb;
    }

    /* access modifiers changed from: package-private */
    public final zzddk zzc() {
        zzdar zzdar = this.zzb;
        if (zzdar != null) {
            return new zzddk(zzdar, zzbzw.zzg);
        }
        return new zzddk(new zzcqq(this), zzbzw.zzg);
    }
}
