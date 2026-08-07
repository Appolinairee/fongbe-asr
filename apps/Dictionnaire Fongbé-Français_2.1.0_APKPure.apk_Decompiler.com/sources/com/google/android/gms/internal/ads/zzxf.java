package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzxf implements Comparable {
    private final boolean zza;
    private final boolean zzb;

    public zzxf(zzab zzab, int i) {
        this.zza = 1 != (zzab.zze & 1) ? false : true;
        this.zzb = zzlk.zza(i, false);
    }

    /* renamed from: zza */
    public final int compareTo(zzxf zzxf) {
        return zzfxc.zzj().zzd(this.zzb, zzxf.zzb).zzd(this.zza, zzxf.zza).zza();
    }
}
