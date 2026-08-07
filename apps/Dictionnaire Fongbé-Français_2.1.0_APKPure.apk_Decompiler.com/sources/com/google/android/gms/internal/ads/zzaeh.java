package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzaeh implements zzaeb {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    private zzaeh(int i, int i2, int i3, int i4, int i5, int i6) {
        this.zza = i;
        this.zzb = i3;
        this.zzc = i4;
        this.zzd = i5;
        this.zze = i6;
    }

    public static zzaeh zzb(zzdy zzdy) {
        int zzi = zzdy.zzi();
        zzdy.zzM(12);
        int zzi2 = zzdy.zzi();
        int zzi3 = zzdy.zzi();
        int zzi4 = zzdy.zzi();
        zzdy.zzM(4);
        int zzi5 = zzdy.zzi();
        int zzi6 = zzdy.zzi();
        zzdy.zzM(8);
        return new zzaeh(zzi, zzi2, zzi3, zzi4, zzi5, zzi6);
    }

    public final int zza() {
        return 1752331379;
    }
}
