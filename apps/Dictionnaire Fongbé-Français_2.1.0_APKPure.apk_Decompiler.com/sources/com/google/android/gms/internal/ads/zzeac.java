package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzeac {
    private final zzdzy zza;
    private final zzgcs zzb;

    public zzeac(zzdzy zzdzy, zzgcs zzgcs) {
        this.zza = zzdzy;
        this.zzb = zzgcs;
    }

    public final void zza(zzffr zzffr) {
        zzdzy zzdzy = this.zza;
        Objects.requireNonNull(zzdzy);
        zzgch.zzr(this.zzb.zzb(new zzeaa(zzdzy)), new zzeab(this, zzffr), this.zzb);
    }
}
