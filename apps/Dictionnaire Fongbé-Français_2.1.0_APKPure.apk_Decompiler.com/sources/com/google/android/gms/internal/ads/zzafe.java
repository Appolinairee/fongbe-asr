package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzafe extends zzacz {
    private final long zza;

    public zzafe(zzaco zzaco, long j) {
        super(zzaco);
        zzcw.zzd(zzaco.zzf() >= j);
        this.zza = j;
    }

    public final long zzd() {
        return super.zzd() - this.zza;
    }

    public final long zze() {
        return super.zze() - this.zza;
    }

    public final long zzf() {
        return super.zzf() - this.zza;
    }
}
