package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzaih implements zzaid {
    private final zzdy zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private int zze;

    public zzaih(zzeo zzeo) {
        zzdy zzdy = zzeo.zza;
        this.zza = zzdy;
        zzdy.zzL(12);
        this.zzc = zzdy.zzp() & 255;
        this.zzb = zzdy.zzp();
    }

    public final int zza() {
        return -1;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        int i = this.zzc;
        if (i == 8) {
            return this.zza.zzm();
        }
        if (i == 16) {
            return this.zza.zzq();
        }
        int i2 = this.zzd;
        this.zzd = i2 + 1;
        if (i2 % 2 != 0) {
            return this.zze & 15;
        }
        int zzm = this.zza.zzm();
        this.zze = zzm;
        return (zzm & 240) >> 4;
    }
}
