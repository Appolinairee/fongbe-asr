package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbl;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzela {
    private final zzdiq zza;
    private final zzekn zzb;
    private final zzcvw zzc;

    public zzela(zzdiq zzdiq, zzdrw zzdrw) {
        this.zza = zzdiq;
        zzekn zzekn = new zzekn(zzdrw);
        this.zzb = zzekn;
        this.zzc = new zzekz(zzekn, zzdiq.zzg());
    }

    public final zzcvw zza() {
        return this.zzc;
    }

    public final zzcxh zzb() {
        return this.zzb;
    }

    public final zzdgl zzc() {
        return new zzdgl(this.zza, this.zzb.zzg());
    }

    public final zzekn zzd() {
        return this.zzb;
    }

    public final void zze(zzbl zzbl) {
        this.zzb.zzj(zzbl);
    }
}
