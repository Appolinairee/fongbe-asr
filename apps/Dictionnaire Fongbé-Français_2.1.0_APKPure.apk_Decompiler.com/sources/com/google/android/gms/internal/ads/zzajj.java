package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzajj implements zzajo {
    private final zzacy zza;
    private final zzacx zzb;
    private long zzc = -1;
    private long zzd = -1;

    public zzajj(zzacy zzacy, zzacx zzacx) {
        this.zza = zzacy;
        this.zzb = zzacx;
    }

    public final void zza(long j) {
        this.zzc = j;
    }

    public final long zzd(zzaco zzaco) {
        long j = this.zzd;
        if (j < 0) {
            return -1;
        }
        this.zzd = -1;
        return -(j + 2);
    }

    public final zzadm zze() {
        zzcw.zzf(this.zzc != -1);
        return new zzacw(this.zza, this.zzc);
    }

    public final void zzg(long j) {
        long[] jArr = this.zzb.zza;
        this.zzd = jArr[zzei.zzd(jArr, j, true, true)];
    }
}
